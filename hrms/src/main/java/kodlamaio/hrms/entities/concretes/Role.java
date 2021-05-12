package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="roles")
public class Role {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="role_name")
	private String roleName;

}
