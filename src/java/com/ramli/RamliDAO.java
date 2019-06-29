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

import com.ramli.database.DBConfiguration;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jevison7x
 * @since May 5, 2018 7:39:46 PM
 */
public class RamliDAO
{
    private static DotConfig getDotConfig(String dotConfigStr)
    {
        String[] dotConfigVals = dotConfigStr.split(",");
        int first = Integer.parseInt(dotConfigVals[0]);
        int second = Integer.parseInt(dotConfigVals[1]);
        int third = Integer.parseInt(dotConfigVals[2]);
        int fourth = Integer.parseInt(dotConfigVals[3]);
        DotConfig dotConfig = new DotConfig(first, second, third, fourth);
        return dotConfig;
    }

    private static RamliSymbol getRamliSymbol(ResultSet rs) throws SQLException
    {
        RamliSymbol ramliSymbol = new RamliSymbol();
        ramliSymbol.setName(rs.getString("symbolName"));
        ramliSymbol.setHouseNumber(rs.getInt("houseNumber"));
        ramliSymbol.setImageFileName(rs.getString("imageFileName"));
        ramliSymbol.setDotConfig(getDotConfig(rs.getString("dotConfig")));
        ramliSymbol.setDefinition(rs.getString("definition"));
        ramliSymbol.setDescriptions(rs.getString("descriptions"));
        return ramliSymbol;
    }

    public static List<RamliSymbol> getAllRamliObjects() throws SQLException, IOException, IllegalArgumentException, ClassNotFoundException
    {
        DBConfiguration dbConfig = new DBConfiguration();
        try(Connection conn = dbConfig.getDatabaseConnection())
        {
            String sql = "SELECT * FROM symbols ORDER BY dotConfig ASC";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<RamliSymbol> ramliSymbols = new ArrayList<>();
            while(rs.next())
                ramliSymbols.add(getRamliSymbol(rs));
            return ramliSymbols;
        }
    }

    public static String getDefinitionSummary(String definition)
    {
        String summary = definition.substring(0, definition.length() > 70 ? 70 : definition.length());
        return summary + "...<br/>";
    }

    public static String replaceReturnChar(String text)
    {
        return text.replace("\n", "");
    }
}
