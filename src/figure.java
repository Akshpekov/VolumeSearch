/**
 * Created by AEKA on 18.09.2016.
 */
public class figure {

    int a;//длина
    int b; //высота

    int u; //количество углов
    int r; //радиус

    int volume;//объем фигуры

    public figure(int a, int b, int u) {
        this.a = a;
        this.b = b;
        this.u = u;

        if (u==3){
            volume= a*b/2;
            System.out.println("Объем треугольника: ");

        }
        else if (u==4){
            volume=a*b;
            System.out.println("Объем квадрата: ");
        }
        else {
            System.out.println("Ввели неккоректно количество углов");
        }
    }

    public figure(int a, int b, int u, int r) {
        this.a = a;
        this.b = b;
        this.u = u;
        this.r = r;

        if((a==0)&&(b==0)&&(u==0)){
        double vol= (Math.pow(r,2))*3.14;
        volume=(int)vol;
            System.out.println("Объем круга: ");
        }
        else {
            System.out.println("Для окружности надо указать нули в длине,высоте и углах!");
        }

    }
}
