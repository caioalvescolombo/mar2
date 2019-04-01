
package br.com.principal;

public class Aluno {
    private int idaluno;
    private  double data;
    private double registro;
    private byte[] imagem;

    public int getIdaluno() {
        return idaluno;
    }

    public void setIdaluno(int idaluno) {
        this.idaluno = idaluno;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public double getRegistro() {
        return registro;
    }

    public void setRegistro(double registro) {
        this.registro = registro;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
    
}
