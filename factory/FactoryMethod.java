package org.thiru.factory;

import org.thiru.factory.product.Processor;
import org.thiru.factory.productfactory.I5Factory;
import org.thiru.factory.productfactory.ProcessorFactory;

public class FactoryMethod {
    public static void main(String[] args) {
        ProcessorFactory processorFactory = new I5Factory();
        Processor p1 = processorFactory.createProcessor();
        p1.speed();
    }
}
