package com.fitec.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int mult(int a, int b) {
        return a * b;
    }
}