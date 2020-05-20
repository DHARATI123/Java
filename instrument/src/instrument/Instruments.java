package instrument;

public abstract class Instruments {
	public abstract void play();
	

}
  class Piano extends Instruments{
	  public void play(){
		  System.out.println("piano is playing tan tan tan");
	  }
	  
  }
 
  class Flute extends Instruments{
	  public void play(){
		  System.out.println("Flute is playing tooth tooth tooth");
	  }
	  
  }
  
  class guitar extends Instruments{
	  public void play(){
		  System.out.println("guitar is playing tin tin tin");
	  }
	  
  }
   