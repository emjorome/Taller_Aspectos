package SeccionA;



public aspect AdapterAspect {
	
	// Punto de corte para interceptar llamadas al método 'convertir' de JPGtoPNGAdapter
    pointcut convertirCall(): execution(void SeccionA.JPGtoPNGAdapter.convertir());

   
    before() : convertirCall() {
        System.out.println("Adaptando JPG a PNG...");
    }

}
