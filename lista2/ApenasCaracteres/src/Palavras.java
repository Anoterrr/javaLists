public class Palavras {

    public boolean isPalindromo(char[] palavra) {
        return isPalindromoRecursivo(palavra, 0, palavra.length - 1);
    }
            
    private static boolean isPalindromoRecursivo(char[] palavra, int inicio, int fim) {
        if (inicio >= fim) return true;// Case word has 1 or 0 caracter
        else if (palavra[inicio] != palavra[fim]) return false;// Case initial caracter and final are diferent
        else return isPalindromoRecursivo(palavra, inicio + 1, fim - 1);  // Call recursive function for the rest of words
    }
}
