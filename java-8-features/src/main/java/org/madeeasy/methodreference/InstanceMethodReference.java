package org.madeeasy.methodreference;


import org.madeeasy.functionalinterface.MyMethodReference;

import java.util.function.Consumer;

public class InstanceMethodReference {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Runnable runable = myClass::hello;
        runable.run();
        MyMethodReference methodReference = myClass::hello;
        methodReference.perform();
    }
}
