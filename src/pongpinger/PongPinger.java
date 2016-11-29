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
        for(int i=0; i < 10; i++){
            if(i%2 == 0){
               System.out.println("Ping");
            }
            else{
               System.out.println("Pong");
            }
        }
        if (Thread.interrupted()) {
            System.out.println("Threads been interrupted!");
        }
    }
}

public class PongPinger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pinger pong = new Pinger();
        pong.start();
    }
    
}
