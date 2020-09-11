package examplex.dagger;

import dagger.Component;
import examplex.dagger.animals.Animal;

@Component(modules = {ZooModule.class, NameModule.class})
public interface ZooComponent {
    Animal buildAnimal();
}
