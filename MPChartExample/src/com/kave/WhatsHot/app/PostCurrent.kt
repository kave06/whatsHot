package com.kave.WhatsHot.app

import android.util.Log
import com.beust.klaxon.JsonObject
import com.beust.klaxon.double
import com.beust.klaxon.int
import com.beust.klaxon.string
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

/**
 * Created by kave on 6/01/18.
 */

class PostCurrent {
    var currentTemp : Double? = null
    var currentHumi : Double? = null
    var currentDate : String? = null
    var currentHour : Int? = null

    constructor(jsonObject: JsonObject){
        currentTemp = jsonObject.double("current_temp")
        currentHumi = jsonObject.double("current_humi")
        currentDate = jsonObject.string(fieldName = "current_datetime")
        currentHour = jsonObject.int("hour")

    }
}
