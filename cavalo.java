package heranca;

public class cavalo extends animal{
private String correr;
	
	public cavalo(String nome, int idade,String som, String correr)
	{
		super(nome,idade,som);
		this.correr=correr;
	}
	public void info()
	{
		System.out.println("\nele corre de forma "+correr);
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	
	}
}
