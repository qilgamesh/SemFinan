package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Semenyuk Andrey on 22.12.15.
 */
public class Gui4Tests extends JFrame implements ActionListener {
	JPanel pTop = new JPanel();
	JPanel pBottom = new JPanel();
	JLabel lblName = new JLabel("Наименование:");
	JTextField txtName = new JTextField(15);
	JLabel lblSum = new JLabel("Сумма");
	JTextField txtSum = new JTextField(10);
	JButton bAdd = new JButton("Добавить");
	JButton bCancel = new JButton("Отмена");

	Gui4Tests() {
		//root = new Incomes(0, "Корень");
		GridLayout gBottom = new GridLayout(3, 2, 1, 1);
		pBottom.setLayout(gBottom);
		pBottom.add(lblName);
		pBottom.add(lblSum);
		pBottom.add(txtName);
		pBottom.add(txtSum);
		pBottom.add(bAdd);
		pBottom.add(bCancel);
		GridLayout gTop = new GridLayout(4, 4, 1, 1);
		pTop.setLayout(gTop);
		pTop.add(new JLabel("test"));
		pTop.add(new JLabel("test2"));
		pTop.add(new JLabel("test3"));
		pTop.add(new JLabel("test4"));
		pTop.add(new JLabel("test5"));
		GridLayout gr = new GridLayout(2, 1, 1, 1);
		setLayout(gr);
		add(pTop);
		add(pBottom);

		txtSum.setText("0");
		bAdd.addActionListener(this);
		bCancel.addActionListener(this);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("Good bye!");
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();
		if (source == bAdd) {
			String name = txtName.getText();
			double sum = Double.parseDouble(txtSum.getText());
		} else if (source == bCancel) {
			txtName.setText("");
			txtSum.setText("0");
		}
	}

	public static void main(String args[]) {
		Gui4Tests tFrame = new Gui4Tests();
		tFrame.setSize(400, 300);
		tFrame.setDefaultLookAndFeelDecorated(true);
		tFrame.setVisible(true);

	}
}

