import java.util.Scanner;

public class Computador {
  private int ram;
  private int hdd;
  private String processador;
  private boolean estaLigado;

  public Computador(int ram, int hdd, String processador, boolean estaLigado) {
    this.ram = ram;
    this.hdd = hdd;
    this.processador = processador;
    this.estaLigado = estaLigado;
  }

  public void desligar() {
    this.estaLigado = false;
    System.out.println("Computador desligado!");
  }

  public void ligar() {
    this.estaLigado = true;
    System.out.println("Computador ligado!");
  }

  public String mostrarInformacoes() {
    return this.processador + " RAM " + this.ram;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Computador computador = new Computador(4, 500, "Intel pentium", false);
    boolean over = true;
    while (over) {
      System.out.println(computador.mostrarInformacoes());
      System.out.println("l = Ligar, f = Desligar | Deseja parar? (s = sim)");
      String input = sc.next();
      if (input.equals("l") || input.equals("L"))
        computador.ligar();
      if (input.equals("f") || input.equals("F"))
        computador.desligar();
      if (input.equals("s") || input.equals("S"))
        over = false;
    }
  }
}