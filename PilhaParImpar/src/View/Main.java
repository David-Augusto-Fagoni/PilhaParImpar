package View;

import Controller.Pilha;
import PilhaInt.PilhaI;

public class Main {

	public static void main(String[] args) {
		PilhaI PilhaA = new PilhaI();
		PilhaI PilhaB = new PilhaI();
		PilhaI PilhaC = new PilhaI();
		Pilha P = new Pilha();
		P.NumPilha(PilhaA);
		
		while (PilhaA.size() != 0) {
			try {
				if (PilhaA.top() % 2 == 0) {
					PilhaC.push(PilhaA.pop());
				}else {
					PilhaB.push(PilhaA.pop());
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			for (int J=0; J<PilhaC.size()+J;J++) {
				PilhaA.push(PilhaC.pop());
			}
			System.out.println("Os valores Pares são:");
			for (int J=0; J<PilhaA.size()+J;J++) {
				System.out.println(PilhaA.pop());
			}
			System.out.println("Os valores Impares são:");
			for (int J=0; J<PilhaB.size()+J;J++) {
				System.out.println(PilhaB.pop());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
