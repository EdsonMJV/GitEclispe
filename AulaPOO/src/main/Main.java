package main;

import java.util.ArrayList;
import java.util.List;

import classes.Empresa;

public class Main {

	public static void main(String[] args) {

		
		Empresa empr1 = new Empresa();
		Empresa emp2 = new Empresa();
		Empresa emp3 = new Empresa();
		emp3.setNome("Empresa 3");
		
		Empresa emp4 = new Empresa();
		Empresa emp5 = new Empresa();
		
		List<Empresa> empresas = new ArrayList<>();
		
		empresas.add(empr1);
		empresas.add(emp2);
		empresas.add(emp3);
		empresas.add(emp4);
		empresas.add(emp5);
		
		int count = 0;
		
		for(Empresa emp : empresas) {
			System.out.println("Teste mostrando conflito");
		}
		
		
		for(int aux = 0; aux < empresas.size(); aux++) {
			Empresa emp = empresas.get(aux);
			
			if("Empresa 3".equals(emp.getNome())) {
				empresas.add(aux+1, new Empresa());
			}
			
		}
		
		
		
		while(empresas.size() < count) {
			Empresa emp = empresas.get(count);
			
			if(!"Empresa 3".equals(emp.getNome())) {
				count++;
				continue;
			}
			
			count++;
		}
		
		
		//....
		
	}

}
