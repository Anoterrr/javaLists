public class buscaMatrizClass {
  private static void printVector(int[] vector) {
    for (int i = 0; i < vector.length; i++)
      System.out.print(vector[i] + " ");
      System.out.println();
  }

  private static int[] buscaMatriz(int[][] matriz, int target) {
    int[] finded = new int[2];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        if (matriz[i][j] == target) {
          finded[0] = i;
          finded[1] = j;
          return finded;
        }
      }
    }
    finded[0] = -1;
    finded[1] = -1;
    return finded;
  }

  public static void main(String[] args) throws Exception {
    int[][] matriz = { { 5, 7, 3 }, { 1, 0, 8 }, { 2, 2, 2 } };
    printVector(buscaMatriz(matriz, 90));
  }
}
