import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int primeiroValor = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o segundo valor");
        int segundoValor = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o terceiro valor");
        int terceiroValor = Integer.parseInt(scanner.nextLine());
        menor_de_tres(primeiroValor,segundoValor,terceiroValor);
    }

    private static void menor_de_tres(int primeiroValor, int segundoValor, int terceiroValor) {
        if(primeiroValor < segundoValor && primeiroValor < terceiroValor){
            System.out.println("MENOR " +primeiroValor);
        } else if (segundoValor < primeiroValor && segundoValor < terceiroValor) {
            System.out.println("MENOR " +segundoValor);
        }else{
            System.out.println("MENOR " +terceiroValor);
        }
    }
}

/**
 * Problema "menor_de_tres"
 * Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três
 * números lidos. Em caso de empate, mostrar apenas uma vez.
 * Exemplo 1:
 * Primeiro valor: 7
 * Segundo valor: 3
 * Terceiro valor: 8
 * MENOR = 3
 * Exemplo 2:
 * Primeiro valor: 5
 * Segundo valor: 12
 * Terceiro valor: 5
 * MENOR = 5
 * Exemplo 3:
 * Primeiro valor: 9
 * Segundo valor: 9
 * Terceiro valor: 9
 * MENOR = 9
 */