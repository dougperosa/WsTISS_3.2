package br.com.unimederechim.classes;


public class TiposDados {
    public static enum SimNao {
        SIM("1"),
        NAO("2");
        
        private final String simNao;

        private SimNao(String s) {
            simNao = s;
        }

        public boolean equals(String otherSimNao){
            return (otherSimNao == null)? false:simNao.equals(otherSimNao);
        }

        public String toString() {
           return simNao;
        }        
    }
    
    public static enum Sexo {
        MASCULINO("1"),
        FEMENINO("3");
        
        private final String sexo;

        private Sexo(String s) {
            sexo = s;
        }

        public boolean equals(String otherSexo){
            return (otherSexo == null)? false:sexo.equals(otherSexo);
        }

        public String toString() {
           return sexo;
        }        
    }
    
    public static enum Estadiamento {
        I("1"),
        II("2"),
        III("3"),
        IV("4"),
        NAO_SE_APLICA("5");
        
        private final String estadiamento;

        private Estadiamento(String s) {
            estadiamento = s;
        }

        public boolean equals(String otherEstadiamento){
            return (otherEstadiamento == null)? false:estadiamento.equals(otherEstadiamento);
        }

        public String toString() {
           return estadiamento;
        }
    }
    
    public static enum FinalidadeTratamento {
        CURATIVA("1"),
        NEOADJUVANTE("2"),
        ADJUVANTE("3"),
        PALIATIVA("4"),
        CONTROLE("5");
        
        private final String finalidadeTratamento;

        private FinalidadeTratamento(String s) {
            finalidadeTratamento = s;
        }

        public boolean equals(String otherFinalidadeTratamento){
            return (otherFinalidadeTratamento == null)? false:finalidadeTratamento.equals(otherFinalidadeTratamento);
        }

        public String toString() {
           return finalidadeTratamento;
        }
    }
    
    public static enum Ecog {
        TOTALMENTE_ATIVO("0"),
        NAO_EXERCE_ATIVIDADE_FISICA("1"),
        CAMINHA_E_E_CAPAZ_DE_REALIZAR_ATIVIDADE_DE_AUTOCUIDADO("2"),
        CAPACIDADE_DE_AUTOCUIDADO_LIMITADA("3"),
        COMPLETAMENTE_DEPENDENTE("4");
        
        private final String ecog;

        private Ecog(String s) {
            ecog = s;
        }

        public boolean equals(String otherEcog){
            return (otherEcog == null)? false:ecog.equals(otherEcog);
        }

        public String toString() {
           return ecog;
        }
    }
    
    public static enum TipoQuimioterapia {
        PRIMEIRA_LINHA("1"),
        SEGUNDA_LINHA("2"),
        TERCEIRA_LINHA("3"),
        OUTRAS_LINHAS("4");
        
        private final String tipoQuimioterapia;

        private TipoQuimioterapia(String s) {
            tipoQuimioterapia = s;
        }

        public boolean equals(String otherTipoQuimioterapia){
            return (otherTipoQuimioterapia == null)? false:tipoQuimioterapia.equals(otherTipoQuimioterapia);
        }

        public String toString() {
           return tipoQuimioterapia;
        }
    }
    
    public static enum ViaAdministracao {
        BUCAL("01"),
        CAPILAR("02"),
        DERMATOLOGICA("03"),
        EPIDURAL("04"),
        GASTROSTOMIA_JEJUNOSTOMIA("05"),
        INALATORIA("06"),
        INTRA_OSSEA("07"),
        INTRA_ARTERIAL("08"),
        INTRA_ARTICULAR("09"),
        INTRACARDIACA("10"),
        INTRADERMICA("11"),
        INTRALESIONAL("12"),
        INTRAMUSCULAR("13"),
        INTRAPERITONIAL("14"),
        INTRAPLEURAL("15"),
        INTRATECAL("16"),
        INTRATRAQUEAL("17"),
        INTRAUTERINA("18"),
        INTRAVENOSA("19"),
        INTRAVESICAL("20"),
        INTRAVITREA("21"),
        IRRIGACAO("22"),
        NASAL("23"),
        OFTALMICA("24"),
        ORAL("25"),
        OTOLOGICA("26"),
        RETAL("27"),
        SONDA_ENTERAL("28"),
        SONDA_GASTRICA("29"),
        SUBCUTANEA("30"),
        SUBLINGUAL("31"),
        TRANSDERMICA("32"),
        URETRAL("33"),
        VAGINAL("34"),
        OUTRAS("35");
        
