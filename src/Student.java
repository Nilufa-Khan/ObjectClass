import java.util.Objects;

public class Student {
    int rollno;
    String name;
    public Student(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }
    public String toString(){
        return  rollno + " ," + name;
    }
    public int hashCode(){
        return Objects.hash(rollno , name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return  true;
        }
        Student student = (Student) obj;
        if(this.rollno == student.rollno && this.name.equals(student.name)){
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        Student s1 = new Student(101,"Raj");
        Student s2 = new Student(123,"Rahul");
        Student s3 = new Student(101,"Raj");
        //below two statements are equivalent
        System.out.println("s1 = " + s1); // if we do not use tostring method it will give memory address of object s1.
        System.out.println("s1.toString() = " + s1.toString());
        System.out.println(s1.equals(s2)); // return false
        System.out.println(s1.equals(s3)); // return true
    }
}
