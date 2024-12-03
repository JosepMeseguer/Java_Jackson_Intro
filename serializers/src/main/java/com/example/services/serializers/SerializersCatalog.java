package com.example.services.serializers;

import java.util.TreeMap;

import com.example.model.ClientDTO;
import com.example.model.SpanishClientDTO;

public class SerializersCatalog {
    private static TreeMap<Serializers, Serializer> catalog = new TreeMap<>();

    private static void loadCatalog() {
        // AL CREAR EL SERIALITZADOR PASSEM PER CONSTRUCTOR L'OBJECTE AMB QUE ES
        // REALIZARÀ LA SERIALITZACIO
        catalog.put(Serializers.JSON_CLIENT, new JacksonSerializer<ClientDTO>());
        catalog.put(Serializers.JSON_SP_CLIENT, new JacksonSerializer<SpanishClientDTO>());
        catalog.put(Serializers.XML_CLIENT, new XmlJacksonSerializer<ClientDTO>());
        catalog.put(Serializers.XML_SP_CLIENT, new XmlJacksonSerializer<SpanishClientDTO>());
    }

    public static Serializer getInstance(Serializers type) {
        if (catalog.isEmpty()) {
            loadCatalog();
        }
        return catalog.get(type);
    }
}
