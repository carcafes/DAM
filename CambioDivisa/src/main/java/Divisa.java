
public class Divisa {
	String Nombre;
	Double Valor;
	public Divisa(String nombre,Double valor) {
		Nombre=nombre;
		Valor=valor;
	}
	public String getNombre() {
		return Nombre;
	}
	public Double getValor() {
		return Valor;
	}
	public void setValor(Double valor) {
		Valor = valor;
	}
	
}
