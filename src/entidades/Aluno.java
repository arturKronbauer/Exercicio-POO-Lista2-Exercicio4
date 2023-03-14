package entidades;

public class Aluno {
	private String nome;
	private Float nota1, nota2, nota3, media;

	public Aluno() {	
	}
	
	public Aluno(String nome, Float nota1, Float nota2, Float nota3) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		calculaMedia(nota1, nota2, nota3);
	}
	
	private void calculaMedia(Float nota1, Float nota2, Float nota3) {
		media = nota1 + nota2 + nota3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getNota1() {
		return nota1;
	}

	public void setNota1(Float nota1) {
		this.nota1 = nota1;
		calculaMedia(nota1, nota2, nota3);
	}

	public Float getNota2() {
		return nota2;
	}

	public void setNota2(Float nota2) {
		this.nota2 = nota2;
		calculaMedia(nota1, nota2, nota3);
	}

	public Float getNota3() {
		return nota3;
	}

	public void setNota3(Float nota3) {
		this.nota3 = nota3;
		calculaMedia(nota1, nota2, nota3);
	}

	public Float getMedia() {
		return media;
	}
	
}
