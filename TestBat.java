public class TestBat{

    public static void main(String[] args){
        Bat terapusmordax = new Bat(300);

        // bat flies twice
        terapusmordax.displayEnergy();
        terapusmordax.fly();
        terapusmordax.fly();

        // bat eats two humans
        terapusmordax.displayEnergy();
        terapusmordax.eatHumans();
        terapusmordax.eatHumans();

        //bat attacks three towns
        terapusmordax.displayEnergy();
        terapusmordax.attackTown();
        terapusmordax.attackTown();
        terapusmordax.attackTown();
        terapusmordax.displayEnergy();
        System.out.println("terapusmordax rage has left him with no energy left, at last humans are safe from this savage beast!! ");
    }
}