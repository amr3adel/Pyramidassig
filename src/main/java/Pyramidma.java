/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrad
 */
import java.io.IOException;
import java.util.*;

public class Pyramidma  {

	public static void main(String[] args) throws IOException {
		
		PyramidCSVDAO obj=new PyramidCSVDAO();
		
		List<pyramid> display=new ArrayList<pyramid>();
		
		String file="C:\\Users\\amrad\\Desktop\\pyramids.csv";
		
		display=obj.readPyramidsFromCSV(file);
		
            Psite(display);
	}
	
	public static void Psite (List<pyramid> pyramids) {
		Map<String, Integer> countBySite=new HashMap<>();
                pyramids.stream().map(p -> p.getSite()).forEachOrdered(site -> {
                    Integer count=countBySite.get(site);
                    if (count==null) count=1;
                    else count++;
                    countBySite.put(site, count);
            });
		System.out.println(countBySite);
			
		}
	}