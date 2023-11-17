package com.urprovider.pay.controller;


import com.urprovider.pay.domain.model.service.PayService;
import com.urprovider.pay.mapping.PayMapper;
import com.urprovider.pay.resource.PayResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/v1/pay", produces = "application/json")
public class PayController {

    private final PayService payService;

    private final PayMapper mapper;
    public PayController(PayService payService, PayMapper mapper){
        this.payService = payService;
        this.mapper = mapper;
    }

    @GetMapping
    public Page<PayResource> getAllPay(Pageable pageable){
        return mapper.modelListPage(payService.getAll(), pageable);
    }
    @GetMapping("{payId}")
    public PayResource getPayById(@PathVariable Long payId){
        return mapper.toResource(payService.getById(payId));
    }

    @PostMapping
    public PayResource createPay( @Valid @RequestBody PayResource resource){
        return mapper.toResource(payService.create(mapper.toModel(resource)));
    }

}
