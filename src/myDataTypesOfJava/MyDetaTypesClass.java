package myDataTypesOfJava;

public class MyDetaTypesClass {

        int a=22;   //global variable
   static int s=35;   //static variable
   
   public void variable3()
   {
	  int d=23 ;
	 System.out.println(" this is local:"+d);
	 System.out.println(" this is global:"+a);
	 System.out.println(" this is static:"+s);  
   }
   public void variable4()
   {
	  int d=34 ;
	 System.out.println(" this is local:"+d);
	 System.out.println(" this is global:"+a);
	 System.out.println(" this is static:"+s);  
   }

   public void variable7()
   {
	  int d=45 ;
	 System.out.println(" this is local:"+d);
	 System.out.println(" this is global:"+a);
	 System.out.println(" this is static:"+s);  
   }
   public void variable5()
   {
	  int d=23 ;
	 System.out.println(" this is local:"+d);
	 System.out.println(" this is global:"+a);
	 System.out.println(" this is static:"+s);  
   }
   public static void varible56()
   {
	  int d=45 ;
	 System.out.println(" this is local:"+d);
	 
	 System.out.println(" this is static:"+s);  
   } 
     
   public static void variable38()
   {
	  int d=457 ;
	 System.out.println(" this is local:"+d);
	
	 System.out.println(" this is static:"+s);  
   } 
public static void main(String[] args) {
	MyDetaTypesClass a=new MyDetaTypesClass();
	   a.variable3();
	   a.variable4();
	   a.variable7();
	   a.variable5();
	   varible56();
       variable38();

}







}
