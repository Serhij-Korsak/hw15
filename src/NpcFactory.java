import java.util.*;

public class NpcFactory {

    public static final String[] NAMES = {"Mykhajlo", "Oleksandr", "Serhij", "Vasyl", "Mykola", "Oleksij", "Vitalij"};
    public static final String[] SURNAMES = {"Korsak", "Sydorenko", "Vovk", "Ivanov", "Petrenko", "Lesiv", "Budkivskyj"};

    public static List<Person> createPeople(){
        Random random = new Random();
        List<Person> result = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String randomName = NAMES[random.nextInt(NAMES.length)];
            String randomSurname = SURNAMES[random.nextInt(SURNAMES.length)];
            result.add(new Person(randomName,randomSurname,random.nextInt(42)+18, random.nextInt(30)+160,random.nextInt(40)+60));
             }
        return result;
        }
}