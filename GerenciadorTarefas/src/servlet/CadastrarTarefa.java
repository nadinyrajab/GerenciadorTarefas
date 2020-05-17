package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Tarefa;
import service.TarefaService;




@WebServlet("/CadastrarTarefa.do")
public class CadastrarTarefa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {

		String titulo = request.getParameter("titulo_tarefa");
		String descricao = request.getParameter("descricao_tarefa");
		String emailUsuario = request.getParameter("email_usuario_tarefa");

		Tarefa t = new Tarefa(titulo, descricao, emailUsuario);
		TarefaService ts = new TarefaService();
		
		
		if(titulo.equals("") || descricao.equals("") || emailUsuario.equals("")) {			
			HttpSession sessao = request.getSession();
			sessao.setAttribute("mensagem", " Preencha todos os campos");
			response.sendRedirect("cadastrar_tarefa.jsp");
		}
		else {	
			ts.cadastrar(t);
			HttpSession sessao = request.getSession();
			sessao.setAttribute("mensagem", " Cadastrado com sucesso");
			response.sendRedirect("tarefas.jsp");
		}
	}
	
}
