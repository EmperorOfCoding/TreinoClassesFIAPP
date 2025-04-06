public class PersonagemMagico {

    String nome;
    double nivelEnergia;
    double poderMagico;
    HabilidadeEspecial habilidade;

    public PersonagemMagico () {

    }

    public void atacar (String ataque) {

        if (nivelEnergia >= 10) {
            System.out.println(nome+ " realizou um ataque: " + ataque + "!");
            nivelEnergia -= 10;
        }

        else {
            System.out.println(nome + " está sem energia para atacar.");
        }

    }

    public double descansar (double qtdEnergia) {

        nivelEnergia = nivelEnergia + qtdEnergia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial () {

        if (!habilidade.habilitada) {
            System.out.println("Habilidade especial não está ativada");
        }

        else if (nivelEnergia >= habilidade.custoEnergia) {
            System.out.println("Ativando a habilidade: " + habilidade.nome);
            nivelEnergia -= habilidade.custoEnergia;
        }

        else {
            System.out.println(nome + " está sem energia para a habilidade especial!");
        }
    }






}
