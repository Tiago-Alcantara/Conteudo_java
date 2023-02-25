package Aula2;

public class aluno {

	String nome;
	String curso;
	
	
	 Avaliacao notas; 
	
	aluno(String nome,String curso,float nota1,float nota2, float nota3){
		 	notas = new Avaliacao(nota1,nota2,nota3);
			this.nome = nome;
			this.curso = curso;
	};
	
	void imprimir() {
		System.out.printf("Nome: %s\nCurso: %s\n",nome,curso);
		notas.MediaAritmetica();
		notas.MediaPonderada();
	};
}
