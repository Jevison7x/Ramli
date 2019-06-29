/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramli.grouping;

import com.ramli.RamliObject;

/**
 *
 * @author Mamfon
 */
public interface Group
{

    public int getGroupTypeNumber();

    public String getGroupTypeName();

    public String getName();

    public RamliObject[] getRamliObjects();

    public String getDescription();

    public void setGroupTypeNumber(int groupTypeNumber);

    public void setGroupTypeName(String groupTypeName);

    public void setName(String name);

    public void setRamliObjects(RamliObject[] ramliArr);

    public void setDescription(String description);
}
