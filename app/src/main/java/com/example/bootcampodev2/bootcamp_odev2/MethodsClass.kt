package com.example.bootcampodev2.bootcamp_odev2

class MethodsClass {
    //Soru 1 (Girilen dereceyi  fahrenhayta dönüştürme)
    fun degreeToFahrenheit(degree:Double):Double{
        val fahrenheit=(degree*1.8)+32
        return fahrenheit
    }


    //Soru 2 (kenarları verilen dikdörtgen çevresi)
    fun perimeterOfRectangle(shortSide:Int,longSide:Int){
        val perimeter=(2*shortSide)+(2*longSide)
        println("Kısa kenarı $shortSide ve uzun kenarı $longSide olan diktörgenin çevresi : $perimeter")
    }


    //Soru 3 ( Girilen sayının faktöriyelini hesaplama)
    fun factorial(sayi:Int):Int{
        if(sayi ==0){
            return 1
        }else{
            return (sayi * factorial(sayi-1))//rekürsif
        }
    }


    //Soru 4 (Girilen ifadede kaç tane a olduğunu bulma)
    fun howManyA(ifade:String){
      var yeniİfade=ifade.lowercase()//Büyük veya küçük a harflerine bakıldı(sadece 'a' ise bu satıra gerek yoktur
        var sayac=0
        for(i in yeniİfade){
            if(i == 'a'){
                sayac++
            }
        }
        println("$ifade ifadesinde $sayac adet 'A/a' vardır ")
    }


    //Soru 5 (Girilen kenar sayısına göre iç açılar toplamı hesaplama)
    fun internalAngle(kenarSayisi:Int):Int{
        var icAciToplami=(kenarSayisi-2)*180
        return icAciToplami
    }


    //Soru 6(Girilen gün sayısına göre maaş hesaplama(160 ve altı normal üstü mesaidir)(Normal ücret=10 ve mesai=20 ,bir günde max 8 saat çalışabilir)
    fun salary(gun:Int):Int{
        var calismaSaat=gun*8
        var mesaiUcret=20
        var normalUcret=10
        var maas=0
        if(calismaSaat<=160){
            maas=calismaSaat*normalUcret
        }else{
            maas=(160*normalUcret)+((calismaSaat-160)*mesaiUcret)
        }
        return maas
    }


    //Soru 7
    fun internetQuoate(kullanilanInternet:Int):Int{
        val kota=50
        var ekstra=0
        var toplamUcret=0
        val defaultPara=100
        if(kullanilanInternet < kota){
            toplamUcret=defaultPara+ekstra
            return toplamUcret
        }else{
            ekstra=(kullanilanInternet-kota)*4
            toplamUcret=ekstra+defaultPara
            return toplamUcret
        }
    }
}