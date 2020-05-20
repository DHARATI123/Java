
public class Testint {
public static void main (String[] args){
	Instrument i[]=null;
	i=new Instrument[10];
	i[0]=new Piano();
	i[1]=new Flute();
	i[2]=new Guitar();
	     Display(i);
	     
}
public static void Display(Instrument arr[]){
	String str=" is playing ";
	for(Instrument i:arr){
		if(i instanceof Guitar){
			System.out.println("guitar"+str+i.play());
		}
		if (i instanceof Piano)
		{
			System.out.println("Piano"+str+i.play());
		}
		if (i instanceof Flute)
		{
			System.out.println("Flute"+str+i.play());
		}
	}
}
}
