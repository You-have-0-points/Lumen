package com.lumen

class Tag (
    private var name: String
) {
    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }
}