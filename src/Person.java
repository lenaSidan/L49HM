public class Person {
    private String name;
    private int height;

    public Person(String name, int age) {
        this.name = name;
        this.height = age;
    }

    public int compareTo(Person other) {
        return Integer.compare(this.height, other.height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return height;
    }

    public void setAge(int age) {
        this.height = age;
    }

    @Override
    public String toString() {
        return name + " - " + height + " cm";
    }
}
