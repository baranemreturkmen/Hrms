package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="members")
public class Member {
		
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="citizenship_number")
	private String citizenshipNumber;
	
	@Column(name="birth_date")
	private String birthDate;
	
	@Column(name="role_id")
	private int roleId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="position_id")
	private int positionId;

}
