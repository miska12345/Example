package examplex.dagger;

import examplex.dagger.animals.Animal;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class CLI {
    public static void main(String[] args) {
        ZooComponent comp = DaggerZooComponent.create();
        Animal animal = comp.buildAnimal();

        // If you don't see log, go to Run and add -Dlog4j.configurationFile=log4j.xml to VM Args.
        log.info(animal.talk());
    }
}

