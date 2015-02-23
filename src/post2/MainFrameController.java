/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package post2;

import java.util.ArrayList;

/**
 *
 * @author Optimus Prime
 */
public class MainFrameController 
{
// Variables...
Post post;
ProductController pc = new ProductController(this);
InvoiceController ic = new InvoiceController(this);
PaymentController paymentC = new PaymentController (this);
CustomerController cc = new CustomerController(this);

Main_GUI2 mg;
String itemN;
int qu;
double pr;
double ep;

MainFrameController (){}
MainFrameController(Post p)
{
    this.post = p;
}

////////////////////////
// Product Controller
//////////////////////
public ArrayList<String> getUPCListFromPostToMC()
{

    return post.getUPCList();
}

public void getUpcAndQuantityFromPCToPost (String upc,int quant) // Do Calculations in Post!!!
{   //method called when person PRESSES ENTER
    //get stuf from post first (post returns string a, quant, price, extended price and total
    double total = 234;
    //setInvoiceListFromMCToIC(a,quant,total,total);
    post.addToCustomerProductList(upc,quant);
    post.addProductToInvoice(upc,quant);
    
}


////////////////////////
// Invoice Stuff
////////////////////////
public void setInvoiceListFromMCToIC(String itemName, int quantity, double price, double extendedPrice)
{
    //pc.getUpcAndQuantityFromPRGToPC(itemN,qu );
    ic.setInvoiceListFromICToIG(itemName, quantity, price, extendedPrice);
}
public void setMGTotal(double total){
    mg.setTotal(total);
}

public String getItemNameFromMCToInvoice()
{
return "asdf";            
}

void setIG (Invoice_GUI ig)
{
    ic.setIG(ig);
}

//////////////////////////////
// Setting The Main_GUI stuff
/////////////////////////////

public void setMG (Main_GUI2  mg)
{
    this.mg = mg;
}

//Setting up POST
public void setPOST(Post post){
    this.post=post;
}

////////////////////////////////
// Setting up The Payment Logic
//////////////////////////////

void setTotalFromMCToPaymentController (double total)
{
    paymentC.setTotalToPaymentGUI(total);
}

void setPaymentGUI(Payment_GUI paymentG)
{
    paymentC.setPaymentGUI(paymentG);
}
//////////////////////////////////
// Sending Everything To The POST
/////////////////////////////////

void sendAllInfoToPost()
{
    getCustomerNameFromCC();
    
}

//////////////////////////////////////
// Setting Things up for Customer GUI
/////////////////////////////////////
void setCG(Customer_GUI cg)
{
    cc.setCG(cg);
}
public void getCustomerNameFromCC(){
    System.out.println(cc.getCustomerNameFromCG());
}

}
