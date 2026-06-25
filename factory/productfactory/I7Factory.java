package org.thiru.factory.productfactory;

import org.thiru.factory.product.I7;
import org.thiru.factory.product.Processor;

public class I7Factory implements ProcessorFactory{
    public Processor createProcessor(){
        return new I7();
    }
}
