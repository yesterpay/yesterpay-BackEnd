package com.yesterpay.bingo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BingoStatusResponseDTO {
    private Integer requiredBingoCount;
    private Integer bingoCount;
}
