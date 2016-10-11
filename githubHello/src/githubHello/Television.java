package githubHello;

public class Television {
	
	private int id;
	private String nom;
	private String desc;
	public Television(int id, String nom, String desc) {
		super();
		this.id = id;
		this.nom = nom;
		this.desc = desc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Television [id=" + id + ", nom=" + nom + ", desc=" + desc + "]";
	}
	
	
}
