package models

import java.util.*

sealed class Vehiculo(
    val marca: String,
    val anyoFabricacion: Int,
    val isApto: Boolean,
    val kilometraje: Int
) {
    val id: UUID = UUID.randomUUID()
}

class Coche(
    marca: String,
    anyoFabricacion: Int,
    isApto: Boolean,
    kilometraje: Int,
    val numPuertas: Int):
    Vehiculo(marca, anyoFabricacion, isApto, kilometraje) {

    override fun toString(): String {
        return "Coche -> Marca: $marca, Año de fabricación: $anyoFabricacion, Apto: $isApto, Kilometraje: ${kilometraje}km, Número de puertas: $numPuertas"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Coche) return false
        return this.id == other.id
                && this.marca == other.marca
                && this.anyoFabricacion == other.anyoFabricacion
                && this.isApto == other.isApto
                && this.kilometraje == other.kilometraje
                && this.numPuertas == other.numPuertas
    }
}

class Moto(
    marca: String,
    anyoFabricacion: Int,
    isApto: Boolean,
    kilometraje: Int,
    val cilindradas: Int):
    Vehiculo(marca, anyoFabricacion, isApto, kilometraje) {

    override fun toString(): String {
        return "Coche -> Marca: $marca, Año de fabricación: $anyoFabricacion, Apto: $isApto, Kilometraje: ${kilometraje}km, Número de puertas: $cilindradas"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Moto) return false
        return this.id == other.id
                && this.marca == other.marca
                && this.anyoFabricacion == other.anyoFabricacion
                && this.isApto == other.isApto
                && this.kilometraje == other.kilometraje
                && this.cilindradas == other.cilindradas
    }
}