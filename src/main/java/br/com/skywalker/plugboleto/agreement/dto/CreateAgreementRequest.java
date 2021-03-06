package br.com.skywalker.plugboleto.agreement.dto;

import br.com.skywalker.plugboleto.common.Request;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import retrofit2.Call;

@Getter
@Builder

public class CreateAgreementRequest {
    @JsonProperty("ConvenioNumero")
    private String agreementNumber;

    @JsonProperty("ConvenioDescricao")
    private String agreementDescription;

    @JsonProperty("ConvenioCarteira")
    private String agreementWallet;

    @JsonProperty("ConvenioEspecie")
    private String agreementCash;

    @JsonProperty("ConvenioPadraoCNAB")
    private String agreementCNABPattern;

    @JsonProperty("ConvenioNumeroRemessa")
    private String agreementShipmentNumber;

    @JsonProperty("ConvenioDensidaDeRemessa")
    private String agreementShipmentDensity;

    @JsonProperty("ConvenioReiniciarDiariamente")
    private boolean agreementDailyReset;

    @JsonProperty("Conta")
    private long account;
}

/*
    "ConvenioNumero": "7889604745",
    "ConvenioDescricao": "Convenio da tecnospeed",
    "ConvenioCarteira": "109",
    "ConvenioEspecie": "R$",
    "ConvenioPadraoCNAB": "400",
    "ConvenioNumeroRemessa": "1",
    "ConvenioReiniciarDiariamente": false,
    "Conta": 168
*/
