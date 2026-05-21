import java.util.ArrayList;

// 泛型类 - 管理不同类型的对象
public class Manager<T> {
    private ArrayList<T> items;
    
    public Manager() {
        items = new ArrayList<>();
    }
    
    // 添加项目
    public void addItem(T item) {
        items.add(item);
    }
    
    // 获取项目
    public T getItem(int index) {
        return items.get(index);
    }
    
    // 显示所有项目
    public void displayAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }
    
    // 获取总项目数
    public int getTotalItems() {
        return items.size();
    }
}
