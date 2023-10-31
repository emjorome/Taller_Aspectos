package SeccionC;

public class Singleton {
    private static Singleton instance;
    
    private Singleton() {

    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public static void setInstance(Singleton s) {
    	instance = s;
    }
    
    public void sayHello() {
        System.out.println("Hola desde Singleton!");
    }
    public class Main {
        public static void main(String[] args) {
            Singleton singleton = Singleton.getInstance();
            singleton.sayHello();
        }
    }

}
