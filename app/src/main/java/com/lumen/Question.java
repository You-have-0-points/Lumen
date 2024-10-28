package com.lumen;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Question {
    String text;
    User author;
    SimpleDateFormat date;
    ArrayList<Answer> listOfAnswers;
    Answer bestAnswer;
    ArrayList<File> listOfFiles;
    ArrayList<Tag> listOfTags;
    long likes = 0;

    public Question(String text, User author, SimpleDateFormat date, long likes) {
        this.text = text;
        this.author = author;
        this.date = date;
        this.likes = likes;
    }

    public Question(String text, User author, SimpleDateFormat date, ArrayList<Answer> listOfAnswers, Answer bestAnswer,
                    ArrayList<File> listOfFiles, ArrayList<Tag> listOfTags, long likes) {
        this.text = text;
        this.author = author;
        this.date = date;
        this.listOfAnswers = listOfAnswers;
        this.bestAnswer = bestAnswer;
        this.listOfFiles = listOfFiles;
        this.listOfTags = listOfTags;
        this.likes = likes;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }
    public void setAuthor(User author) {
        this.author = author;
    }

    public SimpleDateFormat getDate() {
        return date;
    }
    public void setDate(SimpleDateFormat date) {
        this.date = date;
    }

    public ArrayList<Answer> getListOfAnswers() {
        return listOfAnswers;
    }
    public void setListOfAnswers(ArrayList<Answer> listOfAnswers) {
        this.listOfAnswers = listOfAnswers;
    }

    public Answer getBestAnswer() {
        return bestAnswer;
    }
    public void setBestAnswer(Answer bestAnswer) {
        this.bestAnswer = bestAnswer;
    }

    public ArrayList<File> getListOfFiles() {
        return listOfFiles;
    }
    public void setListOfFiles(ArrayList<File> listOfFiles) {
        this.listOfFiles = listOfFiles;
    }

    public ArrayList<Tag> getListOfTags() {
        return listOfTags;
    }
    public void setListOfTags(ArrayList<Tag> listOfTags) {
        this.listOfTags = listOfTags;
    }

    public long getLikes() {
        return likes;
    }
    public void setLikes(long likes) {
        this.likes = likes;
    }


    public void addFile(File file){
        listOfFiles.add(file);
    }
    public void removeFile(File file){
        listOfFiles.remove(file);
    }

    public void addAnswer(Answer ans){
        listOfAnswers.add(ans);
    }
    public void removeAnswer(Answer ans){
        listOfAnswers.remove(ans);                         //need to check
    }

    public void addTag(Tag tag){
        listOfTags.add(tag);
    }
    public void removeTag(Tag tag){
        listOfTags.remove(tag);                            //need to check
    }

    public void addLike(){
        likes += 1;
    }
    public void removeLike(){
        likes -= 1;
    }

}
