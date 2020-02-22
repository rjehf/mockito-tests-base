package pl.kazmierski.springbootapidocker;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AnimalControllerTest {

    @Test
    void getAnimals() {
        //given
        AnimalController animalController = mock(AnimalController.class);
        //when
        when(animalController.getAnimals()).thenReturn(prepareMockData());
        //then
        Assert.assertThat(animalController.getAnimals(), Matchers.hasSize(2));
    }

    @Test
    void getAnimals_withBDD() {
        //given
        AnimalController animalController = mock(AnimalController.class);
        given(animalController.getAnimals()).willReturn(prepareMockData());
        //when
        List<Animal> animals = animalController.getAnimals();
        //then
        Assert.assertThat(animals, Matchers.hasSize(2));
    }

    private List<Animal> prepareMockData() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cat"));
        animals.add(new Animal("dog"));
        return animals;
    }

    @Test
    void addAnimal() {
        //given
        AnimalController animalController = mock(AnimalController.class);
        given(animalController.addAnimal(Mockito.any(Animal.class))).willReturn(new Animal("dog"));
        //when
        Animal animal = animalController.addAnimal(new Animal());
        //then
        Assert.assertEquals(animal.getName(),"dog");
    }
}