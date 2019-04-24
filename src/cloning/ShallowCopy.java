package cloning;

/**
 * The default version of clone() method creates the shallow copy of an object.
 * The shallow copy of an object will have exact copy of all the fields of original object.
 * If original object has any references to other objects as fields, then only references of those objects are copied into clone object,
 * copy of those objects are not created. That means any changes made to those objects through clone object will be reflected in original object or vice-versa.
 * Shallow copy is not 100% disjoint from original object. Shallow copy is not 100% independent of original object.
 */
public class ShallowCopy {
    public static void main(String[] args) {
        shallowCopy();
        deepCopy();
    }

    private static void deepCopy() {
        Course science = new Course("Physics", "Chemistry", "Biology");
        Student student1 = new Student(111, "John", science);
        Student student2 = null;
        try {
            //Creating a clone of student1 and assigning it to student2
            student2 = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //Printing the subject3 of 'student1'
        System.out.println(student1.course.subject3);         //Output : Biology
        //Changing the subject3 of 'student2'
        student2.course.subject3 = "Maths";
        //This change will be reflected in original student 'student1'
        System.out.println(student1.course.subject3);       //Output : Maths
    }

    private static void shallowCopy() {
        Course science = new Course("Physics", "Chemistry", "Biology");
        Student student1 = new Student(111, "John", science);
        Student student2 = null;
        try {
            student2 = (Student) student1.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(student1.course.subject3);         //Output : Biology
        //Changing the subject3 of 'student2'
        student2.course.subject3 = "Maths";
        student2.id = 112;
        //This change will be reflected in original student 'student1'
        System.out.println(student1.course.subject3);       //Output : Maths
        System.out.println(student1.id);
    }
}

class Course {
    String subject1;
    String subject2;
    String subject3;

    public Course(String sub1, String sub2, String sub3) {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
    }
}

class Student implements Cloneable {
    int id;
    String name;
    Course course;

    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    //Default version of clone() method. It creates shallow copy of an object.
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}