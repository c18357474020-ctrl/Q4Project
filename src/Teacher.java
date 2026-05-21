// 教师类 - 继承Person
public class Teacher extends Person {
    private String subject;
    
    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }
    
    @Override
    public String getRole() {
        return "教师";
    }
    
    public String getSubject() {
        return subject;
    }
}
