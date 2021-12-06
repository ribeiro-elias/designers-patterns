package book.singleton;

public class DbSingletonThreadsafe {
    private static volatile DbSingletonThreadsafe instance = null;

    private DbSingletonThreadsafe(){
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingletonThreadsafe getInstance(){
        if(instance == null){
            synchronized (DbSingletonThreadsafe.class){
                if(instance == null){
                    instance = new DbSingletonThreadsafe();
                }
            }
        }
        return instance;
    }
}
