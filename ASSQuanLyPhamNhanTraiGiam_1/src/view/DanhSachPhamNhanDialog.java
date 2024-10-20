/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class DanhSachPhamNhanDialog extends javax.swing.JDialog {

    /**
     * Creates new form DánhachPhamNhanDialog
     */
    private void addPredefinedPrisoners() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    // Information of predefined prisoners
    String[][] prisoners = {
        {"Nguyễn Tú", "29/09/2004", "Lạng Sơn", "PN0023", "Cướp ngân hàng", "2 tháng", "5 năm", "Việt Nam", "Nữ"},
        {"Tran Trang", "24/12/2004", "Ninh Bình", "PN0034", "Bán ma túy", "1 năm", "10 năm", "Việt  Nam", "Nữ"},
        {"Phạm Thái", "27/03/2000", "Nam Định", "PN0056", "Đánh nhau", "5 tháng", "6 tháng" ,"Việt Nam", "Nam"},
        {"Nguyễn Lan", "26/09/2003", "Đà Nẵng", "PN0067", "cướp", "4 tháng" ,"1 măm", "Việt Nam", "Nữ"},
        {"Đỗ Nam", "11/11/2001", "Hà Nội", "PN0069", "Gây rối trật tự", "1 tuần" ,"1 tháng", "Việt Nam", "Nam"},
        {"Vũ Hán", "02/09/2002", "Điện Biên", "PN0001", "Đốt pháo", "3 ngày" ,"15 ngày", "Việt Nam", "Nam"},
        {"Hà Hùng", "12/10/1999", "Lai Châu", "PN0081", "Cố ý gây thương tích", "3 tuần" ,"6 tháng", "Việt Nam", "Nam"},
        // Add more prisoners as needed
    };

    // Iterate over the list of predefined prisoners
    for (String[] prisonerData : prisoners) {
        // Add a new row to the table with the predefined prisoner's information
        model.addRow(prisonerData);
    }
}
    public DanhSachPhamNhanDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addPredefinedPrisoners();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DANH SÁCH PHẠM NHÂN TRẠI GIAM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 6, 210, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Họ và tên", "Ngày sinh", "Quê quán", "Id", "Tội danh", "Thời gian thụ án", "Thời hạn tù", "Quốc tịch", "Giới tính"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 810, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DánhachPhamNhanDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DánhachPhamNhanDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DánhachPhamNhanDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DánhachPhamNhanDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DanhSachPhamNhanDialog dialog = new DanhSachPhamNhanDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
