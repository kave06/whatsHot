//@file:JvmName("getDataUtil")

package com.kave.WhatsHot.app

import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import org.w3c.dom.Entity
import kotlin.text.StringBuilder

/**
 * Created by kave on 12/01/18.
 */

class ListTemp





fun getTemp() : ArrayList<Float>{

    var listJsonTemp = ArrayList<JsonObject>()
    var temperature : Float
    var tempDouble : Double
    var listTemp = ArrayList<Float>()
    val parser : Parser = Parser()
    val stringBuilder : StringBuilder = java.lang.StringBuilder(" {\n" +
            "                    \"current_datetime\": \"Fri, 12 Jan 2018 12:14:33 GMT\",\n" +
            "                    \"current_humi\": 36.4,\n" +
            "                    \"current_temp\": 14.7,\n" +
            "                    \"hour\": 12\n" +
            "                }")

    val objectJson : JsonObject = parser.parse(stringBuilder) as JsonObject

    for (i in 1..5){
        listJsonTemp.add(objectJson)
    }

    for (item in listJsonTemp){
        tempDouble = item.get("current_temp") as Double
        temperature = tempDouble.toFloat()
        listTemp.add(temperature)
    }

    return listTemp
}


fun getHour() : ArrayList<Int>{

    var listJsonHour = ArrayList<JsonObject>()
    var hour : Int
    var listHour = ArrayList<Int>()
    val parser : Parser = Parser()
    val stringBuilder : StringBuilder = java.lang.StringBuilder(" {\n" +
            "                    \"current_datetime\": \"Fri, 12 Jan 2018 12:14:33 GMT\",\n" +
            "                    \"current_humi\": 36.4,\n" +
            "                    \"current_temp\": 14.7,\n" +
            "                    \"hour\": 12\n" +
            "                }")

    val objectJson : JsonObject = parser.parse(stringBuilder) as JsonObject

    for (i in 1..5){
        listJsonHour.add(objectJson)
    }

    for (item in listJsonHour){
        hour = item.get("hour") as Int
        listHour.add(hour)
    }

    return listHour
}
