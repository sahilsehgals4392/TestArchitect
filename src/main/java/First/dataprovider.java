package First;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class dataprovider {
  @Test (dataProvider="testdata")
  		public void addition(String var1,String var2,String var3,String var4,String var5)
  		{
	  	int a=Integer.parseInt(var1);
	  	int b=Integer.parseInt(var2);
	  	int c=Integer.parseInt(var3);
	  	int d=Integer.parseInt(var4);
	  	int e=Integer.parseInt(var5);
	  	int result=a+b+c+d+e;
	  	System.out.println(result);
  		}	
  	@DataProvider(name="testdata")
	  public Object[][] readexcel ()throws BiffException, IOException {
	  int rows,columns;
	  FileInputStream file=new FileInputStream("C:\\Users\\Sahil\\Desktop\\SELENIUM\\input1.xls");
	  Workbook wb=Workbook.getWorkbook(file);
	  Sheet sh=wb.getSheet(0);
	  rows=sh.getRows();
	  columns=sh.getColumns();
	  Object InputData[][]=new String[rows][columns];
	  for (int i = 0; i < rows; i++) {
		  System.out.println("Row "+(i+1));
		  
		  for (int j = 0; j < columns; j++) {
			  Cell celldata=sh.getCell(j, i);
			  InputData[i][j]=celldata.getContents();
			  System.out.print(InputData[i][j]+" ");
		}
		System.out.println();
	}
	return InputData;  
}
}
	