import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int a,b,end;
        int total = 1,total2 = 1,total3 = 1;


        Scanner inp = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz: ");
        a = inp.nextInt();

        System.out.print("Oluşturmak istediğiniz alt kümelerin eleman sayısını giriniz:");
        b = inp.nextInt();
        int c = a - b;

        for (int i = 1; i <= a; i++) {
            total = total * i;

        }
        for (int i = 1; i <= b; i++) {
            total2 = total2 * i;
        }
        for (int i = 1; i <= c; i++) {
            total3 = total3 * i;
        }
        end = total / (total2 * total3);
        System.out.println("Alt küme sayısı:" + end);



    }
}