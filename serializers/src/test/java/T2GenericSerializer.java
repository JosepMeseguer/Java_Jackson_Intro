import com.example.model.BookDTO;
import com.example.model.ClientDTO;
import com.example.services.serializers.JacksonSerializer;
import com.example.services.serializers.Serializer;

public class T2GenericSerializer {
    public static void main(String[] args) {
        BookDTO b = new BookDTO("Sapiens", "Yuval Harari", 300);
        ClientDTO c = new ClientDTO(1, "Joan");
        
        try {
            Serializer formatter = new JacksonSerializer<BookDTO>();
            String jbook = formatter.serialize(b);
            System.out.println(jbook);

            BookDTO copyDTO = (BookDTO)formatter.deserialize (jbook, BookDTO.class);
            System.out.println(copyDTO);

            formatter = new JacksonSerializer<ClientDTO>();
            String jclient = formatter.serialize(c);
            System.out.println(jclient);

            ClientDTO clientDTO = (ClientDTO)formatter.deserialize (jclient, ClientDTO.class);
            System.out.println(clientDTO);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }       
    }
}