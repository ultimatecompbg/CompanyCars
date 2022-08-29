package org.ultimatecompbg.cargiving;

public class ProxyGiveCar implements GiveCar{
    String employeeName;
    public ProxyGiveCar(String newName){
        employeeName = newName;
    }
    public void giveCar(){
        if(employeeName.equals("Petkan")){
            RealGiveCar realGiveCar = new RealGiveCar(employeeName);
            realGiveCar.giveCar();
        } else {
            System.out.println("You can't get a car if your name is not Petkan");
        }
    }
}
