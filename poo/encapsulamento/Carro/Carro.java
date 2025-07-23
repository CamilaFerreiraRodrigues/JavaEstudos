package encapsulamento.carro;

import java.util.Objects;

public class Carro {
    private String nomeCarro;
    private int marcha;
    private float velocidade;
    private boolean ligado;

    public Carro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
        this.marcha = 0;
        this.velocidade = 0;
        this.setLigado(false);
    }

    public void status() {
        System.out.println(this.nomeCarro);
        System.out.println(this.marcha);
        System.out.println(this.velocidade);
        System.out.println(this.ligado);
    }

    public void ligarCarro() {
        setLigado(true);
        System.out.println("Você ligou o carro ;)");
    }

    public void desligarCarro() {
        if ((Objects.equals(getMarcha(), 0)) && (Objects.equals(getVelocidade(), 0))) {
            setLigado(false);
            System.out.println("Você desligou o carro :)");
        } else {
            System.out.println("O carro está em movimento e não pode ser desligado :(");
        }
    }

    public void acelerar() {
        if (isLigado()) {
            switch (getMarcha()) {
                case 0:
                    System.out.println("O carro está em ponto morto, não permite acelerar.");
                    break;
                case 1:
                    if (this.velocidade >= 0 && this.velocidade <= 19) {
                        this.velocidade++;
                        System.out.println("Sua velocidade é " + getVelocidade() + "Km/h");
                    } else {
                        System.out.println("Velocidade fora da faixa de primeira marcha :(. Troque a marcha para aumentar a velocidade :)");
                    }
                    break;
                case 2:
                    if (getVelocidade() >= 20 && getVelocidade() <= 39) {
                        this.velocidade++;
                        System.out.println("Sua velocidade é " + getVelocidade() + "Km/h");
                    } else {
                        System.out.println("Velocidade fora da faixa de segunda marcha :(. Troque a marcha para aumentar a velocidade :)");
                    }
                    break;
                case 3:
                    if (getVelocidade() >= 40 && getVelocidade() <= 59) {
                        this.velocidade++;
                        System.out.println("Sua velocidade é " + getVelocidade() + "Km/h");
                    } else {
                        System.out.println("Velocidade fora da faixa de terceira marcha :(. Troque a marcha para aumentar a velocidade :)");
                    }
                    break;
                case 4:
                    if (getVelocidade() >= 60 && getVelocidade() <= 79) {
                        this.velocidade++;
                        System.out.println("Sua velocidade é " + getVelocidade() + "Km/h");
                    } else {
                        System.out.println("Velocidade fora da faixa de quarta marcha :(. Troque a marcha para aumentar a velocidade :)");
                    }
                    break;
                case 5:
                    if (getVelocidade() >= 80 && getVelocidade() <= 99) {
                        this.velocidade++;
                        System.out.println("Sua velocidade é " + getVelocidade() + "Km/h");
                    } else {
                        System.out.println("Velocidade fora da faixa de quinta marcha :(. Troque a marcha para aumentar a velocidade :)");
                    }
                    break;
                case 6:
                    if (getVelocidade() >= 100 && getVelocidade() <= 119) {
                        this.velocidade++;
                        System.out.println("Sua velocidade é " + getVelocidade() + "Km/h");
                    } else {
                        System.out.println("Velocidade fora da faixa de sexta marcha :(. Troque a marcha para aumentar a velocidade :)");
                    }
                    break;
                default:
                    System.out.println("O máximo que pode acelerar é até 120km/h.");
            }
        }
    }

    public void diminuirVelocidade() {
        if (isLigado()) {
            switch (getMarcha()) {
                case 0:
                    System.out.println("O carro está em ponto morto, não permite diminuir.");
                    break;
                case 1:
                    if (this.velocidade >= 0 && this.velocidade <= 20) {
                        this.velocidade--;
                        System.out.println("Sua velocidade é " + getVelocidade() + "Km/h");
                    } else {
                        System.out.println("Velocidade fora da faixa de primeira marcha :(. Troque a marcha para diminuir a velocidade :)");
                    }
                    break;
                case 2:
                    if (getVelocidade() >= 21 && getVelocidade() <= 40) {
                        this.velocidade--;
                        System.out.println("Sua velocidade é " + getVelocidade() + "Km/h");
                    } else {
                        System.out.println("Velocidade fora da faixa de segunda marcha :(. Troque a marcha para diminuir a velocidade :)");
                    }
                    break;
                case 3:
                    if (getVelocidade() >= 41 && getVelocidade() <= 60) {
                        this.velocidade--;
                        System.out.println("Sua velocidade é " + getVelocidade() + "Km/h");
                    } else {
                        System.out.println("Velocidade fora da faixa de terceira marcha :(. Troque a marcha para diminuir a velocidade :)");
                    }
                    break;
                case 4:
                    if (getVelocidade() >= 61 && getVelocidade() <= 80) {
                        this.velocidade--;
                        System.out.println("Sua velocidade é " + getVelocidade() + "Km/h");
                    } else {
                        System.out.println("Velocidade fora da faixa de quarta marcha :(. Troque a marcha para diminuir a velocidade :)");
                    }
                    break;
                case 5:
                    if (getVelocidade() >= 81 && getVelocidade() <= 100) {
                        this.velocidade--;
                        System.out.println("Sua velocidade é " + getVelocidade() + "Km/h");
                    } else {
                        System.out.println("Velocidade fora da faixa de quinta marcha :(. Troque a marcha para diminuir a velocidade :)");
                    }
                    break;
                case 6:
                    if (getVelocidade() >= 100 && getVelocidade() <= 120) {
                        this.velocidade--;
                        System.out.println("Sua velocidade é " + getVelocidade() + "Km/h");
                    } else {
                        System.out.println("Velocidade fora da faixa de sexta marcha :(. Troque a marcha para diminuir a velocidade :)");
                    }
                    break;
                default:
                    System.out.println("O mínimo que pode atingir é 0km/h.");
            }
        }
    }

    public void verificarVelocidade() {
        if (isLigado()) {
            System.out.println("Sua Velocidade: " + getVelocidade());
        }
    }

    public void trocarMarcha(int marcha) {
        if (isLigado()) {
            switch (getMarcha()) {
                case 0:
                    if (marcha == 1) {
                        setMarcha(marcha);
                        System.out.println("Marcha trocada para: " + marcha);
                    } else {
                        System.out.println("Você está em ponto morto! Precisa passar para a primeira marcha :)");
                    }
                    break;
                case 1:
                    if (marcha == 2 || marcha == 0) {
                        setMarcha(marcha);
                        System.out.println("Marcha trocada para: " + marcha);
                    } else {
                        System.out.println("Você está em " + getMarcha() + ". Precisa passar para segunda marcha ou reduzir para ponto morto :)");
                    }
                    break;
                case 2:
                    if (marcha == 1 || marcha == 3) {
                        setMarcha(marcha);
                        System.out.println("Marcha trocada para: " + marcha);
                    } else {
                        System.out.println("Você está em " + getMarcha() + ". Precisa passar para terceira marcha ou reduzir para primeira :)");
                    }
                    break;
                case 3:
                    if (marcha == 2 || marcha == 4) {
                        setMarcha(marcha);
                        System.out.println("Marcha trocada para: " + marcha);
                    } else {
                        System.out.println("Você está em " + getMarcha() + ". Precisa passar para quarta marcha ou reduzir para segunda :)");
                    }
                    break;
                case 4:
                    if (marcha == 3 || marcha == 5) {
                        setMarcha(marcha);
                        System.out.println("Marcha trocada para: " + marcha);
                    } else {
                        System.out.println("Você está em " + getMarcha() + ". Precisa passar para quinta marcha ou reduzir para terceira :)");
                    }
                    break;
                case 5:
                    if (marcha == 4 || marcha == 6) {
                        setMarcha(marcha);
                        System.out.println("Marcha trocada para: " + marcha);
                    } else {
                        System.out.println("Você está em " + getMarcha() + ". Precisa passar para sexta marcha ou reduzir para quarta :)");
                    }
                    break;
                case 6:
                    if (marcha == 5) {
                        setMarcha(marcha);
                        System.out.println("Marcha trocada para: " + marcha);
                    } else {
                        System.out.println("Você está em " + getMarcha() + ". Só pode reduzir para quinta marcha :)");
                    }
                    break;
                default:
                    System.out.println("Marcha inválida!");
            }
        }
    }

    public void virarCarro(String lado) {
        if (getVelocidade() >= 1 && getVelocidade() <= 40 && isLigado()) {
            System.out.println("Virando carro... para " + lado);
        }
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
