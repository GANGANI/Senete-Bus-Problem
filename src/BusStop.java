import java.util.concurrent.Semaphore;

public class BusStop {

    //generate all the semaphores

    private static int riders_count = 0;
    private static int maximumPassengers = 50;

    private static final Semaphore busDepartureS = new Semaphore(0);

    private static final Semaphore mutex = new Semaphore(1);

    private static final Semaphore riderBusStopEntranceS= new Semaphore(maximumPassengers);

    private static final Semaphore riderBoardingAreaEntranceS = new Semaphore(0);

    public int getRidersCount() {
        return riders_count;
    }

    //Increment the riders count
    public void incrementRidersCount() {

        riders_count = riders_count + 1;
    }

    public void decrementRidersCount() {

        riders_count = riders_count - 1 ;
    }

    public static Semaphore getRiderBusStopEntranceSem() {
        return riderBusStopEntranceS;
    }

    public static Semaphore getRiderBoardingAreaEntranceS() {
        return riderBoardingAreaEntranceS;
    }


    public static Semaphore getBusDepartureS() {
        return busDepartureS;
    }

    public static Semaphore getMutex() {
        return mutex;
    }
}
