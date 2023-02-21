package com.example.intenttask

import java.io.Serializable

data class User(
    val pName: String,
    val uName: String,
    val email: String,
    val city:String

): Serializable {
}