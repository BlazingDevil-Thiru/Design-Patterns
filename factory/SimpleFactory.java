package org.thiru.factory;

import org.thiru.factory.product.I5;
import org.thiru.factory.product.I7;
import org.thiru.factory.product.Processor;

public class SimpleFactory {
    public static Processor createProcessor(String spec){
        if(spec.equals("i5")) return new I5();
        else if(spec.equals("i7")) return new I7();
        else return null;
    }
}
