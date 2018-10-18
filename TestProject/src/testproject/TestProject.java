/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

/**
 *
 * @author 91030834
 */

public class TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] list = new int [6];
        list[0] = 6;
        list[1] = 764;
        list[2] = 99;
        list[3] = 100;
        list[4] = 1337;
        list[5] = 80085;
        
        for (Integer i : list) {
            System.out.println(i);
        }
        
        System.out.println("zeebus " + list[4]);
        
        
    }
    
}
