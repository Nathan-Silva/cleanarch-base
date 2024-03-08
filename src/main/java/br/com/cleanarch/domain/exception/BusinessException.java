package br.com.cleanarch.domain.exception;

public class BusinessException extends RuntimeException {

    private String errorCode = "-1";

    public BusinessException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
