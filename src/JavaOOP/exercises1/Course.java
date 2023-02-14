package JavaOOP.exercises1;

import java.util.List;

public class Course {

    String courseName;
    Integer maxStudents;
    int courseAge;
    Integer qualityRatingOutOf10;

    String nameOfClasses;
    String nameOfSchool;


    List<student> Student;

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", maxStudents=" + maxStudents +
                ", courseAge=" + courseAge +
                ", qualityRatingOutOf10=" + qualityRatingOutOf10 +
                ", nameOfClasses='" + nameOfClasses + '\'' +
                ", nameOfSchool='" + nameOfSchool + '\'' +
                ", Student=" + Student +
                '}';
    }
}
