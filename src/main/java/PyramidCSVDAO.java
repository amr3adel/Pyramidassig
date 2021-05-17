/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrad
 */

public class PyramidCSVDAO implements PyramidCSVDAOInt{
    public double ParseDouble(String strNumber) {
   if (strNumber != null && strNumber.length() > 0) {
       try {
          return Double.parseDouble(strNumber);
       } catch(Exception e) {
          return -1;   // or some value to mark this field is wrong. or make a function validates field first ...
       }
   }
   else return 0;
}
    @Override
    public List<Pyramid> readPyramidsFromCSV(String fileName) {
            try{
            List<Pyramid> pyramids= new LinkedList<>();
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            // Read the head row
            String Line = br.readLine();
            // Check if the file is empty
            if (Line!=null){
                String[] parts = Line.split(",");
                System.out.println(parts[0]+" "+parts[2]+" "+parts[4]+" "+parts[7]+" ");
            }
            do {
                Line = br.readLine();
                if (Line != null){
                    String[] attributes = Line.split(",");
                    Pyramid p = new Pyramid(attributes[0],attributes[2],attributes[4],ParseDouble(attributes[7]));
                    pyramids.add(p);
                }
            }while (Line != null);
            return pyramids;
            }
            catch (FileNotFoundException ex2){
                ex2.printStackTrace();
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
            return null;
    }
     
}