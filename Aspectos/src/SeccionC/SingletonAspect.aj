package SeccionC;

import SeccionA.JPGtoPNGAdapter;

public aspect SingletonAspect{
	private static JPGtoPNGAdapter myConverter;

	pointcut singletonCreation(): call(JPGtoPNGAdapter.new(..));

	after() returning(JPGtoPNGAdapter instance): singletonCreation(){
		if(myConverter == null) {
			myConverter = instance;
		}
	}
	
	public static JPGtoPNGAdapter JPGtoPNGAdapter.getInstance(){
		return myConverter;
	}
}