// 抽象类 - 表示学校系统中的人员
public abstract class Person {
    private String name;
    private int id;
    
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    // 具体方法
    public void displayBasicInfo() {
        System.out.println("姓名: " + name + ", ID: " + id);
    }
    
    // 抽象方法
    public abstract String getRole();
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
}
