package com.Alura.ChallegeLiteratura.Service;

public interface IConversionDato {
    <T> T obtenerDatos(String json, Class<T> clase);
}

