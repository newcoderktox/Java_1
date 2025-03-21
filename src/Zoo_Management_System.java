import java.util.ArrayList;

class Animal{
    String name;
    int age;
    String feedingHabit;

    Animal(String name, int age, String feedingHabit){
        this.name=name;
        this.age=age;
        this.feedingHabit=feedingHabit;
    }
    void feed(){
        switch(feedingHabit){
            case "carnivore":
                System.out.println("Animal "+ name + " feeds on meat.");
                break;
            case "herbivore":
                System.out.println("Animal "+name + " feeds on plants");
                break;
            case "omnivore":
                System.out.println("Animal "+name+ " feeds on both meat and plants.");
                break;
            default:
                System.out.println("Please enter a valid feeding habit.");
        }
    }

    void makeANoise(){
        System.out.println("A common animal sound...");
    }
    String getKind(){
        return "animal";
    }
}

class Cat extends Animal{
    Cat(String name, int age, String feedingHabit){
        super(name, age, feedingHabit);
    }
    @Override
    void makeANoise(){
        super.makeANoise();
        System.out.println("Miyav!");
    }
    @Override
    String getKind(){
        return "cat";
    }
}
class Dog extends Animal {
    Dog(String name, int age, String feedingHabit) {
        super(name, age, feedingHabit);
    }

    @Override
    void makeANoise() {
        super.makeANoise();
        System.out.println("Woof!");
    }

    @Override
    String getKind() {
        return "dog";
    }
}
class Bird extends Animal {
    Bird(String name, int age, String feedingHabit) {
        super(name, age, feedingHabit);
    }

    @Override
    void makeANoise() {
        super.makeANoise();
        System.out.println("Chrip!");
    }

    @Override
    String getKind() {
        return "bird";
    }
}
class Lion extends Animal {
    Lion(String name, int age, String feedingHabit) {
        super(name, age, feedingHabit);
    }

    @Override
    void makeANoise() {
        super.makeANoise();
        System.out.println("Roar!");
    }

    @Override
    String getKind() {
        return "lion";
    }
}
class Shelter{
    private ArrayList<Animal> animals;

    Shelter(){
        this.animals= new ArrayList<>();
    }

    void addAnAnimal(Animal animal){
        this.animals.add(animal);
    }

    void allSounds(){
        for (int i=0; i<animals.size(); i++){
            Animal animal = animals.get(i);
            animal.makeANoise();
        }
    }
    void feedAll(){
        for (int i=0; i<animals.size(); i++){
            Animal animal = animals.get(i);
            animal.feed();
        }
    }
    void makeASoundKind(String kind){
        for (int i=0; i<animals.size(); i++){
            Animal animal = animals.get(i);
            if (animal.getKind().equals(kind)){
                animal.makeANoise();
            }
        }
    }
    // Yeni ekleyeceğin metot:
    public ArrayList<Animal> getAnimals() {
        return this.animals;
    }

}

public class Zoo_Management_System {
    public static void main(String [] args){
        Shelter shelter = new Shelter ();
        Cat cat1= new Cat ("badem",3, "carnivore");
        shelter.addAnAnimal(cat1);
        Dog dog1= new Dog ("karabas", 4, "carnivore");
        shelter.addAnAnimal(dog1);
        Bird bird1= new Bird ("badem",4,"herbivore");
        shelter.addAnAnimal(bird1);
        Lion lion1= new Lion ("aslan",18, "carnivore");
        shelter.addAnAnimal(lion1);


        System.out.println("---The animals in shelter---");
        for (int i=0; i<shelter.getAnimals().size(); i++){
            Animal animal =shelter.getAnimals().get(i);
            System.out.println("Name: "+ animal.name + " Age: "+ animal.age+ " Feeding Habit: "+ animal.feedingHabit);
            animal.makeANoise();

        }
        System.out.println("---Feed all the animals---");
        shelter.feedAll();

        System.out.println("Only cats:");
        shelter.makeASoundKind("cat");
        System.out.println("Only dogs:");
        shelter.makeASoundKind("dog");
        System.out.println("Only birds:");
        shelter.makeASoundKind("bird");
        System.out.println("Only lions:");
        shelter.makeASoundKind("lion");



        }
}


