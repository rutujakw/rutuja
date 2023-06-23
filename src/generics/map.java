package generics;

import java.util.HashMap;

public class map 
{
	static HashMap<String,String> rv;
	
	public static void addDataIntoshmap (String sheetname)
	{
		rv=new HashMap<>();
		excell.openExcel();
		excell.identifysheet(sheetname);
		int rowcount=excell.totalcellcount();
	
		for (int r=0;r<=rowcount;r++)
		{
			excell.identifyrow(r);
			int cellcount=excell.totalcellcount();
			
			for(int c=1;c<cellcount;c++)
			{
				excell.identifycell(c-1);
				String key=excell.identifydata();
				excell.identifycell(c);
				String value=excell.identifydata();
				rv.put(key, value);
		     }
			
		}
		
	}
	
	public static String getDataFromMap(String keyname)
	{
		return rv.get(keyname);
		
	
	}
	
}

	
