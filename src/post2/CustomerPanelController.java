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
public class CustomerPanelController 
{
    
    MainFrameController mc;
    Customer_Panel cg;
    
    CustomerPanelController(){}
    
    CustomerPanelController (MainFrameController mc)
    {
        this.mc = mc;
    }
    
    void setCG(Customer_Panel cg)
    {
        this.cg = cg;
    }
    public String getCustomerNameFromCG(){
        return cg.getCustomerName();
    }
    public void resetCG(){
        cg.reset();
    }
    
}
