/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p250624;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class WarnetController {
   
    private FormWarnet formWarnet;
    private Warnet warnet;
    private WarnetDao warnetDao;
    
    
    public WarnetController(FormWarnet formWarnet){
        this.formWarnet = formWarnet;
        warnetDao = new WarnetDao();
    }
    
    
    public void clearForm(){
        formWarnet.getTxtKode().setText("");
        formWarnet.getTxtNamaPelanggan().setText("");
        formWarnet.getCmbJenisPelanggan().removeAllItems();
        formWarnet.getCmbJenisPelanggan().addItem("VIP");
        formWarnet.getCmbJenisPelanggan().addItem("GOLD");
        formWarnet.getTxtTglMasuk().setText("");
        formWarnet.getTxtJamMasuk().setText("");
        formWarnet.getTxtJamKeluar().setText("");
        formWarnet.getTxtTarif().setText("");
    }

    
    public void tampil(){
        DefaultTableModel tableModel = (DefaultTableModel)
                formWarnet.getTblWarnet().getModel();
        tableModel.setRowCount(0);
        List<Warnet> list = warnetDao.getAll();
        for(Warnet a : list){
            Object[] row = {
                a.getKode(),
                a.getNamaPelanggan(),
                a.getJenisPelanggan(),
                a.getTglMasuk(),
                a.getJamMasuk(),
                a.getJamKeluar(),
                a.getTarif(),
                a.hitungTotal()
            };
            tableModel.addRow(row);
        }
    }

    
    public void saveWarnet(){
        warnet = new Warnet();
        warnet.setKode(formWarnet.getTxtKode().getText());
        warnet.setNamaPelanggan(formWarnet.getTxtNamaPelanggan().getText());
        warnet.setJenisPelanggan(formWarnet.getCmbJenisPelanggan().getSelectedItem().toString());
        warnet.setTglMasuk(formWarnet.getTxtTglMasuk().getText());
        warnet.setJamMasuk(Integer.parseInt(formWarnet.getTxtJamMasuk().getText()));
        warnet.setJamKeluar(Integer.parseInt(formWarnet.getTxtJamKeluar().getText()));
        warnet.setTarif(Integer.parseInt(formWarnet.getTxtTarif().getText()));
        warnetDao.insert(warnet);
        JOptionPane.showMessageDialog(formWarnet, "Insert OK");
    }

    
    public void updateWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnet = warnetDao.getWarnet(index);
        warnet.setKode(formWarnet.getTxtKode().getText());
        warnet.setNamaPelanggan(formWarnet.getTxtNamaPelanggan().getText());
        warnet.setJenisPelanggan(formWarnet.getCmbJenisPelanggan().getSelectedItem().toString());
        warnet.setTglMasuk(formWarnet.getTxtTglMasuk().getText());
        warnet.setJamMasuk(Integer.parseInt(formWarnet.getTxtJamMasuk().getText()));
        warnet.setJamKeluar(Integer.parseInt(formWarnet.getTxtJamKeluar().getText()));
        warnet.setTarif(Integer.parseInt(formWarnet.getTxtTarif().getText()));
        warnetDao.update(index, warnet);
        JOptionPane.showMessageDialog(formWarnet, "Update OK");
    }

    
    public void getWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnet = warnetDao.getWarnet(index);
        if (warnet != null) {
            formWarnet.getTxtKode().setText(warnet.getKode());
            formWarnet.getTxtNamaPelanggan().setText(warnet.getNamaPelanggan());
            formWarnet.getCmbJenisPelanggan().setSelectedItem(warnet.getJenisPelanggan());
            formWarnet.getTxtTglMasuk().setText(warnet.getTglMasuk());
            formWarnet.getTxtJamMasuk().setText(String.valueOf(warnet.getJamMasuk()));
            formWarnet.getTxtJamKeluar().setText(String.valueOf(warnet.getJamKeluar()));
            formWarnet.getTxtTarif().setText(String.valueOf(warnet.getTarif()));
        }
    }

    
    public void deleteWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnetDao.delete(index);
        JOptionPane.showMessageDialog(formWarnet, "Delete OK");
    }
    
}
