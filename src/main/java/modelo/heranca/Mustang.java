package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Esportivo")
public class Mustang extends Carro {
	

	private String motor;
	
	public Mustang() {
	
	}

	public Mustang(String modelo, String ano, String marca, String motor) {
		super(modelo, ano, marca);
		this.motor = motor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	
	
	
	

}
