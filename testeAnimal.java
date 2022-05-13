package heranca;

public class testeAnimal {

	public static void main(String[] args) {
		cachorro pet= new cachorro("bob",5,"auau","perfeita");
		pet.imprimir();
		pet.info();
		
		cavalo horse = new cavalo("tornado",3,"relicha","veloz");
		horse.imprimir();
		horse.info();
		
		preguica preguica=new preguica("bela",4,"aaaa","lentamente");
		preguica.imprimir();
		horse.info();
	}

}
