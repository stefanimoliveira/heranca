package heranca;

public class preguica extends animal{
	private String subirArvore;
	
	public preguica(String nome, int idade,String som, String subirArvore)
	{
		super(nome,idade,som);
		this.subirArvore=subirArvore;
	}
	public void info()
	{
		System.out.println("\nela sobe na arvore"+subirArvore);
	}
	public String getsubirArvore() {
		return subirArvore;
	}
	public void setCorrer(String subirArvore) {
		this.subirArvore = subirArvore;
	}
}
