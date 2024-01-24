package designPatterns.builder;

public class Student {
    private int id;
    private String name;
    private String universityName;
    private int gradYear;
    private int psp;
    private int age;
    private String phoneNumber;

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.universityName = builder.universityName;
        this.gradYear = builder.gradYear;
        this.psp = builder.psp;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    /*
            1) Take inputs (using setters)
            2) Validate the values
            3) create Student object

         */
    public static class Builder{
        private int id;
        private String name;
        private String universityName;
        private int gradYear;
        private int psp;
        private int age;
        private String phoneNumber;

//        public static

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        private void validate(){
            if(name == null){
                throw new InvalidNameException();
            }
            if(age < 23){
                throw new InvalidAgeException();
            }
            if(gradYear > 2023){
                throw new InvalidGraduationException();
            }
        }

//        public Student build(){
//            validate();
//            return new Student(this.id, this.name, this.universityName, this.gradYear, this.psp, this.age, this.phoneNumber);
//        }

        public Student build(){
            validate();
            return new Student(this);
        }
    }
}
