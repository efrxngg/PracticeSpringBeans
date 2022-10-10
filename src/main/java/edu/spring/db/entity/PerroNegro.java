package edu.spring.db.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = false, exclude = "id")
public class PerroNegro {
    @Setter(value = AccessLevel.NONE)
    @Getter
    private String id;

    @Setter(value = AccessLevel.PROTECTED)
    @Getter
    private String name = "Blanqui";
}
