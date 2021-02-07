
public class Book {

    private String identifier;
    private String name;

    public Book(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }
    
    public boolean equals(Book compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Book)) {
            return false;
        }
        Book comparedBird = (Book) compared;

        // if the values of the object variables are equal, the objects are, too
        return (this.identifier.equals(comparedBird.identifier));

        /*
        // the comparison of names above is equal to
        // the following code

        if (this.name.equals(comparedBird.name)) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
        */
    }

}
