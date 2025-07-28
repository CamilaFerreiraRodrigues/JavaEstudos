package org.composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private Departament departament;
    private List<HourContrat> contrats =  new ArrayList<>();
    // One worker to many contracts


    public Worker(){

    }

    public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
        //não inclui a lista no construtor
    }
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                '}';
    }

    public void addContract( HourContrat contrat){
        contrats.add(contrat);
    }
    public void removeContract(HourContrat contrat){
        contrats.remove(contrat);
    }
    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();

        for ( HourContrat c : contrats) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContrat> getContrats() {
        return contrats;
    }

}
