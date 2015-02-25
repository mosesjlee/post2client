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
public class MainFrameController 
{
// Variables...
Post post;
ProductPanelController pc = new ProductPanelController(this);
InvoicePanelController ic = new InvoicePanelController(this);
PaymentPanelController paymentC = new PaymentPanelController (this);
CustomerPanelController cc = new CustomerPanelController(this);

Main_Panel mg;
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
public void setMGTotal(double total)
{
    mg.setTotal(total);
}
public String getDateFromMG(){
    return mg.getDate();
}
public void resetMG(){
    mg.reset();
}
public void resetCG(){
    cc.resetCG();
}
public void resetIG(){
    ic.resetIG();
}

public String getItemNameFromMCToInvoice()
{
return "asdf";            
}

void setIG (Invoice_Panel ig)
{
    ic.setIG(ig);
}
public void endTransaction(){
    post.endTransaction();
    resetMG();
    resetCG();
    resetIG();
}

//////////////////////////////
// Setting The Main_GUI stuff
/////////////////////////////

public void setMG (Main_Panel  mg)
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

void setPaymentGUI(Payment_Panel paymentG)
{
    paymentC.setPaymentGUI(paymentG);
}
String getAccountNumberFromPaymentController(){
    return paymentC.getAccountNumberFromPaymentGUI();
}
String getPaymentTypeFromPaymentController(){
    return paymentC.getPaymentTypeFromPaymentGUI();
}
double getAmountPaidFromPaymentController(){
    return paymentC.getAmountPaidFromPaymentGUI();
}
//////////////////////////////////
// Sending Everything To The POST
/////////////////////////////////

/*void sendAllInfoToPost()
{
    getCustomerNameFromCC();   
}*/

//////////////////////////////////////
// Setting Things up for Customer GUI
/////////////////////////////////////
void setCG(Customer_Panel cg)
{
    cc.setCG(cg);
}
public String getCustomerNameFromCC()
{
    return cc.getCustomerNameFromCG();
}

}
