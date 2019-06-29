/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramli;

/**
 *
 * @author Mamfon
 */
public class RamliCombinations
{
    /*
    private RamliObject ramli1;
    private RamliObject ramli2;
    private RamliObject ramli3;
    private RamliObject ramli4;
    private RamliObject ramli5;
    private RamliObject ramli6;
    private RamliObject ramli7;
    private RamliObject ramli8;
    private RamliObject ramli9;
    private RamliObject ramli10;
    private RamliObject ramli11;
    private RamliObject ramli12;
    private RamliObject ramli13;
    private RamliObject ramli14;
    private RamliObject ramli15;
    private RamliObject ramli16;

    private List<RamliObject> listOfRamli;
    private RamliList<RamliObject> generatedList;

    public RamliCombinations()
    {
        this.listOfRamli = SetRamli.getList();
        Collections.shuffle(listOfRamli);
        this.ramli1 = listOfRamli.get(0);
        this.ramli2 = listOfRamli.get(1);
        this.ramli3 = listOfRamli.get(2);
        this.ramli4 = listOfRamli.get(3);
        this.init();
    }

    public RamliCombinations(RamliObject ramli1, RamliObject ramli2, RamliObject ramli3, RamliObject ramli4)
    {
        this.listOfRamli = SetRamli.getList();
        this.ramli1 = ramli1;
        this.ramli2 = ramli2;
        this.ramli3 = ramli3;
        this.ramli4 = ramli4;
        this.init();
    }

    private void init()
    {
        this.doCombinations();
        this.generateList();
    }

    private void generateList()
    {
        this.generatedList = new RamliList<>();
        this.generatedList.add(ramli1);
        this.generatedList.add(ramli2);
        this.generatedList.add(ramli3);
        this.generatedList.add(ramli4);
        this.generatedList.add(ramli5);
        this.generatedList.add(ramli6);
        this.generatedList.add(ramli7);
        this.generatedList.add(ramli8);
        this.generatedList.add(ramli9);
        this.generatedList.add(ramli10);
        this.generatedList.add(ramli11);
        this.generatedList.add(ramli12);
        this.generatedList.add(ramli13);
        this.generatedList.add(ramli14);
        this.generatedList.add(ramli15);
        this.generatedList.add(ramli16);
    }

    private void doCombinations()
    {
        this.firstFormula();
        this.ramli9 = this.secondFormula(this.ramli1, this.ramli2);
        this.ramli10 = this.secondFormula(this.ramli3, this.ramli4);
        this.ramli11 = this.secondFormula(this.ramli5, this.ramli6);
        this.ramli12 = this.secondFormula(this.ramli7, this.ramli8);
        this.ramli13 = this.secondFormula(this.ramli9, this.ramli10);
        this.ramli14 = this.secondFormula(this.ramli11, this.ramli12);
        this.ramli15 = this.secondFormula(this.ramli13, this.ramli14);
        this.ramli16 = this.secondFormula(this.ramli15, this.ramli1);

    }

    private void firstFormula()
    {
        DotConfig dc1 = this.ramli1.getDotConfig();
        DotConfig dc2 = this.ramli2.getDotConfig();
        DotConfig dc3 = this.ramli3.getDotConfig();
        DotConfig dc4 = this.ramli4.getDotConfig();

        DotConfig dotConfig5 = new DotConfig(dc1.getFirst(), dc2.getFirst(), dc3.getFirst(), dc4.getFirst());
        DotConfig dotConfig6 = new DotConfig(dc1.getSecond(), dc2.getSecond(), dc3.getSecond(), dc4.getSecond());
        DotConfig dotConfig7 = new DotConfig(dc1.getThird(), dc2.getThird(), dc3.getThird(), dc4.getThird());
        DotConfig dotConfig8 = new DotConfig(dc1.getFourth(), dc2.getFourth(), dc3.getFourth(), dc4.getFourth());

        this.ramli5 = new RamliObject();
        this.ramli6 = new RamliObject();
        this.ramli7 = new RamliObject();
        this.ramli8 = new RamliObject();

        this.ramli5.setDotConfig(dotConfig5);
        this.ramli6.setDotConfig(dotConfig6);
        this.ramli7.setDotConfig(dotConfig7);
        this.ramli8.setDotConfig(dotConfig8);

        Comparator<RamliObject> comparator = new RamliDotConfigComparator();
        Collections.sort(this.listOfRamli, comparator);

        this.ramli5 = this.listOfRamli.get(Collections.binarySearch(this.listOfRamli, this.ramli5, comparator));
        this.ramli6 = this.listOfRamli.get(Collections.binarySearch(this.listOfRamli, this.ramli6, comparator));
        this.ramli7 = this.listOfRamli.get(Collections.binarySearch(this.listOfRamli, this.ramli7, comparator));
        this.ramli8 = this.listOfRamli.get(Collections.binarySearch(this.listOfRamli, this.ramli8, comparator));
    }

    public RamliObject secondFormula(RamliObject ramliX, RamliObject ramliY)
    {
        DotConfig dotConfigX = ramliX.getDotConfig();
        DotConfig dotConfigY = ramliY.getDotConfig();
        final int firstRow = (dotConfigX.getFirst() + dotConfigY.getFirst()) % 2 == 0 ? DotConfig.TWO : DotConfig.ONE;
        final int secondRow = (dotConfigX.getSecond() + dotConfigY.getSecond()) % 2 == 0 ? DotConfig.TWO : DotConfig.ONE;
        final int thirdRow = (dotConfigX.getThird() + dotConfigY.getThird()) % 2 == 0 ? DotConfig.TWO : DotConfig.ONE;
        final int fourthRow = (dotConfigX.getFourth() + dotConfigY.getFourth()) % 2 == 0 ? DotConfig.TWO : DotConfig.ONE;

        RamliObject anonymousRamli = new RamliObject();
        anonymousRamli.setDotConfig(new DotConfig(firstRow, secondRow, thirdRow, fourthRow));

        Comparator<RamliObject> comparator = new RamliDotConfigComparator();
        Collections.sort(this.listOfRamli, comparator);

        return this.listOfRamli.get(Collections.binarySearch(this.listOfRamli, anonymousRamli, comparator));
    }

    public RamliList<RamliObject> getGeneratedList()
    {
        return generatedList;
    }
     */
}
