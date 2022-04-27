package part_3;
/*
Программа вычисляет площадь круга по формуле
 */
public class Area {
    public static void main(String[] args) {
        double pi, radius, area;
        radius = 10.8;
        pi = 3.1416;
        area = pi * radius * radius;
        System.out.println("Площадь круга равна " + area);
    }
}
