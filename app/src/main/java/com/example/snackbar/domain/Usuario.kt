package com.example.snackbar.domain

import java.io.Serializable

class Usuario(var id: Int, var username: String, var password: String): Serializable {

    override fun toString(): String {
        return "id: $id || username: $username || password: $password"
    }

}
