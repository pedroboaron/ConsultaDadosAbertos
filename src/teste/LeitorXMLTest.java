package teste;

import java.io.StringReader;
import java.util.List;

import org.junit.jupiter.api.Test;

class LeitorXMLTest {

//	@Test
	public static void carregaXmlComUmNegocioEmListaUnitaria() {
		String xmlDeTeste = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"\r\n" + 
				"<orgao nome=\"Câmara dos Deputados\">\r\n" + 
				"  <DESPESAS>\r\n" + 
				"    <DESPESA>\r\n" + 
				"      <txNomeParlamentar>ABEL MESQUITA JR.</txNomeParlamentar>\r\n" + 
				"      <idecadastro>178957</idecadastro>\r\n" + 
				"      <nuCarteiraParlamentar>1</nuCarteiraParlamentar>\r\n" + 
				"      <nuLegislatura>2015</nuLegislatura>\r\n" + 
				"      <sgUF>RR</sgUF>\r\n" + 
				"      <sgPartido>DEM</sgPartido>\r\n" + 
				"      <codLegislatura>55</codLegislatura>\r\n" + 
				"      <numSubCota>1</numSubCota>\r\n" + 
				"      <txtDescricao>MANUTENÇÃO DE ESCRITÓRIO DE APOIO À ATIVIDADE PARLAMENTAR</txtDescricao>\r\n" + 
				"      <numEspecificacaoSubCota>0</numEspecificacaoSubCota>\r\n" + 
				"      <txtDescricaoEspecificacao></txtDescricaoEspecificacao>\r\n" + 
				"      <txtFornecedor>WM PAPELARIA E ESCRITÓRIO</txtFornecedor>\r\n" + 
				"      <txtCNPJCPF>12132854000100</txtCNPJCPF>\r\n" + 
				"      <txtNumero>3592</txtNumero>\r\n" + 
				"      <indTipoDocumento>0</indTipoDocumento>\r\n" + 
				"      <datEmissao>2017-04-26 00:00:00</datEmissao>\r\n" + 
				"      <vlrDocumento>296</vlrDocumento>\r\n" + 
				"      <vlrGlosa>0</vlrGlosa>\r\n" + 
				"      <vlrLiquido>296</vlrLiquido>\r\n" + 
				"      <numMes>4</numMes>\r\n" + 
				"      <numAno>2017</numAno>\r\n" + 
				"      <numParcela>0</numParcela>\r\n" + 
				"      <numLote>1377952</numLote>\r\n" + 
				"      <numRessarcimento>5828</numRessarcimento>\r\n" + 
				"      <vlrRestituicao>0</vlrRestituicao>\r\n" + 
				"      <nuDeputadoId>3074</nuDeputadoId>\r\n" + 
				"      <ideDocumento>6266962</ideDocumento>\r\n" + 
				"    </DESPESA>\r\n" + 
				"  </DESPESAS>\r\n"+
				"</orgao>";
				
	  LeitorXML leitor = new LeitorXML();
	  List<Negocio> negocios = leitor.carrega(new StringReader(xmlDeTeste));
	  System.out.println(negocios);
	}
	public static void main(String[] args) {
		carregaXmlComUmNegocioEmListaUnitaria();
		
	}
}
