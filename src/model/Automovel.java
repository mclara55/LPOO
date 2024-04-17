package model;

public class Automovel {

    private String renavan;
    private String placa;
    private String cor;
    private Integer numRodas;
    private String combustivel;
    private Integer quilometragem;
    private String chassi;
    private Double valorLocacao;

    public Automovel() {

    }

    public Automovel(String renavan, String placa, String cor, Integer numRodas, String combustivel, Integer quilometragem, String chassi, Double valorLocacao) {
        this.renavan = renavan;
        this.placa = placa;
        this.cor = cor;
        this.numRodas = numRodas;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.chassi = chassi;
        this.valorLocacao = valorLocacao;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(Integer numRodas) {
        this.numRodas = numRodas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Integer getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(Double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    @Override
    public String toString() {
        return "\nAutomovel{" +
                "renavan='" + renavan + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", numRodas=" + numRodas +
                ", combustivel='" + combustivel + '\'' +
                ", quilometragem=" + quilometragem +
                ", chassi='" + chassi + '\'' +
                ", valorLocacao=" + valorLocacao +
                '}';
    }
}
