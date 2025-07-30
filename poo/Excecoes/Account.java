package org.Excecoes;

public class Account {
    private Integer number;
    private  String holder;
    private  double balance;
    private double withdrawLimit;


    public Account(Integer number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        balance += amount;

    }
    public void withDraw(double amount){
        validationWithDraw(amount);
        balance -= amount;
    }

    private void validationWithDraw(double amount){
        if (amount > getWithdrawLimit()){
            throw new RuntimeException("Erro de saque: A quantia excede o limite de saque!");
        }
        if (amount > getBalance()){ //BusinesExeption -> exceção personalizada :)

            throw new BusinesExeption("Erro de saque: Saldo insuficiente");
        }
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
