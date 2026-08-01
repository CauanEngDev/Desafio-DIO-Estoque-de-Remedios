package com.cauandev.estoqueremedio.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Antibiótico")
public class Antibiotico extends TipoRemedio {
}
