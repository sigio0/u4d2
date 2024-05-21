import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una stringa e ti diro' se il totale dei caratteri è pari o dispari");
        String parola=sc.nextLine();
        System.out.println("Il numero è " +PariDispari(parola));
        System.out.println("Inserisci un anno");
        int anno=sc.nextInt();
        System.out.println("l anno è "+annoBisestile(anno));


    }

    public static boolean PariDispari(String parola){
        int cont=0;
        for(int i=0;i<parola.length();i++){
            cont++;

        }
         if(cont%2==0) {
             return true;
         } else return false;
    }

    public static boolean annoBisestile(int anno){
        if(anno%4==0){
            return true;
        } else return false;


    }

}
