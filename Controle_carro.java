// package removed to match expected default package

import java.util.Objects;

public class Controle_carro {

    boolean carro_ligado = false;

    int velocidade = 0;

    String direcao = "";

    int marcha = 0;


    public Controle_carro(){
        this.carro_ligado = false;
        this.velocidade = 0;
        this.marcha = 0;

    }

    public void getstatus_carro(){

        if (!this.carro_ligado){
            System.out.println("Seu veiculo encontra-se desligado! ");
        }else {
            System.out.println("Seu veiculo encontra-se ligado! ");
        }
        System.out.printf("Marcha: %s\n",marcha);
        System.out.printf("Velocidade: %s\n",velocidade);
    }

    public void setLigar_carro(){
        if (!this.carro_ligado){
            System.out.println("Vrummmmmm Vrummmmmm! ");
            this.carro_ligado = true;
        }else {
            System.out.println("Seu veículo já está ligado pé na tábua! ");
        }

    }
    public void setDesligar_carro(){
        if (this.marcha == 0 && this.velocidade ==0){
            this.carro_ligado = false;
            System.out.println("Carro desligado!!! ");
        }else {
            System.out.println("pare o carro para desliga-lo");
        }
    }

    public void setAcelerar(){
        if (!this.carro_ligado){
            System.out.println("Seu veículo está desligado, ligue-o para começar a brincadeira! ");
        } else if (this.velocidade == 120) {
            System.out.println("Seu veículo está na velocidade maxima permitida");
        } else if (this.marcha == 0) {
            System.out.println("Seu veículo está em ponto morto não pode acelerar");
        } else {
            if ((this.velocidade >= 0 && this.velocidade < 20) && this.marcha == 1){
                this.velocidade += 1;
                System.out.printf("Velocidade atual: %s\n", this.velocidade);
            } else if ((this.velocidade >= 20 && this.velocidade < 40) && this.marcha == 2) {
                this.velocidade += 1;
                System.out.printf("Velocidade atual: %s\n", this.velocidade);
            }else if ((this.velocidade >= 40 && this.velocidade < 60) && this.marcha == 3) {
                this.velocidade += 1;
                System.out.printf("Velocidade atual: %s\n", this.velocidade);
            }else if ((this.velocidade >= 60 && this.velocidade < 80) && this.marcha == 4) {
                this.velocidade += 1;
                System.out.printf("Velocidade atual: %s\n", this.velocidade);
            }else if ((this.velocidade >= 80 && this.velocidade < 100) && this.marcha == 5) {
                this.velocidade += 1;
                System.out.printf("Velocidade atual: %s\n", this.velocidade);
            }else if ((this.velocidade >= 100 && this.velocidade < 120) && this.marcha == 6) {
                this.velocidade += 1;
                System.out.printf("Velocidade atual: %s\n", this.velocidade);
            }else {
                System.out.println("Para aumentar a velocidade mude de marcha!!!");
            }
        }
    }

    public void setDesacelerar(){
        if (!this.carro_ligado){
            System.out.println("Seu veículo está desligado, ligue-o para começar a brincadeira! ");
        }else {
            if (this.velocidade == 0){
                System.out.println("Seu veículo está na velocidade minima permitida");
            }else {
                if ((this.velocidade >= 0 && this.velocidade <= 21) && this.marcha == 1){
                    this.velocidade -= 1;
                    System.out.printf("Velocidade atual: %s\n", this.velocidade);
                } else if ((this.velocidade > 21 && this.velocidade <= 41) && this.marcha == 2) {
                    this.velocidade -= 1;
                    System.out.printf("Velocidade atual: %s\n", this.velocidade);
                }else if ((this.velocidade > 41 && this.velocidade <= 61) && this.marcha == 3) {
                    this.velocidade -= 1;
                    System.out.printf("Velocidade atual: %s\n", this.velocidade);
                }else if ((this.velocidade > 61 && this.velocidade <= 81) && this.marcha == 4) {
                    this.velocidade -= 1;
                    System.out.printf("Velocidade atual: %s\n", this.velocidade);
                }else if ((this.velocidade > 81 && this.velocidade <= 101) && this.marcha == 5) {
                    this.velocidade -= 1;
                    System.out.printf("Velocidade atual: %s\n", this.velocidade);
                }else if ((this.velocidade > 101 && this.velocidade <= 121) && this.marcha == 6) {
                    this.velocidade -= 1;
                    System.out.printf("Velocidade atual: %s\n", this.velocidade);
                }else {
                    System.out.println("Para diminuir a velocidade mude de marcha!!!");
                }
            }
        }
    }

    public void setDirecao(String direcao){
        if (!this.carro_ligado){
            System.out.println("Seu veículo está desligado, ligue-o para começar a brincadeira! ");
        }else {
            if (this.velocidade >= 1 && this.velocidade <=40) {
                if (Objects.equals(direcao, "direita")) {
                    System.out.println("Virar a direita! ");
                } else if (Objects.equals(direcao, "esquerda")) {
                    System.out.println("Virar a esquerda! ");
                } else {
                    System.out.println("Opção invalida!! ");
                }
            } else if (this.velocidade > 40) {
                System.out.println("O carro está muito rapido para realizar conversão");
            }else {
                System.out.println("O carro não está em movimento!!! ");
            }
        }
    }

    public void setMarcha(int marcha){

        if (!this.carro_ligado){
            System.out.println("Seu veículo está desligado, ligue-o para começar a brincadeira! ");
        } else if (marcha > 6) {
            System.out.println("Limite da marcha atingida, seu veiculo tem apenas 6 marchas!!! ");
        } else if (marcha < 0) {
            System.out.println("Essa marcha não existe!!!");
        } else {
            if (marcha != (this.marcha + 1 ) && marcha!= (this.marcha - 1)){
                System.out.println("Não é possível pular marcha nesse veiculo");
            }else {
                this.marcha = marcha;
                System.out.printf("Marcha: %s \n",this.marcha);
            }
        }

    }

    public void test_marcha(int velocidade){
        this.velocidade = velocidade;
    }

}
