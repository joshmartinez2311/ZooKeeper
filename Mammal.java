public class Mammal{
    protected int energyLevel;

    // mammal constructor
    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    // method to display energy
    public int displayEnergy(){
        System.out.println("the Mammal's current energy level is " + this.energyLevel);
        return this.energyLevel;
    }
}