package Model;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 * Created by Semenyuk Andrey on 28.12.15.
 */
public class IncomeTableModel implements TableModel {
	private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

	private List<CompTrans> incomes;

	public IncomeTableModel(List<CompTrans> compTranses) {
		this.incomes = compTranses;
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
		return incomes.size();
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		CompTrans bean = incomes.get(rowIndex);
		switch (columnIndex) {
			case 0:
				return bean.getDate();
			case 1:
				return bean.getName();
			case 2:
				return bean.getSum();
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
		CompTrans bean = incomes.get(rowIndex);
		switch (columnIndex) {
			case 0:
				bean.setDate((String) value);
			case 1:
				bean.setName((String) value);
			case 2:
				bean.setSum((double) value);
		}
	}

	public void addRow(Vector<String> newRow) {

	}
}
