package Atividade1;
import java.util.HashMap;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.awt.image.ImageProducer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

public class Mensagem {
    static void main() {

        EmailAviso email = new EmailAviso();
        SmsAviso sms = new SmsAviso();
        PushAviso push = new PushAviso();

        CentralEnvio central = new CentralEnvio();

         central.enviarAviso(sms, "Ola", "123");
         central.enviarAviso(email, "Ola", "456");
         central.enviarAviso(push, "Ola", "789");

    Map<String, Avisos> listaAvisos = new HashMap<String, Avisos>();

    listaAvisos.put("Erro no envio", sms);
    listaAvisos.put("Erro no envio", email);
    listaAvisos.put("Erro no envio", push);

    for(Map.Entry<String, Avisos> mapa: listaAvisos.entrySet()){
        System.out.println("Mensagem - " + mapa.getKey());
    }
    }
}
