package teste;

public class SomarDoisNumeros
{
	public static void main (String [] args) 
	{
		/* 
		 Primeiro fiz uma int x que seria a int de leitura
		*/
		int x = MyIO.readInt("Insira um numero: ");
		/*
		 Depois criei uma int z para ser o resultado
		 */
		int z = 0;
		z += x;
		/*
		Depois de somar x em z,redefino x e mostro o resultado 
		*/
		x = MyIO.readInt("Insira um outro numero: ");
		System.out.println("Resultado da soma: " + (z + x));
	}

}
