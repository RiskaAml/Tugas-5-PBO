package FormTransaksi;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
    
public class DataTransaksiMobil extends javax.swing.JFrame {

    // DB config
    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/TugasPbo";
    String user = "postgres";
    String password = "amelcantik";

    public DataTransaksiMobil() {
        initComponents();
        showTable();
    }

    private void bersih() {
        txtIdTransaksi.setText("");
        txtMerk.setText("");
        txtHarga.setText("");
        txtTanggal.setText("");
        txtNamaPembeli.setText("");
    }

    public void showTable() {
        String sql = "SELECT id_pembelian, nama_pembeli, merk_mobil, harga, tanggal_pembelian "
                   + "FROM transaksi_mobil_sport ORDER BY id_pembelian";
        DefaultTableModel model = new DefaultTableModel(new String[]{
            "ID Transaksi", "Merk Mobil", "Harga", "Tanggal Pembelian", "Nama Pembeli"
        }, 0);

        try (Connection conn = DriverManager.getConnection(koneksi, user, password);
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Object[] row = new Object[]{
                    rs.getString("id_pembelian"),
                    rs.getString("merk_mobil"),
                    rs.getDouble("harga"),
                    rs.getDate("tanggal_pembelian"),
                    rs.getString("nama_pembeli")
                };
                model.addRow(row);
            }
            tabelTransaksi.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(DataTransaksiMobil.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Gagal load data: " + ex.getMessage());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdTransaksi = new javax.swing.JTextField();
        txtMerk = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNamaPembeli = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpadate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(66, 53, 53));
        jLabel1.setText("Data Transaksi Mobil Sport");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        txtIdTransaksi.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtIdTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 90, 310, -1));

        txtMerk.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtMerk, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 130, 310, -1));

        txtHarga.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 170, 310, -1));

        txtTanggal.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 210, 310, -1));

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 0));
        jLabel2.setText("ID Transaksi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 113, -1));

        jLabel3.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("Merk Mobil");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 113, -1));

        jLabel4.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setText("Harga");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 113, -1));

        jLabel5.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("Tanggal Pembelian");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 160, -1));

        jLabel6.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("Nama Pembeli");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 113, -1));

        txtNamaPembeli.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtNamaPembeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 250, 310, -1));

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        btnUpadate.setText("Update");
        btnUpadate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpadateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpadate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "Merk Mobil", "Harga", "Tanggal Pembelian", "Nama Pembeli"
            }
        ));
        tabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelTransaksi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 510, 230));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 340, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FormTransaksi/WhatsApp Image 2025-09-19 at 7.55.38 PM.jpeg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -140, 820, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // Validasi sederhana
        if (txtIdTransaksi.getText().trim().isEmpty()
                || txtNamaPembeli.getText().trim().isEmpty()
                || txtMerk.getText().trim().isEmpty()
                || txtHarga.getText().trim().isEmpty()
                || txtTanggal.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Isi semua data");
            return;
        }

        String id = txtIdTransaksi.getText().trim();
        String nama = txtNamaPembeli.getText().trim();
        String merk = txtMerk.getText().trim();
        String hargaStr = txtHarga.getText().trim();
        String tanggalStr = txtTanggal.getText().trim();

        double harga;
        java.sql.Date sqlDate;
        try {
            harga = Double.parseDouble(hargaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Format harga salah. Gunakan angka, contoh: 1500000");
            return;
        }

        try {
            LocalDate ld = LocalDate.parse(tanggalStr); // ekspektasi YYYY-MM-DD
            sqlDate = java.sql.Date.valueOf(ld);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Format tanggal salah. Gunakan YYYY-MM-DD");
            return;
        }

        String sql = "INSERT INTO transaksi_mobil_sport (id_pembelian, nama_pembeli, merk_mobil, harga, tanggal_pembelian) VALUES (?,?,?,?,?)";

        try (Connection conn = DriverManager.getConnection(koneksi, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, id);
            pstmt.setString(2, nama);
            pstmt.setString(3, merk);
            pstmt.setDouble(4, harga);
            pstmt.setDate(5, sqlDate);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menyimpan data");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Gagal insert: " + ex.getMessage());
        }

        bersih();
        showTable();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpadateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpadateActionPerformed
         // Validasi minimal: id wajib (karena update by id)
        if (txtIdTransaksi.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan ID transaksi yang ingin diupdate");
            return;
        }

        String id = txtIdTransaksi.getText().trim();
        String nama = txtNamaPembeli.getText().trim();
        String merk = txtMerk.getText().trim();
        String hargaStr = txtHarga.getText().trim();
        String tanggalStr = txtTanggal.getText().trim();

        double harga;
        java.sql.Date sqlDate;
        try {
            harga = Double.parseDouble(hargaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Format harga salah. Gunakan angka.");
            return;
        }
        try {
            LocalDate ld = LocalDate.parse(tanggalStr);
            sqlDate = java.sql.Date.valueOf(ld);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Format tanggal salah. Gunakan YYYY-MM-DD");
            return;
        }

        String sql = "UPDATE transaksi_mobil_sport SET nama_pembeli=?, merk_mobil=?, harga=?, tanggal_pembelian=? WHERE id_pembelian=?";

        try (Connection conn = DriverManager.getConnection(koneksi, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nama);
            pstmt.setString(2, merk);
            pstmt.setDouble(3, harga);
            pstmt.setDate(4, sqlDate);
            pstmt.setString(5, id);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate");
            } else {
                JOptionPane.showMessageDialog(this, "ID tidak ditemukan, update gagal.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Gagal update: " + ex.getMessage());
        }

        bersih();
        showTable();
    }//GEN-LAST:event_btnUpadateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        bersih();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         String id = txtIdTransaksi.getText().trim();
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan ID transaksi yang ingin dihapus");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus ID " + id + " ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;

        String sql = "DELETE FROM transaksi_mobil_sport WHERE id_pembelian = ?";

        try (Connection conn = DriverManager.getConnection(koneksi, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, id);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            } else {
                JOptionPane.showMessageDialog(this, "ID tidak ditemukan, hapus gagal.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Gagal delete: " + ex.getMessage());
        }

        bersih();
        showTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransaksiMouseClicked
        int row = tabelTransaksi.getSelectedRow();
        if (row < 0) return;
        txtIdTransaksi.setText(tabelTransaksi.getValueAt(row, 0).toString());
        txtMerk.setText(tabelTransaksi.getValueAt(row, 1).toString());
        txtHarga.setText(tabelTransaksi.getValueAt(row, 2).toString());
        txtTanggal.setText(tabelTransaksi.getValueAt(row, 3).toString());
        txtNamaPembeli.setText(tabelTransaksi.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tabelTransaksiMouseClicked

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataTransaksiMobil().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpadate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIdTransaksi;
    private javax.swing.JTextField txtMerk;
    private javax.swing.JTextField txtNamaPembeli;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables
}
