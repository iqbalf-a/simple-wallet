package com.enigmacamp.simplewallet.model.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public abstract class CommonResponse {
    private String code;
    private String status;
    private String message;
}
