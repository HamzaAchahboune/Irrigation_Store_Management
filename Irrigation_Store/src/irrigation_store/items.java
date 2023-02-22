
package irrigation_store;

import com.mysql.cj.jdbc.*;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
//import com.itextpdf.text.Document;

public class items extends javax.swing.JFrame {
        
    int ItemID;
    Statement st = null;     
    ResultSet Rs = null ;

    public items() {
        
        initComponents();
        DisplayItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        itname = new javax.swing.JTextField();
        itprice = new javax.swing.JTextField();
        itqty = new javax.swing.JTextField();
        itcat = new javax.swing.JComboBox<>();
        Label_Image = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ittable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        itadd = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        Browse = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(48, 141, 70));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(48, 141, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sprinkler.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Manage Items");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Quantity");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Price");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Image");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Category");

        itname.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        itname.setCaretColor(new java.awt.Color(48, 141, 70));
        itname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        itname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itnameActionPerformed(evt);
            }
        });

        itprice.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        itprice.setCaretColor(new java.awt.Color(48, 141, 70));
        itprice.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        itqty.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        itqty.setCaretColor(new java.awt.Color(48, 141, 70));
        itqty.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        itcat.setBackground(new java.awt.Color(48, 141, 70));
        itcat.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        itcat.setForeground(new java.awt.Color(48, 141, 70));
        itcat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electrical", "Plumbing", "Irrigation" }));
        itcat.setMaximumSize(new java.awt.Dimension(69, 23));
        itcat.setMinimumSize(new java.awt.Dimension(69, 23));

        Label_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/No image.jpg"))); // NOI18N

        ittable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Quantity", "Price", "Category", "Image"
            }
        ));
        ittable.setGridColor(new java.awt.Color(48, 141, 70));
        ittable.setSelectionBackground(new java.awt.Color(48, 141, 70));
        ittable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ittableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ittable);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Items Stock");

        itadd.setBackground(new java.awt.Color(48, 141, 70));
        itadd.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        itadd.setForeground(new java.awt.Color(255, 255, 255));
        itadd.setText("ADD");
        itadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itaddActionPerformed(evt);
            }
        });

        Edit.setBackground(new java.awt.Color(48, 141, 70));
        Edit.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(48, 141, 70));
        delete.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        Browse.setBackground(new java.awt.Color(48, 141, 70));
        Browse.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        Browse.setForeground(new java.awt.Color(255, 255, 255));
        Browse.setText("Browse");
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel-24.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(itname, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itqty, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itprice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itcat, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(140, 140, 140))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(itadd, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(232, 232, 232)
                                .addComponent(Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(850, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(Label_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itprice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itqty, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itcat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itadd)
                            .addComponent(Edit)
                            .addComponent(delete))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Browse)
                        .addGap(46, 46, 46)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(442, Short.MAX_VALUE)))
        );

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sellers");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Selles");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Logout");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void DisplayItems(){
        try{
            java.sql.Connection Con = DriverManager.getConnection("jdbc:mysql://localhost/hardware?serverTimezone=UTC","root","");
            PreparedStatement st = Con.prepareStatement("select * from itemst");
            ResultSet Rs = st.executeQuery();
            ittable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    public void Clear(){
        itname.setText("");
	itqty.setText("");
	itprice.setText("");
	//itcat.setI
        Label_Image.setIcon(null);
    }
    //increments the itemid to use it in add function into DB" 
    public void Count(){
        try{
            java.sql.Connection Con = DriverManager.getConnection("jdbc:mysql://localhost/hardware?serverTimezone=UTC","root","");
            st = Con.createStatement();
            Rs = st.executeQuery("select max(ITid) from itemst");
            Rs.next();
            ItemID = Rs.getInt(1)+1;
        }catch(Exception e){
        } 
    }
    //function add 
    private void itaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itaddActionPerformed
        String url = "jdbc:mysql://localhost/hardware?serverTimezone=UTC";
        String user = "root";
        String password = "";
        
        if(itname.getText().isEmpty() || itqty.getText().isEmpty() || itprice.getText().isEmpty() || itcat.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Messing Information");
        }else {
            try{
                Count();
                java.sql.Connection Con = DriverManager.getConnection("jdbc:mysql://localhost/hardware?serverTimezone=UTC","root","");
                java.sql.PreparedStatement st = Con.prepareStatement("insert into itemst values (?,?,?,?,?,?)");
                st.setInt(1, ItemID);
                st.setString(2, itname.getText());
                st.setInt(3,Integer.valueOf(itqty.getText()));
                st.setInt(4 , Integer.valueOf(itprice.getText()));
                st.setString(5, itcat.getSelectedItem().toString());
                InputStream img = new FileInputStream(imgPath); 
                st.setBlob(6, img);
                int row = st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Item Added");
                Con.close();
                DisplayItems();
                Clear();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_itaddActionPerformed
    
    // to alter size of Image 
    public ImageIcon ResizeImage(String ImagePath , byte [] pic ){
        ImageIcon MyImage = null;
        if( ImagePath != null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
 
        Image img = MyImage.getImage();
        
        Image NewImage = img.getScaledInstance(Label_Image.getWidth(), Label_Image.getHeight(), Image.SCALE_SMOOTH);
        
        ImageIcon image = new ImageIcon(NewImage);

        return image;

    }
    String imgPath;
    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed
        JFileChooser file = new JFileChooser("D:\\irrigation\\Product_Images");
        
        file.setDialogTitle("Irrigation Images");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images" , "png" , "jpg" ,"gif");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(file);
        if (result == JFileChooser.APPROVE_OPTION){
            File selectedfile = file.getSelectedFile();
            String path = selectedfile.getAbsolutePath();
            Label_Image.setIcon(ResizeImage(path,null));
            imgPath = path; //chemin dyal dik image li khetariti ka ytstocka f had variable 
            JOptionPane.showMessageDialog(this,"Selected Success");
        
        }else if (result == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(this, "No File Selected");
        }
   
    }//GEN-LAST:event_BrowseActionPerformed

    private void itnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itnameActionPerformed
    //Get photo from database
    private void GetPhoto(){
        String Query = "Select ITphoto from itemst where ITid ="+key;
        Statement st;
        ResultSet rs;
        try{
            
            java.sql.Connection Con = DriverManager.getConnection("jdbc:mysql://localhost/hardware?serverTimezone=UTC","root","");
            st = Con.createStatement();
            rs = st.executeQuery(Query);
            if(rs.next()){
                Label_Image.setIcon(ResizeImage(null, rs.getBytes("ITphoto")));
            }
        }catch(Exception e){}
    }
    
    //function when you clicked on a table row
    int key=0; 
    private void ittableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ittableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ittable.getModel();
        int index = ittable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(index, 0).toString());
        itname.setText(model.getValueAt(index, 1).toString());
        itqty.setText(model.getValueAt(index, 2).toString());
        itprice.setText(model.getValueAt(index, 3).toString());
        itcat.setSelectedItem(model.getValueAt(index, 4).toString());
        GetPhoto();
    }//GEN-LAST:event_ittableMouseClicked
    //delete item from database
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(key == 0){
            JOptionPane.showMessageDialog(this , "Select Item" , "Warning" , JOptionPane.WARNING_MESSAGE);
        }else {
            int op = JOptionPane.showConfirmDialog(null, "Are you sure want to Delete this Item" , "Delete Item" , JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);
            if (op == JOptionPane.OK_OPTION)
                try{
                
                    String Query = "delete from itemst where ITid="+key;
                    Connection Con = DriverManager.getConnection("jdbc:mysql://localhost/hardware?serverTimezone=UTC","root","");
                    Statement st = Con.createStatement();
                    st.executeUpdate(Query);
                    DisplayItems();
                    Clear();
                }catch(Exception e){}
        }
 
    }//GEN-LAST:event_deleteActionPerformed
    //Edit item in database
    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        
        if (imgPath != null){
            try{
                InputStream img = new FileInputStream(imgPath);
                
                String Query = "Update itemst set itname=? , itqty = ? , itprice=? , itcat=? ,ITphoto=? where ITid=?";
                Connection Con = DriverManager.getConnection("jdbc:mysql://localhost/hardware?serverTimezone=UTC","root","");
                java.sql.PreparedStatement st = Con.prepareStatement(Query);
                st.setString(1,itname.getText());
                st.setInt(2, Integer.valueOf(itqty.getText()));
                st.setInt(3,Integer.valueOf(itprice.getText()));
                st.setString(4,itcat.getSelectedItem().toString());
                st.setBlob(5, img);
                st.setInt(6,key);
                if(st.executeUpdate() == 1){
                    DisplayItems();
                    JOptionPane.showMessageDialog(this, "successful update");
                }else{
                    JOptionPane.showMessageDialog(this, "Missing information");
                }
            }catch(Exception e){JOptionPane.showMessageDialog(this, e);}
        
        
        }else{JOptionPane.showMessageDialog(this, "No photo Selected");}
        imgPath=null;
    }//GEN-LAST:event_EditActionPerformed
    //cancel Buuton
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked
    //Logout
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new Sellers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked
    //page ventes
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new Ventes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked
    
   
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
            java.util.logging.Logger.getLogger(items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        
        //</editor-fold>
        
        //</editor-fold>
        
        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browse;
    private javax.swing.JButton Edit;
    private javax.swing.JLabel Label_Image;
    private javax.swing.JButton delete;
    private javax.swing.JButton itadd;
    private javax.swing.JComboBox<String> itcat;
    private javax.swing.JTextField itname;
    private javax.swing.JTextField itprice;
    private javax.swing.JTextField itqty;
    private javax.swing.JTable ittable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
