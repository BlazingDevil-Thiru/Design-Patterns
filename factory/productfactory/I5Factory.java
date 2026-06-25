package org.thiru.factory.productfactory;

import org.thiru.factory.product.I5;
import org.thiru.factory.product.Processor;

public class I5Factory implements ProcessorFactory {
    public Processor createProcessor(){
        return new I5();
    }
}
