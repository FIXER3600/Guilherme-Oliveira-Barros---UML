
public class SecretariaAgencia extends Secretaria {
	private int cod_agencia;
	private float bonifica��o;
	public int getCod_agencia() {
		return cod_agencia;
	}
	public void setCod_agencia(int cod_agencia) {
		this.cod_agencia = cod_agencia;
	}
	public float getBonifica��o() {
		return bonifica��o;
	}
	public void setBonifica��o(float bonifica��o) {
		this.bonifica��o = bonifica��o;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	private String tipo;
}
