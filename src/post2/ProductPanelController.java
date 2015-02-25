/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package post2;

import java.util.ArrayList;

/**
 *
 * @author Bryan Chevalier
 */
public class ProductPanelController 
{
    
    MainFrameController mc; // Communicates with MainFrameController
    
    ProductPanelController (){}
    
    ProductPanelController(MainFrameController mc)
    {
        this.mc = mc;
    }
    
    //ArrayList<String> temp = new ArrayList();
    
    // Going <-
    public ArrayList<String>  getUPCListFromMainFrameToPC()
    {
       return mc.getUPCListFromPostToMC();
    }
    
    // Going ->
    public void getUpcAndQuantityFromPRGToPC(String upc,int quantity)
    {
        mc.getUpcAndQuantityFromPCToPost(upc,quantity);
    }
    
}
