package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExListas {
    public static void main(String[] args) {


        System.out.println("Digite a quantidade de funcionarios: ");
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        int howManyFuncioanrios = scanner.nextInt();

       for (int i = 0; i < howManyFuncioanrios; i++){


           System.out.println("Digite o nome:");
           scanner.nextLine();
           String name = scanner.nextLine();


           System.out.println("Digite o salario:");
           double salario = scanner.nextDouble();
           scanner.nextLine();



           funcionarios.add(new Funcionario(i+1,  name , salario));
        }

       for (Funcionario f : funcionarios ){
           System.out.println(f);
       }


    }
}


