package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class ContractDataManager {
    private static final String filename = "contracts.csv";
    private ArrayList<Contract> contractRecords;

    public ContractDataManager() {
        this.contractRecords = new ArrayList<Contract>();
    }


    public void getContracts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(Pattern.quote("|"));
                String type = data[0];
                String date = data[1];
                String customerName = data[2];
                String customerEmail = data[3];
                Vehicle vehicle = new Vehicle(Integer.parseInt(data[4]), Integer.parseInt(data[5]), data[6], data[7], data[8], data[9], Integer.parseInt(data[10]), Double.parseDouble(data[11])
                );

                if (type.equals("SALE")) {
                    contractRecords.add(new SalesContract(date, customerName, customerEmail, vehicle, data[16].equals("YES")));
                } else if (type.equals("LEASE")) {
                    contractRecords.add(new LeaseContract(date, customerName, customerEmail, vehicle));
                }
            }

        } catch (IOException e) {
            System.out.println("Error getting contracts");
        }
    }

    public void saveContract(Contract contract) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            StringBuilder fullString = new StringBuilder();
            System.out.println("line 43");
            if(contract instanceof SalesContract){
                System.out.println("line 43");
                fullString.append("SALE|");
                fullString.append(contract.getDate());
                fullString.append("|");
                fullString.append(contract.getCustomerName());
                fullString.append("|");
                fullString.append(contract.getCustomerEmail());
                fullString.append("|");
                fullString.append(contract.getVehicleSold().getVin()).append("|");
                fullString.append(contract.getVehicleSold().getYear()).append("|");
                fullString.append(contract.getVehicleSold().getMake()).append("|");
                fullString.append(contract.getVehicleSold().getModel()).append("|");
                fullString.append(contract.getVehicleSold().getVehicleType()).append("|");
                fullString.append(contract.getVehicleSold().getColor()).append("|");
                fullString.append(contract.getVehicleSold().getOdometer()).append("|");
                fullString.append(String.format("%.2f", contract.getVehicleSold().getPrice())).append("|");
                fullString.append(String.format("%.2f", ((SalesContract) contract).getSalesTaxAmount())).append("|");
                fullString.append(((SalesContract) contract).getRecordingFee()).append("|");
                fullString.append(((SalesContract) contract).getProcessingFee()).append("|");
                fullString.append(contract.getTotalPrice()).append("|");
                if(((SalesContract) contract).isFinanceOption()){
                    fullString.append("YES").append("|");
                }else{
                    fullString.append("NO").append("|");
                }
                fullString.append(String.format("%.2f", contract.getMonthlyPayment()));

            }

            if (contract instanceof LeaseContract){
                fullString.append("LEASe|");
                fullString.append(contract.getDate());
                fullString.append("|");
                fullString.append(contract.getCustomerName());
                fullString.append("|");
                fullString.append(contract.getCustomerEmail());
                fullString.append("|");
                fullString.append(contract.getVehicleSold().getVin()).append("|");
                fullString.append(contract.getVehicleSold().getYear()).append("|");
                fullString.append(contract.getVehicleSold().getMake()).append("|");
                fullString.append(contract.getVehicleSold().getModel()).append("|");
                fullString.append(contract.getVehicleSold().getVehicleType()).append("|");
                fullString.append(contract.getVehicleSold().getColor()).append("|");
                fullString.append(contract.getVehicleSold().getOdometer()).append("|");
                fullString.append(String.format("%.2f", contract.getVehicleSold().getPrice())).append("|");
                fullString.append(((LeaseContract) contract).getExpectedEndingValue()).append("|");
                fullString.append(((LeaseContract) contract).getLeaseFee()).append("|");
                fullString.append(contract.getTotalPrice()).append("|");
                fullString.append(contract.getMonthlyPayment()).append("|");

            }

            bw.newLine();
            bw.write(fullString.toString());


            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Contract> getContractRecords() {
        return contractRecords;
    }
}
