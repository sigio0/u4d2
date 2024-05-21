import java.util.Scanner;


public class Main4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int number=sc.nextInt();

        for(int i=number;i>0;i--){
            System.out.println(i);
        }
    }
}
