package com.example.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Clientes")
public class SpanishClientDTO {
    //@JacksonXmlProperty(localName = "Codigo_Cliente")
    private int code;
    //@JacksonXmlProperty(localName = "Nombre")
    private String name;
  
    public SpanishClientDTO() {
    }

    public SpanishClientDTO(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @JsonGetter("codigo_cliente")
    public int getCode() {
        return code;
    }

    @JsonSetter("codigo_cliente")
    public void setCode(int code) {
        this.code = code;
    }

    @JsonGetter("nombre")
    public String getName() {
        return name;
    }

    @JsonSetter("nombre")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SpanishClientDTO [codigo=" + code + ", nombre=" + name + "]";
    }

    
}
