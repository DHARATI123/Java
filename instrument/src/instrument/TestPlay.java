package instrument;

public class TestPlay {

	public static void main(String[] args) {
		Instruments i=null;
		Instruments arr[]=new Instruments[10];
		// TODO Auto-generated method stub
        i=new Piano();
        i.play();
        i=new Flute();
        i.play();
        i=new guitar();
        i.play();
	}

}

