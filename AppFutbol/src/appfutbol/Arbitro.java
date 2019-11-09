package appfutbol;
import java.util.*;
import java.io.*;



public class Arbitro extends Personas implements Serializable{
	int id;
	String nombre;
	String email;
	String tlf;
	private String tipo;
	Arbitro(int aid, String anombre, String aemail, String atlf,String atipo){
		super(aid, anombre,aemail,atlf);
		nombre=anombre;
		email=aemail;
		tlf=atlf;
		id=aid;
		tipo=atipo;
	}

public String getTipo() {
	String tip=tipo;
	return tip;
}
public String toString() {
	return "| Tipo de Arbitro: "+tipo+"| Id:  "+id+"| Nombre: "+nombre+"| Email:  "+email+"| Telefono: "+tlf;
}
}
