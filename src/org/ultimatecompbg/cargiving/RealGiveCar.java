package org.ultimatecompbg.cargiving;

class RealGiveCar implements GiveCar {
    String employeeName;
    public RealGiveCar(String newName){
        employeeName = newName;
    }

    @Override
    public void giveCar(){
        System.out.println("Car given to " + employeeName);
    }
}
