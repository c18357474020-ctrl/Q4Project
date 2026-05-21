// 测试类 - 主程序
public class Main {
    public static void main(String[] args) {
        System.out.println("===== 学生课程管理系统 =====\n");
        
        // 创建教师
        Teacher teacher1 = new Teacher("王老师", 2001, "计算机科学");
        Teacher teacher2 = new Teacher("李老师", 2002, "数学");
        System.out.println("添加教师成功");
        System.out.println("教师: " + teacher1.getName() + " (科目: " + teacher1.getSubject() + ")");
        System.out.println("教师: " + teacher2.getName() + " (科目: " + teacher2.getSubject() + ")\n");
        
        // 创建学生
        Student student1 = new Student("张三", 1001, 11);
        Student student2 = new Student("李四", 1002, 11);
        Student student3 = new Student("王五", 1003, 12);
        System.out.println("添加学生成功");
        System.out.println("学生: " + student1.getName());
        System.out.println("学生: " + student2.getName());
        System.out.println("学生: " + student3.getName() + "\n");
        
        // 创建课程
        Course course1 = new Course("AP计算机科学", teacher1);
        Course course2 = new Course("高等数学", teacher2);
        System.out.println("添加课程成功");
        System.out.println("课程: " + course1.getCourseName());
        System.out.println("课程: " + course2.getCourseName() + "\n");
        
        // 学生选课
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student2);
        course2.enrollStudent(student3);
        System.out.println("学生选课成功");
        System.out.println(student1.getName() + " 选了 " + course1.getCourseName());
        System.out.println(student2.getName() + " 选了 " + course1.getCourseName());
        System.out.println(student2.getName() + " 选了 " + course2.getCourseName());
        System.out.println(student3.getName() + " 选了 " + course2.getCourseName() + "\n");
        
        // 使用泛型Manager
        Manager<Student> studentManager = new Manager<>();
        studentManager.addItem(student1);
        studentManager.addItem(student2);
        studentManager.addItem(student3);
        
        Manager<Course> courseManager = new Manager<>();
        courseManager.addItem(course1);
        courseManager.addItem(course2);
        
        System.out.println("===== 显示所有学生 =====");
        for (int i = 0; i < studentManager.getTotalItems(); i++) {
            Student s = studentManager.getItem(i);
            s.displayBasicInfo();  // 调用抽象类的具体方法
            System.out.println("角色: " + s.getRole());  // 调用重写的抽象方法
        }
        
        System.out.println("\n===== 显示所有课程 =====");
        for (int i = 0; i < courseManager.getTotalItems(); i++) {
            Course c = courseManager.getItem(i);
            c.printGradeReport();  // 调用接口方法
        }
        
        // 多态演示
        System.out.println("\n===== 多态演示 =====");
        Person p1 = new Student("张三", 1001, 11);
        Person p2 = new Teacher("王老师", 2001, "计算机科学");
        System.out.println(p1.getName() + " 的角色: " + p1.getRole());
        System.out.println(p2.getName() + " 的角色: " + p2.getRole());
        
        // 搜索学生（额外功能）
        System.out.println("\n===== 搜索学生 =====");
        String searchName = "李四";
        searchStudent(studentManager, searchName);
    }
    
    // 搜索学生的方法
    private static void searchStudent(Manager<Student> studentManager, String name) {
        for (int i = 0; i < studentManager.getTotalItems(); i++) {
            Student s = studentManager.getItem(i);
            if (s.getName().equals(name)) {
                System.out.println("找到学生: " + s.getName() + " (ID: " + s.getId() + ")");
                return;
            }
        }
        System.out.println("未找到学生: " + name);
    }
}
