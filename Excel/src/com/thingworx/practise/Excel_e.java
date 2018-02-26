package com.thingworx.practise;

import com.thingworx.logging.LogUtilities;
import com.thingworx.metadata.FieldDefinition;
import com.thingworx.metadata.annotations.ThingworxBaseTemplateDefinition;
import com.thingworx.metadata.annotations.ThingworxFieldDefinition;
import com.thingworx.metadata.annotations.ThingworxPropertyDefinition;
import com.thingworx.metadata.annotations.ThingworxPropertyDefinitions;
import com.thingworx.metadata.annotations.ThingworxServiceDefinition;
import com.thingworx.metadata.annotations.ThingworxServiceResult;
import com.thingworx.relationships.RelationshipTypes;
import com.thingworx.things.Thing;
import com.thingworx.types.BaseTypes;
import com.thingworx.types.InfoTable;
import com.thingworx.types.collections.ValueCollection;
import com.thingworx.types.collections.ValueCollectionList;
import com.thingworx.types.primitives.IPrimitiveType;
import com.thingworx.types.primitives.InfoTablePrimitive;
import com.thingworx.types.primitives.NumberPrimitive;
import com.thingworx.types.primitives.StringPrimitive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.slf4j.Logger;

@ThingworxBaseTemplateDefinition(name = "GenericThing")
@ThingworxPropertyDefinitions(properties = {
		@ThingworxPropertyDefinition(name = "A", description = "", category = "", baseType = "NUMBER", isLocalOnly = false, aspects = {
				 "defaultValue:50.0" }) ,
		@ThingworxPropertyDefinition(name="SN", baseType = "NUMBER" , aspects ={"isReadOnly:false", "defaultValue:80.0"}),
		@ThingworxPropertyDefinition(name="SN1", baseType = "NUMBER" , aspects ={"isReadOnly:false", "defaultValue:40.0"}),
		@ThingworxPropertyDefinition(baseType = "STRING", name = "Value1" , aspects ={"isReadOnly:false", "defaultValue:unknown"}),	
		@ThingworxPropertyDefinition(baseType = "STRING", name = "Value2" , aspects ={"isReadOnly:false", "defaultValue:unknown"})
})
public class Excel_e extends Thing {

	private static Logger _logger = LogUtilities.getInstance().getApplicationLogger(Excel_e.class);
	
	String stopHeart;
	String s="Hello Buddy";
	Number n;
	Number a;
	Number sn,sn1;
	String value1=null;
	Number n1;
	 String a12[]= {
				"a","b","c","d"
		};
	 public static double a1[] ={
				931,932,933,934
		};
	  int LasteIndex=0;
	
