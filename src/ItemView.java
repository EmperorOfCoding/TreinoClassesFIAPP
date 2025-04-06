import java.util.Scanner;

public class ItemView {

    public static void main (String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Item item = null;
        int op;

        do {
            System.out.println("Escolha uma opção: \n1 - Cadastrar Item \n2 - Exibir Item \n3 - Sair");
            op = myScanner.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Digite o nome do item:");
                    String nome = myScanner.next() + myScanner.nextLine();

                    System.out.println("Digite a descrição do item:");
                    String descricao = myScanner.next() + myScanner.nextLine();

                    System.out.println("O item é raro? (true/false):");
                    boolean raro = myScanner.nextBoolean();

                    System.out.println("Digite o nível do poder do item:");
                    double nivelPoder = myScanner.nextDouble();

                    item = new Item(nome, descricao, raro, nivelPoder);
                    break;

                case 2:
                    if (item != null) {
                        System.out.println(" Nome: " + item.nome + "\n Descricao: " + item.descricao + "\n Raro: " + item.raro + "\n Nível de poder: " + item.nivelPoder);
                    }

                    else {
                        System.out.println("Nenhum item foi cadastrado ainda! Por favor, cadastre um item.");
                    }
                    break;

                case 3:
                    System.out.println("Finalizando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 3);

        myScanner.close();
    }


}
