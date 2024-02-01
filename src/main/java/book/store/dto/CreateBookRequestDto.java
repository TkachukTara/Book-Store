package book.store.dto;

import java.math.BigDecimal;
import java.util.Random;
import lombok.Data;

@Data
public class CreateBookRequestDto {
    private String title;
    private String author;
    private BigDecimal price;
    private String description;
    private String coverImage;
    private String isbn = "Isbn" + new Random().nextInt(1000);
}
