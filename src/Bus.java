
public class Bus extends Transport {


     Bus(String model, String bodyColor, int maximumMovementSpeed) {
        super(model, bodyColor, maximumMovementSpeed);

    }

    @Override
    public void diagnostics() {
        System.out.println("пройти диагностику");
     }

    public void refill(){
        System.out.println("можно заправлять бензином или дизелем на заправке");
    }

    public String toString() {
        return getModel() + " " + getBodyColor() + " " + getMaximumMovementSpeed();
    }
}
