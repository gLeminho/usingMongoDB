package com.nelioalves.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.nelioalves.workshopmongo.domain.Post;

public class CommentDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String text;
    private Date date;
    private AuthorDTO author;
    @DBRef (lazy = true)
    private Post post;

    public CommentDTO() {

    }

    public CommentDTO(String text, Date date,AuthorDTO author) {
        this.text = text;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

      public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    

}

