package animal;

public class Executavel {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro ("Theo ");
		c.imprime();
		
		Gato g = new Gato ("Lui ");
		g.imprime();
		
		Passaro p = new Passaro ("Bicudo ");
		p.imprime();
		
		g.metodoDoGato();
		p.metodoDoPassaro();

	}

}
