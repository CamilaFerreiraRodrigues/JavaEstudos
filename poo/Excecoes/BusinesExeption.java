package org.Excecoes;

//RuntimeException -> não exige tratamento
// Exception -. exige tratamento

public class BusinesExeption extends RuntimeException {

    public BusinesExeption(String msg){
        super(msg);
    }
}
