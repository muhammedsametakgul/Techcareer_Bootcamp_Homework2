package com.example.bootcampodev2.bootcamp_odev2

fun main() {
    var nesne=MethodsClass()

    println("-------------------- Soru-1 --------------------")
    println(nesne.degreeToFahrenheit(32.0))

    println("-------------------- Soru-2 --------------------")
    nesne.perimeterOfRectangle(10,20)

    println("-------------------- Soru-3 --------------------")
    var factorialNumber=5
    println("Girilen ${factorialNumber}  değerinin faktöriyeli :${nesne.factorial(factorialNumber)}")

    println("-------------------- Soru-4 --------------------")
    var  kelime="Techcareer Bootcamp Kotlin Android"
    nesne.howManyA(kelime)

    println("-------------------- Soru-5 --------------------")
    var kenarSayisi=4
    println(nesne.internalAngle(kenarSayisi))

    println("-------------------- Soru-6 --------------------")
    var gun=25
    println("Toplam Maas : ${nesne.salary(gun)}")

    println("-------------------- Soru-7 --------------------")
    var internet=51
    println("Toplam İnternet Ücreti : ${nesne.internetQuoate(internet)}")


}