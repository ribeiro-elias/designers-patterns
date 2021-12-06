package book.singleton;

public class SingletonV1 {
    //So ele se instancia
    //Garanto que tenho uma unica instancia na aplicacao
    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println(singletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);

        if(singletonRuntime == anotherInstance){
            System.out.println("They are the same instance");
        }
    }
}
