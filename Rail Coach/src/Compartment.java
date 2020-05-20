
public abstract class Compartment {
	public abstract void Notice();

}
class Firstclass extends Compartment{
	  public void Notice(){
		  System.out.println("No Smoking");
	  }
	  
}
class Ladies extends Compartment{
	public void Notice(){
		System.out.println("Stay alert from thieves");
	}
}
class General extends Compartment{
	public void Notice(){
		System.out.println("No spitting");
	}
}
class Luggage extends Compartment{
	public void Notice(){
		System.out.println("keep clean your surrounding");
	}
}
