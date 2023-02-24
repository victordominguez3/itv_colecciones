package controller

import models.Coche
import models.Moto
import models.Vehiculo

val listaCoches = listOf<Vehiculo>(
    Coche("Peugeot", 2007, true, 120000, 4),
    Coche("Seat", 2009, false, 160000, 2),
    Coche("Peugeot", 2016, true, 125000, 5),
    Coche("BMW", 2003, false, 210000, 2)
)

val listaMotos = listOf<Vehiculo>(
    Moto("Seat", 2013, true, 90000, 1750),
    Moto("BMW", 2019, true, 30000, 1860),
    Moto("Peugeot", 2011, false, 140000, 1790),
)