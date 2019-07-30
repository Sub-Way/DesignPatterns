/* 2013112015 ¿”¡¯º∑*/

package number3;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

public class RocketTable extends AbstractTableModel {
	protected Rocket[] rockets;
	protected static String[][] values;
	protected static String[] columnNames =
			new String[] { "Name", "Price", "Apogee" };
	public RocketTable(Rocket[] rockets) {
		this.rockets = rockets;
	}

	public int getColumnCount() {
		return this.columnNames.length;
	}
	public String getColumnName(int i) {
		return this.columnNames[i];
	}
	public int getRowCount() {
		return rockets.length;
	}
	public Object getValueAt(int row, int col) {
		if (col == 0) {
			return rockets[row].getName();
		} else if (col == 1) {
			return rockets[row].getPrice();
		} else if (col == 2) {
			return rockets[row].getApogge();
		} else
			return null;
	}

	public static void main(String[] args) {
		Rocket rarray[] = new Rocket[2];
		values = new String[2][3];
		Rocket r1 = new Rocket("Shooter", 3.95, 50.0);
		Rocket r2 = new Rocket("Orbit", 29.95, 5000.0);

		rarray[0] = r1;
		rarray[1] = r2;

		RocketTable rtable = new RocketTable(rarray);
		int cnt = rtable.getColumnCount();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < cnt; j++)
				values[i][j] = rtable.getValueAt(i, j).toString();
		}

		Dimension dimension = new Dimension(385, 96);
		JFrame jframe = new JFrame("2013112015 ¿”¡¯º∑");
		jframe.setLocation(200, 400);
		jframe.setPreferredSize(dimension);

		JTable jtable = new JTable(values, columnNames);
		JScrollPane jscrollpane = new JScrollPane(jtable);
		jframe.add(jscrollpane);
		jframe.pack();
		jframe.setVisible(true);
	}
}