	public Excel_e() {
		// TODO Auto-generated constructor stub
		try {
			
			//readadd();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

public void setValue2(String Value2) {
		
		try
		{
			setPropertyValue("Value2", new StringPrimitive(Value2));	
			
		}
		catch(Exception e)
		{
			_logger.error("Failed to set default value", e);
		}		
	}
	
public void setValue1(String Value1) {
		
		try
		{
			setPropertyValue("Value1", new StringPrimitive(Value1));	
			
		}
		catch(Exception e)
		{
			_logger.error("Failed to set default value", e);
		}		
	}

public String getValue1() throws Exception {
	return  (String) getProperty("Value1").getValue().getValue();
}

public double getA() throws Exception {
	return  (Double) getProperty("A").getValue().getValue();
}

public void setA(Number a) {
	
	try
	{
		setPropertyValue("A", new NumberPrimitive(this.a));	
		
	}
	catch(Exception e)
	{
		_logger.error("Failed to set default value", e);
	}
}

public double getSN() throws Exception {
	return  (Double) getProperty("SN").getValue().getValue();
}



public void setSN(double SN) {
	try
	{
		setPropertyValue("SN", new NumberPrimitive(this.sn));	
		//super.updateSubscribedProperties(5000);
	}
	catch(Exception e)
	{
		_logger.error("Failed to set default value", e);
	}
}

public double getSN1() throws Exception {
	return  (Double) getProperty("SN1").getValue().getValue();
}

public void setSN1(double SN1) {
	try
	{
		setPropertyValue("SN1", new NumberPrimitive(this.sn1));	
		//super.updateSubscribedProperties(5000);
	}
	catch(Exception e)
	{
		_logger.error("Failed to set default value", e);
	}
}



public double readadd() throws Exception
{
	
	
	n=a.intValue() + sn.intValue();
	return (double) 12.5;
	
	
}


	@ThingworxServiceDefinition(name = "getdataex", description = "", category = "", isAllowOverride = false, aspects = {
			"isAsync:false" })
	@ThingworxServiceResult(name = "Result", description = "", baseType = "NOTHING", aspects = {})
	public void getdataex() {
		_logger.trace("Entering Service: getdataex");
		_logger.trace("Exiting Service: getdataex");
		this.stopHeart="hello ji";
		
	}

	@ThingworxServiceDefinition(name = "yert", description = "yert", category = "", isAllowOverride = false, aspects = {
			"isAsync:false" })
	@ThingworxServiceResult(name = "Result", description = "", baseType = "STRING", aspects = {})
	public String yert() {
		_logger.trace("Entering Service: yert");
		_logger.trace("Exiting Service: yert");
		return s;
	}

	@ThingworxServiceDefinition(name = "addres", description = "", category = "", isAllowOverride = false, aspects = {
			"isAsync:false" })
	@ThingworxServiceResult(name = "Result", description = "", baseType = "NUMBER", aspects = {})
	public Double addres() {
		_logger.trace("Entering Service: addres");
		_logger.trace("Exiting Service: addres");
		//return (double) n;
		try {
			//n1=readadd();
			n1=144.5;
			n=a.intValue() + sn.intValue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Double) a;
	}

	@ThingworxServiceDefinition(name = "testad", description = "", category = "", isAllowOverride = false, aspects = {
			"isAsync:false" })
	@ThingworxServiceResult(name = "Result", description = "", baseType = "NUMBER", aspects = {})
	public Double testad() {
		_logger.trace("Entering Service: testad");
		_logger.trace("Exiting Service: testad");
		try {
			a=getA();
			sn= getSN();
			n=a.doubleValue()+sn.doubleValue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (Double) n;
	}

	@ThingworxServiceDefinition(name = "excel_attempt", description = "", category = "", isAllowOverride = false, aspects = {
			"isAsync:false" })
	@ThingworxServiceResult(name = "Result", description = "", baseType = "INFOTABLE", aspects = {
			"isEntityDataShape:true" })
	public InfoTable excel_attempt() {
		_logger.trace("Entering Service: excel_attempt");
		_logger.trace("Exiting Service: excel_attempt");
		
		InfoTable it= new InfoTable();
		it.getDataShape().addFieldDefinition(new FieldDefinition("SN", BaseTypes.NUMBER));
		it.getDataShape().addFieldDefinition(new FieldDefinition("Value", BaseTypes.STRING));
		ValueCollection vc= new ValueCollection();
		ValueCollection vc1= new ValueCollection();
		
		//HashMap<String,String[]> instruments = new HashMap<String, String[]>();
		
		/*setSN1(a1[LasteIndex]);
		LasteIndex++;
		if(LasteIndex==a1.length)
		{LasteIndex=0;}*/
		
		
		
		/*setValue1(a12[LasteIndex]);
		LasteIndex++;
		if(LasteIndex==a12.length)
		{LasteIndex=0;}*/
		
		
		String o;
		try {
			sn1=getSN1();
			//vc.put("SN", new NumberPrimitive(12.0));
			
			for(int i=0;i<a12.length;i++)
			{
			setValue1(a12[i]);
			o=a12[0];
			setValue2(o);
			//vc.put("Value", new StringPrimitive(getValue1()));
			vc.put("Value", new StringPrimitive(a12[i]));
			vc.put("SN", new NumberPrimitive(a1[i]));
			it.addRow(vc);
						//vc1.setValue("propertyNames", new InfoTablePrimitive(it));
			}
			o=null;
			//vc1.putAll(o);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//it.addRow(vc);
		return it;
	}

	@ThingworxServiceDefinition(name = "attm", description = "", category = "", isAllowOverride = false, aspects = {
			"isAsync:false" })
	@ThingworxServiceResult(name = "Result", description = "", baseType = "INFOTABLE", aspects = {
			"isEntityDataShape:true", "dataShape:asd" })
	public InfoTable attm() {
		_logger.trace("Entering Service: attm");
		_logger.trace("Exiting Service: attm");
		
		
		
			InfoTable it= new InfoTable();
			it.getDataShape().addFieldDefinition(new FieldDefinition("SN_VALUE", BaseTypes.STRING));
			ValueCollection vc= new ValueCollection();
			vc.put("SN_VALUE", new StringPrimitive(s));
			it.addRow(vc);
			ValueCollection param= new ValueCollection();
			
			
		
		return it;
	}

	
	
	/*@ThingworxServiceDefinition(name = "excel_attempt_1", description = "", category = "", isAllowOverride = false, aspects = {
			"isAsync:false" })
	@ThingworxServiceResult(name = "Result", description = "", baseType = "INFOTABLE", aspects = {
			"isEntityDataShape:true", "dataShape:asd" })
	public InfoTable excel_attempt_1() {
		_logger.trace("Entering Service: excel_attempt_1");
		_logger.trace("Exiting Service: excel_attempt_1");
		
		try {
			FileInputStream file = new FileInputStream(new File("C:/Inservice_cases/Book2.xlsx"));
			Workbook workbook = new XSSFWorkbook(file);
			//Get first/desired sheet from the workbook
	         Sheet sheet = workbook.getSheetAt(0);
	         List listBooks = new ArrayList();
	         List listBooks2 = new ArrayList();
	         //Iterate through each rows one by one
	         Iterator<Row> rowIterator = sheet.iterator();
	         
	         while (rowIterator.hasNext())
	         {
	             Row row = rowIterator.next();
	             //For each row, iterate through all the columns
	            // Iterator<Cell> cellIterator = row.cellIterator();
	             
	             Iterator<Cell> cellIterator = row.cellIterator();
	             
	             ValueCollectionList a= new ValueCollectionList();
	             
	            while (cellIterator.hasNext())
	             {
	            	// loadSettings();
	            	
	                 Cell cell = cellIterator.next();
	                 //Check the cell type and format accordingly
	                 switch (cell.getCellType())
	                 {
	                     case Cell.CELL_TYPE_NUMERIC:
	                         System.out.print(cell.getNumericCellValue() + "t");
	                        setSN1(cell.getNumericCellValue());
	                         listBooks.add(cell.getNumericCellValue());
	                         
	                         
	                         
	                         break;
	                     case Cell.CELL_TYPE_STRING:
	                         System.out.print(cell.getStringCellValue() + "t");
	                         setValue1(cell.getStringCellValue());
	                       listBooks2.add(cell.getStringCellValue());
	                         break;
	                 }
	                 
	            
	             System.out.println("");
	             }
	         }
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		return null;
		
	}*/

	
	

}
