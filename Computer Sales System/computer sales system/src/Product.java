
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Roshan Gatkal
 */
public class Product extends javax.swing.JFrame {
static int inc;
    boolean ins=false;

    /**
     * Creates new form Product
     */
    public Product() {
        initComponents();
        fillCombo();
        alert();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        pprice = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        save = new javax.swing.JButton();
        home = new javax.swing.JButton();
        display = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ptype = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jc1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        pqty = new javax.swing.JTextField();
        j7 = new javax.swing.JLabel();
        j8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product");
        setBounds(new java.awt.Rectangle(210, 130, 0, 0));
        setMaximumSize(new java.awt.Dimension(1130, 710));
        setMinimumSize(new java.awt.Dimension(1130, 710));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        pid.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        pid.setPreferredSize(new java.awt.Dimension(8, 24));
        getContentPane().add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 210, 40));

        pname.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        pname.setPreferredSize(new java.awt.Dimension(8, 24));
        pname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnameKeyPressed(evt);
            }
        });
        getContentPane().add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 210, 40));

        pprice.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        pprice.setPreferredSize(new java.awt.Dimension(8, 24));
        pprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ppriceKeyPressed(evt);
            }
        });
        getContentPane().add(pprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 210, 40));

        add.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 100, -1));

        save.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 100, -1));

        home.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 100, -1));

        display.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        display.setText("Display");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 100, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Type");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        ptype.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        ptype.setPreferredSize(new java.awt.Dimension(8, 24));
        getContentPane().add(ptype, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 210, 40));

        delete.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 100, -1));

        jc1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        getContentPane().add(jc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 220, -1));

        t1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Type", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(t1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 590, 350));

        clear.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 100, -1));

        pqty.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        pqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pqtyKeyPressed(evt);
            }
        });
        getContentPane().add(pqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 210, 40));

        j7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        j7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(j7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 210, 20));

        j8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        j8.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(j8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 210, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentbackground.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(1130, 710));
        jLabel5.setMinimumSize(new java.awt.Dimension(1130, 710));
        jLabel5.setPreferredSize(new java.awt.Dimension(1130, 710));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
    try
{
    Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/computer","root","1111");
Statement stmt;
stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from product");
while(rs.next())
{
    inc=rs.getInt(1);
    
}
    rs.close();
    stmt.close();
    con.close();    
}
catch(Exception e){
JOptionPane.showMessageDialog(null, e.getMessage());
}
inc++;
pid.setText(String.valueOf(inc));
pid.setEditable(false);
pname.setText("");
ptype.setText("");
pprice.setText("");
pqty.setText("");

ins=true;   
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

       /* if(pname.getText()=="" || ptype.getText()=="" || pprice.getText()=="" || pqty.getText()=="")
        {
        JOptionPane.showMessageDialog(null,"one or more fields empty");
        }
        else*/
        
       
        if(ins=true)
{
        try
{
    Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/computer","root","1111"); 
PreparedStatement stmt1;
if(pname.getText().isEmpty() || ptype.getText().isEmpty() || pprice.getText().isEmpty() || pqty.getText().isEmpty())
{
    JOptionPane.showMessageDialog(null, "One or more textfield empty!!!!");  
}
else
{
stmt1=con.prepareStatement("insert into product values(?,?,?,?,?)");
stmt1.setInt(1,(Integer.parseInt(pid.getText())));
stmt1.setString(2,pname.getText());
stmt1.setString(3,ptype.getText());
stmt1.setInt(4,(Integer.parseInt(pprice.getText())));
stmt1.setInt(5,(Integer.parseInt(pqty.getText())));

stmt1.executeUpdate();
JOptionPane.showMessageDialog(null,"Product added succesfully");
stmt1.close();
}
// TODO add your handling code here:
    }                                        
catch(Exception e)
{
    JOptionPane.showMessageDialog(null, e.getMessage());
    
}
}
else
    JOptionPane.showMessageDialog(null,"Please Click on add button");
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    public void fillCombo()
    {
         try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/computer","root","1111");
            Statement stmt;
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from product");
            while(rs.next())
            {
                jc1.addItem((rs.getString(2)));
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
    }  
    }
    
    
    public void alert()
    {
         try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/computer","root","1111");
            Statement stmt;
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from product");
            while(rs.next())
            {
               if(rs.getInt("pqty")<10)
               {
                JOptionPane.showMessageDialog(null,"Low Stock");
               }
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
    }  
    }
    
    
    
    
    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
dispose();
home h=new home();
h.setSize(h.getSize());
h.show();
// TODO add your handling code here:
    }//GEN-LAST:event_homeActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
  try
{
Class.forName("com.mysql.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/computer","root","1111");
            PreparedStatement stmt1;   
            stmt1=conn.prepareStatement("delete  from product where pname='"+jc1.getSelectedItem()+"' ");
            stmt1.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Deleted");
jc1.removeAllItems();
            fillCombo();

            
}
catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());

}
        
// TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
DefaultTableModel model=(DefaultTableModel) t1.getModel();
        model.setRowCount(0);
 try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/computer","root","1111");
            Statement stmt;
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from product ");
            while(rs.next())
         {
             String id=rs.getString("pid");
             String name=rs.getString("pname");
             String type=rs.getString("ptype");
             String price=rs.getString("pprice");
             String qty=rs.getString("pqty");
             
             model.addRow(new Object[] {id,name,type,price,qty});
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
    }
        
// TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
pid.setText("");
pname.setText("");
ptype.setText("");
pprice.setText("");
pqty.setText("");

// TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void ppriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ppriceKeyPressed
try
{
int i=Integer.parseInt(pprice.getText());
j7.setText("");
}catch(NumberFormatException e)
{
j7.setText("Invalid Number");
}// TODO add your handling code he        // TODO add your handling code here:
    }//GEN-LAST:event_ppriceKeyPressed

    private void pqtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pqtyKeyPressed
try
{
int i=Integer.parseInt(pqty.getText());
j8.setText("");
}catch(NumberFormatException e)
{
j8.setText("Invalid Number");
}// TODO add your handling code he        // TODO add your handling code here:
    }//GEN-LAST:event_pqtyKeyPressed

    private void pnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnameKeyPressed
char c=evt.getKeyChar();
if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))
    pname.setEditable(true);
else
    pname.setEditable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_pnameKeyPressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton display;
    private javax.swing.JButton home;
    private javax.swing.JLabel j7;
    private javax.swing.JLabel j8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jc1;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pprice;
    private javax.swing.JTextField pqty;
    private javax.swing.JTextField ptype;
    private javax.swing.JButton save;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables
}