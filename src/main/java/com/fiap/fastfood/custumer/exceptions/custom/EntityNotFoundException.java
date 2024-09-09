package com.fiap.fastfood.custumer.exceptions.custom;

import com.fiap.fastfood.custumer.exceptions.model.CustomException;

public class EntityNotFoundException extends CustomException {
    public EntityNotFoundException(String code, String message) {
        super(code, message);
    }
}
