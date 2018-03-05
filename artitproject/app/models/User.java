package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name = "t_users")
public class User extends Model {

	// Data Members
	@Id
	@Column(name = "user_id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "stage_name")
	private String stageName;

	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;

	@Column(name = "birthdate")
	private Date birthdate;

	@Column(name = "description")
	private String description;

	@Column(name = "profile_picture")
	private String picture;

	@ManyToOne
	@JoinColumn(name = "artist_type")
	private ArtistType type;

	@OneToMany(mappedBy = "user", targetEntity = Post.class)
	private List<Post> posts = new ArrayList<Post>();

	// Ctor

	public User(int id, String firstName, String lastName, String stageName, String password, String email,
			Date birthdate, String description, String picture, ArtistType type) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setStageName(stageName);
		this.setPassword(password);
		this.setEmail(email);
		this.setBirthdate(birthdate);
		this.setDescription(description);
		this.setPicture(picture);
		this.setType(type);
	}

	// Accesss Methods

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public ArtistType getType() {
		return type;
	}

	public void setType(ArtistType type) {
		this.type = type;
	}
    
    public List<Post>  getPosts() {
		return posts;
	}

	public void setType(List<Post> posts) {
		this.posts = posts;
	}

}
