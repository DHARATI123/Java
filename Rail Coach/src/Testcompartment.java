
public class Testcompartment {
	public static void main(String[] args) {
		Compartment i=null;
		Compartment arr[]=new Compartment[10];
		i[0]=new Firstclass();
		i[1]=new Ladies();
		i[2]=new General();
		i[3]=new Luggage();
		     Display(i);
		// TODO Auto-generated method stub
		System.out.println("Notice in Firstclass compartment:");
        i=new Firstclass();
        i.Notice();
        System.out.println("Notice in Ladies compartment:");
        i=new Ladies();
        i.Notice();
        System.out.println("Notice in general compartment:");
        i=new General();
        i.Notice();
        System.out.println("Notice in Luggage compartment:");
        i=new Luggage();
        i.Notice();
	}
}

