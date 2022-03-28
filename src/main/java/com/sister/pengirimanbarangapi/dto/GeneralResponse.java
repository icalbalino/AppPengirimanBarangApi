package com.sister.pengirimanbarangapi.dto;

import java.io.Serializable;
import java.util.List;
import lombok.Data;


@Data
public class GeneralResponse<T> implements Serializable {
    
    private boolean status;
    private List<String> messages;
    private T data;
    
}