public class Bat extends Mammal{
    public Bat(int energyLevel){
        super(energyLevel);
    }

    public void fly(){
        System.out.println("Every body run!!!! Terapusmordax, the flying rat, has taken to the sky");
        this.energyLevel -= 50;
    }
    public void eatHumans(){
        System.out.println("Puny Humans, so delicious");
        this.energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("Oh my God!! The inhumanity, Terapusmordax has devastated the town");
        this.energyLevel -= 100;
    }
}