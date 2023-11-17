package com.urprovider.shipping.domain.entity;


import com.urprovider.shared.domain.model.BaseModel;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shipments")
@Builder
public class Shipment extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String address;
    @NotNull
    private Boolean status;
    @NotNull
    private Long suplier_id;
    @NotNull
    private Long shop_owner_id;
    @NotNull
    private Integer trackingNumber;
}
