package com.rnv.batalhaNaval.view;

import com.rnv.batalhaNaval.controller.BatalhaNaval;
import com.rnv.batalhaNaval.domain.Tabuleiro;

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
        System.out.println("                " + bnvController.getJogo().getJogador().getName() + "                ");
        System.out.println("---------------------------------------------");
        System.out.println(bnvController.getJogo().getJogador().getTabuleiro().toString());
    }

    private void play() {
        Scanner scan = new Scanner(System.in);
        String resposta;
        System.out.println("Novo Jogo");
        bnvController.setJogo(new NovoJogoView().create());
        System.out.println("Deseja posicionar os navios manualmente (S/N)?");
        resposta = scan.next();

        if (resposta.equalsIgnoreCase("s")){
            int linha;
            int coluna;
            this.showGrade();

            for(int i = 0; i < 10; i++){
                /*System.out.printf("Informe a posição do %dº navio. Ex.(A0/a0): ", i+1);
                linha = scan.nextInt();
                System.out.println("Informe uma coluna de 0 a 9");
                coluna = scan.nextInt();

                while(linha > 9 || coluna > 9 ) {
                    if(linha > 9){
                        System.out.println("linha inválida, tente novamente");
                        linha = scan.nextInt();
                    }
                    if(coluna > 9){
                        System.out.println("coluna inválida, tente novamente");
                        coluna = scan.nextInt();
                    }
                }*/
                //Delega a classe NovoJogoView para perguntar e validar as posições e as retorna.
                String pos = new NovoJogoView().askPosicao(i);
                //Converte a letra da linha para a posição coorrespondente do array LABEL_LINHAS
                linha = String.valueOf( Tabuleiro.LABEL_LINHAS ).indexOf( pos.toUpperCase().charAt(0) );
                //Pega o número da coluna
                coluna = Integer.parseInt( pos.substring(1) );

                bnvController.prepareTabuleiroManualJogador(bnvController.getJogo().getJogador().getTabuleiro(), linha, coluna);
                System.out.printf("Inserido em linha: %s coluna: %s%n", linha, coluna);
                this.showGrade();
            }
            bnvController.prepareTabuleiroManualComputador();
        }else{
            bnvController.prepareJogoAutomatico();
        }
        this.showGrade();
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
