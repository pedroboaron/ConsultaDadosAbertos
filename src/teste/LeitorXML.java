package teste;

import java.io.Reader;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class LeitorXML {
	 
	   public List<Negocio> carrega(Reader fonte) {
	     XStream stream = new XStream(new DomDriver());
	     stream.alias("negocio", Negocio.class);
	     return (List<Negocio>) stream.fromXML(fonte);
	   }
	   public boolean lerArq (String path) {
		   /*
		    * acha o arquivo
		    * vertifica se alguma vez ja foi lido para a base 
		    * se ja retorna dizendo que esta pronto para consulta
		    * senao le
		    * 
		    * */
		   
		   
		   /*usar lista onde a cabeça e a tabela 
		    * os osutros itens sao sequencialmente a tag e o valor associado
		    * passar a lista para o metodo q faz insert na base */
		   return true;
	   }
	 }
