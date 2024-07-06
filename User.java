package CashModel;


import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class User {

	
	  public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	   // @NonNull(firstName = "First Name is mandatory")
	    private String firstName;

	//    @NotBlank(message = "Last Name is mandatory")
	    private String lastName;

	//    @NotBlank(message = "Email is mandatory")
	//    @Email(message = "Email should be valid")
	    @Column(unique = true)
	    private String email;

	  //  @NotBlank(message = "Mobile is mandatory")
	//    @Pattern(regexp = "^\\d{10}$", message = "Mobile should be a valid 10-digit number")
	    private String mobile;

	//    @NotBlank(message = "Username is mandatory")
	    private String username;

	  //  @NotBlank(message = "Password is mandatory")
	    private String password;

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
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

		public String getEmail() {
			// TODO Auto-generated method stub
			return null;
		}
	

}
