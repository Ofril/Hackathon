package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name = "t_post_types")
public class PostType extends Model {

	// Data Members
	@Id
	@Column(name = "post_type_id")
	private int id;

	@Column(name = "post_type")
	private String typeName;

	// Ctor
	public PostType(int id, String typeName) {
		this.setId(id);
		this.setTypeName(typeName);
	}

	// Access Methods

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}