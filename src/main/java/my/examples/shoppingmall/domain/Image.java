package my.examples.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name="image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length=255,name="file_name")
    private String fileName;
    @Column(length=255,name="save_file_name")
    private String saveFileName;
    @Column(length=255,name="mime_type")
    private String mimeType;
    private Long length;
    @Column(name="reg_date")
    private Date regDate;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    public Image() {
        regDate = new Date();
    }
}
