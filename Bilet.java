// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package tema1_class_diagram;

import java.util.Scanner;

/************************************************************/
/**
 * 
 */
public class Bilet {
	/**
	 * 
	 */
	protected int id;
	/**
	 * 
	 */
	protected int pret;
	/**
	 * 
	 */
	protected int loc;
	/**
	 * 
	 */
	protected int poarta;
	/**
	 * 
	 */
	protected String dataGenerare;
	/**
	 * 
	 */
	protected String deadlineCheckin;
	/**
	 * 
	 */
	public OptiuniAditionaleBilet optiuniAditionale;
	/**
	 * 
	 */
	//public OptiuniAditionaleBilet optiuniaditionalebilet;
	
	public Bilet(int id, int pret, int loc, int poarta, String dataGenerare, String deadlineCheckin) {
		super();
		this.id = id;
		this.pret = pret;
		this.loc = loc;
		this.poarta = poarta;
		this.dataGenerare = dataGenerare;
		this.deadlineCheckin = deadlineCheckin;
		//optiunile aditionale lipsesc de aici pt ca sunt optionale
	}
	
	public void completareDetaliiBilet(int id, int pret, int loc, int poarta, String dataGenerare, String deadlineCheckin, boolean adaugaOptiuniAditionale) {
		this.id = id;	
		this.pret = pret;
		this.loc = loc;
		this.poarta = poarta;
		this.dataGenerare = dataGenerare;
		this.deadlineCheckin = deadlineCheckin;
		if(adaugaOptiuniAditionale == true) {
			selecteazaOptiuniAditionale();
		}
	}
	

	/**
	 * 
	 * @param bilet_nou 
	 */
	public void editare(Bilet bilet_nou) {
		if(bilet_nou.getPret() > -1) {
			setPret(bilet_nou.getPret());
		}
		if(bilet_nou.getLoc() > -1) {
			setLoc(bilet_nou.getLoc());
			
		}
		if(bilet_nou.getPoarta() > -1) {
			setPoarta(bilet_nou.getPoarta());
			
		}
		if(bilet_nou.getDeadlineCheckin() != null) {
			setDeadlineCheckin(bilet_nou.getDeadlineCheckin());
		}
	}


	/**
	 * 
	 */
	public void afisare() {
		System.out.println("Info Bilet" + this.id + this.pret + this.loc + this.poarta + this.dataGenerare + this.deadlineCheckin);
	}
	
	

	public int getId() {
		return id;
	}



	public int getPret() {
		return pret;
	}



	public void setPret(int pret) {
		this.pret = pret;
	}



	public int getLoc() {
		return loc;
	}



	public void setLoc(int loc) {
		this.loc = loc;
	}



	public int getPoarta() {
		return poarta;
	}



	public void setPoarta(int poarta) {
		this.poarta = poarta;
	}



	public String getDataGenerare() {
		return dataGenerare;
	}

	public String getDeadlineCheckin() {
		return deadlineCheckin;
	}



	public void setDeadlineCheckin(String deadlineCheckin) {
		this.deadlineCheckin = deadlineCheckin;
	}



	public OptiuniAditionaleBilet getOptiuniAditionale() {
		return optiuniAditionale;
	}



	public void setOptiuniAditionale(OptiuniAditionaleBilet optiuniAditionale) {
		this.optiuniAditionale = optiuniAditionale;
	}	



	/**
	 * 
	 * @param optiuniAditionale 
	 */
	public void selecteazaOptiuniAditionale() {
		Scanner keyboard = new Scanner(System.in);

		OptiuniAditionaleBilet optiuniAditionale = new OptiuniAditionaleBilet();

		System.out.println("Introduceti clasa dorita (0 to skip): ");
		int clasa = keyboard.nextInt();
		if(clasa > 0 && clasa < 3) {
			optiuniAditionale.setClasa(clasa);
		}
		
		System.out.println("Selecteaza numar bagaje: ");
		int nrBagaje = keyboard.nextInt();
		if(nrBagaje > 0) {
			optiuniAditionale.setNrBagaje(nrBagaje);
		} 
		
		System.out.println("Selecteaza greutate aditionala (max 10): ");
		int greutateAditionala = keyboard.nextInt();
		if(greutateAditionala > 0 && greutateAditionala <=10) {
			optiuniAditionale.setGreutateAditionala(greutateAditionala);
		}
		
		optiuniAditionale.computeCost();
		
		this.setOptiuniAditionale(optiuniAditionale);
			
	}
	
	public void stergere() {
		this.optiuniAditionale = null;
	}
}
