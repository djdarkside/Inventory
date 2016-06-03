import java.io.File;
import java.io.IOException;
import java.util.Date;

import com.healthmarketscience.jackcess.Column;
import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;

public class Main {

	public static File dbpath = new File("res/InventoryDB.accdb");
	//public static String dbpath = "res/InventoryDB.accdb";
	
	public static void main(String[] args) throws IOException {		
		Database db = DatabaseBuilder.open(dbpath);
		Table table = db.getTable("Items");

		for (Row row : table) {
			for(Column column : table.getColumns()) {
			    String columnName = column.getName();
			    Object value = row.get(columnName);
			    System.out.println("Column " + columnName + "(" + column.getType() + "): "
			                       + value + " (" + value.getClass() + ")");
			}
		}	
		Date create = new Date();
		table.addRow(Column.AUTO_NUMBER, "Fill Light", "2154621", create, "Light", "No Note", "Mitchell", 1);
		System.out.println("New Row Added");
	}	
}
