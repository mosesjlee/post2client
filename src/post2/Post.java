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
public class Post 
{
    InvoiceForm invoiceForm = new InvoiceForm();
    ArrayList<Product> productList = new ArrayList();
    ArrayList<String> upcList = new ArrayList();
    ArrayList<Product> customerProductList = new ArrayList();
    MainFrameController mc;
    
    public Post(){
        productList.add(new Product("1111","eggs",3.40));
        productList.add(new Product("1112","beer",2.00));
        productList.add(new Product("1114", "pussy",3.00));
        
    }
    public void addToCustomerProductList(String upc, int quant){
       // productList.add(new Product(upc,name,price));
       // System.out.println(upc + name + price + quant);
        for(int i = 0;i<quant;i++){
            customerProductList.add(new Product(upc,getProductNameByUPC(upc),getPriceByUPC(upc)));
        }
    }
    public void addProductToInvoice(String upc,int quant){
        double price = getPriceByUPC(upc);
        double extendedPrice = price*quant;
        mc.setInvoiceListFromMCToIC(getProductNameByUPC(upc),quant,price,extendedPrice);
        setMGTotal();
        setPaymentTotal();
    }
    public double getCustomerTotalPrice(){
        double total = 0;
        for(int i = 0; i < customerProductList.size();i++){
            total+=customerProductList.get(i).getPrice();
        }
        return total;
    }
    public void setMGTotal(){
        mc.setMGTotal(getCustomerTotalPrice());
    }
    public void setPaymentTotal(){
        mc.setTotalFromMCToPaymentController(getCustomerTotalPrice());
    }
    
    public ArrayList<Product> getProductListFromDB(){
        return productList;
    }
    public ArrayList<String> getUPCList(){
        for(int i = 0; i < productList.size();i++){
            upcList.add(productList.get(i).getUPC());
        }
        return upcList;
    }
    public void setMC(MainFrameController mc){
        this.mc=mc;
    }
    public String getProductNameByUPC(String upc){
        for(int i = 0;i < productList.size();i++){
            if (upc.equalsIgnoreCase(productList.get(i).getUPC())){
                return productList.get(i).getName();
            }
        }
        return "not found";
    }
    public Product getProductByUPC(String upc){
        for(int i = 0; i < productList.size();i++){
            if (upc.equalsIgnoreCase((productList.get(i).getUPC()))){
                return productList.get(i);
            }
        }
        return null;
    }
    public double getPriceByUPC(String upc){
        for(int i = 0; i < productList.size();i++){
            if (upc.equalsIgnoreCase(productList.get(i).getUPC())){
                return productList.get(i).getPrice();
            }
        }
        return -1;
    }
    
}
