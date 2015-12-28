package view;


import Model.IncomeTableModel;
import Model.SFDB;
import Model.ScheduledTransaction;
import control.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import static control.LoadDB.loadDB;

/**
 * Created by Semenyuk Andrey on 20.12.15.
 */
public class test {

	public static boolean needSave = false;
	public static ArrayList<ScheduledTransaction> sTransactions;
	public static SFDB sfdb;

	public static void main(String[] args) {
		Log.log("Запуск приложение");

		sfdb = loadDB();

		if (sfdb == null) {
			Log.log("Закрытие приложения");
			System.exit(0);
		}

		JTable table = new JTable();

		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(new FlowLayout());

		IncomeTableModel mod = new IncomeTableModel(sfdb.compTranses);
		table.setModel(mod);
		frame.getContentPane().add(new JScrollPane(table));

		JButton btAdd = new JButton(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btLoad = new JButton(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btSave = new JButton(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				needSave = true;
			}
		});

		btLoad.setText("Загрузить");
		btSave.setText("Сохранить");
		btAdd.setText("Добавить");
		frame.getContentPane().add(btLoad);
		frame.getContentPane().add(btSave);
		frame.getContentPane().add(btAdd);
		frame.setSize(new Dimension(800, 600));
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				if (needSave) {
					Log.log("Необходимо сохранить изменения");
				}
				Log.log("Закрытие приложения");
				System.exit(0);
			}
		});
	}

}

