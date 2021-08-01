package First;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel_read {
  
  public static void main(String args[]) throws BiffException, IOException {
	  int rows,columns;
	  FileInputStream file=new FileInputStream("C:\\Users\\Sahil\\Desktop\\Selenium\\input1.xls");
	  Workbook wb=Workbook.getWorkbook(file);
	  Sheet sh=wb.getSheet(0);
	  rows=sh.getRows();
	  columns=sh.getColumns();
	  String InputData[][]=new String[rows][columns];
	  for (int i = 0; i < rows; i++) {
		  System.out.println("Row "+(i+1));
		  
		  for (int j = 0; j < columns; j++) {
			  Cell celldata=sh.getCell(j, i);
			  System.out.print(celldata.getContents()+" ");
		}
		System.out.println();
	}
	  
}
}
	