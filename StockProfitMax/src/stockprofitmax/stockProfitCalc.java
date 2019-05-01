/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockprofitmax;

/**
 *
 * @author tauri
 */
public class stockProfitCalc {
    //Creates a lowest price and hightest price variable, stores the index
    // of the lowest price and creates a string for the result returned.
    private int minFoundAt;
    private int min;
    private int max;
    private String maxProfitString;
    
    
    //Method to calculate the lowest price then 
     public  String calcMaxProfit(int arrayLength, int[]stockPrices ){
        
        // Stores Array and length of array as well as the first index 
        int[] stockCheck = stockPrices;
        int length = arrayLength;
        int curPrice = stockCheck[0];
        // This loop checks for the lowest price then store a index  
        // 1 step after the lowest price
        for(int i=0;i<length;i++){
            if(curPrice > stockCheck[i]){
                curPrice = stockCheck[i];
                minFoundAt = i + 2;
                min = stockCheck[i];
            }
        }
        // the lowest price is stored for the next loop
        curPrice = stockCheck[(minFoundAt - 2)];
        //This next loop searches from the lowest prices index for the next
        // highest price
        for(int i = minFoundAt;i<length;i++){
            if(curPrice < stockCheck[i]){
                curPrice = stockCheck[i];
                max = stockCheck[i];
            }
        }
        // if the there is no next highest price due to the lowest amount being
        // found too late in the day a message stating this is returned.
        if(max == 0 )
        {
            maxProfitString = "Lowest price discovered to late in the day to buy at max profit.";
        }
        // if a highest price is found within the step limit the max profit 
        // buy is returned by the function.
        else{
         maxProfitString = "Buy at "+min+" Sell at "+max;
        }
         
       
    return maxProfitString;
}
    
    
    
}
