package service;

import dao.UsuarioDAO;
import model.Usuario;

public class UsuarioService {
	
	private UsuarioDAO usuarioDao;


	public UsuarioService(){
		this.usuarioDao = new UsuarioDAO();
	}

	public Usuario consultar(String email, String senha) {		
		return usuarioDao.consultar(email, senha);
	
	}

	public void cadastraUsuario(Usuario usuario) {
		usuarioDao.cadastrar(usuario);
	}


}
