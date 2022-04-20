
public class Main {
    public static void main(String[] args) {
        Search search = new Search();
        Human[] humans = new Human[4];
        humans[0] = new Human("Ivan", "Ivanov", 1999, 01, 01, "Moskov", "Arbat", 1);
        humans[1] = new Human("Ivan", "1Ivanov", 1997, 01, 01, "Moskov", "Sov", 1);
        humans[2] = new Human("Ivan", "2Ivanov", 1993, 01, 01, "Moskov", "Arbat", 1);
        humans[3] = new Human("Ivan", "3Ivanov", 1995, 01, 01, "Moskov", "Sov", 2);

        search.search(humans, "1Ivanov");
        search.search(humans, "Moskov", "Arbat", 1);
        search.search(humans, 1998, 1999);
        search.search(humans);
        search.search("Sov",humans);
    }
}

