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
public class InvoiceController 
{
    MainFrameController mc;
    Invoice_GUI ig;
    
    InvoiceController(){}
    InvoiceController(MainFrameController m)
    {
        this.mc = m;
    }
    
    void setInvoiceListFromICToIG(String itemName,int quantity, double price,double extendedPrice)
    {
         ig.setInvoiceItemListFromIC(itemName, quantity, price, extendedPrice);
    }
    
    void setIG (Invoice_GUI ig)
    {
        this.ig = ig;
    }
    public void resetIG(){
        ig.reset();
    }
    
}
