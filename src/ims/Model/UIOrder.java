/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.Model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kumar
 */
public class UIOrder extends EntityBase {
    
    private Map<Pizza,Integer> orderList;
    private double totalCost;
   
    //Getter and setter definitions
    public void addOrder(Pizza pizza,Integer noOfPizza){
        
        //create and allocate order list if it is not created
        if(orderList==null)orderList = new HashMap<Pizza, Integer>();
        
        //Check for pizza already exist in the order list
        //If it is not present add it to the list
        if(!orderList.containsKey(pizza))
        {
            orderList.put(pizza,noOfPizza);  
        }
        else
        {
          int num = orderList.get(pizza);
          num += noOfPizza;
          
          orderList.remove(pizza);
          orderList.put(pizza, num);
        }
    }
    
    public Map<Pizza,Integer> gerOrderList(){
        return orderList;
    }

    /**
     * @return the totalCost
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * @param totalCost the totalCost to set
     */
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    
}
