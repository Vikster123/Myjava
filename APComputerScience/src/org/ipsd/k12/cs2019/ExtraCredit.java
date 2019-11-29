package org.ipsd.k12.cs2019;
import javax.swing.JOptionPane;
public class ExtraCredit {

	public static void main(String[] args) {
		String option = JOptionPane.showInputDialog(
				"1. Rectangular Prism\n" + 
				"2. Cylinder\n" + 
				"3. Rectangular Pyramid\n" + 
				"4. Cone\n" + 
				"5. Sphere\n" + 
				"0. Exit\n"
				);
		
		  if(option.equals("1")) {
			 int length = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter length:"));
			 int width = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter width:"));
			 int height = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter height:"));
			 JOptionPane.showMessageDialog(null, "Rectangular Prism Volume = " + rectangularPrismVolume(length, width, height) + " \n Rectangular Prism Surface Area = " + rectangularPrismSurfaceArea (length,width,height) );
			
		} else if(option.equals("2")){
			 int radius = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter radius"));
			 int height = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter height"));
			 JOptionPane.showMessageDialog(null, "Cylinder Volume = " + cylinderVolume(radius, height) + " \n  Cylinder Surface Area = " + cylinderSurfaceArea (radius,height) );
				
		} else if(option.equals("3")){
			 int length = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter length:"));
			 int width = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter width:"));
			 int height = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter height:"));
			 JOptionPane.showMessageDialog(null, "Rectangular Pyramid Volume = " + rectangularPyramidVolume(length, width, height) + " \n Rectangular Pyramid Surface Area = " + rectangularPyramidSurfaceArea (length,width,height) );
		} else if(option.equals("4")){
			int radius = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter radius"));
			 int height = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter height"));
			 JOptionPane.showMessageDialog(null, "Cone Volume = " + coneVolume(radius, height) + " \n Cone Surface Area = " + coneSurfaceArea (radius,height) );
				
		} else if(option.equals("5")){
			int radius = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter radius"));
			 JOptionPane.showMessageDialog(null, "Sphere Volume = " + sphereVolume(radius) + " \n Sphere Surface Area = " + sphereSurfaceArea (radius) );
				
		} else if(option.equals("0")){
			JOptionPane.showMessageDialog(null, "Sorry the shape you are looking for is not available... \n Have a Nice Day!");
		}//if
		
		
	} //main
	
	
//rectangular prism
	public static int rectangularPrismVolume ( int length, int width, int height) {
		
	    int Volume = length * width * height;
		return Volume;
	}
   public static int rectangularPrismSurfaceArea ( int length, int width, int height) {
		
	    int SurfaceArea = 2* ( (width * length) + (height * length) + (height * width));
		return SurfaceArea;
	}
 //Cylinder
   public static double cylinderVolume ( int radius, int height) {
   	
       double Volume = Math.PI * Math.pow(radius, 2) * height ;
   	return Volume;
   }
   public static double cylinderSurfaceArea ( int radius, int height) {
   	
       double SurfaceArea =   (2 * Math.PI * radius* height ) + (2 * Math.PI * Math.pow(radius, 2) )  ;
   	return SurfaceArea;
   }


   public static int rectangularPyramidVolume ( int length, int width, int height) {
		
	    int Volume = ((length * width * height)/3);
		return Volume;
	}
  public static double rectangularPyramidSurfaceArea ( int length, int width, int height) {
		
	    double SurfaceArea = (length * width + length) * (Math.sqrt(Math.pow(width/2, 2) + Math.pow(height, 2)) + width + Math.sqrt( Math.pow(length/2, 2) + Math.pow(height, 2) )  ) ;
		return SurfaceArea;
	}

 //cone
  public static double coneVolume ( int radius, int height) {
		
	    double Volume =  ( Math.PI * Math.pow(radius, 2) * height/3 );
		return Volume;
	}
  public static double coneSurfaceArea ( int radius, int height) {
		
	    double SurfaceArea =  Math.PI * radius * ( radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2) ) ) ;
		return SurfaceArea;
	}

//sphere
  public static double sphereVolume ( int radius) {
		
	    double Volume = (4 * Math.PI * Math.pow(radius,3) )/3;
		return Volume;
	}
  public static double sphereSurfaceArea ( int radius) {
		
	    double SurfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		return SurfaceArea;
	}
  
}
