/*
 * Esse é um arquivo Java principal (main) que testa a conexão com o banco de dados MySQL.
 * Ele faz parte do pacote 'conectando'.
 */

package conectando;

// Importa a classe 'Conexao' de outro pacote, que é responsável por criar a conexão com o banco
import controller.Conexao;

// Importa a classe Connection, que representa a conexão com o banco de dados
import java.sql.Connection;

public class Conectando {
    public static void main(String[] args) {

        // Aqui, chamamos o método 'conectar()' da classe Conexao e armazenamos a conexão retornada
        Connection conexao = Conexao.conectar();

        // Verifica se a conexão foi bem-sucedida
        if (conexao != null) {
            // Se a conexão estiver funcionando, imprime uma mensagem de sucesso
            System.out.println("👍 Conexão disponível para uso.");
        } else {
            // Se a conexão falhar, imprime uma mensagem de erro
            System.out.println("⚠️ Falha ao conectar, revise os dados.");
        }

    }

}
