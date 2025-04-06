import java.util.Scanner;

public class Menu {

    public static void main (String[] args) {

        Scanner myScanner = new Scanner(System.in);
        PersonagemMagico personagem = new PersonagemMagico();

        int op;

        do {
            System.out.println("Escolha uma opção: \n1 - Cadastrar Personagem \n2 - Exibir Personagem \n3 - Sair");
            op = myScanner.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Digite o nome do personagem:");
                    String nome = myScanner.next() + myScanner.nextLine();

                    System.out.println("Digite o poder do personagem:");
                    double poder = myScanner.nextDouble();

                    System.out.println("Digite o nível de energia");
                    double energia = myScanner.nextDouble();

                    personagem.nome = nome;
                    personagem.poderMagico = poder;
                    personagem.nivelEnergia = energia;

                    System.out.println("Digite o nome da habilidade especial:");
                    String nomeHabilidade = myScanner.next() + myScanner.nextLine();

                    System.out.println("Digite o custo de energia para usar a habilidade:");
                    double custoEnergia = myScanner.nextDouble();

                    System.out.println("A habilidade está ativada? (true/false):");
                    boolean ativada = myScanner.nextBoolean();

                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, custoEnergia, ativada);
                    personagem.habilidade = habilidadeEspecial;
                    break;

                case 2:
                    System.out.println("Nome: " + personagem.nome + " Poder: " + personagem.poderMagico + " Nível energia: " + personagem.nivelEnergia);
                    System.out.println("Habilidade: " + personagem.habilidade.nome + " Custo de Energia: " + personagem.habilidade.custoEnergia + " Habilitada: " + personagem.habilidade.habilitada);
                    break;

                case 3:
                    System.out.println("Finalizando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 3);

            myScanner.close();
        }


        }




