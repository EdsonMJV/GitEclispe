package classes;

public class ClienteOracleImpl implements ClienteDAO {

	
	public Integer recuperarIdSequence() {
		return 123;
	}

	@Override
	public Integer incluir(Empresa empresa) {
		return recuperarIdSequence();
	}
	
}
