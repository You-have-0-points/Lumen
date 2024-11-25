package com.lumen

import android.text.format.DateFormat

class Answer (
    private var text: String,
    private var author: User,
    private var date: DateFormat,
    private var likes: ULong,
    private var isBestAnswer: Boolean,
    private var messageReply: Answer?
) {
    // Геттеры
    fun getText(): String = text

    fun getAuthor(): User = author

    fun getDate(): DateFormat = date

    fun getLikes(): ULong = likes

    fun isBestAnswer(): Boolean = isBestAnswer

    fun getMessageReply(): Answer? = messageReply

    // Сеттеры

    fun setText(text: String) {
        this.text = text
    }

    fun setAuthor(author: User) {
        this.author = author
    }

    fun setDate(date: DateFormat) {
        this.date = date
    }

    fun setLikes(likes: ULong) {
        this.likes = likes
    }

    fun setIsBestAnswer(isBestAnswer: Boolean) {
        this.isBestAnswer = isBestAnswer
    }

    fun setMessageReply(messageReply: Answer?) {
        this.messageReply = messageReply
    }
}