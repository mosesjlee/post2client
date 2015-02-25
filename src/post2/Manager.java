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
public class Manager {
    public static void main(String args[]) throws Exception{
        
        
        Post post = new Post();
        MainFrameController mc = new MainFrameController (post);
        Main_Panel mg = new Main_Panel(mc);
        post.setMC(mc);
        mg.setIG(mg.getIG());
        mg.setMG(mg);
        mg.setPaymentGUI(mg.getPaymentGUI());
        mg.setCustomerGUI(mg.getCG());
        mg.setVisible(true);
        
    }
    
    
}
