package com.urprovider.shipping.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateShipmentResource {

    @NotNull
    private String address;
    @NotNull
    private Boolean status;
    @NotNull
    private Long suplier_id;
    @NotNull
    private Long shop_owner_id;
    @NotNull
    private Integer tracking_number;
}
