package examplex.dagger.animals;

import javax.inject.Inject;
import javax.inject.Named;

public class Cat implements Animal {
    private final String name;

    /**
     * Name is injected.
     */
    @Inject
    public Cat(@Named("catName") String name) {
        this.name = name;
    }

    @Override
    public String talk() {
        return name + ": Meow";
    }
}
