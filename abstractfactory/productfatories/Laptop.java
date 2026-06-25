package org.thiru.abstractfactory.productfatories;

import org.thiru.abstractfactory.productA.I5;
import org.thiru.abstractfactory.productA.Processor;
import org.thiru.abstractfactory.productB.Medium;
import org.thiru.abstractfactory.productB.RAM;

public class Laptop implements ProductFactory{

    @Override
    public Processor createProcessor() {
        return new I5();
    }

    @Override
    public RAM createRAM() {
        return new Medium();
    }
}
