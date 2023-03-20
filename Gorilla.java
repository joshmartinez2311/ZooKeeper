public class Gorilla extends Mammal{
    

    // gorilla constructor
    public Gorilla(int energyLevel){
        super(energyLevel); // inherits from the mammal class
    }
    
    
    public void throwSomething() {
        System.out.println(" Heads up!! Kong has hurtle something at you");
        this.energyLevel -= 5;
    }

    public void eatBanana(){
        System.out.println("Kong enjoys a delicious banana!! mmmmmmmm");
        this.energyLevel += 10;
    }

    public void climb(){
        System.out.println(" Look at Kong go, he's almost to the top of the tree!!");
        this.energyLevel -= 10;
    }


}