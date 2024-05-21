import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("inserisci una stringa");
        String parola=sc.nextLine();
        do {


            for(int i=0;i<parola.length();i++){
                System.out.println(parola.charAt(i)+",");
            }


        }while(parola!=":q");
    }


}
