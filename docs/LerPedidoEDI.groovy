import br.com.accio.acp.log.bpw.Log;
import groovy.xml.MarkupBuilder;


public class DocIn {

	String[][] docModel = [["UNB00","INICI","BGM10","DTM20","FTX44","GS02N","GS03R","GS08P","GS08 ","GS11T"],["GS25 ","GS25L","GS25P","GS25I","GS25Q","QTDE-","CODPR","PRECO","DESCP","GS28P","GS30P"],["UNS  ","MOA50"]];
	int group=0;
	String curGroup;
	String curSeg;
	Stack p = new Stack<Integer>();
	HashMap docTxt=new HashMap<String,String>();
	int i = 1;
	int j = 1;
	public int putField(String campo, String valor) {
		int erro=0;
		println "campo=$campo"
		curSeg = campo.substring(0,5);
		campo=campo.trim();
		println "curSeg=$curSeg"
		if (docModel[group].contains(curSeg)) {
			curGroup = docModel[group][0];
		} else {
			if (group<docModel.size()-1) {
				group++;
			} else if (group>0) {
				group--;
			}
			if (docModel[group].contains(curSeg)) {
				curGroup = docModel[group][0];
			} else {
				curGroup="";
				erro = 1;
				return erro;
			}
		}
		println curGroup+"[$j]"+campo
		String ret = docTxt.put(curGroup+"[$j]"+campo,valor);
		println curGroup+"[$j]"+campo + "=$valor ret=$ret"
		while (ret!=null) {
			j++;
			ret = docTxt.put(curGroup+"[$j]"+campo,valor);
			println curGroup+"[$j]"+campo + "=$valor ret=$ret"
		}
		return erro;
	}

	String getCurr(String campo) {
		curSeg = campo.padRight(5,' ').substring(0,5);
		println "get=$curSeg[$i]$campo"
		String valor=null;
		docModel.each {
			if (it.contains(curSeg)) {
				valor = docTxt.get(it[0]+"[$i]"+campo);
				println "Group:" + it[0] + "[$i]"+campo + "=$valor"
			}
		}
		println "valor=$valor"
		return valor;
		
	}
	
	String getNext(String campo) {
		String ret = this.getCurr(campo);
		println "getnext=$curSeg[$i]$campo=$ret"
		if (ret==null) {
			if (i==1) {
				if (!p.isEmpty()) { 
					i=p.pop();	
				}
			} else {
				p.push(i);
				i = 1;
			}
		} else {
			i++;
		}
		return ret;
	}
}

DocIn nf = new DocIn();
int erro = 0;
String notfistxt = docIn.getString("/serialized",null);
String[] aNotFis = notfistxt.split("\n");

aNotFis.each {
		String campo = it.substring(0,31);
		String valor = it.substring(31,it.length()-1).trim();		
		erro = nf.putField(campo,valor);
}

//	"MOA5025-86-BPRECO"(nf.getCurr("MOA5025-86-BPRECO"))


