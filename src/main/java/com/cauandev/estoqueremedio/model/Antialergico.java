package com.cauandev.estoqueremedio.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Antialérgico")
public class Antialergico extends TipoRemedio {
}
