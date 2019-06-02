
public class SecretariaAgencia extends Secretaria {
	private int cod_agencia;
	private float bonificação;
	public int getCod_agencia() {
		return cod_agencia;
	}
	public void setCod_agencia(int cod_agencia) {
		this.cod_agencia = cod_agencia;
	}
	public float getBonificação() {
		return bonificação;
	}
	public void setBonificação(float bonificação) {
		this.bonificação = bonificação;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	private String tipo;
}
