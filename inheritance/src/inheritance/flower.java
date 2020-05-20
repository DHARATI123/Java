package inheritance;

 class Flower 
 {
	 void colour()
	 {
		 System.out.println("red colour......");
	 }

}
 class Rose extends Flower
 {
	 void texture()
	 {
		 System.out.println("soft texture.....");
	 }

 }
 class TestInheritance
 {
	 public static void main(String args[])
	 {
		Rose r=new Rose();
		r.colour();
		r.texture();
	 }
	 
 }
