package proj.example.RegisterAndLogin;

public class DTO {

    private int id;
    private String name;
    private String email;
    private String password;

    public DTO() {
    }

    public DTO(int id, String name, String email, String password) {
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    

} //create getters and setters
