package com.urprovider.pay.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreatePayResource {

    @NotNull
    private Float amount;
    @NotNull
    private Date date;
    @NotNull
    private Long supplier_id;
    @NotNull
    private Long show_owner_id;
}
