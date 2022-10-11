public class testStaticMethod {
    public static void main(String args[]){
        Student.change();
        Student s1 = new Student(111, "Phu");
        Student s2 = new Student(222, "Tien");
        Student s3 = new Student(333, "Mai");

        s1.display();
        s2.display();
        s3.display();
    }
}
