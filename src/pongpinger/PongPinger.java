/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongpinger;


/**
 *
 * @author Blake
 */

class Pinger extends Thread {
    public void run(){
    System.out.println("Ping");
    }
}

 class Ponger extends Thread {
    public void run(){
   System.out.println("Pong");
    }
}
    
public class PongPinger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i < 10; i++){
            if(i%2 == 0){
               Pinger ping = new Pinger();
               ping.start();
            }
            else{
               Ponger pong = new Ponger();
               pong.start();
            }
        }
    
  
    }
    
}