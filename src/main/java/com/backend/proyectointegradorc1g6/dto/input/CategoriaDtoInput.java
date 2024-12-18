package com.backend.proyectointegradorc1g6.dto.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaDtoInput {

    @NotBlank(message = "The value nombre should not be empty")
    @Size(max = 50, message = "The value nombre should has max 50 characters")
    private String nombre;
    @NotBlank(message = "The value descripcion should not be empty")
    @Size(max = 200, message = "The value descripcion should has max 200 characters")
    private String descripcion;
    @NotBlank(message = "The value iconoCat should not be empty")
    @Size(max = 400, message = "The value iconoCat should has max 400 characters for its URL")
    private String iconoCat;

    @Override
    public String toString() {
        return "CategoriaDtoInput{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", iconoCat='" + iconoCat + '\'' +
                '}';
    }
}