def writer = new StringWriter()
def xml = new MarkupBuilder(writer)
xml.table() {
	"BGM1004-BPRECO" (nf.getCurr("BGM1004-BPRECO"))
	"UNB0020-BPRECO"(nf.getCurr("UNB0020-BPRECO"))
	"UNB0017-BPRECO"(nf.getCurr("UNB0017-BPRECO"))
	"UNB0019-BPRECO"(nf.getCurr("UNB0019-BPRECO"))
	"DTM2005-137-BPRECO"(nf.getCurr("DTM2005-137-BPRECO"))
	"DTM2005-2-BPRECO"(nf.getCurr("DTM2005-2-BPRECO"))
	"FTX4451-TDP-DESC-BPRECO"(nf.getCurr("FTX4451-TDP-DESC-BPRECO"))
	"GS11TOD4053-BPRECO"(nf.getCurr("GS11TOD4053-BPRECO"))
	"FTX4440-ZZZ-BPRECO"(nf.getCurr("FTX4440-ZZZ-BPRECO"))
	"GS02NAD3035-BY-BPRECO"(nf.getCurr("GS02NAD3035-BY-BPRECO"))
	"GS02NAD3036-BY-BPRECO"(nf.getCurr("GS02NAD3036-BY-BPRECO"))
	"GS03RFF1153-CGC-BY-BPRECO"(nf.getCurr("GS03RFF1153-CGC-BY-BPRECO"))
	"GS03RFF1153-IE-BY-BPRECO"(nf.getCurr("GS03RFF1153-IE-BY-BPRECO"))
	"GS02NAD3042-BY-BPRECO"(nf.getCurr("GS02NAD3042-BY-BPRECO"))
	"GS02NAD3035-DP-BPRECO"(nf.getCurr("GS02NAD3035-DP-BPRECO"))
	"GS02NAD3036-DP-BPRECO"(nf.getCurr("GS02NAD3036-DP-BPRECO"))
	"GS03RFF1153-CGC-DP-BPRECO"(nf.getCurr("GS03RFF1153-CGC-DP-BPRECO"))
	"GS03RFF1153-IE-DP-BPRECO"(nf.getCurr("GS03RFF1153-IE-DP-BPRECO"))
	"GS02NAD3042-DP-BPRECO"(nf.getCurr("GS02NAD3042-DP-BPRECO"))
	"GS02NAD3035-IV-BPRECO"(nf.getCurr("GS02NAD3035-IV-BPRECO"))
	"GS02NAD3036-IV-BPRECO"(nf.getCurr("GS02NAD3036-IV-BPRECO"))
	"GS03RFF1153-CGC-IV-BPRECO"(nf.getCurr("GS03RFF1153-CGC-IV-BPRECO"))
	"GS03RFF1153-IE-IV-BPRECO"(nf.getCurr("GS03RFF1153-IE-IV-BPRECO"))
	"GS02NAD3042-IV-BPRECO"(nf.getCurr("GS02NAD3042-IV-BPRECO"))
	"GS02NAD3035-SU-BPRECO"(nf.getCurr("GS02NAD3035-SU-BPRECO"))
	"GS02NAD3036-SU-BPRECO"(nf.getCurr("GS02NAD3036-SU-BPRECO"))
	"GS03RFF1153-CGC-SU-BPRECO"(nf.getCurr("GS03RFF1153-CGC-SU-BPRECO"))
	"GS03RFF1153-IE-SU-BPRECO"(nf.getCurr("GS03RFF1153-IE-SU-BPRECO"))
	"GS02NAD3042-SU-BPRECO"(nf.getCurr("GS02NAD3042-SU-BPRECO"))
	
	"GS08"{
		"GS08PAT4279-BPRECO"(nf.getCurr("GS08PAT4279-BPRECO"))
		"GS08PAT4279-DESC-BPRECO"(nf.getCurr("GS08PAT4279-DESC-BPRECO"))
		"GS08PAT2009-BPRECO"(nf.getCurr("GS08PAT2009-BPRECO"))
		"GS08PAT2009-DESC-BPRECO"(nf.getCurr("GS08PAT2009-DESC-BPRECO"))
		"GS08PAT2475-BPRECO"(nf.getCurr("GS08PAT2475-BPRECO"))
		"GS08PAT2475-DESC-BPRECO"(nf.getCurr("GS08PAT2475-DESC-BPRECO"))
		"GS08PAT2151-BPRECO"(nf.getCurr("GS08PAT2151-BPRECO")) 
		"GS08PAT2151-DESC-BPRECO"(nf.getCurr("GS08PAT2151-DESC-BPRECO")) 
		"GS08PAT2152-BPRECO"(nf.getCurr("GS08PAT2152-BPRECO"))
		"GS08DTM2005-13-BPRECO"(nf.getCurr("GS08DTM2005-13-BPRECO"))
		"GS08PCD5245-12-BPRECO"(nf.getCurr("GS08PCD5245-12-BPRECO"))
	}
	for (;nf.getCurr("GS25")!=null;nf.getNext("GS25")) {
	
		"GS25"{
			"GS25LIN1082-BPRECO" (nf.getCurr("GS25LIN1082-BPRECO"))
			"GS25PIA7140-SA-BPRECO" (nf.getCurr("GS25PIA7140-SA-BPRECO"))
			"GS25LIN7140-BPRECO" (nf.getCurr("GS25LIN7140-BPRECO"))
			"GS25IMD7008-BPRECO" (nf.getCurr("GS25IMD7008-BPRECO"))
			"GS25QTY6063-21-BPRECO" (nf.getCurr("GS25QTY6063-21-BPRECO"))
			"GS25QTY6063-15E-BPRECO" (nf.getCurr("GS25QTY6063-15E-BPRECO"))
			"GS30PAC7065-BPRECO" (nf.getCurr("GS30PAC7065-BPRECO"))
			"GS25QTY6063-59-BPRECO" (nf.getCurr("GS25QTY6063-59-BPRECO"))
			"GS28PRI5125-BRG-BPRECO" (nf.getCurr("GS28PRI5125-BRG-BPRECO"))
			"GS41PCD5245-3-BPRECO" (nf.getCurr("GS41PCD5245-3-BPRECO"))
			"GS28PRI5125-BRN-BPRECO" (nf.getCurr("GS28PRI5125-BRN-BPRECO"))
			"GS34TAX5278-IPI-BPRECO" (nf.getCurr("GS34TAX5278-IPI-BPRECO"))
			
			"GS33"{ 
				"GS33LOC3225-BPRECO" (nf.getCurr("GS33LOC3225-BPRECO"))
				"GS33LOC3225-DESC-BPRECO" (nf.getCurr("GS33LOC3225-DESC-BPRECO"))
				"GS33QTY6063-11-BPRECO" (nf.getCurr("GS33QTY6063-11-BPRECO"))
			} 
		}
	}
}

saida = writer.toString()

println "saida=[$saida]"

return saida;
