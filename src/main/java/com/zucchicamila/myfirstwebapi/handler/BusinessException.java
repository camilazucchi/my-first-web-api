package com.zucchicamila.myfirstwebapi.handler;

/* Este código define uma classe chamada "BusinessException" que estende "RuntimeException", o que significa que é uma
 * exceção que pode ser lançada durante a execução do programa para indicar um problema relacionado à
 * lógica de negócios.*/
public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }

}