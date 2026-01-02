package com.example.demo.model.payment;

import com.example.demo.model.checkoutsession.ImmutableShipToAddress;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.micrometer.common.lang.Nullable;
import org.immutables.value.Value;


@Value.Immutable
@Value.Modifiable
@Value.Style(create = "new")
@JsonDeserialize(as = ImmutableBillToAddress.class)
public interface BillToAddress {
    String getName();

    String getAddressLine1();

    String getAddressLine2();

    @Nullable
    String getColoniaNeighborhood();

    String getCity();

    String getStateProvinceCode();

    String getPostalCode();

    String getPostalCodeExtension();

    String getCountryCode();
}
