import com.example.model.ClientDTO;
import com.example.model.SpanishClientDTO;
import com.example.services.serializers.Serializer;
import com.example.services.serializers.Serializers;
import com.example.services.serializers.SerializersCatalog;

public class T5SerializersCatalog {
    public static void main(String[] args) {
        ClientDTO c = new ClientDTO(1, "Joan");
        SpanishClientDTO sc = new SpanishClientDTO (2, "Juan");
        
        try {
            Serializer formatter = SerializersCatalog.getInstance(Serializers.JSON_CLIENT);
            String jclient = formatter.serialize(c);
            System.out.println(jclient);

            ClientDTO clientDTO = (ClientDTO)formatter.deserialize (jclient, ClientDTO.class);
            System.out.println(clientDTO);

            formatter = SerializersCatalog.getInstance(Serializers.JSON_SP_CLIENT);
            String jsclient = formatter.serialize(sc);
            System.out.println(jsclient);

            SpanishClientDTO SpanishClientDTO = (SpanishClientDTO)formatter.deserialize (jsclient, SpanishClientDTO.class);
            System.out.println(SpanishClientDTO);  
            
            formatter = SerializersCatalog.getInstance(Serializers.XML_CLIENT);
            String xmlClient = formatter.serialize(c);
            System.out.println(xmlClient);

            clientDTO = (ClientDTO)formatter.deserialize (xmlClient, ClientDTO.class);
            System.out.println(clientDTO);

            formatter = SerializersCatalog.getInstance(Serializers.XML_SP_CLIENT);
            String xmlsclient = formatter.serialize(sc);
            System.out.println(xmlsclient);

            SpanishClientDTO = (SpanishClientDTO)formatter.deserialize (xmlsclient, SpanishClientDTO.class);
            System.out.println(SpanishClientDTO);      


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }       
    }
}