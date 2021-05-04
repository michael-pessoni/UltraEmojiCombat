package ultraEmojiCombat;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    // Métodos públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
            System.out.println("Luta marcada!! Preparem-se...");
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("A luta não foi aprovada. Os lutadores não podem se enfrentar.");
        }
    }

    public void lutar(){
        if (aprovada){
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println("\n### DESAFIADO ###");
            this.desafiado.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0, 1 ou 2
            switch (vencedor){
                case 0: //Empate
                    System.out.println("Deu empate!!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println(desafiado.getNome() + " venceu a luta!!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.println(desafiante.getNome() + " venceu a luta!!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
            System.out.println("Que luta, meus amigos!! \nAté a proxima");
        }

    }

    // Métodos especiais

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
