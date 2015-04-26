import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pratica31 {
        private static String meuNome = "Gustavo Pereira Morais";
        private static Date inicio, fim;
        private static GregorianCalendar dataNascimento = new GregorianCalendar(1997, Calendar.JANUARY, 27);
        
        public static void main(String[] args){
                
           //Inicializando a data de inicio da variável inicio
           Date inicio = new Date();
           
           //Exibindo a string meuNome
           System.out.println(meuNome.toUpperCase());
           
           //Exibindo as iniciais da string meuNome armazenadas na string minhasIniciais
           System.out.println(meuNome.toUpperCase().substring(16, 17) + meuNome.toLowerCase().substring(17, 22) + ", " + meuNome.toUpperCase().substring(0, 1) + ". " + meuNome.toUpperCase().substring(8, 9) + ".");
            
           //Exibindo a quantidade de dias entre a data da variável dataNascimento e a atual
           System.out.println( (inicio.getTime() - dataNascimento.getTime().getTime() )/86400000);
           
           //Inicializando a data de inicio da variável fim
           Date fim = new Date();
           
           long milisegundos = fim.getTime() - inicio.getTime() ;
                   
           //Exibindo a quantidade de milisegundos passados desde o inicio da execução até o fim
           System.out.println(milisegundos);
    }
        
}
