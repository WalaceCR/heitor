package classesTratamentoString;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrataString {
	
	public String verificaAceitaCaracteresAaZe0a9Acentos(String string) {
		 String saida = "";
		 Pattern pattern = Pattern.compile("[������������ qwertyuiopasdfghjklzxcvbnm QWERTY�UIOPASDFGHJKLZXCVBNM 0123456789]");
		 Matcher matcher = pattern.matcher(string);
		 while (matcher.find()) {
			 saida += matcher.group();
		 }
		 return saida;
	}
	
	
	public String verificaAceitaCaracteresAaZe0a9SemAcentos(String string) {
		String saida = "";
		Pattern pattern = Pattern.compile("[qwertyuiopasdfghjklzxcvbnm QWERTYUIOPASDFGHJKLZXCVBNM 0123456789]");
		Matcher matcher = pattern.matcher(string);
		while (matcher.find()) {
			saida += matcher.group();
		}
		return saida;	
	}
	
	/*public String verificaNome(String string) {
		String saida = "";
		string = retornaStringSemEspacos(string).toUpperCase();
		String string2 = retornaStringSemEspacos(string);
		Pattern pattern = Pattern
		.compile("[qwertyuiopasdfghjklzxcvbnm QWERTYUIOPASDFGHJKLZXCVBNM]");
		Matcher matcher = pattern.matcher(string2);
		while (matcher.find()) {
		saida += matcher.group();
		}
		return retiraLetrasRepetidas(saida);
		}*/
	
	public String retornaStringSemEspacos(String string) {
		String patternStr = "\\s+";
		String replaceStr = "";
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(string);
		string = matcher.replaceAll(replaceStr);
		 
		return string;
		}

	public String verificaCharRepetido(String string) {
		Pattern p = Pattern.compile("(\\w)\\1+");
		Matcher m = p.matcher(string);
		return m.group(1);
		}
	
	/*public String retiraLetrasRepetidas(String s) {
		 
		String aux = "";
		String string1 = "";
		List<String> lista = new ArrayList<String>();
		int cont = 0;
		for (int i = 0; i < s.length(); i++) {
		string1 = "" + s.charAt(i);
		if (string1.equalsIgnoreCase(aux)) {
		cont++;
		if (cont >= 3) {
		cont = 0;
		lista.add(retornaStringRepetida(s, aux));
		aux = "";
		 
		}
		}
		aux = string1;
		}
		 
		for (String ss : lista) {
		char c = ss.charAt(0);
		s = s.replace(ss, String.valueOf(c));
		 
		}
		 
		return s;
		}*/
	
	public String verificaCpf(String string) {
		 String saida = "";
		 Pattern pattern = Pattern.compile("[0123456789]");
		 Matcher matcher = pattern.matcher(string);
		 while (matcher.find()) {
		 saida += matcher.group();
		 }
		 
		 if (saida.equalsIgnoreCase("00000000191")) {
		 return "Invalido";
		 } else if (saida.equalsIgnoreCase("00000000000")) {
		 return "Invalido";
		 } else if (saida.equalsIgnoreCase("11111111111")) {
		 return "Invalido";
		 } else if (saida.equalsIgnoreCase("22222222222")) {
		 return "Invalido";
		 } else if (saida.equalsIgnoreCase("33333333333")) {
		 return "Invalido";
		 } else if (saida.equalsIgnoreCase("44444444444")) {
		 return "Invalido";
		 } else if (saida.equalsIgnoreCase("55555555555")) {
		 return "Invalido";
		 } else if (saida.equalsIgnoreCase("66666666666")) {
		 return "Invalido";
		 } else if (saida.equalsIgnoreCase("77777777777")) {
		 return "Invalido";
		 } else if (saida.equalsIgnoreCase("88888888888")) {
		 return "Invalido";
		 } else if (saida.equalsIgnoreCase("99999999999")) {
		 return "Invalido";
		 } else {
		 return saida;
		 }
		 
		 
		 }
	
	
}
