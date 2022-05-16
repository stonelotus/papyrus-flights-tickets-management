// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package tema1_class_diagram;

/************************************************************/
/**
 * 
 */
public class Cos {
	/**
	 * 
	 */
	protected int nrBilete = 0;
	/**
	 * 
	 */
	// protected Bilet bilete; //relatia de asociere asigura generarea in cod a
	// vectorului bilete. Declararea lui ca variabila in diagrama de clase e
	// redundanta
	/**
	 * 
	 */
	protected float pretTotalCurent;
	/**
	 * 
	 */
	public Bilet[] bilete;

	static final int NR_MAX_BILETE = 30;

	public Cos() {
		super();
		nrBilete = 0;
		pretTotalCurent = 0;
		bilete = new Bilet[NR_MAX_BILETE];
	}

	/**
	 * 
	 * @param bilet
	 */
	public void adaugareBilet(Bilet bilet) {
		if (nrBilete < NR_MAX_BILETE)
			this.bilete[nrBilete++] = bilet;
	}

	public void afisareBilete() {
		for (int i = 0; i < nrBilete; i++)
			bilete[i].afisare();
	}

	/**
	 * 
	 * @param idBilet
	 */
	public void stergereBilet(int idBilet) {
		int index = 0, i;
		for (i = 0; i < this.nrBilete; i++)
			if (this.bilete[i].id == idBilet) {
				index = i;
				break;
			}
		for(i = index; i < this.nrBilete - 1; i++)
			this.bilete[i] = this.bilete[i+1];
		
		this.nrBilete--;
	}

	/**
	 * 
	 */
	public void golireCos() {
		this.nrBilete = 0;
	}

	/**
	 * 
	 */
	public void checkout() {
		//aici ar trebui ca zbor.loc
	}
}