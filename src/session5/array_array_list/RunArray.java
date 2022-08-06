package session5.array_array_list;

import session5.WhileDemo;

public class RunArray {

    public static void main(String[] args) {

       ArrayDemo arrayDemo = new ArrayDemo();
       arrayDemo.initialize();
       arrayDemo.addValueArray();
       arrayDemo.getValueArray();


       ArraylistDemo arraylistDemo = new ArraylistDemo();
       arraylistDemo.initialize();
       arraylistDemo.addValueArrayList();
       arraylistDemo.getValueArrayList();
       arraylistDemo.joinArrayList();
    }
}
