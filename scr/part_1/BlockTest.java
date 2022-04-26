package part_1;

/*
Демонстрация применения блоков кода
 */
public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;
        for (int i = 0; i < 10; i++) {
            System.out.println("Значение i: " + i);
            System.out.println("Значение y: " + y);
            y -= 2;
        }
    }
}
