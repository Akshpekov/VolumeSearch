import java.util.Scanner;

/**
 * Created by AEKA on 18.09.2016.
 */
public class SearchVolume {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать!");

        System.out.println("Введите длину:");
        Scanner dl =new Scanner(System.in);
        int dlina = dl.nextInt();

        System.out.println("Введите высоту:");
        Scanner vs = new Scanner(System.in);
        int visota = vs.nextInt();

        System.out.println("Введите количество углов:");
        Scanner ug = new Scanner(System.in);
        int uglov = vs.nextInt();

        System.out.println("Введите радиус:");
        Scanner rd = new Scanner(System.in);
        int radius = rd.nextInt();

        if (radius==0) {
            figure figureinput = new figure(dlina, visota, uglov);
            System.out.println(figureinput.volume);
        }
        else {
            figure roundinput = new figure(dlina,visota,uglov,radius);
            System.out.println(roundinput.volume);
        }




    }
}
