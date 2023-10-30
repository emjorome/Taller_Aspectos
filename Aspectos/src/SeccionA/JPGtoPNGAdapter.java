package SeccionA;

//Adapter --> Todo el metodo es el adapter
public class JPGtoPNGAdapter extends JPG{
	private static PNG imgPNG;
	private static  JPGtoPNGAdapter myConverter;
	
	//El constructor va en privada para cumplir el patron de diseño del Singleton
	private JPGtoPNGAdapter() {
		imgPNG = new PNG();
	}
	
	//Singleton --> metodo que asegura que haya una unica instancia
	public static JPGtoPNGAdapter getJPGtoPNGAdapter() {
		if(myConverter == null) {
			myConverter = new JPGtoPNGAdapter();
		}
		return myConverter;
	}
	
	//metodo del Adapter
	public void convertir() {
		this.imagenJPG();
		System.out.println("Convirtiendo...");
		imgPNG.imagenPNG();
	}
	
	public static void main(String[] args) {
		JPGtoPNGAdapter prueba = JPGtoPNGAdapter.getJPGtoPNGAdapter(); //instanciando con Singleton
		prueba.convertir();
	}
}

interface modeloJPG {
	void imagenJPG();
}

class JPG implements modeloJPG {
	@Override
	public void imagenJPG() {
		System.out.println("Esta imagen es JPG");	
	}
}

interface modeloPNG {
	void imagenPNG();
}

class PNG implements modeloPNG {
	@Override
	public void imagenPNG() {
		System.out.println("Esta imagen es PNG");	
	}	
}