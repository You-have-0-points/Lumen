package com.lumen
import java.util.*
import java.io.File
import java.text.DateFormat

class Article (
    private var name: String = "" ,
    private var author: User = User(),
    private var text: String = "",
    private var date: DateFormat,
    private var ID: ULong,
    private var likes: Long,
    private var listOfFiles: ArrayList<File>,
    private var listOfTags: ArrayList<Tag>
) {

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getAuthor(): User {
        return author
    }

    fun setAuthor(author: User) {
        this.author = author
    }

    fun getText(): String {
        return text
    }

    fun setText(text: String) {
        this.text = text
    }

    fun getDate(): DateFormat {
        return date
    }

    fun setDate(date: DateFormat) {
        this.date = date
    }

    fun getID(): ULong {
        return ID
    }

    fun setID(ID: ULong) {
        this.ID = ID
    }

    fun getLikes(): Long {
        return likes
    }

    fun setLikes(likes: Long) {
        this.likes = likes
    }

    fun getListOfFiles(): ArrayList<File> {
        return listOfFiles
    }

    fun setListOfFiles(listOfFiles: ArrayList<File>) {
        this.listOfFiles = listOfFiles
    }

    fun getListOfTags(): ArrayList<Tag> {
        return listOfTags
    }

    fun setListOfTags(listOfTags: ArrayList<Tag>) {
        this.listOfTags = listOfTags
    }

    fun addFile(file: File) {
        listOfFiles.add(file)
    }

    fun removeFile(file: File) {
        listOfFiles.remove(file)
    }

    fun addLike() {
        likes += 1
    }

    fun removeLike() {
        if (likes > 0) {
            likes -= 1
        }
    }
}