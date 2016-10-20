/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class AreaPerim extends HttpServlet {

    int area;
    int respuesta;
    String Opreacion = "";
    int lado1;
    int lado2;
    String opc = "";
    int opci;
    public void doGet(HttpServletRequest rq, HttpServletResponse rp)
            throws ServletException, IOException {
        lado1 = Integer.parseInt(rq.getParameter("txt1"));
        lado2 = Integer.parseInt(rq.getParameter("txt2"));
        opci =Integer.parseInt(rq.getParameter("op"));
        if (opci == 1) {
            respuesta = lado1 * lado2;
            Opreacion = "Area";
        } else if (opci == 2) {
            respuesta = (lado1 * 2) + (lado2 * 2);
            Opreacion = "Perimetro";
        }
        else if (opci == 3) {
            respuesta = (lado1 * lado2) / 2;
            Opreacion = "Area";
        } else if (opci == 4) {
            respuesta = lado1 * 3;
            Opreacion = "Perimetro";
        }

        rp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = rp.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El Resultado del " + Opreacion + " es:" + respuesta + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
