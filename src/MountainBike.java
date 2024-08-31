public class MountainBike extends Bicycle {
    private boolean suspension;
    private int gears;

    public MountainBike(String name, int wheelSize, MaterialEnum frame, Shop shop) {
        super(name, wheelSize, frame, shop);
    }

    public final void suspensionTurn(){
        if (!suspension){
            suspension=true;
            System.out.println("suspension is turn ON");
        }
        else{
            suspension=false;
            System.out.println("suspension is turn OFF");
        }


    }
    public final void suspensionTurn(boolean askTurnON) {
        if (askTurnON) {
            suspension = true;
            System.out.println("Suspension is turned ON");
        } else {
            suspension = false;
            System.out.println("Suspension is turned OFF");
        }
    }

    public boolean isSuspension() {
        return suspension;
    }

    public int getGears() {
        return gears;
    }

    public void shiftGears() {
        gears++;
        System.out.println("shifted Gear to "+gears);
    }
    public void shiftGears(int chosenGear) {
        gears = chosenGear;
        System.out.println("shifted Gear to "+gears);
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nsuspension Turn :"+suspension+"\nGear :"+gears;
    }
}
