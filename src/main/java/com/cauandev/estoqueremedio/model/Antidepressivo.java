package com.cauandev.estoqueremedio.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Antidepressivo")
public class Antidepressivo extends TipoRemedio {
}
