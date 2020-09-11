package examplex.dagger.animals;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Dog_Factory implements Factory<Dog> {
  private final Provider<String> nameProvider;

  public Dog_Factory(Provider<String> nameProvider) {
    assert nameProvider != null;
    this.nameProvider = nameProvider;
  }

  @Override
  public Dog get() {
    return new Dog(nameProvider.get());
  }

  public static Factory<Dog> create(Provider<String> nameProvider) {
    return new Dog_Factory(nameProvider);
  }
}
