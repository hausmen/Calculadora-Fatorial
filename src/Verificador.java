import java.util.Scanner;

public class Verificador {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Informe um número positivo: ");
            numero = ler.nextInt();
            if (numero<0){
                System.out.println("Digite números positivos.");
            }
        }while (numero<0);

        Numero n1 = new Numero(numero);
        int opcao;

        do {
            System.out.println("1 - Visualizar número informado");
            System.out.println("2 - Alterar número");
            System.out.println("3 - Visualizar fatorial do número");
            System.out.println("4 - Visualizar somatório do número");
            System.out.println("5 - Visualizar quantidade de múltiplos do número");
            System.out.println("6 - Ver se o número é primo");
            System.out.println("0 - Sair");
            opcao = ler.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("Número informado: "+n1.getValor());
                    System.out.println();
                    break;
                case 2:
                    int novoNumero;
                    do {
                        System.out.println("Informe o novo número: ");
                        novoNumero = ler.nextInt();
                        System.out.println();
                        if (novoNumero<0) {
                            System.out.println("Informe números positivos.");
                        }
                    }while(novoNumero<0);
                    n1.setValor(novoNumero);
                    System.out.println("Número alterado com sucesso.");
                    System.out.println();
                    break;
                case 3:
                    int fatorial = n1.calcularFatorial();
                    System.out.println("O fatorial de "+n1.getValor()+" é: "+fatorial);
                    System.out.println();
                    break;
                case 4:
                    int somatorio = n1.calcularSomatorio();
                    System.out.println("O somatório de "+n1.getValor()+ " é: "+somatorio);
                    System.out.println();
                    break;
                case 5:
                    int quantidade = n1.contarMultiplos();
                    System.out.println("A quantidade de múltiplos de "+n1.getValor()+" é: "+quantidade);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("O número "+n1.verificarPrimo());
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Sistema finalizado.");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    System.out.println();
            }
        }while(opcao != 0);
    }
}
