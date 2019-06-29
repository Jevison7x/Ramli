/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramli.grouping;

/**
 *
 * @author Mamfon
 */
public interface GroupType
{
    public int getNumber();
    
    public String getName();
    
    public Group[] getGroups();
    
    public void setNumber(int number);
    
    public void setName(String name);
    
    public void setGroups(Group[] groups);
}
