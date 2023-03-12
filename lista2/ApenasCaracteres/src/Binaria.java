import java.util.Stack;

public class Binaria {
    public String baseBinaria(Stack<Integer> binary, int input){ 
        if(input <= 0) return binary.toString().replaceAll("[^0-9]", "");
        int i = input % 2 == 0 ? binary.push(0) : binary.push(1); // "i" apenas para comparação funcionar
        return baseBinaria(binary, input = input / 2); // Recusividade para demais binarios
    }
}
