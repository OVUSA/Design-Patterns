public class Dog extends Animal{
    public void digHole(){
        System.out.println("Dug a hole");
    }

    public Dog(){

        super();
        setSound("Bark");
        // We set the Flys interface polymorphically
        // This sets the behavior as a non-flying Animal
        flyType = new CantFly();

    }


}
