package Aula42.HerancaPalavraChaveFinal;

public class Professor {

    private double salario;
    private String nomeCurso;



    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereco do professor: ";
       // s += this.getEndereco();

        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {

        System.out.println("Imprimindo endereço do professor");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
