import com.example.model.ClientDTO;
import com.example.model.SpanishClientDTO;
import com.example.services.serializers.JacksonSerializer;
import com.example.services.serializers.Serializer;
import com.example.services.serializers.XmlJacksonSerializer;

public class T4JsonAndXmlSerializers {
    public static void main(String[] args) {
        ClientDTO c = new ClientDTO(1, "Joan");
        SpanishClientDTO sc = new SpanishClientDTO (2, "Juan");
        
        try {
            Serializer formatter = new JacksonSerializer<ClientDTO>();
            String jclient = formatter.serialize(c);
            System.out.println(jclient);

            ClientDTO clientDTO = (ClientDTO)formatter.deserialize (jclient, ClientDTO.class);
            System.out.println(clientDTO);

            formatter = new JacksonSerializer<SpanishClientDTO>();
            String jsclient = formatter.serialize(sc);
            System.out.println(jsclient);

            SpanishClientDTO SpanishClientDTO = (SpanishClientDTO)formatter.deserialize (jsclient, SpanishClientDTO.class);
            System.out.println(SpanishClientDTO);  
            
            formatter = new XmlJacksonSerializer<ClientDTO>();
            String xmlClient = formatter.serialize(c);
            System.out.println(xmlClient);

            clientDTO = (ClientDTO)formatter.deserialize (xmlClient, ClientDTO.class);
            System.out.println(clientDTO);

            formatter = new XmlJacksonSerializer<SpanishClientDTO>();
            String xmlsclient = formatter.serialize(sc);
            System.out.println(xmlsclient);

            SpanishClientDTO = (SpanishClientDTO)formatter.deserialize (xmlsclient, SpanishClientDTO.class);
            System.out.println(SpanishClientDTO);      


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }       
    }
}