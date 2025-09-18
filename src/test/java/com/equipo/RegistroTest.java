package com.equipo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {

    @Test
    void testRegistrarUsuarioValido() {
        Registro registro = new Registro();
        boolean resultado = registro.registrar("juan", "1234");
        assertTrue(resultado, "El usuario debería registrarse correctamente");
        assertEquals(1, registro.cantidadUsuarios(), "Debe haber un usuario registrado");
    }

    @Test
    void testRegistrarUsuarioDuplicado() {
        Registro registro = new Registro();
        registro.registrar("juan", "1234"); // primer registro
        boolean resultado = registro.registrar("juan", "abcd"); // intento duplicado
        assertFalse(resultado, "No debe permitir registrar un usuario duplicado");
        assertEquals(1, registro.cantidadUsuarios(), "Debe haber solo un usuario registrado");
    }

    @Test
    void testRegistrarUsuarioDatosInvalidos() {
        Registro registro = new Registro();

        // usuario vacío
        assertFalse(registro.registrar("", "1234"), "No debe permitir usuario vacío");

        // contraseña vacía
        assertFalse(registro.registrar("maria", ""), "No debe permitir contraseña vacía");

        // usuario null
        assertFalse(registro.registrar(null, "1234"), "No debe permitir usuario null");

        // contraseña null
        assertFalse(registro.registrar("maria", null), "No debe permitir contraseña null");

        assertEquals(0, registro.cantidadUsuarios(), "No debe haber usuarios registrados con datos inválidos");
    }

    @Test
    void testCantidadUsuarios() {
        Registro registro = new Registro();
        registro.registrar("juan", "1234");
        registro.registrar("maria", "abcd");
        assertEquals(2, registro.cantidadUsuarios(), "Debe contar correctamente los usuarios registrados");
    }
}
