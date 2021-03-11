package com.senati.webs.jsps.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginWeb.jr")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		// obtener el valor del usuario
		String usuario = request.getParameter("usuario");
		String correo = request.getParameter("correo");

		// obtener el valor de la clave
		String clave = request.getParameter("clave");


		// si usuario y clave son correctos
		if (usuario.equals("jhordan") && correo.equals("davogonza19@gmail.com") && clave.equals("jhordan123") ){
			System.out.println("Bienvenido " + usuario);
			request.setAttribute("usuarioLogueado",usuario);
			request.getRequestDispatcher("bienvenida.jsp").forward(request,response);
		}else{
			System.out.println("No tiene acceso");
		}
				
	}

}