        private final String viaAdministracao;

        private ViaAdministracao(String s) {
            viaAdministracao = s;
        }

        public boolean equals(String otherViaAdministracao){
            return (otherViaAdministracao == null)? false:viaAdministracao.equals(otherViaAdministracao);
        }

        public String toString() {
           return viaAdministracao;
        }
    }
        
    public static enum DiagnosticoImagem {
        TOMOGRAFIA("1"),
        RESSONANCIA_MAGNETICA("2"),
        RAIO_X("3"),
        OUTRAS("4"),
        ULTRASSONOGRAFIA("5"),
        PET("6");
        
        private final String diagnosticoImagem;

        private DiagnosticoImagem(String s) {
            diagnosticoImagem = s;
        }

        public boolean equals(String otherDiagnosticoImagem){
            return (otherDiagnosticoImagem == null)? false:diagnosticoImagem.equals(otherDiagnosticoImagem);
        }

        public String toString() {
           return diagnosticoImagem;
        }
    }

    public static enum OpcaoFabricante {
        PRIMEIRA_OPCAO_FABRICANTE("1"),
        SEGUNDA_OPCAO_FABRICANTE("2"),
        TERCEIRA_OPCAO_FABRICANTE("3");
        
        private final String opcaoFabricante;

        private OpcaoFabricante(String s) {
            opcaoFabricante = s;
        }

        public boolean equals(String otherOpcaoFabricante){
            return (otherOpcaoFabricante == null)? false:opcaoFabricante.equals(otherOpcaoFabricante);
        }

        public String toString() {
           return opcaoFabricante;
        }
    }
    
    public static enum CaraterAtendimento {
        ELETIVA("1"),
        URGENCIA_EMERGENCIA("2");
        
        private final String caraterAtendimento;

        private CaraterAtendimento(String s) {
            caraterAtendimento = s;
        }

        public boolean equals(String otherCaraterAtendimento){
            return (otherCaraterAtendimento == null)? false:caraterAtendimento.equals(otherCaraterAtendimento);
        }

        public String toString() {
           return caraterAtendimento;
        }
    }
    
    public static enum TipoInternacao {
        CLINICA("1"),
        CIRURGICA("2"),
        OBSTETRICA("3"),
        PEDIATRICA("4"),
        PSIQUIATRICA("5");
        
        private final String tipoInternacao;

        private TipoInternacao(String s) {
            tipoInternacao = s;
        }

        public boolean equals(String otherTipoInternacao){
            return (otherTipoInternacao == null)? false:tipoInternacao.equals(otherTipoInternacao);
        }

        public String toString() {
           return tipoInternacao;
        }
    }
    
    public static enum RegimeInternacao {
        HOSPITALAR("1"),
        HOSPITAL_DIA("2"),
        DOMICILIAR("3");
        
        private final String regimeInternacao;

        private RegimeInternacao(String s) {
            regimeInternacao = s;
        }

        public boolean equals(String otherRegimeInternacao){
            return (otherRegimeInternacao == null)? false:regimeInternacao.equals(otherRegimeInternacao);
        }

        public String toString() {
           return regimeInternacao;
        }
    }
    
    public static enum IndicadorAcidente {
        TRABALHO("0"),
        TRANSITO("1"),
        OUTROS_ACIDENTES("2"),
        NAO_ACIDENTES("9");
        
        private final String indicadorAcidente;

        private IndicadorAcidente(String s) {
            indicadorAcidente = s;
        }

        public boolean equals(String otherIndicadorAcidente){
            return (otherIndicadorAcidente == null)? false:indicadorAcidente.equals(otherIndicadorAcidente);
        }

        public String toString() {
           return indicadorAcidente;
        }
    }

