package exc11.dominio;

public class Aluno {
    private String name;
    private double nota1, nota2, nota3, nota4;
    private double media;
    private String situacaoFinal;

    public Aluno(String name, double nota1, double nota2, double nota3, double nota4) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }

    public String getSituacaoFinal() {
        return situacaoFinal;
    }

    public void setSituacaoFinal(String situacaoFinal) {
        this.situacaoFinal = situacaoFinal;
    }

    public double calculaMedia(){
        media = (nota1 + nota2 + nota3 + nota4)/4;
        if(media>=7){
        situacaoFinal = "Aprovado!";
        }else{
            situacaoFinal = "Reprovado!";
        }
        setMedia(media);
    return media;
    }

}
