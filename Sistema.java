import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Sistema {

	private Map<String, Usuario> lista;

	public Sistema() {
		this.lista = new HashMap<>();
	}

	public void iterar() {
//		Iterator entries = lista.entrySet().iterator();
//		while (entries.hasNext()) {
//		    Map.Entry entry = (Map.Entry) entries.next();
//		    String key = (String)entry.getKey();
//		    S value = entry.getValue().toString();
//		    System.out.println("Key = " + key + ", Value = " + value);
//		}

//		Iterator listita = lista.entrySet().iterator();
//		while (listita.hasNext()) {
//			Map.Entry keys = (Map.Entry) listita.next();
////			String key = (String) keys.getKey();
//			String key = "llave";
//			if(keys.equals(key)) {
//				listita.remove();
//			}
////			System.out.println(key);
//		}
		
//		for (String keyRemovida : lista.keySet()) {
//			System.out.println(keyRemovida);
//		}

//		lista.entrySet().remove(lista.containsKey("llave"));

		Iterator<String> it = lista.keySet().iterator();
		while(it.hasNext()) {
			String clave = it.next();
			Usuario u = lista.get(clave);
		}
	}

	public void agregar(Usuario usr) {
		this.lista.put("llave", usr);
	}

	public Map<String, Usuario> getMapa() {
		return lista;
	}

}
