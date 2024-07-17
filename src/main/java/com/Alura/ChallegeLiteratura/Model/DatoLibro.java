package com.Alura.ChallegeLiteratura.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatoLibro(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<DatoAutor> autor,
        @JsonAlias("languages") List<String> idiomas,
        @JsonAlias("download_count") Double numeroDeDescargas
) {
    public DatoLibro {
        if (autor.size() == 0) {
            autor.add(new DatoAutor("NULL", 0, 0));
        }
    }
}
