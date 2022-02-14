package com.example.board;
import java.util.Date;

/*ìäçeì‡óe*/
public class Post {
	 public int id = 1;
	 public String author = null;
	 public String title = null;
	 public String body = null;
	 public Date createdDate = null;
	 public Date updatedDate = null;
	 public boolean deleted = false;

	 public int getId() {
		    return id;
		  }
	 
	 public void setId(int id) {
		    this.id = id;
		  }
	 
	 public String getAuthor() {
		    return author;
		  }
	 
	 public void setAuthor(String author) {
		    this.author = author;
		  }
	 
	 public String getTitle() {
		    return title;
		  }
	 
	 public void setTitle(String title) {
		    this.title = title;
		  }
	 
	 
	 public String getBody() {
		    return body;
		  }
	 
	 public void setBody(String body) {
		    this.body = body;
		  }
	 
	 public Date getcreatedDate() {
		    return createdDate;
		  }
	 
	 public void setcreatedDate(Date createdDate) {
		    this.createdDate = createdDate;
		  }
	 
	 public Date getupdatedDate() {
		    return updatedDate;
		  }
	 
	 public void setupdatedDate(Date updatedDate) {
		    this.updatedDate = updatedDate;
		  }
	 
	 
	 public boolean setDeleted() {
		    return deleted;
		  }
	 
	 public void getDeleted(boolean deleted) {
		    this.deleted = deleted;
		  }

	 

}
