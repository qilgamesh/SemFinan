package view;


import controller.Log;
import model.ExpTableModel;
import model.IncTableModel;
import model.SchedTrans;
import model.SemFinanDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import static controller.LoadDB.loadDB;

/**
 * @author Andrey Semenyuk
 */
public class test {

	public static boolean needSave = false;
	public static ArrayList<SchedTrans> sTransactions;
	public static SemFinanDB semFinanDB;

	public static void main(String[] args) {
		Log.toConsole("Запуск приложение");

		semFinanDB = loadDB();

		if (semFinanDB == null) {
			Log.toConsole("Закрытие приложения");
			System.exit(0);
		}

		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(new FlowLayout());

		JTable incTable = new JTable();

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
		IncTableModel incMod = new IncTableModel(semFinanDB.cTrans);
		incTable.setModel(incMod);
		frame.getContentPane().add(new JScrollPane(incTable));


		JTable expTable = new JTable();
		ExpTableModel expMod = new ExpTableModel(semFinanDB.cTrans);
		expTable.setModel(expMod);
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
	}

}

