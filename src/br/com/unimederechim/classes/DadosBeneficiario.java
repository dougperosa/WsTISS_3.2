package br.com.unimederechim.classes;

public class DadosBeneficiario {
    
    private String numeroCarteira = null;
    private TiposDados.SimNao atendimentoRN = null;
    private String nomeBeneficiario = null;
    private String numeroCNS = null;
    private String identificadorBeneficiario = null;
    
    public DadosBeneficiario() {
        super();
    }

    public String getNumeroCarteira() {
        return numeroCarteira;
    }

    public void setNumeroCarteira(String numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }

    public TiposDados.SimNao getAtendimentoRN() {
        return atendimentoRN;
    }

    public void setAtendimentoRN(TiposDados.SimNao atendimentoRN) {
        this.atendimentoRN = atendimentoRN;
    }

    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    public String getNumeroCNS() {
        return numeroCNS;
    }

    public void setNumeroCNS(String numeroCNS) {
        this.numeroCNS = numeroCNS;
    }

    public String getIdentificadorBeneficiario() {
        return identificadorBeneficiario;
    }

    public void setIdentificadorBeneficiario(String identificadorBeneficiario) {
        this.identificadorBeneficiario = identificadorBeneficiario;
    }

}
