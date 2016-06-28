package br.gov.ans.tiss.ws.tipos.tissloteguias.v30200;

import br.com.unimederechim.classes.LoteGuias;
import br.com.unimederechim.classes.VerificaElegibilidade;

import br.com.unimederechim.classes.VerificaUsuario;

import br.gov.ans.padroes.tiss.schemas.CtMotivoGlosa;
import br.gov.ans.padroes.tiss.schemas.CtRecebimentoLote;
import br.gov.ans.padroes.tiss.schemas.LoteGuiasWS;
import br.gov.ans.padroes.tiss.schemas.ObjectFactory;
import br.gov.ans.padroes.tiss.schemas.ProtocoloRecebimentoWS;

import br.gov.ans.padroes.tiss.schemas.StTissFault;

import br.gov.ans.padroes.tiss.schemas.TissFaultWS;

import java.io.FileWriter;
import java.io.IOException;

import java.math.BigDecimal;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "tissLoteGuias_PortType",
            targetNamespace = "http://www.ans.gov.br/tiss/ws/tipos/tissloteguias/v30200",
            serviceName = "tissLoteGuias", portName = "tissLoteGuias_Port",
            wsdlLocation = "/WEB-INF/wsdl/tissLoteGuias.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso( { ObjectFactory.class, org.w3._2000._09.xmldsig_.ObjectFactory.class })
public class TissLoteGuiasPortTypeImpl {
    public TissLoteGuiasPortTypeImpl() {
    }

    @WebResult(name = "protocoloRecebimentoWS", partName = "protocoloRecebimento",
               targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas")
    @WebMethod(operationName = "tissLoteGuias_Operation")
    public ProtocoloRecebimentoWS tissLoteGuiasOperation(@WebParam(name = "loteGuiasWS", partName = "loteGuias",
                                                                   targetNamespace =
                                                                   "http://www.ans.gov.br/padroes/tiss/schemas")
        LoteGuiasWS loteGuias) throws TissFault {

        ProtocoloRecebimentoWS retorno = new ProtocoloRecebimentoWS();

        boolean usuario;

        try {

            if (loteGuias.getCabecalho().getLoginSenhaPrestador().getLoginPrestador().isEmpty() == false &&
                loteGuias.getCabecalho().getLoginSenhaPrestador().getSenhaPrestador().isEmpty() == false) {

                VerificaUsuario verificaUsuario = new VerificaUsuario();
                usuario =
                        verificaUsuario.verificaUsuario(loteGuias.getCabecalho().getLoginSenhaPrestador(), String.valueOf(loteGuias.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));

                if (usuario) {
                    int lote, idPrestador;

                    VerificaElegibilidade eleg = new VerificaElegibilidade();
                    LoteGuias lotes = new LoteGuias(loteGuias);

                    lotes.saveXML();                    

                    idPrestador =
                            eleg.idPrestador(String.valueOf(loteGuias.getCabecalho().getOrigem().getIdentificacaoPrestador().getCPF()),
                                             String.valueOf(loteGuias.getCabecalho().getOrigem().getIdentificacaoPrestador().getCNPJ()),
                                             String.valueOf(loteGuias.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));
                    Date data = new Date();
                    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

                    lote = lotes.fauLotes(idPrestador, "Lote Gerado pelo WebService", "S", sd.format(data), 6202);

                    String arquivo = lotes.nomeArquivo();
                    lotes.fauEnvArq(lote, arquivo, arquivo, sd.format(data), idPrestador, "E",
                                    Integer.valueOf(String.valueOf(loteGuias.getLoteGuias().getNumeroLote())));

                    retorno = lotes.retorno(String.valueOf(lote));

                } else {

                    CtRecebimentoLote lote = new CtRecebimentoLote();
                    CtMotivoGlosa motivo = new CtMotivoGlosa();
                    motivo.setCodigoGlosa("5005");
                    motivo.setDescricaoGlosa("REMETENTE NÃO IDENTIFICADO");
                    lote.setMensagemErro(motivo);
                    retorno.setRecebimentoLote(lote);

                }

            } else {

            }

        } catch (Exception e) {

        }

        return retorno;
    }

}
