class Emp {
    static String dep = "IIT";//Static Variable will get memory only once and retain its value
    String name;//Instance Variable
    int age;

    Emp(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("name:" + name + " " + "age:" + age + " " + dep);
    }
}

public class Employee {
    public static void main(String[] args) {
        Emp e = new Emp("Sita", 21);
        Emp e1 = new Emp("Gita", 22);
        e.display();
        e1.display();
    }
}