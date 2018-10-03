package classes;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Veiculo {
  private String marca;
  private String modelo;
  private String placa;
  private Integer ano;
  private CategoriaCnh cnhMinima;
  private final Queue<Objeto> carga;
  private final Integer cargaMax;
  private Motorista motorista;

  public Veiculo(Integer qtdPacote) {
    this.cargaMax = qtdPacote;
    this.carga = new LinkedList<>();
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public Integer getAno() {
    return ano;
  }

  public void setAno(Integer ano) {
    this.ano = ano;
  }

  public CategoriaCnh getCnhMinima() {
    return cnhMinima;
  }

  public void setCnhMinima(CategoriaCnh cnhMinima) {
    this.cnhMinima = cnhMinima;
  }

  public Motorista getMotorista() {
    return motorista;
  }

  public void setMotorista(Motorista motorista) {
    this.motorista = motorista;
  }

  public Queue<Objeto> getCarga() {
    return carga;
  }
  
  public Objeto getProximaEncomenda() {
    return this.carga.poll();
  }
  
  public Boolean adicionarEncomenda(Objeto encomenda) {
    if (this.carga.size() < this.cargaMax) {
      this.carga.offer(encomenda);
      return true;
    }
    return false;
  }
}
