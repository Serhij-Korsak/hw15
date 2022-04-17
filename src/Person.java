import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int height;
    private double weight;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }


    public Person(String name, String surname, int age, int height, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return '\n'+"Person {" +
                "name: " + name +
                ", surname: " + surname +
                ", age: " + age +
                ", height: " + height +
                ", weight: " + weight +
                '}';
    }
}
