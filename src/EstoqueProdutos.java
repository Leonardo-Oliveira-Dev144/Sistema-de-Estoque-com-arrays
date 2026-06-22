import java.util.Scanner;

public class EstoqueProdutos {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] precos = new double[5];
        int[] qtds = new int[5];
        int opcao;
        int totalProdutos = 0;
        double total = 0;


        do {

            System.out.println("ESCOLHA UMA OPÇÃO:");

            System.out.println("1- CADASTRAR PRODUTO");
            System.out.println("2- LISTAR PRODUTOS");
            System.out.println("3- VALOR TOTAL DO ESTOQUE");
            System.out.println("4- SAIR");

            opcao = leitor.nextInt();

            if (opcao == 1){

                System.out.println("DIGITE O NOME DO PRODUTO:");
                nomes[totalProdutos] = leitor.next();

                System.out.println("DIGITE O PREÇO DO PRODUTO:");
                precos[totalProdutos] = leitor.nextDouble();

                System.out.println("DIGITE A QUANTIDADE:");
                qtds[totalProdutos] = leitor.nextInt();

                totalProdutos++;

            }

            if (opcao == 2){

                for (int i = 0; i < totalProdutos; i++) {

                    System.out.println("NOME DO PRODUTO: " + nomes[i]);
                    System.out.println("PREÇO DO PRODUTO: " + precos[i]);
                    System.out.println("QUANTIDADE DO PRODUTO EM ESTOQUE: " + qtds[i]);
                    System.out.println("----------------------------------");

                }


            }

            if (opcao == 3){

                for (int i = 0; i < totalProdutos; i++) {

                    total+= precos[i] * qtds[i];

                }
                System.out.println("VALOR TOTAL DO ESTOQUE: " + total);

            }

        }while (opcao != 4);

        leitor.close();

    }



}
