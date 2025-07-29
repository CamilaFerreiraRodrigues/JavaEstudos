package org.Posts;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date data;
    private String title;
    private String content;
    private  int likes;

    private List<Comment> comments = new ArrayList<>();

    public Post(){
    }
    public Post(Date data, String title, String content, int likes) {
        this.data = data;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void  addComment(Comment comment){
        comments.add(comment);
    }

    public void  removeComment(Comment comment){
        comments.remove(comment);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes).append(" Likes - ").append(data).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments:\n");

        for (Comment c : comments) {
            sb.append(c).append("\n").toString();
        }

        return sb.toString();

    }


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }


    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
