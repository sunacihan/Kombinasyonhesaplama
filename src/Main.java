import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r,n_fak=1,r_fak=1, nr_fak=1;
        Scanner input=new Scanner(System.in);
        System.out.print("N sayısını giriniz:");
        n=input.nextInt();

        System.out.print("R sayısını giriniz:");
        r=input.nextInt();

        for (int i=1;i<=n; i++){
            n_fak*=i;
        }
        for (int i=1;i<=r; i++){
            r_fak*=i;
        }
        for (int i=1;i<=(n-r); i++){
            nr_fak*=i;
        }
        double formul=n_fak/(r_fak*nr_fak);
        System.out.println("N sayısının R'li kombinasyonu:"+formul);
    }
}