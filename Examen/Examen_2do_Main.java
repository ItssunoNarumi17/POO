public class Main{
        public static void main(String[] args){
            
            Institucion uaeh = new Institucion("UAEH", "Universidad Autónoma del Estado de Hidalgo", "Pachuca");

            Institucion ipn = new Institucion("IPN", "Instituto Politécnico Nacional", "Ciudad de México");

            Participante p1 = new Ponente("101", "Ana Torres", "ana@congreso.mx", uaeh, "Inteligencia Artificial");

            Participante p2 = new Ponente("102", "Carlos Vega", "carlos@congreso.mx", ipn, "Ciberseguridad");
            
            Participante p3 = new Asistente("201", "María López", "maria@congreso.mx", uaeh, true);

            Participante p4 = new Asistente("202", "José Ramírez", "jose@congreso.mx", ipn, false);

            Participante[] participantes = {p1, p2, p3, p4};
                for (Participante participante : participantes) {
                    System.out.println("-------------------------------");
                    participante.mostrarDatos();
                    
                    System.out.printf("Cuota: $%.2f\n", participante.calcularCuota());
                }

                System.out.println("-------------------------------");

                System.out.println("Total de participantes: " + Participante.getContadorParticipantes());
        }
}
