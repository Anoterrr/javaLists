import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Palavra {
  char[] vogal;
  char[] consonant;

  public void Palavra(char[] vogal, char[] consonant) {
    this.vogal = vogal;
    this.consonant = consonant;
  }
}

public static Palavra criaPalavra(String str) {
  char[] chars = str.toCharArray();
  Set<Character> vogaisSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
  Set<Character> vogais = new HashSet<>();
  Set<Character> consoantes = new HashSet<>();

  for (char c : chars) {
      if (vogaisSet.contains(Character.toLowerCase(c))) {
          vogais.add(Character.toLowerCase(c));
      } else if (Character.isLetter(c)) {
          consoantes.add(Character.toLowerCase(c));
      }
  }


  return new Palavra(vogais.toArray(new Character[0]), consoantes.toArray(new Character[0]));
}

public static void main() {
  String str = "exemplo de palavra";
  Palavra palavra = criaPalavra(str);
  System.out.println("Vogais: " + Arrays.toString(palavra.vogal));
  System.out.println("Consoantes: " + Arrays.toString(palavra.consonant));

}