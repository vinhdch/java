package session3;

public class Demo {

    public static void main(String[] args) {
       Cat miMi = new Cat();
       Cat moMo = new Cat("momo");
       Cat fullInfo = new Cat("Anh",(byte)2, "blue","US","Lai");

       // lay info cua object
       String name = fullInfo.getName();

       // cap nhat gia tri cho object
        fullInfo.setName("Obama");
        fullInfo.printInfo();
    }
}
