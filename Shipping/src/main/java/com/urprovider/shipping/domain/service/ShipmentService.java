package com.urprovider.shipping.domain.service;

import com.urprovider.shipping.domain.entity.Shipment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ShipmentService {

    List<Shipment> getAll();
    Page<Shipment> getAll(Pageable pageable);
    Shipment getById(Long shipmentId);

    Shipment getByTrackingNumber(String trackingNumber);
    Shipment create(Shipment shipment);
}
