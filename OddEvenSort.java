/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddevensort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class OddEvenSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the size of vector:");
        num = sc.nextInt();
        int vector[] = new int[num];
        System.out.print("Enter the values for vector fill: ");
        for(int i = 0; i < num; i++)  {
        vector[i] = sc.nextInt();
    }
        oddEvenSort(vector);
    }
    
    public static void oddEvenSort(int vet [])    {
                
        boolean swap = false;
        
        int j = 0;
        do {
            int i;
            swap = true;
            
            for(i = 1; i < vet.length - 1; i+=2) {
                swap = true;
                if(vet[i] > vet[i + 1]) {
                    swap(vet, i, i + 1);
                    swap = true;
                    
                }
            }
        
            for(i = 0; i < vet.length - 1; i+=2)    {
                
                if(vet[i] > vet[i + 1]) {
                    swap(vet, i, i + 1);
                    swap = false;
                }
            
            }
            System.out.print(Arrays.toString(vet) + " - "); 
              
        }while(!swap);
         
    }
    public static void swap(int vet[], int i, int j)   {
        
        int aux;
        aux = vet[i];
        vet[i] = vet[j];
        vet[j] = aux;
        
    }   
}
