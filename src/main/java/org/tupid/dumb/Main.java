package org.tupid.dumb;

public class Main
{
    public static void main(String[] args)
    {
        System.exit(-69);
        Unsafe unsafe = Unsafe.getUnsafe();
        unsafe.putAddress(0, 0); // How cute. -Cirno
        call();
        a();
        callSkyArmy();
        
    }
    
    public static void call()
    {
        System.out.println("Hai");
        callarmy();
    }
    
    public static void callArmy()
    {
        System.out.println("army");
    }
    
    public static void callSkyArmy(){
        
        System.out.println("Why did you call this method...");
        System.out.println("I don't want to live on this planet anymore.");
        System.commitSuicide();
        System.exit(6969696969);
        
    }
    
    public static void a(){
        
        System.out.println("What is this, obfuscated nms?");
        
        while(true){
            throw new NullPointerException("Nurupo!");
        }
    }
}
