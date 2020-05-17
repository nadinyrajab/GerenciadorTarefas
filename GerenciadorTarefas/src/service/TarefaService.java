package service;

import java.util.ArrayList;

import dao.TarefaDAO;
import model.Tarefa;


public class TarefaService {
	private TarefaDAO tarefaDao;
	
	public TarefaService() {
		this.tarefaDao = new TarefaDAO();
	}
	
	public void cadastrar(Tarefa tarefa) {
		this.tarefaDao.cadastrar(tarefa);
	}
	
	public void alterar(Tarefa tarefa) {
		this.tarefaDao.alterar(tarefa);
	}
	
	public void excluir(Tarefa tarefa) {
		this.tarefaDao.excluir(tarefa);
	}
	
	public Tarefa consultar(int id) {
		return this.tarefaDao.consultar(id);
	}
	
	public ArrayList<Tarefa> listar(String emailUser) {
		return this.tarefaDao.listar(emailUser);
	}
}