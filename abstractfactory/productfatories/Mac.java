package org.thiru.abstractfactory.productfatories;

import org.thiru.abstractfactory.productA.I7;
import org.thiru.abstractfactory.productA.Processor;
import org.thiru.abstractfactory.productB.High;
import org.thiru.abstractfactory.productB.RAM;

public class Mac implements ProductFactory{
    @Override
    public Processor createProcessor() {
        return new I7();
    }

    @Override
    public RAM createRAM() {
        return new High();
    }
}
