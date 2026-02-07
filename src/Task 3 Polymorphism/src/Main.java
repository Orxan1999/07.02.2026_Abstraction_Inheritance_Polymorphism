import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Course> courses=new ArrayList<>();

        courses.add(new VideoCourse());
        courses.add(new LiveClass());
        courses.add(new InteractiveTest());
        for(Course course: courses){
            course.Start();
        }
    }
}