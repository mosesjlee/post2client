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
public class InvoicePanelController 
{
    MainFrameController mc;
    Invoice_Panel ig;
    
    InvoicePanelController(){}
    InvoicePanelController(MainFrameController m)
    {
        this.mc = m;
    }
    
    void setInvoiceListFromICToIG(String itemName,int quantity, double price,double extendedPrice)
    {
         ig.setInvoiceItemListFromIC(itemName, quantity, price, extendedPrice);
    }
    
    void setIG (Invoice_Panel ig)
    {
        this.ig = ig;
    }
    public void resetIG(){
        ig.reset();
    }
    
}
