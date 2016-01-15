package model;

import controller.Log;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.*;

/**
 * @author Andrey Semenyuk
 */
public class IncTableModel implements TableModel {
	private Set<TableModelListener> listeners = new HashSet<>();

	private List<CompTrans> incTranses;

	public IncTableModel(List<CompTrans> incTranses) {
		this.incTranses = new ArrayList<>();
		for (CompTrans cTrans : incTranses) {
			if (cTrans.getSum() > 0) {
				this.incTranses.add(cTrans);
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
				return "Дата";
			case 1:
				return "Описание";
			case 2:
				return "Приход";
		}
		return "";
	}

	public int getRowCount() {
		return incTranses.size();
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		CompTrans compTrans = incTranses.get(rowIndex);
		switch (columnIndex) {
			case 0:
				return compTrans.getName();
			case 1:
				return compTrans.getSum();
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
		CompTrans compTrans = incTranses.get(rowIndex);
		switch (columnIndex) {
			case 0:
				Log.toConsole((String) value);
				compTrans.setName((String) value);
				break;
			case 1:
				Log.toConsole((String) value);
				compTrans.setSum(Double.parseDouble((String) value));
				break;
			default:
				break;
		}
	}

	public void addRow(Vector<String> newRow) {

	}
}
