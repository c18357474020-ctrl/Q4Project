// 学生类 - 继承Person
public class Student extends Person {
    private int gradeLevel;
    
    public Student(String name, int id, int gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;
    }
    
    @Override
    public String getRole() {
        return "学生";
    }
    
    public int getGradeLevel() {
        return gradeLevel;
    }
}
