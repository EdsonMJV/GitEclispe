package classes;

public class ClienteOracleImpl implements ClienteDAO {

	private String teste;
	
	public Integer recuperarIdSequence() {
		return 000;
	}

	@Override
	public Integer incluir(Empresa empresa) {
		return recuperarIdSequence();
	}
	
}
