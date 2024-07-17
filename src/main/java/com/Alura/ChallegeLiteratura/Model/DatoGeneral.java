package com.Alura.ChallegeLiteratura.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatoGeneral
        (
                @JsonAlias("results") List<DatoLibro> resultados
        ) {

}