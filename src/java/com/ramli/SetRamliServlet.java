/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramli;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SammieNash
 */
public class SetRamliServlet extends HttpServlet
{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {/*
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            int fristRamliObj = Integer.parseInt(request.getParameter("fristRamliObj"));
            int secondRamliObj = Integer.parseInt(request.getParameter("secondRamliObj"));
            int thirdRamliObj = Integer.parseInt(request.getParameter("thirdRamliObj"));
            int fourthRamliObj = Integer.parseInt(request.getParameter("fourthRamliObj"));

            RamliObject ramli1 = new RamliObject(fristRamliObj);
            RamliObject ramli2 = new RamliObject(secondRamliObj);
            RamliObject ramli3 = new RamliObject(thirdRamliObj);
            RamliObject ramli4 = new RamliObject(fourthRamliObj);

            RamliCombinations rc = new RamliCombinations(ramli1, ramli2, ramli3, ramli4);

            RamliList<RamliObject> generatedList = rc.getGeneratedList();
            HashMap<String, RamliObject> ramliMap = new HashMap<>();
            for(int i = 1; i <= generatedList.size(); i++)
                ramliMap.put("r" + i, generatedList.get(i));
            HttpSession httpSession = request.getSession(true);
            httpSession.setAttribute("generatedList", generatedList);
            httpSession.setAttribute("ramliMap", ramliMap);
            RequestDispatcher dispatch = request.getRequestDispatcher("RamlicombinationOutput");
            dispatch.forward(request, response);
        }
        catch(Exception xcp)
        {
            out.println("Please Select One OfThe Four Ramlis");
            xcp.printStackTrace(out);
        }
        finally
        {
            out.close();
        }*/
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>
}
