
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author huanglinbao
 */
public class EmployeeTableModel extends AbstractTableModel {

    List<Employee> listProduct = new ArrayList<Employee>();
    private final String HEADER[] = {"ID", "Name", "Email", "Password", "Address", "Image"};

    public void setList(List<Employee> listProduct) {
        this.listProduct = listProduct;
    }

    public void save(Employee product) {
        listProduct.add(product);
        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
    }

    public void edit(int index, Employee product) {
        listProduct.set(index, product);
        fireTableRowsUpdated(index, index);
    }

    public void delete(int index) {
        listProduct.remove(index);
        fireTableRowsDeleted(index, index);
    }

    public Employee findOne(int index) {
        return listProduct.get(index);
    }

    public int getRowCount() {
        return listProduct.size();
    }

    public int getColumnCount() {
        return HEADER.length;
    }

    public String getColumnName(int column) {
        return HEADER[column];
    }
    @Override
         public Class<?> getColumnClass(int column) {
                if (column==5) return ImageIcon.class;
                return Object.class;
      }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee product = listProduct.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return product.getId();

            case 1:
                return product.getName();

            case 2:
                return product.getEmail();

            case 3:
                return product.getPassword();

            case 4:
                return product.getAddress();

            case 5:
                return product.getImage();

            default:
                return null;
        }
    }
}
