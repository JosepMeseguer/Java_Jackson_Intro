import com.example.model.BookDTO;
import com.example.services.serializers.book.BookJsonSerializer;

public class T1SpecificJsonSerializers {
    public static void main(String[] args) {
        BookDTO b = new BookDTO("Sapiens", "Yuval Harari", 300);
        try {
            String jbook = BookJsonSerializer.serialize(b);
            System.out.println(jbook);

            BookDTO copyDTO = BookJsonSerializer.deserialize (jbook);
            System.out.println(copyDTO);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        


    }

}
