package edu.yan.controlefluxo.exemplos;

public class PlanoOperadora {
	public static void main(String[] args) {
		//exemplo ideal para usar switchcase
		
				String plano = "M";
				
				switch (plano) {
					case "T": {
						System.out.println("5Gb Youtube");
					}
				
					case "M": {
						System.out.println("Whatsapp e Instagram ilimitado");
					}
					
					case "B": {
						System.out.println("100 minutos de ligação ilimitada");
					}
				default:
					throw new IllegalArgumentException("Unexpected value: " + plano);
				}
	}
}
