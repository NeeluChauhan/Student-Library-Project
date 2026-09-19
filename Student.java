package LibraryManagement;

public class Student {
    private String studentId;
    private String studentName;
    private String email;

    Student(String studentId, String studentName, String email){
        this.studentId= studentId;
        this.studentName= studentName;
        this.email= email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
