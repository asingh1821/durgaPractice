package customException3;

import Exception.InsufficientInventoryException;

class Inventory {
    private int stockAvailable = 100;

    public void checkAvailaibility(int requiredItems) throws InsufficientInventoryException {
        if(requiredItems > stockAvailable){
            throw new InsufficientInventoryException("required stock is more than available stock");
        }else{
            System.out.println("please buy stock is available ");
        }
    }
}
