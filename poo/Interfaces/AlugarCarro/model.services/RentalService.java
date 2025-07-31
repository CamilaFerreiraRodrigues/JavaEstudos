package model.services;

import model.entites.CarRental;
import model.entites.Invoice;

import java.time.Duration;

public class RentalService {

        public double pricePerHour;
        public double pricePerDay;

        private TaxService taxService;


        //SEM CINSTRUTOR SEM ARGUMENTOS PARA OBRIGAR TER DADOS

        public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
            this.pricePerHour = pricePerHour;
            this.pricePerDay = pricePerDay;
            this.taxService = taxService;
        }

        public void processInvoice(CarRental carRental){
            //Realizar o invoice

            double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
            double hours = minutes / 60;

            double basicPayment;
            if (hours <= 12){
                basicPayment = pricePerHour * Math.ceil(hours) ;
            }
            else {
                basicPayment = pricePerDay * Math.ceil(hours / 24);
            }

            double tax = taxService.tax(basicPayment);
            carRental.setInvoice( new Invoice(basicPayment, tax));
            }
}
