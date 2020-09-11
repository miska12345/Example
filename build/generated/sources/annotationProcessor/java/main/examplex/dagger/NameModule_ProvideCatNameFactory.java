package examplex.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NameModule_ProvideCatNameFactory implements Factory<String> {
  private final NameModule module;

  public NameModule_ProvideCatNameFactory(NameModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {
    return Preconditions.checkNotNull(
        module.provideCatName(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<String> create(NameModule module) {
    return new NameModule_ProvideCatNameFactory(module);
  }
}
