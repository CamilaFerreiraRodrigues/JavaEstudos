package org.composicao;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args) throws ParseException {
        
        List<Worker> workers = new ArrayList<Worker>();
        List<HourContrat> contrats = new ArrayList<>();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        //-------WORKER´S DATE
        System.out.println("Enter departament´s name: ");
        String departamentName = sc.nextLine();

        System.out.println("---Enter worker data---");
        System.out.println("Name: ");
        String name =  sc.nextLine();

        System.out.println("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());

        System.out.println("Base salary: ");
        double baseSalary = sc.nextDouble();


        Worker worker =  new Worker( name, level, baseSalary, new Departament(departamentName));

        //------CONTRACT´S DATE
        System.out.println("---How many contratcs to this worker---");

        int numContracts = sc.nextInt();

        for (int i = 1; i <= numContracts; i++ ){

            System.out.println("--Enter contract #"+ i +"--");
            System.out.println("Date: ");
            Date date = formato.parse(sc.next()); // formatando o formato da dta
            System.out.println("Value per hour: ");
            double value = sc.nextDouble();
            System.out.println("Duration: ");
            int duration = sc.nextInt();

            HourContrat contrat = new HourContrat( date, value, duration);
            //para relacionar o contrato com o o worker - >
            worker.addContract(contrat);
        }
        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY)");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring( 0 , 2));
        int year = Integer.parseInt(monthAndYear.substring( 3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for" + monthAndYear + ": "+ String.format("2%f",worker.income(year, month)));

        sc.close();
    }
}
