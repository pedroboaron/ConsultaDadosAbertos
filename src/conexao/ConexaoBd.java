package conexao;

import java.sql.Connection;

import java.sql.DriverManager;
 
import java.sql.SQLException;

public class ConexaoBd {
    static Connection con = null;    
     public static String status = "Não conectou...";
  
    public ConexaoBd() {
    }
 
//Método de Conexão//
 
public static Connection getConexao() {
      //atributo do tipo Connection
try {
// Carregando o JDBC Driver padrão
String driverName = "org.postgresql.Driver";                        
Class.forName(driverName);
// Configurando a nossa conexão com um banco de dados//

            String serverName = "localhost:5432";    //caminho do servidor do BD
            String mydatabase ="dados_abertos";        //nome do seu banco de dados
            String url = "jdbc:postgresql://" + serverName + "/" + mydatabase;
            String username = "postgres";        //nome de um usuário de seu BD      
            String password = "admin";      //sua senha de acesso

            con = DriverManager.getConnection(url, username, password);
            //Testa sua conexão//  
            if (con != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            return con;
        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {
        	//Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
    }
 
    //Método que retorna o status da sua conexão//
    public static String statusConection() {
        return status;
    }
 
   //Método que fecha sua conexão//
	public static boolean FecharConexao() {
		try {
			ConexaoBd.getConexao().close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
 
   //Método que reinicia sua conexão//
    public static java.sql.Connection ReiniciarConexao() {
        FecharConexao();
        return ConexaoBd.getConexao();
    }
}
