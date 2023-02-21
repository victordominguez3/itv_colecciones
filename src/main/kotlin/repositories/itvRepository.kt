package repositories

interface itvRepository<T> {

    fun mostrarTodos(): List<T>
    fun mostrarCoches(): List<T>
    fun mostrarMotos(): List<T>
    fun vehiculoMasModerno(): T
    fun vehiculoMenosKilometraje(): T
    fun mediaKilometrajeMotos(): Int
    fun vehiculoMasAntiguoConMasDeDosPuertas(): T
    fun numMotos(): Int
    fun numCoches(): Int
    fun numCochesAptos(): Int
    fun numMotosAptas(): Int
    fun mediaAnyosFabricacionCoches(): Int
    fun mediaAnyosFabricacionMotos(): Int
    fun vehiculosPorMarca(): Map<String, List<T>>
    fun vehiculosOrdenadosAnyo(): List<T>
    fun ordenarMarcasDescendente(): List<String>
    fun vehiculosPorMarcaOrdenadoKmDescendente(): Map<String, List<T>>

}