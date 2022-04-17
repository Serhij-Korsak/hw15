import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Person>list = new ArrayList<>();
        list=NpcFactory.createPeople();
        Set<Person> set=new HashSet<>(list);
        System.out.println(set);
    }
}
