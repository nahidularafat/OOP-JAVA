class Teacher {
    String name;
    String gender;
    int phone;
}

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Anisul Islam";
        t1.gender = "male";
        t1.phone = 1;
        
        System.out.println("Name: " + t1.name);
        System.out.println("Gender: " + t1.gender);
        System.out.println("Phone: " + t1.phone);
    }
}
