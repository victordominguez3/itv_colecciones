package controller

import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import models.Coche
import models.Moto
import models.Vehiculo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.api.extension.ExtendWith
import repositories.itvRepository
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockKExtension::class)
class itvControllerTest {
    @MockK
    private lateinit var repository: itvRepository<Vehiculo>
    @InjectMockKs
    private lateinit var controller: itvController

    var misVehiculos: Sequence<Vehiculo> = sequenceOf(
        Coche("Peugeot", 2007, true, 120000, 4),
        Moto("Seat", 2013, true, 90000, 1750),
        Coche("Seat", 2009, false, 160000, 2),
        Moto("BMW", 2019, true, 30000, 1860),
        Moto("Peugeot", 2011, false, 140000, 1790),
        Coche("Peugeot", 2016, true, 125000, 5),
        Coche("BMW", 2003, false, 210000, 2)
    )

    @Test
    fun mostrarTodosTest() {
        every { repository.mostrarTodos() } returns misVehiculos.toList()

        val lista = controller.mostrarTodos()

        assertAll(
            { assertEquals(misVehiculos.toList(), lista) },
            { assertTrue { lista.size == 7 } }
        )

        verify { repository.mostrarTodos() }
    }

    @Test
    fun mostrarCochesTest() {
        every { repository.mostrarCoches() } returns listaCoches

        val lista = controller.mostrarCoches()

        assertAll(
            { assertTrue { lista.size == 4 } },
            { assertTrue { listaCoches == lista } }
        )

        verify { repository.mostrarCoches() }
    }

    @Test
    fun mostrarMotosTest() {
        every { repository.mostrarMotos() } returns listaMotos

        val lista = controller.mostrarMotos()

        assertAll(
            { assertTrue { lista.size == 3 } },
            { assertTrue { listaMotos == lista } }
        )

        verify { repository.mostrarMotos() }
    }

    @Test
    fun vehiculoMasModernoTest() {
        every { repository.vehiculoMasModerno() } returns misVehiculos.toList()[3]

        val vehiculo = controller.vehiculoMasModerno()

        assertEquals(misVehiculos.toList()[3], vehiculo)

        verify { repository.vehiculoMasModerno() }
    }

    @Test
    fun vehiculoMenosKilometrajeTest() {
        every { repository.vehiculoMenosKilometraje() } returns misVehiculos.toList()[3]

        val vehiculo = controller.vehiculoMenosKilometraje()

        assertEquals(misVehiculos.toList()[3], vehiculo)

        verify { repository.vehiculoMasModerno() }
    }




}