package part_3;

/*
Программа вычисляет расстояние проходимое светом
 */
public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;
        lightSpeed = 186000;
        days = 1000;

        /*
        Преобразовать в секунды
         */
        seconds = days * 24 * 60 * 60;

        /*
        Вычислить расстояние
         */
        distance = lightSpeed + seconds;
        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
