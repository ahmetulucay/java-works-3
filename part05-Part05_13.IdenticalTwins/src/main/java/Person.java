
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    public boolean equals(Object compared){
        Person comparedPerson = (Person) compared;

        if (this.birthday.equals(comparedPerson.birthday)&&
            this.name == comparedPerson.name &&
            this.weight == comparedPerson.weight &&
            this.height == comparedPerson.height) {
            return true;
        }
        return false;
    }      
    // implement an equals method here for checking the equality of objects
}
