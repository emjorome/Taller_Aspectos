package SeccionC;

public aspect SingletonAspect {
    private static Singleton Singleton.instance;

    pointcut singletonInstanceCreation(): initialization(Singleton.new(..));

    after(Singleton singleton): singletonInstanceCreation() {
        if (Singleton.getInstance() == null) {
            Singleton.setInstance(singleton);
        } else {
            singleton = Singleton.getInstance();
        }
    }

    public static Singleton Singleton.getInstance() {
        return Singleton.getInstance();
    }
}
