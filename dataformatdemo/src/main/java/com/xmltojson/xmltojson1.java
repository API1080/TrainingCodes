package com.xmltojson;
import java.io.FileReader;
import java.io.FileWriter;
import org.json.JSONObject;
import org.json.XML;

public class xmltojson1 {
	public static int indent=10;
	public static char arr[]=new char[5000];
	public static void main(String[] args) {
		try{
			FileReader fr=new FileReader("C:/Users/Apisero/Documents/trialxml.xml");
			fr.read(arr);
			String dt=String.valueOf(arr);
			JSONObject xmljsonobj=XML.toJSONObject(dt);
			String jps=xmljsonobj.toString(indent);
			System.out.println(jps);
			fr.close();
			FileWriter fw=new FileWriter("C:/Users/Apisero/Documents/trialjson.json");
			fw.write(jps); 
			fw.close();
				
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
