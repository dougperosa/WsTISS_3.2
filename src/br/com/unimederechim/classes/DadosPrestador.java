package br.com.unimederechim.classes;


public class DadosPrestador {
    
    private String cnpj = null;
    private String cpf = null;
    private String codigoPrestadorNaOperadora = null;
    
    public DadosPrestador() {
        super();
    }    

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCodigoPrestadorNaOperadora() {
        return codigoPrestadorNaOperadora;
    }

    public void setCodigoPrestadorNaOperadora(String codigoPrestadorNaOperadora) {
        this.codigoPrestadorNaOperadora = codigoPrestadorNaOperadora;
    }
}
