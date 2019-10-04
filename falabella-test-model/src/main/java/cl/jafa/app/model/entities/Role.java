package cl.jafa.app.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cl.jafa.app.model.core.BaseEntity;

@Entity
@Table(name = "role")
public class Role extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Column(unique = true, length = 30)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
