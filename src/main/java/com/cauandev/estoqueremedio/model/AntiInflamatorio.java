package com.cauandev.estoqueremedio.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Anti-Inflamatório")
public class AntiInflamatorio extends TipoRemedio {
}
