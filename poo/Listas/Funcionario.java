package org.example;

public class Funcionario{
    public int id;
    public  String name;
    public  double salario;

    public Funcionario(int id, String name, double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salario=" + salario +
                '}';
    }

    /*public String funcioarioDados(){
        return "Id: " + this.getId()+ " |Nome: " + this.getName() + " |Salário: "+ this.getSalario();
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
