public class ApenasCaracteres {

    public boolean isNumero(String str) {
        return isNumeroRecursiva(str);
    }

    private static boolean isNumeroRecursiva(String str) {
        if (str.isEmpty()) return true; // Case number ended 
        char primeiro = str.charAt(0);
        if (!Character.isDigit(primeiro)) return false;
        return isNumeroRecursiva(str.substring(1)); // Case recursive for the rest of numbers
    }
}
