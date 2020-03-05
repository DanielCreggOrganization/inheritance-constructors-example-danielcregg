/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        //Bicycle bicycleObject1 = new Bicycle();
        MountainBike mountainBikeObject1 = new MountainBike(1, 2, 3, 4);

       // System.out.println(     bicycleObject1.cadence     );
        System.out.println(     mountainBikeObject1.getGear()    );
        mountainBikeObject1.applyBrake(2);
        System.out.println(     mountainBikeObject1.getCadence()   );
    }
}