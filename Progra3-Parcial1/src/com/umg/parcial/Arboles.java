package com.umg.parcial;
import java.util.Scanner;

public class Arboles {
	public static void main (String[] args) {
		Scanner In = new Scanner(System.in);
		ArbolBinario bt = new ArbolBinario();
		
		int opcion = 0;
		System.out.println("1. MOSTRAR");
		System.out.println("2. GUARDAR");
		System.out.println("0. SALIR");
		do {
			System.out.println("INGRESE OPCION");
			opcion = In.nextInt();
			if (opcion == 1) {
				//Invocar m�todo mostrar
				bt.mostrar();
			}else if (opcion == 2) {
				//Invocar m�todo mostrar
				bt.agregar(In);
			}
			
		}while(opcion>0);
		System.out.println("FIN");
		
	}

}

class ArbolBinario {
	Nodo raiz;
	
	public ArbolBinario() {
		Nodo nodo2 = new Nodo(2,null,null);
		Nodo nodo5 = new Nodo(5,null,null);
		Nodo nodo4 = new Nodo(4,nodo2,nodo5);
		Nodo nodo9 = new Nodo(9,null,null);
		Nodo nodo7 = new Nodo(7,null,null);
		Nodo nodo8 = new Nodo(8,nodo7,nodo9);
		raiz = new Nodo(6,nodo4,nodo8);
	}

	
	public void agregar(Scanner In) {
		System.out.println("INGRESE VALOR");
		int valor = In.nextInt();
		//escriba codigo para ingresar
		raiz.Add(valor);
	}
	
	
	//Recorrido InOrden
	public void InOrden(Nodo nodo) {
			if (nodo != null) {
				InOrden(nodo.getIzq());
				System.out.println( nodo.value);
				InOrden(nodo.getDer());
			}
		}
	
	public void mostrar() {
		//escriba codigo para mostrar
		if(raiz == null) {
			}else {
				InOrden(raiz);		
			}
	  }
}

class Nodo{
	//NO MODIFICAR
	int value;
	private Nodo izq;
	private Nodo der;
	public Nodo(int value, Nodo izq, Nodo der) {
		this.value = value;
		this.izq = izq;
		this.der = der;
	}
	public Nodo(int value) {
		System.out.println("guardar "+value);
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Nodo getIzq() {		
		return izq;
	}
	public void setIzq(Nodo izq) {
		this.izq = izq;
	}
	public Nodo getDer() {
		
		return der;
	}
	public void setDer(Nodo der) {		
		this.der = der;
	}
	
	//Insertar un elemento
	public void Add (int text){
			if(text < value){
				if (izq == null)
					izq = new Nodo(text);
				else
					izq.Add(text);
			}
			else{
				if (text > value){
					if (der == null)
						der = new Nodo(text);
					else
						der.Add(text);
				}
			}
	  }
}

