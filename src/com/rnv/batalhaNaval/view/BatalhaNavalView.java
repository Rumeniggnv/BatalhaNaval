package com.rnv.batalhaNaval.view;

import com.rnv.batalhaNaval.controller.BatalhaNaval;

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
        System.out.println("Deseja escolher as posições dos navios manualmente? SIM ou NAO");
        resposta = scan.next();

        if (resposta.toUpperCase().equals("SIM")){
            Integer linha;
            Integer coluna;
            for(int i = 0; i < 10; i++){
                System.out.println("Informe uma linha de 0 a 9");
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
                }
                bnvController.prepareTabuleiroManualJogador(bnvController.getJogo().getJogador().getTabuleiro(), linha, coluna);
                System.out.printf("Inserido em linha: %s coluna: %s%n", linha, coluna);
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
