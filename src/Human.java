
public class Human extends Address {
    String name = "";
    String lastname = "";
    int year, month, day = 0;

    public Human(String name, String lastname, int year, int month, int day, String city, String street, int house) {
        this.name = name;
        this.lastname = lastname;
        this.year = year;
        this.month = month;
        this.day = day;
        super.city = city;
        super.street = street;
        super.house = house;
    }



}

