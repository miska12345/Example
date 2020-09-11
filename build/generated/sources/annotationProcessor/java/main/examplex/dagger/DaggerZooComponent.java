package examplex.dagger;

import dagger.internal.Preconditions;
import examplex.dagger.animals.Animal;
import examplex.dagger.animals.Cat;
import examplex.dagger.animals.Cat_Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerZooComponent implements ZooComponent {
  private Provider<String> provideCatNameProvider;

  private Provider<Cat> catProvider;

  private Provider<Animal> animalProvider;

  private DaggerZooComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ZooComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideCatNameProvider = NameModule_ProvideCatNameFactory.create(builder.nameModule);

    this.catProvider = Cat_Factory.create(provideCatNameProvider);
    this.animalProvider = (Provider) catProvider;
  }

  @Override
  public Animal buildAnimal() {
    return animalProvider.get();
  }

  public static final class Builder {
    private NameModule nameModule;

    private ZooModule zooModule;

    private Builder() {}

    public ZooComponent build() {
      if (nameModule == null) {
        this.nameModule = new NameModule();
      }
      return new DaggerZooComponent(this);
    }

    public Builder zooModule(ZooModule zooModule) {
      this.zooModule = Preconditions.checkNotNull(zooModule);
      return this;
    }

    public Builder nameModule(NameModule nameModule) {
      this.nameModule = Preconditions.checkNotNull(nameModule);
      return this;
    }
  }
}
