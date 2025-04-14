import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        double numeroUmCalculo = scanner.nextDouble();

        System.out.println("Digite outro número");
        double numeroDoisCalculo = scanner.nextDouble();

        System.out.println("Digite a operação do cálculo");
        String operacaoDoCalculo = scanner.next();

        switch (operacaoDoCalculo) {
            case "+":
                double soma = numeroUmCalculo + numeroDoisCalculo;
                System.out.println("A soma dos dois números é: " + soma);
                break;
            case "-":
                double subtracao = numeroUmCalculo - numeroDoisCalculo;
                System.out.println("A subtração dos dois números é: " + subtracao);
                break;
            case "*":
                double multiplicacao = numeroUmCalculo * numeroDoisCalculo;
                System.out.println("A multiplicação dos Dois números é: " + multiplicacao);
                break;
            case "/":
                double divisao = numeroUmCalculo / numeroDoisCalculo;
                System.out.println("A divisão dos dois números é: "+ divisao);
            default:
                System.out.println("Inválido");

                scanner.close();

        }
    }
}
