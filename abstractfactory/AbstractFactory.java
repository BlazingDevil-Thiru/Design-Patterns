package org.thiru.abstractfactory;

import org.thiru.abstractfactory.productA.Processor;
import org.thiru.abstractfactory.productB.RAM;
import org.thiru.abstractfactory.productfatories.Laptop;
import org.thiru.abstractfactory.productfatories.ProductFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        ProductFactory productFactory = new Laptop();
        Processor p1 = productFactory.createProcessor();
        RAM ram = productFactory.createRAM();
        p1.speed();
        ram.capacity();
    }
}
