/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramli.users;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jevison7x
 */
public class SendEmail extends HttpServlet
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
        // Get the name of the sender
        String name = request.getParameter("name");

        // Sender's email ID needs to be mentioned
        String from = request.getParameter("email");

        // Get the message
        String message = request.getParameter("message");

        // Recipient's email ID needs to be mentioned.
        String to = "mujitaba2001@gmail.com";

        // Assuming you are sending email from localhost
        String host = "localhost";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.setProperty("mail.smtp.host", host);

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try
        {
            // Create a default MimeMessage object.
            MimeMessage mimeMessage = new MimeMessage(session);
            // Set From: header field of the header.
            mimeMessage.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            mimeMessage.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));
            // Set Subject: header field
            mimeMessage.setSubject("From: " + name + ": Contact Us Form");
            // Now set the actual message
            mimeMessage.setText(message);
            // Send message
            Transport.send(mimeMessage);
            String title = "Message Sent";
            String res = "Thank you for contacting us, we will get back to you.";
            out.println("<h3 class=\"success-message\">" + title + "</h3>\n"
                    + "<h4 class=\"success-message\">" + res + "</h4>");
        }
        catch(Exception xcp)
        {
            String title = "There was an error!";
            String res = xcp.getMessage();
            out.println("<h3 class=\"error-message\">" + title + "</h3>\n"
                    + "<h4 class=\"error-message\">" + res + "</h4>");
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
