public class Main {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.speak();

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.speak();

        AnimalFamilyFactory dogFamilyFactory = new DogFamilyFactory();
        Animal dogFromFamily = dogFamilyFactory.createAnimal();
        Food dogFood = dogFamilyFactory.createFood();
        dogFromFamily.speak();
        dogFood.eat();

        AnimalFamilyFactory catFamilyFactory = new CatFamilyFactory();
        Animal catFromFamily = catFamilyFactory.createAnimal();
        Food catFood = catFamilyFactory.createFood();
        catFromFamily.speak();
        catFood.eat();
    }
}
