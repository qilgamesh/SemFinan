package model;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.*;

/**
 * @author Andrey Semenyuk
 */
public class ExpTableModel implements TableModel {
	private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

	private List<CompTrans> expTranses;

	public ExpTableModel(List<CompTrans> expTranses) {
		this.expTranses = new ArrayList<CompTrans>();
		for (CompTrans cTrans : expTranses) {
			if (cTrans.getSum() < 0) {
				this.expTranses.add(cTrans);
			}
		}
	}

	public void addTableModelListener(TableModelListener listener) {
		listeners.add(listener);
	}

	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	public int getColumnCount() {
		return 3;
	}

	public String getColumnName(int columnIndex) {

		switch (columnIndex) {
			case 0:
				return "Расход";
			case 1:
				return "Описание";
			case 2:
				return "Дата";
		}
		return "";
	}

	public int getRowCount() {
		return expTranses.size();
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		CompTrans compTrans = expTranses.get(rowIndex);
		switch (columnIndex) {
			case 0:
				return compTrans.getSum() * -1;
			case 1:
				return compTrans.getName();
			case 2:
				return compTrans.getDate();
		}
		return "";
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}

	public void removeTableModelListener(TableModelListener listener) {
		listeners.remove(listener);
	}

	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		CompTrans compTrans = expTranses.get(rowIndex);
		switch (columnIndex) {
			case 0:
				compTrans.setSum(Double.parseDouble((String) value));
				break;
			case 1:
				compTrans.setName((String) value);
				break;
			case 2:
				compTrans.setDate((String) value);
				break;
			default:
				break;
		}

	}

	public void addRow(Vector<String> newRow) {

	}
}
