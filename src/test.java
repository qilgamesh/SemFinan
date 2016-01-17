import controller.Log;
import model.SemFinanDB;

import javax.swing.*;
import java.awt.*;

import static controller.LoadDB.loadDB;

/**
 * @author Andrey Semenyuk
 */
public class test {

	public static boolean needSave = false;
	public static SemFinanDB semFinanDB;

	public static void main(String[] args) {
		Log.toConsole("Запуск приложение");

		semFinanDB = loadDB();

		if (semFinanDB == null) {
			Log.toConsole("Закрытие приложения");
			System.exit(0);
		}

		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(new GridLayout(2, 2));
/*
		IncTableModel incMod = new IncTableModel(semFinanDB.doneTransactions);
		JTable incTable = new JTable(incMod);

		incTable.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				JTable table = (JTable) me.getSource();
				Point p = me.getPoint();
				int row = table.rowAtPoint(p);
				if (me.getButton() == 3) {
					Log.toConsole(String.valueOf(row));
				}
			}
		});

		frame.getContentPane().add(new JScrollPane(incTable));

		ExpTableModel expMod = new ExpTableModel(semFinanDB.doneTransactions);
		JTable expTable = new JTable(expMod);
		frame.getContentPane().add(new JScrollPane(expTable));

		JButton btAdd = new JButton(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btSave = new JButton();

		btSave.setText("Сохранить");
		btAdd.setText("Добавить");
		frame.getContentPane().add(btSave);
		frame.getContentPane().add(btAdd);

		frame.getContentPane().setLayout(new GridLayout(1, 3));
		Locale local = new Locale("ru", "RU");
		DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, local);

		JLabel lblDate = new JLabel(df.format(new Date()));
		JLabel lblName = new JLabel("Наименование");
		JLabel lblSum = new JLabel("0");

		frame.getContentPane().add(lblDate);
		frame.getContentPane().add(lblName);
		frame.getContentPane().add(lblSum);

		frame.setSize(new Dimension(1000, 600));
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				if (needSave) {
					Log.toConsole("Необходимо сохранить изменения");
				}
				Log.toConsole("Закрытие приложения");
				System.exit(0);
			}
		});
*/
	}

}

