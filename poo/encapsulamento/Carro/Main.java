package encapsulamento.carro;

public class Main {
    public static void  main( String[] arg){

        Carro c1 = new Carro("Civic");

        c1.status();
        c1.ligarCarro();

        c1.acelerar();
        c1.trocarMarcha(1);
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        c1.trocarMarcha(3);
        c1.acelerar();
        c1.trocarMarcha(2);
        c1.acelerar();

        c1.verificarVelocidade();






    }
}
