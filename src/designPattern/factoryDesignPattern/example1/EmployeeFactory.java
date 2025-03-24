package designPattern.factoryDesignPattern.example1;

public interface EmployeeFactory {

    public static Employee employeeFactoryMethod(String role){
        if(role.trim().equalsIgnoreCase("ANDroid Developer")){
            return  new AndroidDeveloper();
        } else if (role.trim().equalsIgnoreCase("Web developer")) {
            return new WebDeveloper();
        }
        return null;
    }
}
