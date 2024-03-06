import controller.BillController;
import controller.InitializationController;
import controller.TicketController;
import models.*;
import models.enums.PaymentMode;
import models.enums.VehicleType;
import repository.*;
import service.BillService;
import service.InitializationService;
import service.TicketService;

import java.util.List;
import java.util.Scanner;

public class ParkingLotMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Repositories
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        BillRepository billRepository = new BillRepository();

        // Services
        InitializationService initializationService = new InitializationService(
                gateRepository,
                parkingLotRepository,
                parkingFloorRepository,
                parkingSpotRepository
        );
        TicketService ticketService = new TicketService(
                ticketRepository,
                parkingLotRepository,
                gateRepository,
                parkingSpotRepository
        );
        BillService billService = new BillService(
                ticketRepository,
                gateRepository
        );

        // Controllers
        InitializationController initializationController = new InitializationController(initializationService);
        TicketController ticketController = new TicketController(ticketService);
        BillController billController = new BillController(billService);

        // Main logic
        System.out.println("**** PARKING LOT INITIALIZATION START ****");
        ParkingLot parkingLot = initializationController.init();
        System.out.println("**** PARKING LOT INITIALIZATION END ****");
        System.out.println("Please enter the parkingLot ID");
        int parkingLotId = parkingLot.getId();
        int gateId = 0;
        Ticket ticket = new Ticket();
        while (true) {
            System.out.println("Please enter an option -> 1. Enter Parking Lot, 2. Exit Parking Lot, 3. Exit");
            int option = sc.nextInt();
            if (option == 1) {
                Vehicle vehicle = new Vehicle();
                System.out.println("Welcome to our parking lot");
                System.out.println("Please enter the vehicle details");
                System.out.println("Please enter the vehicle number");
                String vehicleNumber = sc.next();
                vehicle.setVehicleNumber(vehicleNumber);
                System.out.println("Please enter the vehicle color");
                String color = sc.next();
                vehicle.setColor(color);
                System.out.println("Please choose the vehicle type -> 1. Car and 2. Bike");
                int vehicleType = sc.nextInt();
                if (vehicleType == 1){
                    vehicle.setVehicleType(VehicleType.FOUR_WHEELER);
                } else {
                    vehicle.setVehicleType(VehicleType.TWO_WHEELER);
                }
                // We don't have a UI, So, for our use case, we are providing parkinglotId

                System.out.println("Please enter the gate ID");
                gateId = sc.nextInt();
                ticket = ticketController.generateTicket(vehicle, gateId, parkingLotId);
                System.out.println("Ticket details :" + ticket);
            }
            else if (option == 2) {

                // ask user for ticketId, and gate ID
                // call billcontroller
                Bill bill = billController.generateBill(ticket.getId(), getExitGateId(parkingLot));
                System.out.println("Bill Details: " + bill);
                System.out.println("How do you want to pay the bill. Select the option");
                System.out.println("1. CASH    2.CARD    3.UPI");
                int paymentOption = sc.nextInt();
                PaymentMode paymentMode = pay(bill,paymentOption);
                System.out.println("Bill Payed Successfully via " + paymentMode);

                // print bill details
                // ask for payment method
                // mark the bill as paid, and done.
            } else {
                System.out.println("THANKS");
                break;
            }
        }
    }

    private static int getExitGateId(ParkingLot parkingLot) {
        int parkingLotId = parkingLot.getId();

        for (ParkingFloor parkingFloor : parkingLot.getFloors()) {
            if (parkingFloor.getExitGate() != null) {
                return parkingFloor.getExitGate().getId();
            }
        }
        return 0;
    }

    private static PaymentMode pay(Bill bill, int paymentOption) {
        switch (paymentOption){
            case 1 : return PaymentMode.CASH;
            case 2 : return PaymentMode.CARD;
            case 3 : return PaymentMode.UPI;
            default:
                return PaymentMode.CASH;
        }
    }
}