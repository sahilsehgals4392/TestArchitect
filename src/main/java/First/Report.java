package First;

import java.util.List;

public class Report {
	List<String> result;
	String status,Outcome;
	
	public void reportGenerator(String actualValue,String expectedValue)
	{
		if(actualValue.equals(expectedValue))
		//"Pass", "Actual Value :"+actualValue+" matches with expected value "+expectedValue);		
		{status="Pass";
		Outcome="Actual Value :"+actualValue+" matches with expected value "+expectedValue;
		}
		else{
			status="Fail";
			Outcome="Actual Value :"+actualValue+" doesn't matches with expected value "+expectedValue;
		}
		result.add(status);
		result.add(Outcome);
	}
//
//public void writeResults() {
//    try {
//        String reportIn = new String(Files.readAllBytes(Paths.get("C:\\Users\\Sahil\\Desktop\\Report.html")));
//        for (int i = 0; i < result.size();i++) {
//            
//        	reportIn = reportIn.replaceFirst("<tr><td>" + Integer.toString(i+1) + "</td><td>" + result.get(0) + "</td><td>" + details.get(i).getResultText() + "</td></tr>" + resultPlaceholder);
//        }
//             
//        String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
//        String reportPath = "Z:\\Documents\\Bas\\blog\\files\\report_" + currentDate + ".html";
//        Files.write(Paths.get(reportPath),reportIn.getBytes(),StandardOpenOption.CREATE);
//             
//    } catch (Exception e) {
//        System.out.println("Error when writing report file:\n" + e.toString());
//    }
//}

}
