public class Main {
    public static void main(String[] args) {
        MountainBike objectA = new MountainBike("TREK",27,MaterialEnum.ALUMINIUM,new Shop("Bike store","Italy"));
        System.out.println(objectA.getInfo());
        objectA.suspensionTurn();
        objectA.suspensionTurn(false);
        objectA.shiftGears();
        objectA.shiftGears(7);
        objectA.pedaling();
        System.out.println("\n");



        ElectricMountainBike objectB=new ElectricMountainBike("canyon-e",29,MaterialEnum.CARBON,new Shop("gerger sport", "German"),20000);
        System.out.println(objectB.getInfo());
        objectB.suspensionTurn();
        objectB.suspensionTurn(false);
        objectB.shiftGears();
        objectB.shiftGears(7);
        objectB.pedaling();
        System.out.println("\n");




        ElectricMountainBike objectC=new ElectricMountainBike("Santacruzz",26,MaterialEnum.CARBON,new Shop("Cruzz sport", "China"),25000);
        System.out.println(objectC.getInfo());
        objectC.suspensionTurn();
        objectC.suspensionTurn(false);
        objectC.shiftGears();
        objectC.shiftGears(7);
        objectC.pedaling();
        System.out.println("\n");


    }

}
