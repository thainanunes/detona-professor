package br.ufmt.alg3.curso;

public class Curso {
    private String nome;
    private String periodo;
    private float  nota;//Estrela 0-5- fracionada
    private String comentario; //Mat, Vesp, Not
    private String rga;
    private String semestre;//2024/1

    public Curso(){
        periodo =  "Matutino";

    }
    public Curso(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }

}
