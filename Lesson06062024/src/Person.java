public class Person {
    private String name;
    public Person(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return " Name is  " + name;
    }

    @Override
    public int hashCode() {
        return 10;
    }

    @Override
    public boolean equals(Object obj) {
        return this==obj;
    }

}
