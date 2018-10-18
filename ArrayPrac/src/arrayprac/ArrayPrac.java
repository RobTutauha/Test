/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprac;

/**
 *
 * @author 91030834
 */
public class ArrayPrac {
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] grades = new char[4];
        grades[0] = 'A';
        grades[1] = 'B';
        grades[2] = 'D';
        grades[3] = 'F';
        
        for (Character grade : grades) {
            System.out.println(grade);
        }
        
        Arrays.copyOf(grades,5);
        
        // TODO code application logic here
    }
    
}
