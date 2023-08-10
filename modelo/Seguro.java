package modelo;

public class Seguro {

    private float valor;
    private boolean vigencia;
    private Veiculo veiculo;
    private Cliente propietario;
    private Cliente[] assegurados;


    public float getValor() {
        return this.valor;

    }

    public void setValor(float valor) { 
        this.valor = valor; 

    }

    public boolean getVigencia() {
        return this.vigencia;

    }

    public void setVigencia(boolean vigencia) { 
        this.vigencia = vigencia; 

    }
}