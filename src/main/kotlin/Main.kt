fun main() {
    // Variables generales
    val integerNum = 100
    val doubleNum = 123.456
    val floatNum = 78.9f
    val message = "¡Hola Kotlin!"
    val isAvailable = true

    // Variables para funciones
    val mutableListItems = mutableListOf("Manzana", "Naranja", "Pera")
    val mutableMapItems = mutableMapOf("Pedro" to 45, "Sofía" to 29)
    val numberForCondition = 42
    val numberList = mutableListOf(5, 10, 15, 20)
    val dayNumber = 6
    val personName = "Camila"
    val personAge = 30
    val optionalName: String? = null

    // Imprimir tipos básicos
    println("Entero: $integerNum, Doble: $doubleNum, Flotante: $floatNum, Cadena: $message, Booleano: $isAvailable")

    println("\n----- Lista Mutable -----\n")
    mutableListExample(mutableListItems)

    println("\n----- Ejemplo de Mapa -----\n")
    mapExample(mutableMapItems)

    println("\n----- Ejemplo de Condiciones -----\n")
    conditionsExample(numberForCondition)

    println("\n----- Ejemplo de Bucle For -----\n")
    forLoopExample(numberList)

    println("\n----- Ejemplo de Bucle While -----\n")
    whileLoopExample(numberList)

    println("\n----- Expresión When -----\n")
    whenExample(dayNumber)

    println("\n----- Ejemplo de Clases -----\n")
    classesExample(personName, personAge)

    println("\n----- Ejemplo de Seguridad Nula -----\n")
    nullSafetyExample(optionalName)
}

// Ejemplo de lista mutable
fun mutableListExample(items: MutableList<String>) {
    println("Lista inicial: $items")
    items.add("Fresa")
    println("Lista modificada: $items")
}

// Ejemplo de mapa mutable
fun mapExample(myMap: MutableMap<String, Int>) {
    println("Mapa original: $myMap")
    myMap["Lucía"] = 35
    println("Mapa modificado: $myMap")
    println("Valor de Lucía: ${myMap["Lucía"]}")
}

// Ejemplo de condiciones
fun conditionsExample(num: Int) {
    if (num % 2 == 0) {
        println("El número $num es par")
    } else {
        println("El número $num es impar")
    }
}

// Ejemplo de bucle for
fun forLoopExample(list: MutableList<Int>) {
    println("Lista de números:")
    for (number in list) {
        println("Número: $number")
    }
}

// Ejemplo de bucle while
fun whileLoopExample(list: MutableList<Int>) {
    var index = 0
    println("Recorriendo la lista con while:")
    while (index < list.size) {
        println("Número en el índice $index: ${list[index]}")
        index++
    }
}

// Ejemplo de expresión when
fun whenExample(day: Int) {
    val result = when (day) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Día inválido"
    }
    println(result)
}

// Ejemplo de clases
fun classesExample(name: String, age: Int) {
    class Person(val name: String, val age: Int)

    val person = Person(name, age)
    println("Nombre: ${person.name}")
    println("Edad: ${person.age}")
}

// Ejemplo de seguridad nula
fun nullSafetyExample(optionalName: String?) {
    optionalName?.let {
        println("Mi nombre es $it")
    } ?: run {
        println("No tengo nombre")
    }
}
