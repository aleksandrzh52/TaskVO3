public class Search {

    void search(Human[] human, String lastname) {
        System.out.println("осуществить поиск Человека по фамилии;");
        for (int i = 0; i < human.length; i++) {
            if (human[i].lastname.equals(lastname))
                System.out.println(human[i].name + " " + human[i].lastname + " " + human[i].year + " " +
                        human[i].month + " " + human[i].day + " " + human[i].city + " " + human[i].street + " " + human[i].house);
        }
    }
    void search(Human[] human,String city,String street, int house){
        System.out.println("осуществить поиск человека по атрибуту адреса;");
        for (int i = 0; i < human.length; i++) {
            if (human[i].city.equals(city) && human[i].street.equals(street) && human[i].house == house)
                System.out.println(human[i].name + " " + human[i].lastname + " " + human[i].year + " " +
                        human[i].month + " " + human[i].day + " " + human[i].city + " " + human[i].street + " " + human[i].house);
        }
    }
    void search(Human[] human,int yearA, int yearB){
        System.out.println("вывести людей, родившихся между определенными датами;");
        for (int i = 0; i < human.length; i++) {
            if (human[i].year >= yearA & human[i].year <= yearB)
                System.out.println(human[i].name + " " + human[i].lastname + " " + human[i].year + " " +
                        human[i].month + " " + human[i].day + " " + human[i].city + " " + human[i].street + " " + human[i].house);
        }
    }

    void search(Human[] human){
        int old = 0;
        int oldYear = 2022;
        int young = 0;
        int youngYear = 2022;
        System.out.println("найти самого старого (молодого);");
        for (int i = 0; i < human.length; i++) {
            if (human[i].year < oldYear) {
                old = i;
                oldYear = human[i].year;
            }
            if (human[i].year > youngYear) {
                young = i;
                youngYear = human[i].year;
            }
        }
            System.out.print("Самый старый -> ");
            System.out.println(human[old].name + " " + human[old].lastname + " " + human[old].year + " " +
                        human[old].month + " " + human[old].day + " " + human[old].city + " " + human[old].street + " " + human[old].house);
        System.out.print("Самый молодой -> ");
        System.out.println(human[young].name + " " + human[young].lastname + " " + human[young].year + " " +
                human[young].month + " " + human[young].day + " " + human[young].city + " " + human[young].street + " " + human[young].house);

    }

    void search(String street, Human[] human){
        System.out.println("найти людей, проживающих на одной улице.");
        for (int i = 0; i < human.length; i++) {
            if (human[i].street.equals(street))
                System.out.println(human[i].name + " " + human[i].lastname + " " + human[i].year + " " +
                        human[i].month + " " + human[i].day + " " + human[i].city + " " + human[i].street + " " + human[i].house);
        }
    }

}
