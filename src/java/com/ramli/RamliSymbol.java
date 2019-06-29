/*
 * Copyright (c) 2018, Xyneex Technologies. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * You are not meant to edit or modify this source code unless you are
 * authorized to do so.
 *
 * Please contact Xyneex Technologies, #1 Orok Orok Street, Calabar, Nigeria.
 * or visit www.xyneex.com if you need additional information or have any
 * questions.
 */
package com.ramli;

import java.util.Objects;

/**
 *
 * @author Jevison7x
 * @since May 5, 2018 7:43:17 PM
 */
public class RamliSymbol implements Comparable<RamliObject>
{

    private String name;
    private int houseNumber;
    private String imageFileName;
    private String definition;
    private String descriptions;
    private DotConfig dotConfig;

    public static final String KAUSAJI = "Kausaji";
    public static final String RAHIKA = "Rahika";
    public static final String RAYA = "Raya";
    public static final String BAYABA = "Bayaba";
    public static final String DARIKI = "Dariki";
    public static final String KABLA_HARIJA = "Kabla harija";
    public static final String HUMRA = "Humra";
    public static final String INKIS = "Inkis";
    public static final String NUSRA_HARIJA = "Nusra Harija";
    public static final String ISKAFI = "Iskafi";
    public static final String IJTIMAI = "Ijtimai";
    public static final String NUSRA_DAHILA = "Nusra Dahila";
    public static final String SAILI = "Saili";
    public static final String NAKIYA = "Nakiya";
    public static final String KABLA_DAHILA = "Kabla Dahila";
    public static final String JUMUA = "Jumua";

    public static final String KAUSAJI_DEFINITION = "Life";
    public static final String RAHIKA_DEFINITION = "Parents";
    public static final String RAYA_DEFINITION = "Wealth and properties";
    public static final String BAYABA_DEFINITION = "Family and inheritance";
    public static final String DARIKI_DEFINITION = "Children";
    public static final String KABLA_HARIJA_DEFINITION = "Sickness";
    public static final String HUMRA_DEFINITION = "Women and married";
    public static final String INKIS_DEFINITION = "Unhappiness and quarrel";
    public static final String NUSRA_HARIJA_DEFINITION = "Travel";
    public static final String ISKAFI_DEFINITION = "Leadership and office";
    public static final String IJTIMAI_DEFINITION = "Love and Support";
    public static final String NUSRA_DAHILA_DEFINITION = "Disaster and death";
    public static final String SAILI_DEFINITION = "Questionnaire";
    public static final String NAKIYA_DEFINITION = "Hypocrite and person in question";
    public static final String KABLA_DAHILA_DEFINITION = "Judgment";
    public static final String JUMUA_DEFINITION = "Result";

    public RamliSymbol()
    {
    }

    public String getDefinition()
    {
        return definition;
    }

    public void setDefinition(String definition)
    {
        this.definition = definition;
    }

    public String getDescriptions()
    {
        return descriptions;
    }

    public void setDescriptions(String descriptions)
    {
        this.descriptions = descriptions;
    }

    public DotConfig getDotConfig()
    {
        return dotConfig;
    }

    public void setDotConfig(DotConfig dotConfig)
    {
        this.dotConfig = dotConfig;
    }

    public int getHouseNumber()
    {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber)
    {
        this.houseNumber = houseNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj != null)
            if(obj instanceof RamliObject)
            {
                RamliObject ro = (RamliObject)obj;
                int ramliHouseNumber = this.getHouseNumber();
                String ramliName = this.getName();
                DotConfig ramliConfig = this.getDotConfig();
                if(ramliName.equals(ro.getName()) || ramliHouseNumber == ro.getHouseNumber() || ramliConfig.equals(ro.getDotConfig()))
                    return true;
                else
                    return false;
            }
            else
                return false;
        else
            return false;
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.houseNumber;
        hash = 67 * hash + Objects.hashCode(this.imageFileName);
        hash = 67 * hash + Objects.hashCode(this.definition);
        hash = 67 * hash + Objects.hashCode(this.descriptions);
        hash = 67 * hash + Objects.hashCode(this.dotConfig);
        return hash;
    }

    @Override
    public int compareTo(RamliObject ramliObject)
    {
        int thisHouseNumber = this.getHouseNumber();
        int otherHouseNumber = ramliObject.getHouseNumber();
        return thisHouseNumber - otherHouseNumber;
    }

    @Override
    public String toString()
    {
        return "**********Ramli Object**********\nHouse Number: " + this.houseNumber + ", \nName: " + this.name + ", \nDotConfig: " + this.dotConfig + "\n"
                + "====================================";
    }

    public String getImageFileName()
    {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName)
    {
        this.imageFileName = imageFileName;
    }
}
