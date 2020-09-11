package examplex.dagger;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class NameModule {
    @Provides
    @Named("catName")
    String provideCatName() {
        return "Cookie";
    }

    @Provides
    @Named("dogName")
    String provideDogName() {
        return "Doge";
    }
}
