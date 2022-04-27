package part_3;

/*
Демонстрация приведения типов
 */
public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nПреобразование типа инт в байт");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("\nПреобразование типа дабл в инт");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("\nПреобразование типа дабл в байт");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }
}
