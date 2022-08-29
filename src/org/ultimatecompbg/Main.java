package org.ultimatecompbg;

import org.ultimatecompbg.cargiving.ProxyGiveCar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner nameScan = new Scanner(System.in);
        String employeeName = nameScan.nextLine();
        ProxyGiveCar cargiver = new ProxyGiveCar(employeeName);
        cargiver.giveCar();
    }
}
