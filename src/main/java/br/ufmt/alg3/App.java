package br.ufmt.alg3;

import br.ufmt.alg3.curso.Curso;
import br.ufmt.alg3.professor.Professor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Curso c = new Curso(); //criando objeto
        c.setNome("SI");
        System.out.println(c.getNome());
        
        Professor p =  new Professor();
        p.setNome("Raphael");
        p.setAreaAtuacao("TI");
        p.setDiciplina("Algoritmos III");
        p.setSemestre("2024/1");

        System.out.println(p.getNome());
}
}