public class TestGorilla{
    public static void main(String[] args){
        Gorilla kong = new Gorilla(100);

        // kong throws 3 items
        kong.displayEnergy();
        
        kong.throwSomething();
        kong.throwSomething();
        kong.throwSomething();
        kong.displayEnergy();
        
        // kong eats two bananas
        kong.eatBanana();
        kong.displayEnergy();
        
        kong.eatBanana();
        kong.displayEnergy();
        
        //kong climbs a tree
        kong.displayEnergy();
        
        kong.climb();
        kong.displayEnergy();
    }
}