    public static enum TipoAcomodacao {
        QUARTO_PRIVATIVO_PARTICULAR("02"),
        APARTAMENTO_DE_LUXO_DA_MATERNIDADE("09"),
        APARTAMENTO_DE_LUXO_DE_PSIQUIATRIA("10"),
        APARTAMENTO_DE_LUXO("11"),
        APARTAMENTO_SIMPLES("12"),
        APARTAMENTO_STANDARD("13"),
        APARTAMENTO_SUITE("14"),
        APARTAMENTO_COM_ALOJAMENTO_CONJUNTO("15"),
        APARTAMENTO_PARA_PACIENTE_COM_OBESIDADE_MORBIDA("16"),
        APARTAMENTO_SIMPLES_DA_MATERNIDADE("17"),
        APARTAMENTO_SIMPLES_DE_PSIQUIATRIA("18"),
        APARTAMENTO_SUITE_DA_MATERNIDADE("19"),
        APARTAMENTO_SUITE_DE_PSIQUIATRIA("20"),
        BERCARIO_NORMAL("21"),
        BERCARIO_PATOLOGICO_PREMATURO("22"),
        ENFERMARIA_DE_3_LEITOS_DA_MATERNIDADE("25"),
        ENFERMARIA_DE_4_OU_MAIS_LEITOS_DA_MATERNIDADE("26"),
        HOSPITAL_DIA_APARTAMENTO("27"),
        HOSPITAL_DIA_ENFERMARIA("28"),
        HOSPITAL_DIA_PSIQUIATRIA("29"),
        QUARTO_COLETIVO_DE_2_LEITOS_DA_MATERNIDADE("30"),
        ENFERMARIA_DE_3_LEITOS("31"),
        ENFERMARIA_DE_4_OU_MAIS_LEITOS("32"),
        ENFERMARIA_COM_ALOJAMENTO_CONJUNTO("33"),
        QUARTO_PRIVATIVO_PARTICULAR_DA_MATERNIDADE("36"),
        QUARTO_PRIVATIVO_PARTICULAR_DE_PSIQUIATRIA("37"),
        SEMI_UTI_ADULTO_GERAL("38"),
        SEMI_UTI_CORONARIANA("39"),
        SEMI_UTI_NEONATAL("40"),
        QUARTO_COLETIVO_DE_2_LEITOS("41"),
        QUARTO_COM_ALOJAMENTO_CONJUNTO("43"),
        SEMI_UTI_NEUROLOGICA("44"),
        SEMI_UTI_INFANTIL_PEDIATRICA("45"),
        SEMI_UTI_QUEIMADOS("46"),
        UNIDADE_DE_TRANSPLANTE_DE_MEDULA_OSSEA("47"),
        UNIDADE_DE_TRANSPLANTE_EM_GERAL("48"),
        APARTAMENTO_STANDARD_DA_MATERNIDADE("49"),
        APARTAMENTO_STANDARD_DE_PSIQUIATRIA("50"),
        UTI_ADULTO_GERAL("51"),
        UTI_INFANTIL_PEDIATRICA("52"),
        UTI_NEONATAL("53"),
        UNIDADE_PARA_TRATAMENTO_RADIOATIVO("56"),
        UTI_CORONARIANA("57"),
        UTI_NEUROLÓGICA("58"),
        UTI_QUEIMADOS("59");
        
        private final String tipoAcomodacao;

        private TipoAcomodacao(String s) {
            tipoAcomodacao = s;
        }

        public boolean equals(String otherTipoAcomodacao){
            return (otherTipoAcomodacao == null)? false:tipoAcomodacao.equals(otherTipoAcomodacao);
        }

        public String toString() {
           return tipoAcomodacao;
        }
    }
    
    public static enum StatusSolicitacao {
        AUTORIZADO("1"),
        EM_ANALISE("2"),
        NEGADO("3"),
        AGUARDANDO_JUSTIFICATIVA_TECNICA_DO_SOLICITANTE("4"),
        AGUARDANDO_DOCUMENTACAO_DO_PRESTADOR("5"),
        SOLICITACAO_CANCELADA("6"),
        AUTORIZADO_PARCIALMENTE("7");
        
        private final String statusSolicitacao;

        private StatusSolicitacao(String s) {
            statusSolicitacao = s;
        }

        public boolean equals(String otherStatusSolicitacao){
            return (otherStatusSolicitacao == null)? false:statusSolicitacao.equals(otherStatusSolicitacao);
        }

        public String toString() {
           return statusSolicitacao;
        }        
    }   
    
    public static enum TipoMensagem {
        ENVIO_LOTE_GUIAS(1),
        SOLIC_DEMONSTRATIVO_RETORNO(2),
        SOLIC_STATUS_PROTOCOLO(3),
        SOLICITACAO_PROCEDIMENTOS(4),
        PROTOCOLO_RECEBIMENTO(5),
        SITUACAO_PROTOCOLO(6),
        RESPOSTA_SOLICITACAO(7),
        DEMONSTRATIVO_PAGAMENTO(8),
        DEMONSTRATIVO_ANALISE_CONTA(9),
        DEMONSTRATIVO_ODONTOLOGIA(10),
        CANCELAMENTO_GUIA_RECIBO(11),
        CANCELA_GUIA(12),
        VERIFICA_ELEGIBILIDADE(13),
        SITUACAO_ELEGIBILIDADE(14),
        AUTORIZACAO_ODONTOLOGIA(15),
        SOLICITA_STATUS_AUTORIZACAO(16),
        STATUS_AUTORIZACAO(17),
        ENVIO_ANEXO(18),
        PROTOCOLO_RECEBIMENTO_ANEXO(19),
        COMUNICACAO_BENEFICIARIO(20),
        RECIBO_COMUNICACAO(21),
        RECURSO_GLOSA(22),
        RESPOSTA_RECURSO_GLOSA(23); 
        
