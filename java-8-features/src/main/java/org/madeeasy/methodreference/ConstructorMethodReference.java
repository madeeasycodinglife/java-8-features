package org.madeeasy.methodreference;

import org.madeeasy.functionalinterface.Messageable;
import org.madeeasy.model.Message;

public class ConstructorMethodReference {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }
}
