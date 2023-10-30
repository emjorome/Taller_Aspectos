package SeccionA;

public aspect AdapterAspect {
	
	pointcut callSay(): call(* *.say*());

    before() : callSay() {
        
    }

    pointcut convertir(): execution(void JPGtoPNGAdapter.convertir());

    after() : convertir() {
        System.out.println("Después de llamar al método convertir de JPGtoPNGAdapter.");
    }

}
