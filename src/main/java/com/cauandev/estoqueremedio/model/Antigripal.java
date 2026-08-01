package com.cauandev.estoqueremedio.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Antigripal")
public class Antigripal extends TipoRemedio {
}
