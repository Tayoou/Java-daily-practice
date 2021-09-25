package HouseApp.model;

public class House {
    private int id;
    private String name;
    private String phone;
    private String address;
    private int cost;
    private String tender;

    public House(String name, String phone, String address, int cost, String tender) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.cost = cost;
        this.tender = tender;
    }

    @Override
    public String toString() {
        return id +
                "\t\t" + name +
                "\t" + phone +
                "\t\t" + address +
                "\t" + cost +
                "\t" + tender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTender() {
        return tender;
    }

    public void setTender(String tender) {
        this.tender = tender;
    }
}
