package project.traditionalmarket.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Main {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private int day;

    @Column(nullable = false)
    private String marketName;

    @Column(nullable = false)
    private String stateName;

    @Column(nullable = false)
    private String countryName;

    @Column(nullable = false)
    private int itemCode;

    @Column(nullable = false)
    private String itemName;

    @Column(nullable = false)
    private String kindName;

    @Column(nullable = false)
    private String productClsName;

    @Column(nullable = false)
    private String productRank;

    @Column(nullable = false)
    private int price;

    @Column(nullable = true)
    private Integer wholeSaleUnit;

    @Column(nullable = true)
    private String wholeSaleUnitSize;

    @Column(nullable = true)
    private Integer retailSaleUnit;

    @Column(nullable = true)
    private String retailSaleUnitSize;

    @Column(nullable = true)
    private Integer natureSaleUnit;

    @Column(nullable = true)
    private String natureSaleUnitSize;
}
