import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // Declaration Scanner
        Palavras pl = new Palavras(); // Obj Palavras declaration 
        Binaria bi = new Binaria(); // Obj Binaria declaration
        ApenasCaracteres ap = new ApenasCaracteres(); // obj ApenasCaracteres declaration
        int i = 0; // While stopper 
        while(1 > i) {
            System.out.println("Qual das classes deseja utilizar: (ApenasCaracteres = 1; Binaria = 2; Palavras = 3)");
            String str = sc.nextLine(); // Read witch class 
            switch(str) {
                case "1": // Case Class ApenasCaracteres
                    System.out.println("Digite uma numero: ");
                    str = sc.nextLine(); // Read user input
                    System.out.println(ap.isNumero(str));
                    // i = 1; // Terminate while
                    break; // Skip rest switch
                case "2":
                    System.out.println("Digite um decimal para binario: ");
                    str = sc.nextLine(); // Read user input
                    System.out.println(bi.baseBinaria(str));
                    i = 1; // Terminate while
                    break; // Skip rest switch
                case "3":
                    System.out.println("Digite um palindromo: ");
                    str = sc.nextLine(); // Read user input
                    System.out.println(pl.isPalindromo(str));
                    i = 1; // Terminate while
                    break; // Skip rest switch
                default: 
                    System.out.println("Digite uma classe valida!");
                    break; // Skip rest switch
            }
        }
    }
}
