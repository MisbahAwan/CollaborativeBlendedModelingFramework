package webdsl.epackage.pkgdsl;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class xml_context {
	public static int size = 14;

	private static ArrayList<String> DisplayNode(NodeList nList, String check, String var, ArrayList<String> arr, Document doc) {
		// TODO Auto-generated method stub
		int i=0;
		String slash = "/";
		while(i<nList.getLength()){
			Node node = nList.item(i);
			if(node.hasChildNodes()) {	
				if(node.getChildNodes().getLength()==1) {
					if(node.getNodeName()=="SHORT-NAME") {
						var = var.concat(slash);
						var = var.concat(node.getTextContent());
						if(node.getParentNode().getNodeName()==check) { 
						//System.out.println("Found Node-> " + var);
						arr.add(var); 	
					}		}	}
				
				DisplayNode(node.getChildNodes(),check, var,arr, doc);
				}   i++;  }
		return arr;
	}

	
	 public static ArrayList<ArrayList<String>> parse() {
		// TODO Auto-generated method stub
	  String path ="C://Users//Misbah Awan//MyEclipseWorkspace//webdsl.epackage.pkgdsl.parent//webdsl.epackage.pkgdsl//src//webdsl//epackage//pkgdsl//BasicWW3.eaxml";

	  File file = new File(path);
      Document doc;
      String var = "";
      String check = "DESIGN-FUNCTION-PROTOTYPE";
      ArrayList<String> design_func_prototype = new ArrayList<String>();
      ArrayList<String> ea_numerical = new ArrayList<String>();
      ArrayList<String> hardware_func_type = new ArrayList<String>();
      ArrayList<String> local_device_manager = new ArrayList<String>();
      ArrayList<String> func_flow_port = new ArrayList<String>();
      ArrayList<String> event_func = new ArrayList<String>();
      ArrayList<String> event_func_flow_port = new ArrayList<String>();
      ArrayList<String> basic_software_func_type = new ArrayList<String>();
      ArrayList<String> design_func_type = new ArrayList<String>();
      ArrayList<String> event_chain = new ArrayList<String>();
      ArrayList<String> quantity = new ArrayList<String>();
      ArrayList<String> unit = new ArrayList<String>();
      ArrayList<String> rangeabl_value_type = new ArrayList<String>();
      ArrayList<String> ea_boolean = new ArrayList<String>();
      ArrayList<String> array = new ArrayList<String>();
      ArrayList<ArrayList<String> > arr =   new ArrayList<ArrayList<String> >(size);
      arr.add(0, design_func_prototype);
      arr.add(1, ea_numerical);
      arr.add(2, hardware_func_type);
      arr.add(3, local_device_manager);
      arr.add(4, func_flow_port);
      arr.add(5, event_func);
      arr.add(6, event_func_flow_port);
      arr.add(7, basic_software_func_type);
      arr.add(8, design_func_type);
      arr.add(9, event_chain);
      arr.add(10, quantity);
      arr.add(11, unit);
      arr.add(12, rangeabl_value_type);
      arr.add(13, ea_boolean);
     String value = "";
     String[] checklist = {"DESIGN-FUNCTION-PROTOTYPE", "EA-NUMERICAL", "HARDWARE-FUNCTION-TYPE", "LOCAL-DEVICE-MANAGER", "FUNCTION-FLOW-PORT",
    		 "EVENT-FUNCTION", "EVENT-FUNCTION-FLOW-PORT", "BASIC-SOFTWARE-FUNCTION-TYPE", "DESIGN-FUNCTION-TYPE", "EVENT-CHAIN",
    		 "QUANTITY", "UNIT", "RANGEABLE-VALUE-TYPE", "EA-BOOLEAN"};
      
      DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
      try {
		DocumentBuilder dbBuilder = dbfactory.newDocumentBuilder();
		doc = dbBuilder.parse(file);
		doc.getDocumentElement().normalize();
		
	    for (int i = 0; i < arr.size(); i++) {
	    	array = DisplayNode(doc.getChildNodes(), checklist[i] ,var, arr.get(i), doc);
	    	arr.set(i, array);
		    }
	   /* for (int j = 0; j < design_func_prototype.size(); j++) {
				  System.out.println("array item "+design_func_prototype.get(j));
				} */
	    
	 	for (int i = 0; i < arr.size(); i++) {
	 		System.out.println("Array Begins");
			for (int j = 0; j < arr.get(i).size(); j++) {
			 System.out.println("array item "+arr.get(i).get(j));
			}  }
		
      } catch (ParserConfigurationException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	} catch (SAXException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	return arr;
      }

}