

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEspeciales {
	 
    private static final String PATRON_URL = "^http://[\\w]+(\\.[\\w-]+)*/([\\w-])*/([\\w-]+)*(\\.[\\w]{1,})";
    private static final String PATRON_URL2 = "^(https?://)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\w\\.-/]+)?/?$";
	private static final String PATRON_URL3 = "^(ht|f)tp(s?)://[0-9a-zA-Z]([-\\.\\w]*[0-9a-zA-Z])*(?:(0-9)*)*(?)([a-zA-Z0-9-\\.?,/+&%\\$#_]*)?$";
	private static final String PATRON_ID_YOOTUBE = "^http://(?:youtu\\.be/|(?:[a-z]{2,3}\\.)?youtube\\.com/watch(?:\\?|#\\!)v=)([\\w-]{11}).*/gi";
	
    private static final String PATRON_CORREO = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$";
    
    private static final String PATRON_USUARIO = "^[a-z\\d_]{4,15}$";
    private static final String PATRON_CONTRASE�A = "[A-ZÑa-zñ0-9%&#_-]{6,18}";
    private static final String PATRON_CONTRASE�A2 = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";
    private static final String PATRON_CONTRASE�A3 = "((?=.{0,}[A-ZÑ])(?=.{0,}[a-zñ])(?=.{1,}\\d)(?=.{1,}[$*-+&!?%])).{8,16}";
    private static final String PATRON_CONTRASE�A4 = "^(?=[^\\d_].*?\\d)\\w(\\w|[!@#$%]){7,20}";
    
    private static final String PATRON_TELEFONO = "^\\+?\\d{1,3}?[- .]?\\(?(?:\\d{2,3})\\)?[- .]?\\d\\d\\d[- .]?\\d\\d\\d\\d$";
    private static final String PATRON_CP = "^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$";

    private static final String PATRON_TARJETA = "^((67\\d{2})|(4\\d{3})|(5[1-5]\\d{2})|(6011))(-?\\s?\\d{4}){3}|(3[4,7])\\d{2}-?\\s?\\d{6}-?\\s?\\d{5}$";
     

    private static final String PATRON_IP = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
    private static final String PATRON_IP2 = "^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
    private static final String PATRON_IP3 = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?))";
    

    static public void main(String[] args) {

        String cadenaURL = "http://www.devbg.org/forum/index.php";
        String cadenaContrase�a = "rLpuebPa$t5ra";
        
        System.out.print(validar(cadenaURL)); 

        //System.out.print(validar(cadenaContraseña));
    }
    
    
    
    /**
     * Valida email utilizando expresiones regulares.
     * 
     * @param eMail
     *            eMail para validar
     * @return true si el eMail es válido, en otro caso false
     */
    public static boolean validar(String texto) {
 
        // Compila la expresión regular en un patrón.
        
    	//Pattern regex = Pattern.compile(PATRON_CONTRASEÑA2);
        Pattern regex = Pattern.compile(PATRON_URL);
        
        // Comprueba la correspondencia con el patrón
        Matcher correspondencias = regex.matcher(texto);
        return correspondencias.matches();
 
    }
 
}