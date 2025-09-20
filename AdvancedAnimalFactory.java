// in the abstract we have family of object for instance DogFactory has object of Sound and object of Food in it
// in just factory we must declare one factory for sound and another for food
abstract class Animal {
    public abstract void speak();
}

class Dog extends Animal {
    public void speak() {
        System.out.println("Гав");
    }
}

class Cat extends Animal {
    public void speak() {
        System.out.println("Мяу");
    }
}

interface Food {
    void eat();
}

class DogFood implements Food {
    public void eat() {
        System.out.println("Ем корм для собак");
    }
}

class CatFood implements Food {
    public void eat() {
        System.out.println("Ем корм для котов");
    }
}

interface AnimalFamilyFactory {
    Animal createAnimal();

    Food createFood();
}

class DogFamilyFactory implements AnimalFamilyFactory {
    public Animal createAnimal() {
        return new Dog();
    }

    public Food createFood() {
        return new DogFood();
    }
}

class CatFamilyFactory implements AnimalFamilyFactory {
    public Animal createAnimal() {
        return new Cat();
    }

    public Food createFood() {
        return new CatFood();
    }
}