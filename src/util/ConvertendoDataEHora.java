package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertendoDataEHora {
    
    public static String converterDateParaData (Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(data);
    }
    public static String converterDateParaHora (Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("hh:mm:ss");
        return formatador.format(data);
    }
    public static String converterDateParaDataEHora(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy as hh:mm:ss");
        return formatador.format(data);
    }
    public static String converterDateParaData(String string) {
        return null;
    }
}
