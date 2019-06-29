/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramli.grouping;

/**
 *
 * @author Mamfon
 */
public class GroupRamliObjects
{
    /*
    private RamliList<RamliObject> generatedList;

    public GroupRamliObjects(RamliList<RamliObject> generatedList)
    {
        this.generatedList = generatedList;
    }

    protected List<Group> getRamliGroups(RamliObject ro)
    {
        List<Group> ramliGroups = new ArrayList<>();
        for(GroupType groupType : arrayOfGroupTypes())
        {
            //System.out.println("The Grouptype number is " + groupType.getNumber());
            Group[] groups = groupType.getGroups();
            for(Group group : groups)
            {
                //System.out.println("The Group name is " + group.getName());
                RamliObject[] ramliObjects = group.getRamliObjects();
                for(int i = 0; i < ramliObjects.length; i++)
                {
                    RamliObject ramliObject = ramliObjects[i];
                    //System.out.println("The Ramli defination is " + ramliObject.getDefinition());

                    if(ramliObject.equals(ro))
                        ramliGroups.add(group);
                }
            }
        }
        //System.out.println("How many items are in this list? " + ramliGroups.size());
        return ramliGroups;
    }

    public static void main(String[] args)
    {
        RamliCombinations ramliCombinations = new RamliCombinations(new RamliObject(7), new RamliObject(2), new RamliObject(4), new RamliObject(12));
        RamliList<RamliObject> ramliObjects = ramliCombinations.getGeneratedList();
//        new GroupRamliObjects(ramliObjects);
        List<Group> ramliGroups = new GroupRamliObjects(ramliObjects).getRamliGroups(new RamliObject("Nusra"));
        for(Group group : ramliGroups)
        {
            System.out.println("Group: " + group);
            System.out.println("**************************************************************************");
        }
    }

    public GroupType[] arrayOfGroupTypes()
    {
        GroupType[] arrayOfGroupTypes = new GroupType[]
        {
            getGroupType1(),
            getGroupType2(),
            getGroupType3(),
            getGroupType4(),
            getGroupType5(),
            getGroupType6(),
            getGroupType7(),
            getGroupType8(),
            getGroupType9(),
            getGroupType11(),
            getGroupType12()
        };
        return arrayOfGroupTypes;
    }

    public GroupType getGroupType1()
    {
        GroupTypeClass groupType1 = new GroupTypeClass();

        groupType1.setNumber(1);
        groupType1.setName("Dabia Tauraro (Nature 1)");

        GroupTypeClass.GroupClass nari, turabi, hawai, mai;
        nari = groupType1.new GroupClass();
        turabi = groupType1.new GroupClass();
        hawai = groupType1.new GroupClass();
        mai = groupType1.new GroupClass();

        nari.setName("Nari");
        nari.setDescription("Represent Days");
        nari.setGroupTypeName(groupType1.getName());
        nari.setGroupTypeNumber(groupType1.getNumber());
        nari.setRamliObjects(new RamliObject[]
        {
            new RamliObject(2),
            new RamliObject(9),
            new RamliObject(1),
            new RamliObject(16)
        });

        turabi.setName("Turabi");
        turabi.setDescription("Represent Night");
        turabi.setGroupTypeName(groupType1.getName());
        turabi.setGroupTypeNumber(groupType1.getNumber());
        turabi.setRamliObjects(new RamliObject[]
        {
            new RamliObject(10),
            new RamliObject(14),
            new RamliObject(12),
            new RamliObject(8)
        });

        hawai.setName("Hawai");
        hawai.setDescription("Represent Day");
        hawai.setGroupTypeName(groupType1.getName());
        hawai.setGroupTypeNumber(groupType1.getNumber());
        hawai.setRamliObjects(new RamliObject[]
        {
            new RamliObject(11),
            new RamliObject(15),
            new RamliObject(3),
            new RamliObject(4)
        });

        mai.setName("Mai");
        mai.setDescription("Represent Night");
        mai.setGroupTypeName(groupType1.getName());
        mai.setGroupTypeNumber(groupType1.getNumber());
        mai.setRamliObjects(new RamliObject[]
        {
            new RamliObject(5),
            new RamliObject(6),
            new RamliObject(13),
            new RamliObject(7)
        });

        Group[] groupArr1 =
        {
            nari, turabi, hawai, mai
        };
        groupType1.setGroups(groupArr1);
        return groupType1;
    }

    public GroupType getGroupType2()
    {
        GroupTypeClass groupType2 = new GroupTypeClass();

        groupType2.setNumber(2);
        groupType2.setName("Nature 2");

        GroupTypeClass.GroupClass autad, yaliAutad, sawakid, natureGroup4;
        autad = groupType2.new GroupClass();
        yaliAutad = groupType2.new GroupClass();
        sawakid = groupType2.new GroupClass();
        natureGroup4 = groupType2.new GroupClass();

        RamliObject[] ramliObjectArr = new RamliObject[4];

        ramliObjectArr[0] = this.generatedList.get(1);
        ramliObjectArr[1] = this.generatedList.get(4);
        ramliObjectArr[2] = this.generatedList.get(7);
        ramliObjectArr[3] = this.generatedList.get(10);

        autad.setName("AUTAD");
        autad.setRamliObjects(ramliObjectArr);
        autad.setGroupTypeName(groupType2.getName());
        autad.setGroupTypeNumber(groupType2.getNumber());

        RamliObject[] ramliObjectArr2 = new RamliObject[4];
        ramliObjectArr2[0] = this.generatedList.get(2);
        ramliObjectArr2[1] = this.generatedList.get(5);
        ramliObjectArr2[2] = this.generatedList.get(8);
        ramliObjectArr2[3] = this.generatedList.get(11);

        yaliAutad.setName("YALI AUTAD");
        yaliAutad.setRamliObjects(ramliObjectArr2);
        yaliAutad.setGroupTypeName(groupType2.getName());
        yaliAutad.setGroupTypeNumber(groupType2.getNumber());

        RamliObject[] ramliObjectArr3 = new RamliObject[4];
        ramliObjectArr3[0] = this.generatedList.get(3);
        ramliObjectArr3[1] = this.generatedList.get(6);
        ramliObjectArr3[2] = this.generatedList.get(9);
        ramliObjectArr3[3] = this.generatedList.get(12);

        sawakid.setName("SAWAKID");
        sawakid.setRamliObjects(ramliObjectArr3);
        sawakid.setGroupTypeName(groupType2.getName());
        sawakid.setGroupTypeNumber(groupType2.getNumber());

        RamliObject[] ramliObjectArr4 = new RamliObject[4];
        ramliObjectArr4[0] = this.generatedList.get(13);
        ramliObjectArr4[1] = this.generatedList.get(14);
        ramliObjectArr4[2] = this.generatedList.get(15);
        ramliObjectArr4[3] = this.generatedList.get(16);

        natureGroup4.setName("ZAWAID");
        natureGroup4.setRamliObjects(ramliObjectArr4);
        natureGroup4.setGroupTypeName(groupType2.getName());
        natureGroup4.setGroupTypeNumber(groupType2.getNumber());

        Group[] groupArr2 =
        {
            autad, yaliAutad, sawakid, natureGroup4
        };
        groupType2.setGroups(groupArr2);
        return groupType2;
    }

    public GroupType getGroupType3()
    {
        GroupTypeClass groupType3 = new GroupTypeClass();

        groupType3.setNumber(3);
        groupType3.setName("Gender");

        GroupTypeClass.GroupClass male, female, both;
        male = groupType3.new GroupClass();
        female = groupType3.new GroupClass();
        both = groupType3.new GroupClass();

        male.setName("Male");
        male.setGroupTypeName(groupType3.getName());
        male.setGroupTypeNumber(groupType3.getNumber());
        male.setRamliObjects(new RamliObject[]
        {
            new RamliObject(2),
            new RamliObject(7),
            new RamliObject(9),
            new RamliObject(11),
            new RamliObject(5),
            new RamliObject(6),
            new RamliObject(16)
        });

        female.setName("Female");
        female.setGroupTypeName(groupType3.getName());
        female.setGroupTypeNumber(groupType3.getNumber());
        female.setRamliObjects(new RamliObject[]
        {
            new RamliObject(3),
            new RamliObject(4),
            new RamliObject(13),
            new RamliObject(8),
            new RamliObject(10),
            new RamliObject(12),
            new RamliObject(15)
        });

        both.setName("Both");
        both.setGroupTypeName(groupType3.getName());
        both.setGroupTypeNumber(groupType3.getNumber());
        both.setRamliObjects(new RamliObject[]
        {
            new RamliObject(1),
            new RamliObject(14)
        });

        Group[] groupArr3 =
        {
            male, female, both
        };
        groupType3.setGroups(groupArr3);
        return groupType3;
    }

    public GroupType getGroupType4()
    {
        GroupTypeClass groupType4 = new GroupTypeClass();

        groupType4.setNumber(4);
        groupType4.setName("Good and Bad Objects");

        GroupTypeClass.GroupClass goodObjects, badObjects, neutral;
        goodObjects = groupType4.new GroupClass();
        badObjects = groupType4.new GroupClass();
        neutral = groupType4.new GroupClass();

        goodObjects.setName("Good Objects");
        goodObjects.setGroupTypeName(groupType4.getName());
        goodObjects.setGroupTypeNumber(groupType4.getNumber());
        goodObjects.setRamliObjects(new RamliObject[]
        {
            new RamliObject(2),
            new RamliObject(15),
            new RamliObject(9),
            new RamliObject(3),
            new RamliObject(4),
            new RamliObject(12)
        });

        badObjects.setName("Bad Objects");
        badObjects.setGroupTypeName(groupType4.getName());
        badObjects.setGroupTypeNumber(groupType4.getNumber());
        badObjects.setRamliObjects(new RamliObject[]
        {
            new RamliObject(6),
            new RamliObject(13),
            new RamliObject(7),
            new RamliObject(8),
            new RamliObject(14)
        });

        neutral.setName("Neutral");
        neutral.setGroupTypeName(groupType4.getName());
        neutral.setGroupTypeNumber(groupType4.getNumber());
        neutral.setRamliObjects(new RamliObject[]
        {
            new RamliObject(5),
            new RamliObject(16),
            new RamliObject(1),
            new RamliObject(11),
            new RamliObject(10)
        });

        Group[] groupArr4 =
        {
            goodObjects, badObjects, neutral
        };
        groupType4.setGroups(groupArr4);
        return groupType4;
    }

    public GroupType getGroupType5()
    {
        GroupTypeClass groupType5 = new GroupTypeClass();

        groupType5.setNumber(5);
        groupType5.setName("Distance between Objects");

        GroupTypeClass.GroupClass badMukabala, good, bad, pending;
        badMukabala = groupType5.new GroupClass();
        good = groupType5.new GroupClass();
        bad = groupType5.new GroupClass();
        pending = groupType5.new GroupClass();

        RamliObject[] ramliObjectArr1 = new RamliObject[2];
        ramliObjectArr1[0] = this.generatedList.get(7);
        ramliObjectArr1[1] = this.generatedList.get(14);

        badMukabala.setName("Bad Mukabala");
        badMukabala.setRamliObjects(ramliObjectArr1);
        badMukabala.setGroupTypeName(groupType5.getName());
        badMukabala.setGroupTypeNumber(groupType5.getNumber());

        RamliObject[] ramliObjectArr2 = new RamliObject[5];
        ramliObjectArr2[0] = this.generatedList.get(3);
        ramliObjectArr2[1] = this.generatedList.get(9);
        ramliObjectArr2[2] = this.generatedList.get(13);
        ramliObjectArr2[3] = this.generatedList.get(5);
        ramliObjectArr2[4] = this.generatedList.get(15);
        good.setName("Good");
        good.setRamliObjects(ramliObjectArr2);
        good.setGroupTypeName(groupType5.getName());
        good.setGroupTypeNumber(groupType5.getNumber());

        RamliObject[] ramliObjectArr3 = new RamliObject[4];
        ramliObjectArr3[0] = this.generatedList.get(4);
        ramliObjectArr3[1] = this.generatedList.get(12);
        ramliObjectArr3[2] = this.generatedList.get(6);
        ramliObjectArr3[3] = this.generatedList.get(10);
        bad.setName("Bad");
        bad.setRamliObjects(ramliObjectArr3);
        bad.setGroupTypeName(groupType5.getName());
        bad.setGroupTypeNumber(groupType5.getNumber());

        RamliObject[] ramliObjectArr4 = new RamliObject[1];
        ramliObjectArr4[0] = this.generatedList.get(1);

        pending.setName("NEUTURAL");
        pending.setRamliObjects(ramliObjectArr4);
        pending.setGroupTypeName(groupType5.getName());
        pending.setGroupTypeNumber(groupType5.getNumber());

        Group[] groupArr5 =
        {
            badMukabala, good, bad, pending
        };
        groupType5.setGroups(groupArr5);
        return groupType5;
    }

    public GroupType getGroupType6()
    {
        GroupTypeClass groupType6 = new GroupTypeClass();

        groupType6.setNumber(6);
        groupType6.setName("Nature 3");

        GroupTypeClass.GroupClass dahil, harij, munkalabi, sabitun;
        dahil = groupType6.new GroupClass();
        harij = groupType6.new GroupClass();
        munkalabi = groupType6.new GroupClass();
        sabitun = groupType6.new GroupClass();

        dahil.setName("Dahil");
        dahil.setGroupTypeName(groupType6.getName());
        dahil.setGroupTypeNumber(groupType6.getNumber());
        dahil.setRamliObjects(new RamliObject[]
        {
            new RamliObject(12),
            new RamliObject(3),
            new RamliObject(15),
            new RamliObject(8)
        });

        harij.setName("Harij");
        harij.setGroupTypeName(groupType6.getName());
        harij.setGroupTypeNumber(groupType6.getNumber());
        harij.setRamliObjects(new RamliObject[]
        {
            new RamliObject(9),
            new RamliObject(13),
            new RamliObject(2),
            new RamliObject(6)
        });

        munkalabi.setName("Munkalabi");
        munkalabi.setGroupTypeName(groupType6.getName());
        munkalabi.setGroupTypeNumber(groupType6.getNumber());
        munkalabi.setRamliObjects(new RamliObject[]
        {
            new RamliObject(14),
            new RamliObject(1),
            new RamliObject(7),
            new RamliObject(8)
        });

        sabitun.setName("Sabitun");
        sabitun.setGroupTypeName(groupType6.getName());
        sabitun.setGroupTypeNumber(groupType6.getNumber());
        sabitun.setRamliObjects(new RamliObject[]
        {
            new RamliObject(5),
            new RamliObject(10),
            new RamliObject(11),
            new RamliObject(16)
        });

        Group[] groupArr6 =
        {
            dahil, harij, munkalabi, sabitun
        };
        groupType6.setGroups(groupArr6);
        return groupType6;
    }

    public GroupType getGroupType7()
    {
        GroupTypeClass groupType7 = new GroupTypeClass();
        groupType7.setNumber(7);
        groupType7.setName("House Nature");
        GroupTypeClass.GroupClass ummuhat, banatu, kafidatu, sawaqidu;
        ummuhat = groupType7.new GroupClass();
        banatu = groupType7.new GroupClass();
        kafidatu = groupType7.new GroupClass();
        sawaqidu = groupType7.new GroupClass();

        RamliObject[] ramliObjectArr1 = new RamliObject[1];
        ramliObjectArr1[0] = this.generatedList.get(1);

        ummuhat.setName("Ummuhat");
        ummuhat.setGroupTypeName(groupType7.getName());
        ummuhat.setGroupTypeNumber(groupType7.getNumber());
        ummuhat.setRamliObjects(ramliObjectArr1);

        RamliObject[] ramliObjectArr2 = new RamliObject[1];
        ramliObjectArr2[0] = this.generatedList.get(2);

        banatu.setName("Banatu");
        banatu.setGroupTypeName(groupType7.getName());
        banatu.setGroupTypeNumber(groupType7.getNumber());
        banatu.setRamliObjects(ramliObjectArr2);

        RamliObject[] ramliObjectArr3 = new RamliObject[1];
        ramliObjectArr3[0] = this.generatedList.get(3);

        kafidatu.setName("Kafidatu");
        kafidatu.setGroupTypeName(groupType7.getName());
        kafidatu.setGroupTypeNumber(groupType7.getNumber());
        kafidatu.setRamliObjects(ramliObjectArr3);

        RamliObject[] ramliObjectArr4 = new RamliObject[1];
        ramliObjectArr4[0] = this.generatedList.get(4);

        sawaqidu.setName("Sawaqidu");
        sawaqidu.setGroupTypeName(groupType7.getName());
        sawaqidu.setGroupTypeNumber(groupType7.getNumber());
        sawaqidu.setRamliObjects(ramliObjectArr4);

        Group[] groupArr7 =
        {
            ummuhat, banatu, kafidatu, sawaqidu
        };
        groupType7.setGroups(groupArr7);
        return groupType7;
    }

    public GroupType getGroupType8()
    {
        GroupTypeClass groupType8 = new GroupTypeClass();

        groupType8.setNumber(8);
        groupType8.setName("Planets");

        GroupTypeClass.GroupClass saturn, jupiter, mars, sun, venus, mercury, moon, uranus, pluto;
        saturn = groupType8.new GroupClass();
        jupiter = groupType8.new GroupClass();
        mars = groupType8.new GroupClass();
        sun = groupType8.new GroupClass();
        venus = groupType8.new GroupClass();
        mercury = groupType8.new GroupClass();
        moon = groupType8.new GroupClass();
        uranus = groupType8.new GroupClass();
        pluto = groupType8.new GroupClass();

        saturn.setName("Saturn");
        saturn.setGroupTypeName(groupType8.getName());
        saturn.setGroupTypeNumber(groupType8.getNumber());
        saturn.setRamliObjects(new RamliObject[]
        {
            new RamliObject(8), new RamliObject(10)
        });

        jupiter.setName("Jupiter");
        jupiter.setGroupTypeName(groupType8.getName());
        jupiter.setGroupTypeNumber(groupType8.getNumber());
        jupiter.setRamliObjects(new RamliObject[]
        {
            new RamliObject(3), new RamliObject(2)
        });

        mars.setName("Mars");
        mars.setGroupTypeName(groupType8.getName());
        mars.setGroupTypeNumber(groupType8.getNumber());
        mars.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7), new RamliObject(14)
        });

        sun.setName("Sun");
        sun.setGroupTypeName(groupType8.getName());
        sun.setGroupTypeNumber(groupType8.getNumber());
        sun.setRamliObjects(new RamliObject[]
        {
            new RamliObject(9), new RamliObject(15)
        });

        venus.setName("Venus");
        venus.setGroupTypeName(groupType8.getName());
        venus.setGroupTypeNumber(groupType8.getNumber());
        venus.setRamliObjects(new RamliObject[]
        {
            new RamliObject(1), new RamliObject(3)
        });

        mercury.setName("Mercury");
        mercury.setGroupTypeName(groupType8.getName());
        mercury.setGroupTypeNumber(groupType8.getNumber());
        mercury.setRamliObjects(new RamliObject[]
        {
            new RamliObject(11), new RamliObject(16)
        });
        moon.setName("Moon");
        moon.setGroupTypeName(groupType8.getName());
        moon.setGroupTypeNumber(groupType8.getNumber());
        moon.setRamliObjects(new RamliObject[]
        {
            new RamliObject(5), new RamliObject(4)
        });

        uranus.setName("Uranus");
        uranus.setGroupTypeName(groupType8.getName());
        uranus.setGroupTypeNumber(groupType8.getNumber());
        uranus.setRamliObjects(new RamliObject[]
        {
            new RamliObject(6)
        });

        pluto.setName("Pluto");
        pluto.setGroupTypeName(groupType8.getName());
        pluto.setGroupTypeNumber(groupType8.getNumber());
        pluto.setRamliObjects(new RamliObject[]
        {
            new RamliObject(13)
        });

        Group[] groupArr8 =
        {
            saturn, jupiter, mars, sun, venus, mercury, moon, uranus, pluto
        };
        groupType8.setGroups(groupArr8);
        return groupType8;
    }

    public GroupType getGroupType9()
    {
        GroupTypeClass groupType9 = new GroupTypeClass();

        groupType9.setNumber(9);
        groupType9.setName("Object Nature");

        GroupTypeClass.GroupClass nari, hawai, mai, turabi;
        nari = groupType9.new GroupClass();
        hawai = groupType9.new GroupClass();
        mai = groupType9.new GroupClass();
        turabi = groupType9.new GroupClass();

        RamliObject[] ramliObjectArr1 = new RamliObject[1];
        ramliObjectArr1[0] = this.generatedList.get(1);

        nari.setName("Nari");
        nari.setGroupTypeName(groupType9.getName());
        nari.setGroupTypeNumber(groupType9.getNumber());
        nari.setRamliObjects(ramliObjectArr1);

        RamliObject[] ramliObjectArr2 = new RamliObject[1];
        ramliObjectArr2[0] = this.generatedList.get(2);

        hawai.setName("Hawai");
        hawai.setGroupTypeName(groupType9.getName());
        hawai.setGroupTypeNumber(groupType9.getNumber());
        hawai.setRamliObjects(ramliObjectArr2);

        RamliObject[] ramliObjectArr3 = new RamliObject[1];
        ramliObjectArr3[0] = this.generatedList.get(3);
        mai.setName("Mai");
        mai.setGroupTypeName(groupType9.getName());
        mai.setGroupTypeNumber(groupType9.getNumber());
        mai.setRamliObjects(ramliObjectArr3);

        RamliObject[] ramliObjectArr4 = new RamliObject[1];
        ramliObjectArr4[0] = this.generatedList.get(4);

        turabi.setName("Turabi");
        turabi.setGroupTypeName(groupType9.getName());
        turabi.setGroupTypeNumber(groupType9.getNumber());
        turabi.setRamliObjects(ramliObjectArr4);

        Group[] groupArr9 =
        {
            nari, hawai, mai, turabi
        };
        groupType9.setGroups(groupArr9);
        return groupType9;
    }

    public GroupType getGroupType10()
    {
        GroupTypeClass groupType10 = new GroupTypeClass();

        groupType10.setNumber(10);
        groupType10.setName("Colour Object");

        GroupTypeClass.GroupClass yellow, red, white, black;
        yellow = groupType10.new GroupClass();
        red = groupType10.new GroupClass();
        white = groupType10.new GroupClass();
        black = groupType10.new GroupClass();

        yellow.setName("Yellow");
        yellow.setGroupTypeName(groupType10.getName());
        yellow.setGroupTypeNumber(groupType10.getNumber());
        yellow.setRamliObjects(new RamliObject[]
        {
            new RamliObject(9),
            new RamliObject(15),
            new RamliObject(12),
            new RamliObject(2),
            new RamliObject(6),
            new RamliObject(3)
        });

        red.setName("Red");
        red.setGroupTypeName(groupType10.getName());
        red.setGroupTypeNumber(groupType10.getNumber());
        red.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7), new RamliObject(14), new RamliObject(1), new RamliObject(13)
        });

        white.setName("White");
        white.setGroupTypeName(groupType10.getName());
        white.setGroupTypeNumber(groupType10.getNumber());
        white.setRamliObjects(new RamliObject[]
        {
            new RamliObject(4), new RamliObject(5)
        });

        black.setName("Black");
        black.setGroupTypeName(groupType10.getName());
        black.setGroupTypeNumber(groupType10.getNumber());
        black.setRamliObjects(new RamliObject[]
        {
            new RamliObject(10), new RamliObject(8), new RamliObject(11), new RamliObject(16),
        });

        Group[] groupArr10 =
        {
            yellow, red, white, black
        };
        groupType10.setGroups(groupArr10);
        return groupType10;
    }

    public GroupType getGroupType11()
    {
        GroupTypeClass groupType11 = new GroupTypeClass();

        groupType11.setNumber(11);
        groupType11.setName("Colour Object");

        GroupTypeClass.GroupClass salty, bitter, sour, sweet, empty;
        salty = groupType11.new GroupClass();
        bitter = groupType11.new GroupClass();
        sour = groupType11.new GroupClass();
        sweet = groupType11.new GroupClass();
        empty = groupType11.new GroupClass();

        salty.setName("Salty");
        salty.setGroupTypeName(groupType11.getName());
        salty.setGroupTypeNumber(groupType11.getNumber());
        salty.setRamliObjects(new RamliObject[]
        {
            new RamliObject(9), new RamliObject(5), new RamliObject(3)
        });

        bitter.setName("Bitter");
        bitter.setGroupTypeName(groupType11.getName());
        bitter.setGroupTypeNumber(groupType11.getNumber());
        bitter.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7), new RamliObject(2)
        });

        sour.setName("Sour");
        sour.setGroupTypeName(groupType11.getName());
        sour.setGroupTypeNumber(groupType11.getNumber());
        sour.setRamliObjects(new RamliObject[]
        {
            new RamliObject(14), new RamliObject(4), new RamliObject(8)
        });

        sweet.setName("Sweet");
        sweet.setGroupTypeName(groupType11.getName());
        sweet.setGroupTypeNumber(groupType11.getNumber());
        sweet.setRamliObjects(new RamliObject[]
        {
            new RamliObject(6),
            new RamliObject(3),
            new RamliObject(1),
            new RamliObject(13),
            new RamliObject(11),
            new RamliObject(16)
        });

        empty.setName("Empty");
        empty.setGroupTypeName(groupType11.getName());
        empty.setGroupTypeNumber(groupType11.getNumber());
        empty.setRamliObjects(new RamliObject[]
        {
            new RamliObject(2), new RamliObject(5)
        });

        Group[] groupArr11 =
        {
            salty, bitter, sour, sweet, empty
        };
        groupType11.setGroups(groupArr11);
        return groupType11;
    }

    public GroupType getGroupType12()
    {
        GroupTypeClass groupType12 = new GroupTypeClass();

        groupType12.setNumber(12);
        groupType12.setName("Buruj");

        GroupTypeClass.GroupClass aries, taurus, gemini, cancer, leo,
                viger, libra, scopio, saggittarious, capricon, aquarious, pisces;

        aries = groupType12.new GroupClass();
        taurus = groupType12.new GroupClass();
        gemini = groupType12.new GroupClass();
        cancer = groupType12.new GroupClass();
        leo = groupType12.new GroupClass();
        viger = groupType12.new GroupClass();
        libra = groupType12.new GroupClass();
        scopio = groupType12.new GroupClass();
        saggittarious = groupType12.new GroupClass();
        capricon = groupType12.new GroupClass();
        aquarious = groupType12.new GroupClass();
        pisces = groupType12.new GroupClass();

        aries.setName("Aries");
        aries.setGroupTypeName(groupType12.getName());
        aries.setGroupTypeNumber(groupType12.getNumber());
        aries.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7)
        });

        taurus.setName("Taurus");
        aries.setGroupTypeName(groupType12.getName());
        aries.setGroupTypeNumber(groupType12.getNumber());
        taurus.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7)
        });

        gemini.setName("Gemini");
        aries.setGroupTypeName(groupType12.getName());
        aries.setGroupTypeNumber(groupType12.getNumber());
        gemini.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7), new RamliObject(2)
        });

        cancer.setName("Cancer");
        aries.setGroupTypeName(groupType12.getName());
        aries.setGroupTypeNumber(groupType12.getNumber());
        cancer.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7), new RamliObject(2)
        });

        leo.setName("Leo");
        aries.setGroupTypeName(groupType12.getName());
        aries.setGroupTypeNumber(groupType12.getNumber());
        leo.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7), new RamliObject(2)
        });

        viger.setName("Viger");
        aries.setGroupTypeName(groupType12.getName());
        aries.setGroupTypeNumber(groupType12.getNumber());
        viger.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7)
        });

        libra.setName("Libra");
        libra.setGroupTypeName(groupType12.getName());
        libra.setGroupTypeNumber(groupType12.getNumber());
        libra.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7)
        });

        scopio.setName("Scopio");
        scopio.setGroupTypeName(groupType12.getName());
        scopio.setGroupTypeNumber(groupType12.getNumber());
        scopio.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7), new RamliObject(2)
        });

        saggittarious.setName("Saggittarious");
        saggittarious.setGroupTypeName(groupType12.getName());
        saggittarious.setGroupTypeNumber(groupType12.getNumber());
        saggittarious.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7), new RamliObject(2)
        });

        capricon.setName("Capricon");
        capricon.setGroupTypeName(groupType12.getName());
        capricon.setGroupTypeNumber(groupType12.getNumber());
        capricon.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7)
        });

        aquarious.setName("Aquarious");
        aquarious.setGroupTypeName(groupType12.getName());
        aquarious.setGroupTypeNumber(groupType12.getNumber());
        aquarious.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7)
        });

        pisces.setName("Pisces");
        pisces.setGroupTypeName(groupType12.getName());
        pisces.setGroupTypeNumber(groupType12.getNumber());
        pisces.setRamliObjects(new RamliObject[]
        {
            new RamliObject(7)
        });

        Group[] groupArr12 =
        {
            aries, taurus, gemini, cancer, leo, viger, libra, scopio, saggittarious, capricon, aquarious, pisces
        };
        groupType12.setGroups(groupArr12);
        return groupType12;
    }*/
}
