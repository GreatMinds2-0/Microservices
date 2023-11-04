package com.urprovider.sales.domain.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.urprovider.sales.shared.domain.model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "salesOrders")
public class SalesOrder extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private String date;
    private String description;

}
