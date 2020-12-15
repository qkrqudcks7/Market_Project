package project.traditionalmarket.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @EqualsAndHashCode
public class Sub {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private int day;

    @Column(nullable = false)
    private int itemCode;

    @Column(nullable = false)
    private String itemName;

    @Column(nullable = false)
    private String kindName;

    @Column(nullable = false)
    private int avgPrice;

    @Column(nullable = false)
    private String productClsName;

    @Column(nullable = false)
    private String productRank;

    @Column(nullable = false)
    private float circUnit;

    @Column(nullable = false)
    private String circUnitSize;

    @Column(nullable = false)
    private int minPrice;

    @Column(nullable = false)
    private int maxPrice;

}
