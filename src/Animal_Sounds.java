abstract class Animall{
    abstract String makeASound();
}
class Dogg extends Animall{
    @Override
    String makeASound(){
        return "Woof!";
    }
}
class Catt extends Animall{
    @Override
    String makeASound(){
        return "Meow!";
    }
}

public class Animal_Sounds {
    public static void main(String [] args){
        Dogg dog1 = new Dogg();
        Catt cat1 = new Catt();
        Animall dog2 = new Dogg();
        Animall cat2 = new Catt();

        System.out.println(dog1.makeASound());
        System.out.println(cat1.makeASound());
        System.out.println(dog2.makeASound());
        System.out.println(cat2.makeASound());

    }
}
