public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String major;

    public Student() {
        // TODO defaults for String fields are ""
        // TODO defaults for number fields are 0;
    }

    public Student(String studentId, String firstName, String lastName, int age, String major) {// MORE FIELDS ) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + firstName + ", Last Name " + lastName + ", Age" + age + ", major";
    }
}