public final class ElectricMountainBike extends MountainBike{
    private int batteryCapacity;
    public ElectricMountainBike(String name, int wheelSize, MaterialEnum frame, Shop shop, int batteryCapacity) {
        super(name, wheelSize, frame, shop);
        this.batteryCapacity=batteryCapacity;
    }


    @Override
    public void pedaling() {
        super.pedaling();
        System.out.println("helps electric engin");
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nbatteryCapacity: "+batteryCapacity;

    }
}
