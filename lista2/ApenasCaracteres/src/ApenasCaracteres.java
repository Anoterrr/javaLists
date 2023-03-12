public class ApenasCaracteres {
    public static boolean isNumero(String str) {
        if (str.isEmpty()) return true; // Case number ended 
        char primeiro = str.charAt(0);
        if (!Character.isDigit(primeiro)) return false;
        return isNumero(str.substring(1)); // Case recursive for the rest of numbers
    }
}
