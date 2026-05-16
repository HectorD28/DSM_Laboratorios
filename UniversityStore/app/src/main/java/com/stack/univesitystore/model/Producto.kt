package com.stack.univesitystore.model

data class Producto(
    val id: Int,
    val nombre: String,
    val precio: String,
    val categoria: String,
    val favorito: Boolean = false
)

// Datos de prueba para la lista
val productosDePrueba = listOf(
    Producto(1, "Llaveros", "S/ 1.00", "Recuerdos", true),
    Producto(2, "Cuadernillo", "S/ 3.00", "Escritorio"),
    Producto(3, "Lapiz", "S/ 1.50", "Escritorio"),
    Producto(4, "Mochila", "S/ 100.00", "Equipamiento", true),
    Producto(5, "Pines", "S/ 3.00", "Recuerdos"),
    Producto(6, "Polo", "S/ 60.00", "Ropa", true),
    Producto(7, "Gorro", "S/ 40.00", "Accesorio"),
    Producto(8, "Globo", "S/ 5.00", "Recuerdos")
)