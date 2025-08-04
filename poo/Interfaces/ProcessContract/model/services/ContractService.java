package model.services;

import model.entites.Contract;
import model.entites.Installment;

import java.time.LocalDate;

public class ContractService {


    private OnlinePaymentService onlinePaymentService;
    private  Contract contract;
    private  int number;


    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;

    }

    public void processContract(Contract contract, Integer months){
        // months =  quantidade de parecelas.

        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, quota));
        }

    }
}
