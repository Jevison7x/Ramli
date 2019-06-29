/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramli;

/**
 *
 * @author Mamfon
 */
public class DotConfig
{
    private int first;
    private int second;
    private int third;
    private int fourth;
    
    public static final int ONE = 1; 
    public static final int TWO = 2;

    public DotConfig(){}
    
    public DotConfig(int first, int second, int third, int fourth)
    {
        if(first != ONE && first != TWO)
            throw new IllegalArgumentException();
        else if(second != ONE && second != TWO)
            throw new IllegalArgumentException();
        else if(third != ONE && third != TWO)
            throw new IllegalArgumentException();
        else if(fourth != ONE && fourth != TWO)
            throw new IllegalArgumentException();
        
        this.first = first; 
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }
    
    public int getFirst()
    {
        return first;
    }

    public void setFirst(int first)
    {
        this.first = first;
    }

    public int getFourth()
    {
        return fourth;
    }

    public void setFourth(int fourth)
    {
        this.fourth = fourth;
    }

    public int getSecond()
    {
        return second;
    }

    public void setSecond(int second)
    {
        this.second = second;
    }

    public int getThird()
    {
        return third;
    }

    public void setThird(int third)
    {
        this.third = third;
    }
    
    @Override
    public boolean equals(Object dotConfig)
    {
        if(dotConfig != null)
        {
            if(dotConfig instanceof DotConfig)
            {
                DotConfig otherObj = (DotConfig)dotConfig;
                if(this.first != otherObj.getFirst())
                    return false;
                else if(this.second != otherObj.getSecond())
                    return false;
                else if(this.third != otherObj.getThird())
                    return false;
                else if(this.fourth != otherObj.getFourth())
                    return false;
                else
                    return true;
            }
            else
                return false;
        }
        else
            return false;
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 59 * hash + this.first;
        hash = 59 * hash + this.second;
        hash = 59 * hash + this.third;
        hash = 59 * hash + this.fourth;
        return hash;
    }
    
    @Override
    public String toString()
    {
        return "first = "+this.first+", second = "+this.second+", third = "+this.third+", fourth = "+this.fourth+".";
    }
}
