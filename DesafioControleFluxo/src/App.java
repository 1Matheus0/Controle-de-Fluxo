import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Digite o primeiro número: ");
    int parametro1 = leia.nextInt();
    
    System.out.println("Digite o segundo número: ");
    int parametro2 = leia.nextInt();
    
    try {
        contar(parametro1, parametro2);
    } catch (ParametrosInvalidosException e) {
        System.out.println(e.getMessage());
    }
    
    leia.close();
}

public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
    if (parametro1 > parametro2) {
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }
    
    for (int i = 1; i <= (parametro2 - parametro1); i++) {
        System.out.println("Imprimindo o número " + i);
    }

    }
}
