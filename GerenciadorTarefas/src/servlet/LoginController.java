package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Usuario;
import service.UsuarioService;


@WebServlet("/Login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioService ursv = new UsuarioService();
		Usuario user = new Usuario();
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
	
			user = ursv.consultar(email, senha);
			HttpSession sessao = request.getSession();
			if (user != null) {
				sessao.setAttribute("email", email);
				sessao.setAttribute("senha", senha);
				sessao.setAttribute("nome", user.getNome());				
				response.sendRedirect("tarefas.jsp");
			}
			else {
				sessao.setAttribute("mensagem", "Preencha todos os campos!");
				sessao.removeAttribute("mensagem");
			}
	}
}