package ObserverPatternDemo;

import java.util.ArrayList;

//A CourseObserver is a class that is used to observe changes made to a student's course list.
//It contains as a private instance variable a student.  When an update call is made, it prints the
//list of courses associated with the student this object is observing.  Update calls are made
//when a course is added or removed from a student's course list.
public class CourseObserver implements IObserver {

    public CourseObserver() {}

    //Purpose: Prints the course information for a given course.
    public void printCourse(Course course) {
        System.out.println("Course name:   " + course.getCourseName());
        System.out.println("Course number: " + course.getCourseNumber());
        System.out.println("Course credits:" + course.getCredits());
        System.out.println("Professor:     " + course.getProfessor());
        System.out.println();
    }

    //Purpose: Prints all of the courses in a list courses.
    public void printCourses(ArrayList<Course> courses) {
        for (Course course: courses)
            printCourse(course);
    }

    //Purpose: Updates the screen with the new student information.  Prints the list of courses.
    public void update(Student s) {
        System.out.println("The student has the following courses:");
        printCourses(s.getCourses());
    }
}
