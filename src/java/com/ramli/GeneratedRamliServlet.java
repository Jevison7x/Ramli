/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramli;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mamfon
 */
public class GeneratedRamliServlet extends HttpServlet
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
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            /*
            List<RamliObject> listOfRamli = SetRamli.getList();
            Collections.shuffle(listOfRamli);
            RamliObject ramli1 = listOfRamli.get(0);
            RamliObject ramli2 = listOfRamli.get(1);
            RamliObject ramli3 = listOfRamli.get(2);
            RamliObject ramli4 = listOfRamli.get(3);
            request.setAttribute("ramli1", ramli1);
            request.setAttribute("ramli2", ramli2);
            request.setAttribute("ramli3", ramli3);
            request.setAttribute("ramli4", ramli4);
            RequestDispatcher dispatch = request.getRequestDispatcher("GeneratedRamli");
            dispatch.forward(request, response);
             */
        }
        finally
        {
            out.close();
        }
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
