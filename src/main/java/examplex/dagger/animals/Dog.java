package examplex.dagger.animals;

import javax.inject.Inject;
import javax.inject.Named;

public class Dog implements Animal {
    private final String name;
    @Inject
    public Dog(@Named("dogName") String name) {
        this.name = name;
    }
    @Override
    public String talk() {
        return name + ": Wow";
    }
}
