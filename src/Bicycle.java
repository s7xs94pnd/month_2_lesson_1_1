public class Bicycle {
    private String name;
    private int wheelSize;
    private MaterialEnum frame;
    private Shop shop;

    public String getName() {
        return name;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public MaterialEnum getFrame() {
        return frame;
    }

    public Shop getShop() {
        return shop;
    }

    public Bicycle(String name, int wheelSize, MaterialEnum frame, Shop shop) {
        this.name = name;
        this.wheelSize = wheelSize;
        this.frame = frame;
        this.shop = shop;
    }
    public void pedaling(){
        System.out.println(this.getName()+" bike is pedaling");
    }

    public String getInfo(){
        return "bike name: "+name+
                "\nWheel size :"+wheelSize+
                "\nFrame :"+frame+
                "\n\nShop "+shop.getinfo();
    };
}
