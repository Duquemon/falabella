package cl.jafa.app.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import cl.jafa.app.model.core.BaseEntity;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Column(unique = true, length = 20)
	private String username;

	@Column(length = 60)
	private String password;

	private Boolean enabled;
	private String name;
	private String lastname;

	@Column(unique = true, length = 100)
	private String email;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "users_role", joinColumns = @JoinColumn(name = "user_id"), 
	inverseJoinColumns = @JoinColumn(name = "role_id"), 
	uniqueConstraints = {@UniqueConstraint(columnNames = { "user_id", "role_id" }) })
	private List<Role> roles;
	//constraint fails (`test`.`users_role`, CONSTRAINT `FK3qjq7qsiigxa82jgk0i0wuq3g` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`))

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	

}
