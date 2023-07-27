package com.example.modulo4exercicio

class Atividade {
}

fun main() {
    //Atividade 1: Crie uma função que some dois valores
    println("Atividade 1:")
    println(soma(1,2))
    println(soma(2,2))
    println(soma(10,345))
    //Atividade 2: Crie uma função compacta que multiplica dois valores
    println("Atividade 2:")
    println(mult(1,2))
    println(mult(10,2))
    println(mult(77,99))
    //Atividade 3: Crie uma função calculadora que recebe dois inteiros e uma função como parametro, teste a soma e a multiplicação nessa função
    println("Atividade 3:")
    println(calc(1,2, ::soma))
    println(calc(33,17, ::soma))
    println(calc(132,262, ::soma))
    println(calc(1,2, ::mult))
    println(calc(33,17, ::mult))
    println(calc(132,262, ::mult))
    //Atividade 4: Cria uma lista de numeros interos de 0 a 99 e retorne apenas os numeros pares
    println("Atividade 4:")
    var list: MutableList<Int> = mutableListOf()

    for(i in 1..99){
        list.add(i)
    }
    var resultList = list.filter { it % 2 == 0 }
    println(resultList)
    //Atividade 5: Crie uma lista com 4 nome e use o map para acrescentar a palavra ola antes de cada nome
    println("Atividade 5:")
    val namesList = listOf("Ana", "Felipe", "João", "Maria")
    val helloList = namesList.map { "Olá $it" }

    helloList.forEach{
        println(it)
    }
}

fun soma(val1: Int, val2: Int): String{
    return "A soma de $val1 e $val2 é igual a ${val1 + val2}"
}

fun mult(val1: Int, val2: Int) = "A multiplicação de $val1 e $val2 é igual a ${val1 * val2}"

fun calc(val1: Int, val2: Int, operation:(Int,Int)->String): String{
    return operation(val1,val2)
}

