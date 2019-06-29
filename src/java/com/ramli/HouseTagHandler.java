/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramli;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author SammieNash
 */
public class HouseTagHandler extends SimpleTagSupport
{
    private int houseNo;

    /**
     * Called by the container to invoke this tag. The implementation of this method is provided by the tag library developer, and handles all tag processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException
    {
        JspWriter out = getJspContext().getOut();
        /*
        try
        {
            //out.println(RamliObject.getHouseNoAsString(this.houseNo));
        }
        catch(IOException xcp)
        {
            throw new JspException("Error in HouseTagHandler tag", xcp);
        }*/
    }

    public void setHouseNo(int houseNo)
    {
        this.houseNo = houseNo;
    }
}
