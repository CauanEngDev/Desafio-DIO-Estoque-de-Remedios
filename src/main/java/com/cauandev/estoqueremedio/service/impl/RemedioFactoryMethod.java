package com.cauandev.estoqueremedio.service.impl;

import com.cauandev.estoqueremedio.model.Antigripal;
import com.cauandev.estoqueremedio.model.TipoRemedio;

public class RemedioFactoryMethod {
    public <T extends TipoRemedio> T fabricarRemedio(String tipo, TipoRemedio remedio) {
        switch (tipo.toLowerCase()):
            case "antigripal" -> {
                remedio = (Antigripal) remedio;
                return remedio;
            }

    }
}
