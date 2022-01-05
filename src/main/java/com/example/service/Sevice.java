package com.example.service;

import com.example.interfaces.OperationCalculatrice;

public class Sevice implements OperationCalculatrice {
    @Override
    public float addition(float x, float y) {
        return x+y;
    }

    @Override
    public float multiplication(float x, float y) {
        return x*y;
    }

    @Override
    public float division(float x, float y) {
        return x/y;
    }

}
