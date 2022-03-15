/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sister.pengirimanbarangapi.dto;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author user
 */
@Data
public class GeneralResponse<T> implements Serializable {
    
    private boolean status;
    private List<String> messages;
    private T data;
    
}
