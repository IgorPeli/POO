package modelo;

public class Veiculo {

  private int ano;
  private String marca;
  private String placa;
  private String cor;
  private Modelo modelo;
  

  public int getAno() {
      return this.ano;

  }

  public void setAno(int ano) { 
      this.ano = ano; 

  }

  public String getMarca() {
      return this.marca;

  }

  public void setMarca(String marca) { 
      this.marca = marca; 

  }

  public String getPlaca() {
      return this.placa;

  }

  public void setPlaca(String placa) { 
      this.placa = placa; 

  }

  public String getCor() {
      return this.cor;

  }

  public void setCor(String cor) { 
      this.cor = cor; 

  }

}