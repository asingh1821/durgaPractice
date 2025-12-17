package customException3;

import Exception.InsufficientInventoryException;

public class Main {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        try{
            inventory.checkAvailaibility(130);
        }catch(InsufficientInventoryException i){
            System.out.println("insufficient stock: " +i.getMessage());
        }
    }
}
