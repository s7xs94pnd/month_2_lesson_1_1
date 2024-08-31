public class Shop {
    private String name;
    private String country;

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Shop(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getinfo(){
        return " name :"+name+
                "\nCountry :" +country;
    }
}
