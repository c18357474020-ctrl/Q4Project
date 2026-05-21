import java.util.ArrayList;

// 课程类 - 实现Gradable接口
public class Course implements Gradable {
    private String courseName;
    private Teacher teacher;
    private ArrayList<Student> enrolledStudents;
    private double grade;
    
    public Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.enrolledStudents = new ArrayList<>();
        this.grade = 0;
    }
    
    // 添加学生到课程
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }
    
    // 获取课程中的学生列表
    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    
    @Override
    public double calculateGrade() {
        return grade;
    }
    
    @Override
    public void printGradeReport() {
        System.out.println("课程: " + courseName);
        System.out.println("教师: " + teacher.getName());
        System.out.println("学生数量: " + enrolledStudents.size());
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public Teacher getTeacher() {
        return teacher;
    }
}
