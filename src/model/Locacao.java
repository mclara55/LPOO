package model;

import java.time.LocalDateTime;

public class Locacao {
    private LocalDateTime dataLocacao;
    private LocalDateTime horaLocacao;
    private LocalDateTime dataDevolucao;
    private LocalDateTime horaDevolucao;

    private Integer quilometragem;
    private Double valorCalcao;
    private Double valorLocacao;
    private Boolean devolvido;

    public Locacao() {

    }

    public Locacao(LocalDateTime dataLocacao, LocalDateTime horaLocacao, LocalDateTime dataDevolucao, LocalDateTime horaDevolucao, Integer quilometragem, Double valorCalcao, Double valorLocacao, Boolean devolvido) {
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        this.dataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valorLocacao = valorLocacao;
        this.devolvido = devolvido;
    }

    public LocalDateTime getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDateTime dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDateTime getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(LocalDateTime horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDateTime getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(LocalDateTime horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public Integer getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Double getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(Double valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public Double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(Double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public Boolean getDevolvido() {
        return devolvido;
    }

    public void setDevolvido(Boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "\nLocacao{" +
                "dataLocacao=" + dataLocacao +
                ", horaLocacao=" + horaLocacao +
                ", dataDevolucao=" + dataDevolucao +
                ", horaDevolucao=" + horaDevolucao +
                ", quilometragem=" + quilometragem +
                ", valorCalcao=" + valorCalcao +
                ", valorLocacao=" + valorLocacao +
                ", devolvido=" + devolvido +
                '}';
    }
}
