package org.sara.sarageneticalgorithmsplugin.core.events;

import org.sara.interfaces.algorithms.ga.chromosome.IPopulation;
import org.sara.interfaces.algorithms.ga.core.IGeneration;

public class Generation implements IGeneration {

    public Generation(int genNumber, IPopulation population) {
        this.setGenNumber(genNumber);
        this.setPopulation(population);
    }

    public int getGenNumber() {
        return genNumber;
    }

    private void setGenNumber(int genNumber) {
        this.genNumber = genNumber;
    }

    public IPopulation getPopulation() {
        return population;
    }

    private void setPopulation(IPopulation population) {
        this.population = population;
    }

    private int genNumber;
    private IPopulation population;
}
