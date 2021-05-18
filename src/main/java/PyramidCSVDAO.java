/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrad
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PyramidCSVDAO {
	public double ParseDouble(String strNumber) {
		   if (strNumber != null && strNumber.length() > 0) {
		       try {
		          return Double.parseDouble(strNumber);
		       } catch(NumberFormatException e) {
		          return -1;   
		       }
		   }
		   else return 0;
		}

	public List<pyramid> readPyramidsFromCSV(String fileName) throws IOException{
    List<pyramid> pyramidInfo= new ArrayList<pyramid>();
    FileReader fr= new FileReader(fileName);
    BufferedReader br=new BufferedReader(fr);
    String[] parts;
    pyramid py;
    String line="";
    String header=br.readLine();
    
   
    while (line != null) {
        try {
            String[] part=header.split(","); // split the values of csv files
            System.out.println(part[0]+" "+part[2]+" "+part[4]+" "+part[7]); // "parts" varible works to choose columns
      
            line=br.readLine();
        } catch (IOException e) {
        }
        if (line!=null) {
        parts=line.split(",");
        py= new pyramid(parts[0],parts[2],parts[4],ParseDouble(parts[7]));
        pyramidInfo.add(py);
        }
    }
    return pyramidInfo;
    }


    
}