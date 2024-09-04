
package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {

	public void exportarDados(Funcionario funcionario) {
		try {

			var fileWriter = new FileWriter("c:\\temp\\funcionarios.txt", true);
			var printWriter = new PrintWriter(fileWriter);

			printWriter.write("\nId do funcionário.....:" + funcionario.getId());
			printWriter.write("\nNome..................:" + funcionario.getNome());
			printWriter.write("\nMatrícula.............:" + funcionario.getCpf());
			printWriter.write("\nData de admissão......:" + funcionario.getMatricula());
			printWriter.write("\nSalario...:" + funcionario.getSalario());
			printWriter.write("\n");

			printWriter.close();

			System.out.println("\nDados gravados com sucesso!");

		} catch (Exception e) {

			System.out.println("\nErro ao cadastrar funcionário: " + e.getMessage());
		}
	}
}
