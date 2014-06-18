package com.googlecode.jmxtrans.model;

import java.util.Arrays;
import java.util.List;


public class Operation {
    private String method;
    private List<Object> parameters;

    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public List<Object> getParameters() {
        return parameters;
    }
    public void setParameters(List<Object> parameters) {
        this.parameters = parameters;
    }

}