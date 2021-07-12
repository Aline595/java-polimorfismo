public class Gerente extends Funcionario { // extends define a herança 

	private int senha;
	
	@Override
	public double getBonificacao() {
	    return super.getBonificacao() + super.getSalario(); // super diz que o metodo ou atributo é da classe pai da herança
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}