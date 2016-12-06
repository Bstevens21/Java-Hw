/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routecollectionsmap;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Blake
 */
public class RouteCollectionsMap {

    public static void main(String[] args) {
       
        Map<String, Integer> tickList = new TreeMap<String, Integer>();
           
           tickList.put("Questions and Answers 5.10+", 32);
           tickList.put("Caselton Tower, North Face 5.11-", 14);
           tickList.put("Echo Pinnacle, Free Window Route 5.11a", 9);
           tickList.put("Charlie Horse Needle, Sims-Hesse-Hanning Route 5.11", 10);
           tickList.put("The Three Gossips, Be There Or Be Talked About "
                   + "5.11 C1", 16);
          
             for(Map.Entry<String,Integer> entry : tickList.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                
                assert(tickList.containsKey("14"));
                assert(tickList.containsKey("1")) == false;
                assert(tickList.containsValue("Questions and Answers 5.10+"));
                assert(tickList.containsValue("The best route")) == false;
                assert(tickList.size() == 5);

                
                System.out.println("Tick number " + value + " is Blakes ascent "
                        + "of " + key );
            }  
    }

   
    
}

