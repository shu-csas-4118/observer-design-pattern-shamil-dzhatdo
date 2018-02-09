package ObserverPatternDemo;

//A course is a class that represents a course that is a student is taking.

public class Course {

    private String courseName;
    private int courseNumber;
    private int credits;
    private String professor;

    //Constructor: This constructs a new course object with the course name, course number, credit count,
    //             and professor name.
    public Course(String cName, int cNumber, int c, String p) {
        courseName = cName;
        courseNumber = cNumber;
        credits = c;
        professor = p;
    }

    //Purpose: Returns the name of this course.
    public String getCourseName() {
        return courseName;
    }

    //Purpose: Updates the name of this course.
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //Purpose: Returns the course number of this course.
    public int getCourseNumber() {
        return courseNumber;
    }

    //Purpose: Updates the course number of this course.
    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    //Purpose: Returns the credit count for this course.
    public int getCredits() {
        return credits;
    }

    //Purpose: Updates the credit count of this course.
    public void setCredits(int credits) {
        this.credits = credits;
    }

    //Purpose: Returns the professor's name for this course.
    public String getProfessor() {
        return professor;
    }

    //Purpose: Updates the professor's name for this course.
    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
