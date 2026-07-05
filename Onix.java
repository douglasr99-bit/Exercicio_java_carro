// package Exercicios;

import java.util.Scanner;

public class Onix {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        Controle_carro onix = new Controle_carro();

        while (true){
            System.out.println(" ");
            System.out.println("                *Seu carro*                   ");
            System.out.println("======================================================");
            System.out.println(" Controles\n" +
                    "1- Status\n" +
                    "2- Ligar\n" +
                    "3- Desligar\n" +
                    "4- Acelerar\n" +
                    "5- Desacelerar\n" +
                    "6- Direção\n" +
                    "7- Marcha\n" +
                    "======================================================");
            int opcao = scanner.nextInt();
            if (opcao == 1){
                onix.getstatus_carro();
            } else if (opcao == 2) {
                onix.setLigar_carro();
            } else if (opcao == 3) {
                onix.setDesligar_carro();
            } else if (opcao == 4) {
                onix.setAcelerar();
            }else if (opcao == 5) {
                onix.setDesacelerar();
            } else if (opcao == 6) {
                System.out.println("Qual direçãod deseja virar ? 'direta' ou 'esquerda'");
                var dirc = scanner.next();
              onix.setDirecao(dirc);
            }else if (opcao == 7) {
                System.out.println("Qual direçãod deseja virar ? 'direta' ou 'esquerda'");
                int march = scanner.nextInt();
                onix.setMarcha(march);
            }else {
                System.out.println("Opção invalida!!!");
            }
        }
    }
}
