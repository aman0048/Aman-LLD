package repository;

import exception.GateNotFoundException;
import models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
     private final Map<Integer, Gate> gateMap;
//    private static int counter = 0;
     public GateRepository(){
         this.gateMap = new HashMap<>();
     }
     public Gate get(int gateId){
         Gate gate = gateMap.get(gateId);
         if (gate == null){
             throw new GateNotFoundException("Gate not found for id " + gateId);
         }
         return gate;
     }

     public void put(Gate gate){
//         gate.setId(++counter);
         gateMap.put(gate.getId(), gate);
         System.out.println("Gate has been added successfully");
     }
}
