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
public class GroupTypeClass implements GroupType
{

    private int groupTypeNumber;

    private String groupTypeName;

    private Group[] groups;

    public GroupTypeClass()
    {
    }

    @Override
    public int getNumber()
    {
        return this.groupTypeNumber;
    }

    @Override
    public String getName()
    {
        return this.groupTypeName;
    }

    @Override
    public Group[] getGroups()
    {
        return this.groups;
    }

    @Override
    public void setNumber(int number)
    {
        this.groupTypeNumber = number;
    }

    @Override
    public void setName(String name)
    {
        this.groupTypeName = name;
    }

    @Override
    public void setGroups(Group[] groups)
    {
        this.groups = groups;
    }

    public class GroupClass implements Group
    {

        private String name;

        private RamliObject[] ramliObjects;

        private String description;

        private String groupTypeName;

        private int groupTypeNumber;

        public GroupClass()
        {
        }

        @Override
        public String getName()
        {
            return this.name;
        }

        @Override
        public RamliObject[] getRamliObjects()
        {
            return this.ramliObjects;
        }

        @Override
        public String getDescription()
        {
            return this.description;
        }

        @Override
        public void setName(String name)
        {
            this.name = name;
        }

        @Override
        public void setRamliObjects(RamliObject[] ramliArr)
        {
            this.ramliObjects = ramliArr;
        }

        @Override
        public void setDescription(String description)
        {
            this.description = description;
        }

        @Override
        public int getGroupTypeNumber()
        {
            return this.groupTypeNumber;
        }

        @Override
        public String getGroupTypeName()
        {
            return this.groupTypeName;
        }

        @Override
        public void setGroupTypeName(String groupTypeName)
        {
            this.groupTypeName = groupTypeName;
        }

        @Override
        public void setGroupTypeNumber(int groupTypeNumber)
        {
            this.groupTypeNumber = groupTypeNumber;
        }

        @Override
        public String toString()
        {
            return "Group Name: " + this.name + "\nGroup Description: " + this.description + "\nType Name: " + this.groupTypeName + "\nType Number: " + this.groupTypeNumber;
        }
    }
}
