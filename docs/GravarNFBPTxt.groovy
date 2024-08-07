import br.com.accio.acp.log.bpw.Log;

import br.com.accio.bpm.mdl.util.HibernateUtil;
import br.com.accio.bpm.mdl.hbm.PROCESS_USER;
import javax.transaction.UserTransaction;

import org.hibernate.Hibernate;
import org.hibernate.Session;

String getNickName(String caixa) {
	String ret=""
	try {
		Session session = null;
		UserTransaction utx = null;

		utx = HibernateUtil.userTransaction();
		session = HibernateUtil.getSession();
		PROCESS_USER process_user = session.get(PROCESS_USER.class, caixa);
		if (process_user != null) {
			ret=process_user.getEMAIL();
		}
		utx.commit();
	} catch ( Throwable e ) {
		Log.error( e.getMessage() );
	}
	return ret
}


public class Txt {
	StringBuffer txtBuff=new StringBuffer();
	public void linha(String campo, String valor) {
		txtBuff.append(campo.padRight(32));
		txtBuff.append(valor.padRight(100));
		txtBuff.append("\n");
	}
	String toString() {
		"<txt><msg>" + txtBuff.toString() + "</msg></txt>";
	}
}


txt = new Txt();

for (Iterator unb = docIn.forEachNode("/table");docIn.hasNext();) {
	
	txt.linha("UNB0004",getNickName(sender));
	txt.linha("UNB0010",getNickName(receiver));

	txt.linha("INICIO","");
	txt.linha("BGM1004-BPRECO",docIn.getString("BGM1004-BPRECO"));
	txt.linha("BGM1004-SERIE-BPRECO",docIn.getString("BGM1004-SERIE-BPRECO"));
	txt.linha("DTM2005-137-BPRECO",docIn.getString("DTM2005-137-BPRECO"));
	txt.linha("GS01RFF1153-ON-BPRECO",docIn.getString("GS01RFF1153-ON-BPRECO"));
	txt.linha("GS01RFF1153-CNO-BPRECO",docIn.getString("GS01RFF1153-CNO-BPRECO"));
	txt.linha("GS01RFF1153-CNO-DESC-BPRECO",docIn.getString("GS01RFF1153-CNO-DESC-BPRECO"));
	txt.linha("GS02NAD3035-BY-BPRECO",docIn.getString("GS02NAD3035-BY-BPRECO"));
	txt.linha("GS02NAD3036-BY-BPRECO",docIn.getString("GS02NAD3036-BY-BPRECO"));
	txt.linha("GS02NAD3035-DP-BPRECO",docIn.getString("GS02NAD3035-DP-BPRECO"));
	txt.linha("GS02NAD3036-DP-BPRECO",docIn.getString("GS02NAD3036-DP-BPRECO"));
	txt.linha("GS02NAD3035-SU-BPRECO",docIn.getString("GS02NAD3035-SU-BPRECO"));
	txt.linha("GS02NAD3036-SU-BPRECO",docIn.getString("GS02NAD3036-SU-BPRECO"));
	txt.linha("GS02NAD3035-II-BPRECO",docIn.getString("GS02NAD3035-II-BPRECO"));
	txt.linha("GS02NAD3036-II-BPRECO",docIn.getString("GS02NAD3036-II-BPRECO"));
	txt.linha("GS12TOD4053-BPRECO",docIn.getString("GS12TOD4053-BPRECO"));

	
	
	txt.linha("GS18PCD5245-1-TD-BPRECO",docIn.getString("GS18PCD5245-1-TD-BPRECO"));
	txt.linha("GS19MOA5025-8-TD-BPRECO",docIn.getString("GS19MOA5025-8-TD-BPRECO"));
	txt.linha("GS18PCD5245-1-OTE-BPRECO",docIn.getString("GS18PCD5245-1-OTE-BPRECO"));
	txt.linha("GS19MOA5025-8-OTE1-BPRECO",docIn.getString("GS19MOA5025-8-OTE1-BPRECO"));
	txt.linha("GS18PCD5245-2-FC-BPRECO",docIn.getString("GS18PCD5245-2-FC-BPRECO"));
	txt.linha("GS19MOA5025-8-FC-BPRECO",docIn.getString("GS19MOA5025-8-FC-BPRECO"));
	txt.linha("GS18PCD5245-2-PC-BPRECO",docIn.getString("GS18PCD5245-2-PC-BPRECO"));
	txt.linha("GS19MOA5025-8-PC-BPRECO",docIn.getString("GS19MOA5025-8-PC-BPRECO"));
	txt.linha("GS18PCD5245-2-IN-BPRECO",docIn.getString("GS18PCD5245-2-IN-BPRECO"));
	txt.linha("GS19MOA5025-8-IN-BPRECO",docIn.getString("GS19MOA5025-8-IN-BPRECO"));
	txt.linha("GS18PCD5245-2-OTE-BPRECO",docIn.getString("GS18PCD5245-2-OTE-BPRECO"));
	txt.linha("GS19MOA5025-8-OTE2-BPRECO",docIn.getString("GS19MOA5025-8-OTE2-BPRECO"));

		
	int i=1;
	for (Iterator gs25 = docIn.forEachNode("GS25");docIn.hasNext();) {
		txt.linha("GS25","$i".padLeft(5,'0'));
		i++;
		txt.linha("GS25LIN7140-BPRECO",docIn.getString("GS25LIN7140-BPRECO"));
		txt.linha("GS25IMD7008-BPRECO",docIn.getString("GS25IMD7008-BPRECO"));
		txt.linha("GS25QTY6063-47-BPRECO",docIn.getString("GS25QTY6063-47-BPRECO"));
		txt.linha("GS25QTY6063-15E-BPRECO",docIn.getString("GS25QTY6063-15E-BPRECO"));
		txt.linha("GS28PRI5125-BRG-BPRECO",docIn.getString("GS28PRI5125-BRG-BPRECO"));
		txt.linha("GS28PRI5125-BRN-BPRECO",docIn.getString("GS28PRI5125-BRN-BPRECO"));
		txt.linha("GS29RFF1153-ON-BPRECO",docIn.getString("GS29RFF1153-ON-BPRECO"));
		txt.linha("GS33TAX5278-IPI-BPRECO",docIn.getString("GS33TAX5278-IPI-BPRECO"));
		txt.linha("GS33MOA5025-124-IPI-BPRECO",docIn.getString("GS33MOA5025-124-IPI-BPRECO"));
		txt.linha("GS33TAX5278-ICM-BPRECO",docIn.getString("GS33TAX5278-ICM-BPRECO"));
		txt.linha("GS33MOA5025-124-ICM-BPRECO",docIn.getString("GS33MOA5025-124-ICM-BPRECO"));

		txt.linha("GS40PCD5245-1-TD-BPRECO",docIn.getString("GS40PCD5245-1-TD-BPRECO"));
		txt.linha("GS41MOA5025-204-TD-BPRECO",docIn.getString("GS40PCD5245-1-DI-BPRECO"));
		txt.linha("GS40PCD5245-1-DI-BPRECO",docIn.getString("GS40PCD5245-1-DI-BPRECO"));
		txt.linha("GS41MOA5025-204-DI-BPRECO",docIn.getString("GS41MOA5025-204-DI-BPRECO"));
		
		txt.linha("GS40PCD5245-2-PC-BPRECO",docIn.getString("GS40PCD5245-2-PC-BPRECO"));
		txt.linha("GS41MOA5025-23-PC-BPRECO",docIn.getString("GS41MOA5025-23-PC-BPRECO"));

		txt.linha("SUBTOTAL-MOA260-BPRECO",docIn.getString("SUBTOTAL-MOA260-BPRECO"));
		txt.linha("SUBTOTAL-MOA39-BPRECO",docIn.getString("SUBTOTAL-MOA39-BPRECO"));
		txt.linha("SUBTOTAL-MOA79-BPRECO",docIn.getString("SUBTOTAL-MOA79-BPRECO"));
		
		txt.linha("SUBTOTAL-DESC-DI-BPRECO",docIn.getString("SUBTOTAL-DESC-DI-BPRECO"));
		txt.linha("SUBTOTAL-IPI-BPRECO",docIn.getString("SUBTOTAL-IPI-BPRECO"));
	}
	
	txt.linha("CNT6069-7-BPRECO",docIn.getString("CNT6069-7-BPRECO"));
	txt.linha("GS48MOA5025-79-BPRECO",docIn.getString("GS48MOA5025-79-BPRECO"));
	txt.linha("GS48MOA5025-39-BPRECO",docIn.getString("GS48MOA5025-39-BPRECO"));
	txt.linha("GS50TAX5286-ICM-BPRECO",docIn.getString("GS50TAX5286-ICM-BPRECO"));
	txt.linha("GS50MOA5025-176-ICM-BPRECO",docIn.getString("GS50MOA5025-176-ICM-BPRECO"));
	txt.linha("GS50TAX5286-ICT-BPRECO",docIn.getString("GS50TAX5286-ICT-BPRECO"));
	txt.linha("GS50MOA5025-176-ICT-BPRECO",docIn.getString("GS50MOA5025-176-ICT-BPRECO"));
	txt.linha("GS50MOA5025-176-IPI-BPRECO",docIn.getString("GS50MOA5025-176-IPI-BPRECO"));
	txt.linha("GS51MOA5025-131-A-BPRECO",docIn.getString("GS51MOA5025-131-A-BPRECO"));
	txt.linha("GS51MOA5025-131-C-BPRECO",docIn.getString("GS51MOA5025-131-C-BPRECO"));
	txt.linha("SOMA-DI-BPRECO",docIn.getString("SOMA-DI-BPRECO"));
	txt.linha("SOMA-TD-BPRECO",docIn.getString("SOMA-TD-BPRECO"));
	txt.linha("SOMA-MERCADORIA-BPRECO",docIn.getString("SOMA-MERCADORIA-BPRECO"));

}

return txt.toString();