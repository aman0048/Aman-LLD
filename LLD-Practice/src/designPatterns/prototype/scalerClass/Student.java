package designPatterns.prototype.scalerClass;

public class Student implements Prototype<Student> {
    private String name;
    private String email;
    private String phoneNumber;
    private final String yearOfEnrollment;
    private final String batchName;
    private final String moduleName;
    private final String instructorName;
    private final String moduleStartDate;
    private final String moduleSchedule;
    private final String moduleEndDate;

    public Student(String yearOfEnrollment, String batchName, String moduleName, String instructorName, String moduleStartDate, String moduleSchedule, String moduleEndDate) {
        this.yearOfEnrollment = yearOfEnrollment;
        this.batchName = batchName;
        this.moduleName = moduleName;
        this.instructorName = instructorName;
        this.moduleStartDate = moduleStartDate;
        this.moduleSchedule = moduleSchedule;
        this.moduleEndDate = moduleEndDate;
    }

    public Student(Student student){
        this.yearOfEnrollment = student.yearOfEnrollment;
        this.batchName = student.batchName;
        this.moduleName = student.moduleName;
        this.instructorName = student.instructorName;
        this.moduleStartDate = student.moduleStartDate;
        this.moduleSchedule = student.moduleSchedule;
        this.moduleEndDate = student.moduleEndDate;
    }

    @Override
    public Student clone(){
        return new Student(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", yearOfEnrollment='" + yearOfEnrollment + '\'' +
                ", batchName='" + batchName + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", instructorName='" + instructorName + '\'' +
                ", moduleStartDate='" + moduleStartDate + '\'' +
                ", moduleSchedule='" + moduleSchedule + '\'' +
                ", moduleEndDate='" + moduleEndDate + '\'' +
                '}';
    }
}
