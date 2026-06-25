package org.thiru.abstractfactory.productfatories;

import org.thiru.abstractfactory.productA.Processor;
import org.thiru.abstractfactory.productB.RAM;

public interface ProductFactory {
    Processor createProcessor();
    RAM createRAM();
}