        private int tipo;
        
        public int getTipo() {
            return this.tipo;
        }
        
        private TipoMensagem(int tipo) {
            this.tipo = tipo;
        }
    }
    
    public static enum TipoGuia {
        ELEGIBILIDADE("0"),
        CONSULTA("1"),
        SP_SADT("2"),
        INTERNACAO("3"),
        RESUMO_INTERNACAO("4"),
        HONORARIO_INDIVIDUAL("5"),
        OUTRAS_DESPESAS("6"),
        PRORROGACAO_INTERNACAO("7"),
        ANEXO_OPME("8"),
        ANEXO_QUIMIOTERAPIA("9"),
        ANEXO_RADIOTERAPIA("10");
        
        private final String tipo;

        private TipoGuia(String s) {
            tipo = s;
        }

        public boolean equals(String otherTipo){
            return (otherTipo == null)? false:tipo.equals(otherTipo);
        }
        
        public static TipoGuia getValue(String s) {
            if (s == "0") {
                return ELEGIBILIDADE;
            }
            else if (s == "1") {
                return CONSULTA;
            }
            else if (s == "2") {
                return SP_SADT;
            }
            else if (s == "3") {
                return INTERNACAO;
            }
            else if (s == "4") {
                return RESUMO_INTERNACAO;
            }
            else if (s == "5") {
                return HONORARIO_INDIVIDUAL;
            }
            else if (s == "6") {
                return OUTRAS_DESPESAS;
            }
            else if (s == "7") {
                return PRORROGACAO_INTERNACAO;
            }
            else {
                return ELEGIBILIDADE;
            }
        }
        
        public String toString(){
           return tipo;
        }
        
        public String getTipoGuia() {
            return tipo;
        }
    }
    
    public static enum TipoConsulta {
        PRIMEIRA("1"),
        SEGUIMENTO("2"),
        PRE_NATAL("3"),
        POR_ENCAMINHAMENTO("4");
        
        private final String tipoConsulta;

        private TipoConsulta(String s) {
            tipoConsulta = s;
        }

        public boolean equals(String otherTipoConsulta){
            return (otherTipoConsulta == null)? false:tipoConsulta.equals(otherTipoConsulta);
        }

        public String toString() {
           return tipoConsulta;
        }
    }    
    
    public static enum TipoAtendimento {
        REMOCAO("01"),
        PEQUENA_CIRURGIA("02"),
        TERAPIAS("03"),
        CONSULTA("04"),
        EXAMES("05"),
        ATENDIMENTO_DOMICILIAR("06"),
        INTERNACAO("07"),
        QUIMIOTERAPIA("08"),
        RADIOTERAPIA("09"),
        TERAPIA_RENAL_SUBSTITUTIVA("10"),
        PRONTO_SOCORRO("11"),
        OCUPACIONAL("12"),
        PEQUENOS_ATENDIMENTOS("13");
        
        private final String tipoAtendimento;

        private TipoAtendimento(String s) {
            tipoAtendimento = s;
        }

        public boolean equals(String otherTipoAtendimento){
            return (otherTipoAtendimento == null)? false:tipoAtendimento.equals(otherTipoAtendimento);
        }

        public String toString() {
           return tipoAtendimento;
        }
    }

    public static enum TipoSaidaObito {
        OBITO_COM_DECLARACAO_FORNECIDA_PELO_MEDICO_ASSISTENTE("41"),
        OBITO_COM_DECLARACAO_FORNECIDA_PELO_IML("42"),
        OBITO_COM_DECLARACAO_FORNECIDA_PELO_SVO("43");
        
        private final String tipoSaidaObito;

        private TipoSaidaObito(String s) {
            tipoSaidaObito = s;
        }

        public boolean equals(String otherTipoSaidaObito){
            return (otherTipoSaidaObito == null)? false:tipoSaidaObito.equals(otherTipoSaidaObito);
        }

        public String toString() {
           return tipoSaidaObito;
        }
    }
}
