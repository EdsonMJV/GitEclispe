package classes;

public class ClienteOracleImpl implements ClienteDAO {

	private String teste;
	
	public Integer recuperarIdSequence() {
		return 333;
	}

	@Override
	public Integer incluir(Empresa empresa) {
		return recuperarIdSequence();
	}
	
}
