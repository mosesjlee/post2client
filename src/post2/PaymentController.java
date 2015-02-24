/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package post2;

/**
 *
 * @author Bryan Chevalier
 */
public class PaymentController 
{
    Payment_GUI pg;
    MainFrameController mc;
    
    PaymentController (MainFrameController mc)
    {
        this.mc = mc;
    }
    
    // Setting up the GUI Stuff
    public void setPaymentGUI(Payment_GUI pg)
    {
     this.pg = pg;
    }
    
    public void setTotalToPaymentGUI (double total)
    {
       pg.setTotal(total);
    }
    public void endTransaction(){
        mc.endTransaction();
    }
    public String getAccountNumberFromPaymentGUI(){
        return pg.getAccountNumber();
    }
    public String getPaymentTypeFromPaymentGUI(){
        return pg.getPaymentType();
    }
    public double getAmountPaidFromPaymentGUI(){
        return pg.getAmountPaid();
    }
    
    
}
