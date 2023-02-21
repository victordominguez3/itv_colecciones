package controller

import models.Vehiculo
import repositories.itvRepository
import `typealias`.ListaVehiculos
import `typealias`.MapaMarcaVehiculos

class itvController(var repository: itvRepository<Vehiculo>) {

    fun mostrarTodos(): ListaVehiculos {
        return repository.mostrarTodos()
    }

    fun mostrarCoches(): ListaVehiculos {
        return repository.mostrarCoches()
    }

    fun mostrarMotos(): ListaVehiculos {
        return repository.mostrarMotos()
    }

    fun vehiculoMasModerno(): Vehiculo {
        return repository.vehiculoMasModerno()
    }

    fun vehiculoMenosKilometraje(): Vehiculo {
        return repository.vehiculoMenosKilometraje()
    }

    fun mediaKilometrajeMotos(): Int {
        return repository.mediaKilometrajeMotos()
    }

    fun vehiculoMasAntiguoConMasDeDosPuertas(): Vehiculo {
        return repository.vehiculoMasAntiguoConMasDeDosPuertas()
    }

    fun numMotos(): Int {
        return repository.numMotos()
    }

    fun numCoches(): Int {
        return repository.numCoches()
    }

    fun numCochesAptos(): Int {
        return repository.numCochesAptos()
    }

    fun numMotosAptas(): Int {
        return repository.numMotosAptas()
    }

    fun mediaAnyosFabricacionCoches(): Int {
        return repository.mediaAnyosFabricacionCoches()
    }

    fun mediaAnyosFabricacionMotos(): Int {
        return repository.mediaAnyosFabricacionMotos()
    }

    fun vehiculosPorMarca(): MapaMarcaVehiculos {
        return repository.vehiculosPorMarca()
    }

    fun vehiculosOrdenadosAnyo(): ListaVehiculos {
        return repository.vehiculosOrdenadosAnyo()
    }

    fun ordenarMarcasDescendente(): List<String> {
        return repository.ordenarMarcasDescendente()
    }

    fun vehiculosPorMarcaOrdenadoKmDescendente(): MapaMarcaVehiculos {
        return repository.vehiculosPorMarcaOrdenadoKmDescendente()
    }

}