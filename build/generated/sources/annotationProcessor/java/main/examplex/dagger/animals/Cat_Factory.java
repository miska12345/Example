package examplex.dagger.animals;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Cat_Factory implements Factory<Cat> {
  private final Provider<String> nameProvider;

  public Cat_Factory(Provider<String> nameProvider) {
    assert nameProvider != null;
    this.nameProvider = nameProvider;
  }

  @Override
  public Cat get() {
    return new Cat(nameProvider.get());
  }

  public static Factory<Cat> create(Provider<String> nameProvider) {
    return new Cat_Factory(nameProvider);
  }
}
