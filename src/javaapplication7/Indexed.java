/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mariam elbeheiry
 */
public class Indexed {
    void indexedalgo(){
            
   System. out .println("Enter the number of blocks in your disks");
   Scanner input= new Scanner (System.in);
   
   int memory= input.nextInt(); 
   System.out.println("Enter number of files");
   int Files=input.nextInt();
   String Filename[]=new String[Files];
   int FileBlocks[]=new int[Files];
   for(int i=0;i<Files;i++)
   {
       System.out.println("Enter the name of the File Number-->"+(i+1));
       Filename[i]=input.next();
       System.out.println("Enter The number of the Blocks in"+Filename[i]);
       FileBlocks[i]=input.nextInt();
   }
        
   String MemoryBlocks[]=new String[memory];
   Random rand=new Random();
   int index;
   System.out.println("\n\nfileName\tIndexed\tStart\tEnd");
   for(int j=0;j<FileBlocks[j];j++)
   {
       rand=new Random(memory);
       index=rand.nextInt(memory);
       while(true){
           if(MemoryBlocks[index]==null){
               MemoryBlocks[index]=Filename[j];
               if(j==0){
                   System.out.println(index+"\t");
                   
               }
               else if (j==1){
                   
                    System.out.println(index+"\t");
               }
               else if(j==FileBlocks[j]-1){
                    System.out.println(index+"\t");
               }
               break;
           }
           else{
               index=rand.nextInt(memory);
           }
       }
   }
   
   
   
   
            
}
}