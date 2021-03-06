package co.simplon.esportdata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Joueur extends Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Permet de faire l'auto_increment
	private long playerID;
	@NotBlank
	private String country;
	@NotBlank
	private String prizeList;
	@NotNull
	private double salary;

	public long getPlayerID() {
		return playerID;
	}

	public void setPlayerID(long playerID) {
		this.playerID = playerID;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPrizeList() {
		return prizeList;
	}

	public void setPrizeList(String prizeList) {
		this.prizeList = prizeList;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
