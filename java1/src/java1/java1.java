package java1;

import javax.swing.JOptionPane;
public class java1 {
	
	public static void main(String[] args) {
		
		/* caixa de dialogo */
		String carros = JOptionPane.showInputDialog("Informe a qtd de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a qtd de pessoas");
		
		/* convertendo de String para Double */ 
		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		/* convertendo double para inteiro */ 
		int divisao = (int) (carroNumero / pessoasNumero);
		
		double resto = carroNumero % pessoasNumero; 
		
		/*caixa de confirmação */
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisao?");
		
		if (resposta == 0 ) {
			JOptionPane.showMessageDialog(null, "Divisao de pessoas deu "+ divisao);		
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado do resto?");
		if (resposta == 0 ) {
			JOptionPane.showMessageDialog(null, "Resto deu "+ resto);		
		}
		
		
		JOptionPane.showMessageDialog(null, "Divisao de pessoas deu "+ divisao + " carros e sobrou  " + resto + " carros");
		
		double nota1 = 10;
		double nota2 = 32;
		double media = (nota1+nota2)/2;
		
		System.out.println("media = "+media);
		
		String resultado = media>= 70 ? "aprovado" : "Reprovado";
		System.out.println("Resultado = "+resultado); 
		
		if (media >=20) {
			if (media >=25) {
				System.out.println("aprovado");	
			} else {
				System.out.println("Resultado = Recuperaçao");
				
			}
		}
		
		
	} 
		
		
		
		
	

}
