package examplex.dagger;

import dagger.Binds;
import dagger.Module;
import examplex.dagger.animals.Cat;
import examplex.dagger.animals.Animal;

@Module
public abstract class ZooModule {
    /**
     * Bind all instances of Animal to Cat
     *
     * Change 'Cat' to 'Dog' and run CLI again, see output.
     */
    @Binds
    abstract Animal bindAnimal(Cat cat);

//    // Bind all Animal named cat to a Cat instance.
//    @Binds
//    @Named("cat")
//    abstract Animal bindAnimalNamedAsCat(Cat cat);
}
