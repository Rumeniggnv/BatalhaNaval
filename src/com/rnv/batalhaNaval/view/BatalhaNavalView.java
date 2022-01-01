package com.rnv.batalhaNaval.view;

import com.rnv.batalhaNaval.controller.BatalhaNaval;

import java.util.Scanner;

public class BatalhaNavalView {

//    private char[] linhas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
//    private char[][] grade = new char[10][10];
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
//        System.out.println("                J O G A D O R                ");
        System.out.println("                " + bnvController.getJogo().getJogador().getName() + "                ");
        System.out.println("---------------------------------------------");
//        //System.out.println("|   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |\n");
//        System.out.print("|   |");
//        for ( int i = 0; i < 10; i++) {
//            System.out.printf(" %d |", i);
//            if ( i == 9 ) System.out.println();
//        }
//        System.out.println("---------------------------------------------");
//        //Desenha a garde
//        for ( int l = 0; l < grade.length; l++ ) {
//            System.out.printf("| %s |", linhas[l]);
//            for ( int c = 0; c < grade.length; c++ ) {
//                System.out.printf(" %s |", grade[l][c]);
//                if ( c == 9 ) System.out.println();
//            }
//            System.out.println("---------------------------------------------");
//
//        }
        System.out.println(bnvController.getJogo().getJogador().getTabuleiro().toString());

        System.out.println("---------------------------------------------");
        System.out.println("                " + bnvController.getJogo().getComputador().getName() + "                ");
        System.out.println("---------------------------------------------");
        System.out.println(bnvController.getJogo().getComputador().getTabuleiro().toString());
    }

    private void play() {
        System.out.println("Novo Jogo");
//        for ( int l = 0; l < grade.length; l++ ) {
//            for ( int c = 0; c < grade.length; c++ ) {
//                grade[l][c] = ' ';
//            }
//        }
        bnvController.setJogo(new NovoJogoView().create());
        bnvController.prepareJogo();

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
