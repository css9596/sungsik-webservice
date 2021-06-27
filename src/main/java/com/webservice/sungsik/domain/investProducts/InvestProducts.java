package com.webservice.sungsik.domain.investProducts;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class InvestProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성규칙
    private Integer product_id;

    private String title;

    private BigDecimal total_investing_amount;

    private Date started_at;

    private Date finished_at;
}
