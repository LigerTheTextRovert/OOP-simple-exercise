public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void printDetails() {
        System.out.println("person name: " + this.name);
        System.out.println("person age: " + this.age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void isAdult (){
        if (this.age >= 18) System.out.println("Person is adult");
        else System.out.println("Person is not an adult");
    }
}
