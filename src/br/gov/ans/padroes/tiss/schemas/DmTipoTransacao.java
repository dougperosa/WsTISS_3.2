
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dm_tipoTransacao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dm_tipoTransacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENVIO_LOTE_GUIAS"/>
 *     &lt;enumeration value="ENVIO_ANEXO"/>
 *     &lt;enumeration value="SOLIC_DEMONSTRATIVO_RETORNO"/>
 *     &lt;enumeration value="SOLIC_STATUS_PROTOCOLO"/>
 *     &lt;enumeration value="SOLICITACAO_PROCEDIMENTOS"/>
 *     &lt;enumeration value="SOLICITA_STATUS_AUTORIZACAO"/>
 *     &lt;enumeration value="VERIFICA_ELEGIBILIDADE"/>
 *     &lt;enumeration value="CANCELA_GUIA"/>
 *     &lt;enumeration value="COMUNICACAO_BENEFICIARIO"/>
 *     &lt;enumeration value="RECURSO_GLOSA"/>
 *     &lt;enumeration value="SOLIC_STATUS_RECURSO_GLOSA"/>
 *     &lt;enumeration value="PROTOCOLO_RECEBIMENTO"/>
 *     &lt;enumeration value="PROTOCOLO_RECEBIMENTO_ANEXO"/>
 *     &lt;enumeration value="RECEBIMENTO_RECURSO_GLOSA"/>
 *     &lt;enumeration value="DEMONSTRATIVO_ANALISE_CONTA"/>
 *     &lt;enumeration value="DEMONSTRATIVO_PAGAMENTO"/>
 *     &lt;enumeration value="DEMONSTRATIVO_ODONTOLOGIA"/>
 *     &lt;enumeration value="SITUACAO_PROTOCOLO"/>
 *     &lt;enumeration value="RESPOSTA_SOLICITACAO"/>
 *     &lt;enumeration value="AUTORIZACAO_ODONTOLOGIA"/>
 *     &lt;enumeration value="STATUS_AUTORIZACAO"/>
 *     &lt;enumeration value="SITUACAO_ELEGIBILIDADE"/>
 *     &lt;enumeration value="CANCELAMENTO_GUIA_RECIBO"/>
 *     &lt;enumeration value="RECIBO_COMUNICACAO"/>
 *     &lt;enumeration value="RESPOSTA_RECURSO_GLOSA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dm_tipoTransacao")
@XmlEnum
public enum DmTipoTransacao {

    ENVIO_LOTE_GUIAS,
    ENVIO_ANEXO,
    SOLIC_DEMONSTRATIVO_RETORNO,
    SOLIC_STATUS_PROTOCOLO,
    SOLICITACAO_PROCEDIMENTOS,
    SOLICITA_STATUS_AUTORIZACAO,
    VERIFICA_ELEGIBILIDADE,
    CANCELA_GUIA,
    COMUNICACAO_BENEFICIARIO,
    RECURSO_GLOSA,
    SOLIC_STATUS_RECURSO_GLOSA,
    PROTOCOLO_RECEBIMENTO,
    PROTOCOLO_RECEBIMENTO_ANEXO,
    RECEBIMENTO_RECURSO_GLOSA,
    DEMONSTRATIVO_ANALISE_CONTA,
    DEMONSTRATIVO_PAGAMENTO,
    DEMONSTRATIVO_ODONTOLOGIA,
    SITUACAO_PROTOCOLO,
    RESPOSTA_SOLICITACAO,
    AUTORIZACAO_ODONTOLOGIA,
    STATUS_AUTORIZACAO,
    SITUACAO_ELEGIBILIDADE,
    CANCELAMENTO_GUIA_RECIBO,
    RECIBO_COMUNICACAO,
    RESPOSTA_RECURSO_GLOSA;

    public String value() {
        return name();
    }

    public static DmTipoTransacao fromValue(String v) {
        return valueOf(v);
    }

}
