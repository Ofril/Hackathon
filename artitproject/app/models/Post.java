package models;

import java.util.*;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name = "t_posts")
public class Post extends Model {

	// Data Members
	@Id
	@Column(name = "id")
	private int id;
    
    @ManyToOne
    @JoinColumn(name = "type_id")
	private PostType type;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
	private User user;

	@Column(name = "url")
	private String url;
    
	// Ctor
	public Post(int id, PostType type, User user, String url) {
		this.setId(id);
		this.setType(type);
        this.setUser(user);
	}

	// Access Methods

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public void setType(PostType type) {
		this.type = type;
	}
    
   
    public PostType getType() {
		return type;
	}
    
    public void setUser(User user) {
		this.user = user;
	}
    
     @JsonBackReference
    public User getUser() {
		return user;
	}
    
    public void setUrl (String url) {
		this.url = url;
	}
    
	public String getUrl () {
		return url;
	}



}