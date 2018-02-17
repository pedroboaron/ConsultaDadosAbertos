package conexao;

import java.sql.Connection;

import java.sql.DriverManager;
 
import java.sql.SQLException;

public class ConexaoBd {
    static Connection con = null;    
     public static String status = "N�o conectou...";
  
    public ConexaoBd() {
    }
 
//M�todo de Conex�o//
 
public static Connection getConexao() {
      //atributo do tipo Connection
try {
// Carregando o JDBC Driver padr�o
String driverName = "org.postgresql.Driver";                        
Class.forName(driverName);
// Configurando a nossa conex�o com um banco de dados//

            String serverName = "localhost:5432";    //caminho do servidor do BD
            String mydatabase ="dados_abertos";        //nome do seu banco de dados
            String url = "jdbc:postgresql://" + serverName + "/" + mydatabase;
            String username = "postgres";        //nome de um usu�rio de seu BD      
            String password = "admin";      //sua senha de acesso

            con = DriverManager.getConnection(url, username, password);
            //Testa sua conex�o//  
            if (con != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->N�o foi possivel realizar conex�o");
            }
            return con;
        } catch (ClassNotFoundException e) {  //Driver n�o encontrado
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {
        	//N�o conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
    }
 
    //M�todo que retorna o status da sua conex�o//
    public static String statusConection() {
        return status;
    }
 
   //M�todo que fecha sua conex�o//
	public static boolean FecharConexao() {
		try {
			ConexaoBd.getConexao().close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
 
   //M�todo que reinicia sua conex�o//
    public static java.sql.Connection ReiniciarConexao() {
        FecharConexao();
        return ConexaoBd.getConexao();
    }
}
