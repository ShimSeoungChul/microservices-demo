package com.microservices.demo.handler.exception;

public class ElasticQueryWebClientException extends RuntimeException {

    public ElasticQueryWebClientException() {
        super();
    }

    public ElasticQueryWebClientException(String message) {
        super(message);
    }

    public ElasticQueryWebClientException(String message, Throwable t) {
        super(message, t);
    }
}
