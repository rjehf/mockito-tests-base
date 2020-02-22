package pl.kazmierski.springbootapidocker;

import org.springframework.beans.factory.annotation.Autowired;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    private AnimalRepo animalRepo;

    @Autowired
    public AnimalController(AnimalRepo animalRepo) {
        this.animalRepo = animalRepo;
    }

    public List<Animal> getAnimals() {
        List<Animal> list = new ArrayList<>();
        animalRepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    public Animal addAnimal(Animal animal) {
        return animalRepo.save(animal);
    }
}
