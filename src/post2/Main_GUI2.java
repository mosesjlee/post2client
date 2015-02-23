/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package post2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.NumberFormat;

/**
 *
 * @author Optimus Prime
 */
public class Main_GUI2 extends javax.swing.JFrame {

    /**
     * Creates new form Main_GUI
     */
   //MainFrameController mc = new MainFrameController();
   // mc.getPrc();
    ProductController prc = new ProductController();
    InvoiceController ic  = new InvoiceController();
    MainFrameController mc;
    public Main_GUI2 (){}
    public Main_GUI2(MainFrameController mc) {
        this.mc = mc;
        initComponents();
    }
    
    ////////////////////////////////
    // Setting Up Invoice Gui Stuff
    ///////////////////////////////
      public void setIG(Invoice_GUI ig)
    {
        mc.setIG(ig);
    }
    
    public Invoice_GUI getIG(){return invoice_GUI1;}
    
    //////////////////////////////////
    // Setting stuff for the Main GUI
    //////////////////////////////////
    
   void setMG (Main_GUI2 mg)
   {
       mc.setMG(mg);
   }
   public void setTotal(double total){
       NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
       jLabel2.setText(defaultFormat.format(total));
   }
   
   /////////////////////////////////////
   // Setting Stuff up for Payment GUI
   ////////////////////////////////////
   public void setPaymentGUI(Payment_GUI payment_GUI1)
   {
       mc.setPaymentGUI(payment_GUI1);
   }
   
   public Payment_GUI getPaymentGUI()
   {
       return payment_GUI1;
   }
   
   /////////////////////////////////////
   // Setting up the Customer Stuff
   ////////////////////////////////////
   
   public void setCustomerGUI (Customer_GUI cg)
   {
       mc.setCG(cg);
   }
   
   public Customer_GUI getCG ()
   {
       return customer_GUI1;
   }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        product_GUI2 = new post2.Product_GUI(mc.pc);
        customer_GUI1 = new post2.Customer_GUI(mc.cc);
        invoice_GUI1 = new post2.Invoice_GUI(mc.ic);
        payment_GUI1 = new post2.Payment_GUI(mc.paymentC);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 240, 240));
        setForeground(java.awt.Color.black);

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Total:");

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("    $0.00");
        
        Date curDate = new Date();
 
        SimpleDateFormat format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");

        String DateToStr = format.format(curDate);

        timeLabel.setBackground(java.awt.Color.white);
        timeLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        timeLabel.setForeground(java.awt.Color.black);
        timeLabel.setText("Time: " + DateToStr);
        timeLabel.setLocation(0,0);
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(payment_GUI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(customer_GUI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(product_GUI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(invoice_GUI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(152, 152, 152))
                .addComponent(timeLabel)
                .addGap(10,168 ,168)               
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customer_GUI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product_GUI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoice_GUI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                    .addComponent(timeLabel)
                .addGap(18, 18, 18)
                .addComponent(payment_GUI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    ////////////////////
    // ADDING CUSTOMIZED CODE
    /////////////////////////
    

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private post2.Customer_GUI customer_GUI1;
    private post2.Invoice_GUI invoice_GUI1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private post2.Payment_GUI payment_GUI1;
    private post2.Product_GUI product_GUI2;
    
    // Adding Our own Code:
    private javax.swing.JLabel timeLabel;
    // End of variables declaration                   
}