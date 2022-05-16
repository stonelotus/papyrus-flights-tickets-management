package tema1_class_diagram;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aplicatie {

	public static void main(String[] args) {
		Bilet bilet1 = new Bilet(1, 1, 1, 1, "02.02.2022", "03.02.2022");
		Bilet bilet2 = new Bilet(2, 1, 1, 1, "02.02.2022", "03.02.2022");
		Bilet bilet3 = new Bilet(3, 1, 1, 1, "02.02.2022", "03.02.2022");
		Cos cos1 = new Cos();
		cos1.adaugareBilet(bilet1);
		cos1.adaugareBilet(bilet2);
		cos1.adaugareBilet(bilet3);
		cos1.afisareBilete();
		bilet1.afisare();
		
		Client client1 = new Client("010010", "adadwad", "addaaa", "1211312313", "cutarescu@gmail.com", cos1);
		client1.afisareInformatiiClient();
		System.out.println("-----Afisare bilete--------");
		client1.cos.afisareBilete();
		System.out.println("-----Editare bilet 2 -------");
		client1.cos.bilete[1].editare(new Bilet(10,100,1,3,"10.10.2020","20.10.2020"));
		client1.cos.bilete[1].afisare();
		client1.cos.stergereBilet(2);
		System.out.println("----Sters bilet 2-------");
		client1.cos.afisareBilete();
		client1.cos.golireCos();
		System.out.println("----Golit-----");
		client1.cos.afisareBilete();
		
		
		
		
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm");
		Calendar timestampDecolare = new GregorianCalendar(2013,0,31, 21, 26);
		Calendar timestampAterizareDestinatie = new GregorianCalendar(2013,0,31, 22, 26);
		
		Zbor zbor1 = new Zbor(1, "Boeing 747", "edad", "dadad", timestampDecolare, timestampAterizareDestinatie, 102);
		System.out.println("----Intarziere-----");
		zbor1.intarziere(50);
		System.out.println("----Locuri 0:libere 1:ocupate-----");
		zbor1.afisareDetalii();
		System.out.println(zbor1.verificaLocLiber(0)); 
	}

}
