abstract class Animal {
    public abstract void speak();

    public abstract void move();
}

class Dog extends Animal {
    public void speak() {
        System.out.println("Гав");
    }

    public void move() {
        System.out.println("Бегу гавкаю");
    }
}

class Cat extends Animal {
    public void speak() {
        System.out.println("Мяу");
    }

    public void move() {
        System.out.println("Иду тихо и мяукаю");
    }
}

interface AnimalFactory {
    Animal createAnimal();
}

class DogFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Cat();
    }
}