package repository;

import exception.BillNotFoundException;
import models.Bill;

import java.util.HashMap;
import java.util.Map;

public class BillRepository {
     private final Map<Integer, Bill> billMap;
    private static int counter = 0;
     public BillRepository(){
         this.billMap = new HashMap<>();
     }

     public Bill get(int billId){
         Bill bill = billMap.get(billId);
         if (bill == null){
             throw new BillNotFoundException("Bill not found for id " + billId);
         }
         return bill;
     }

     public void put(Bill bill){
         bill.setId(++counter);
         billMap.put(bill.getId(), bill);
         System.out.println("Bill has been added successfully");
     }
}
