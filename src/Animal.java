// Animal class
public class Animal {
    public int age;
    public String gender;

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public void isMammal() {
        System.out.println("This animal is a mammal.");
    }

    public void mate() {
        System.out.println("The animal is mating.");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal(5, "Male");
        Fish myFish = new Fish(3, "Female", 2.0);
        Zebra myZebra = new Zebra(7, "Male", true);

        myAnimal.isMammal();
        myAnimal.mate();

        myZebra.isMammal();
        myZebra.mate();
        myZebra.run();
    }
}

// Fish class
class Fish extends Animal {
    private double sizeInFeet;

    public Fish(int age, String gender, double sizeInFeet) {
        super(age, gender);
        this.sizeInFeet = sizeInFeet;
    }

    private void canEat() {
        System.out.println("This is a private method canEat() from class Fish");
    }
}

// Zebra class
class Zebra extends Animal {
    public boolean is_wild;

    public Zebra(int age, String gender, boolean is_wild) {
        super(age, gender);
        this.is_wild = is_wild;
    }

    public void run() {
        System.out.println("The zebra is running.");
    }
}

