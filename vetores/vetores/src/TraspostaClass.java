public class TraspostaClass {
  private static void printMatriz(int[][] matriz) {
    for(int i = 0; i < matriz.length; i ++) {
      for(int j = 0; j < matriz.length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }

  private static int[][] trasposta(int[][] matriz) {
    if(matriz == null) return null;
    int[][] matrizTrasposta = new int[3][3];
    for(int i = 0; i < matriz.length; i ++) {
      for(int j = 0; j < matriz.length; j++) {
        matrizTrasposta[j][i] = matriz[i][j];
      }
    }
    return matrizTrasposta;
  }

  public static void main(String[] args) throws Exception {
    int[][] matriz = { { 5, 7, 3 }, { 1, 0, 8 }, { 2, 2, 2 } };
    printMatriz(trasposta(matriz));
  }
}
