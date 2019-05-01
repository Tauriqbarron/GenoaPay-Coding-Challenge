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
public class StockProfitMax {

    /**
     * @param args the command line arguments
     */
    

    // Uint test for Stock Profit Calculator 
    // includes standard case as well as case with time limit exceeded
    public static void main(String[] args) {
       
        int[] testPrice1 ={20,8,10,6,21,5};
        int[] testPrice2={10,7,5,11,8,9};
        stockProfitCalc calc = new stockProfitCalc();
        String test1,test2;
        
       
        test1 = calc.calcMaxProfit(6,testPrice1);
        test2 = calc.calcMaxProfit(6,testPrice2);
        System.out.print(test1 + "\n");
        System.out.print(test2);
    }
    
}
