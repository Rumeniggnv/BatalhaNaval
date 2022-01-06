package com.rnv.batalhaNaval.view;

import com.rnv.batalhaNaval.controller.BatalhaNaval;
import com.rnv.batalhaNaval.domain.Tabuleiro;

import java.util.Arrays;
import java.util.Scanner;

public class BatalhaNavalView {
    private BatalhaNaval bnvController = new BatalhaNaval();

    public void showHeader() {
        System.out.println("╔══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓ B A T A L H A ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ N A V A L ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░▓▓▓▓▓▓▓▓▓▓░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓░░░░▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓░░░░▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓░░░░▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓░░░░▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓░░░░▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓░░░░▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓░░░░▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ [J] Jogar ▓▓▓▓▓▓▓▓▓▓▓▓▓ [S] Sair ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("║▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════╝");
    }

    private void showGrade() {
        System.out.println("---------------------------------------------");
        System.out.println("                " + this.bnvController.getJogo().getJogador().getName() + "                ");
        System.out.println("---------------------------------------------");
        System.out.println(this.bnvController.getJogo().getJogador().getTabuleiro().toString());
    }

    private void positioningShips() {
        this.bnvController.setJogo(new NovoJogoView(this.bnvController.getJogo()).create());
        System.out.print("Deseja posicionar os navios manualmente (S/N)? ");
        String resposta = new Scanner(System.in).next();

        if (resposta.equalsIgnoreCase("s")){
            int linha;
            int coluna;
            this.showGrade();

            for(int i = 0; i < 10; i++){
                //Delega a classe NovoJogoView para perguntar e validar as posições e as retorna.
                String pos = new NovoJogoView(this.bnvController.getJogo()).askPosicao(i);
                //Converte a letra da linha para a posição coorrespondente do array LABEL_LINHAS
                linha = String.valueOf( Tabuleiro.LABEL_LINHAS ).indexOf( pos.toUpperCase().charAt(0) );
                //Pega o número da coluna
                coluna = Integer.parseInt( pos.substring(1) );

                this.bnvController.prepareTabuleiroManualJogador(this.bnvController.getJogo().getJogador().getTabuleiro(), linha, coluna);
                this.showGrade();
            }
            this.bnvController.prepareTabuleiroManualComputador();
        }else{
            this.bnvController.prepareJogoAutomatico();
            this.showGrade();
        }
    }

    private void play() {
        System.out.println("Novo Jogo");
        this.positioningShips();
        //Mostra as posições dos navios do computador para fins de depuração, depois deve sair.
        System.out.println("--> Computador: " + Arrays.deepToString(this.bnvController.getJogo().getComputador().getTabuleiro().getGrid()));
        System.out.println("Navios estratégicamente posicionados, inicie o seu ataque!");
        do {
            System.out.printf("Jogada: %d\n", this.bnvController.getJogadas());
            String pos = new NovoJogoView(this.bnvController.getJogo()).askPosicao(null);
            //Verifica os tiros/posições
            this.bnvController.checaTiroJogador( pos );
            this.showGrade();
            this.bnvController.tiroComputador();
            System.out.println("--> Computador: " + Arrays.deepToString(this.bnvController.getJogo().getComputador().getTabuleiro().getGrid()));
        } while ( !this.bnvController.temNavio() );

    }

    public void show() {
        this.showHeader();
        boolean loop = true;
        System.out.print("Digite a sua opção: ");
        String op;
        do {
            op = new Scanner(System.in).next();
            switch (op.toUpperCase()) {
                case "J" :
                    this.play();
                    break;
                case "S":
                    loop = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while (loop);
    }
}
