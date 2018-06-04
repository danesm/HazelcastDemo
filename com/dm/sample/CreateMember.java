/*
 * This is a launcher program for Member JAVA App.
 *  
 */

package com.dm.sample;

public class CreateMember {
	
        public static void main(String[] args) throws InterruptedException {
        
        // Creating 10 instances of Member App. 	
            for(int i=1; i<=10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                   try{
                       Member.main(args);                       
                   } catch(Exception e) {
                       System.out.println("An unknown exception :" + e.toString());
                   }
                }
              }).start();
        }
     }

		
	}


