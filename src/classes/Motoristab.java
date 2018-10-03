package classes;

  

public class Motorista extends Funcionario{
  
  private Roteiro roteiro;
  private Veiculo veiculo;
  private Cnh cnh;
  private int id_motorista;

    public int getId_motorista() {
        return id_motorista;
    }

    public void setId_motorista(int id_motorista) {
        this.id_motorista = id_motorista;
    }
  
  
  public Motorista(){}

  public Motorista(Roteiro roteiro, Veiculo veiculo, String nome, Endereco endereco, Cnh cnh) {
    super(nome, endereco);
    this.roteiro = roteiro;
    this.veiculo = veiculo;
    this.cnh = cnh;
  }  

  public Roteiro getRoteiro() {
    return roteiro;
  }

  public void setRoteiro(Roteiro roteiro) {
    this.roteiro = roteiro;
  }

  public Veiculo getVeiculo() {
    return veiculo;
  }

  public void setVeiculo(Veiculo veiculo) {
    this.veiculo = veiculo;
  }
  public Cnh getCnh() {
    return cnh;
  }

  public void setCnh(Cnh cnh) {
    this.cnh = cnh;
  }
}
