package controllers;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Funcionario;
import repositories.FuncionarioRepository;

public class FuncionarioController {

	public void cadastrarFuncionario() {		

		try {
			var funcionario = new Funcionario();
			funcionario.setId(UUID.randomUUID());
			funcionario.setNome(JOptionPane.showInputDialog("Informe o nome do funcionário:"));
			funcionario.setCpf(JOptionPane.showInputDialog("Informe o CPF do funcionário:"));
			funcionario.setMatricula(JOptionPane.showInputDialog("Informe a matrícula:"));
			funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário:")));
			
			var funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarDados(funcionario);
			
		} catch (Exception e) {
			System.out.println("\nFalha ao cadastrar funcionário: " + e.getMessage());
		}
	}

}
