package com.example.demo.model.payment;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.UUID;

@Value.Immutable
@Value.Modifiable
@Value.Style(create = "new")
@JsonDeserialize(as = ImmutableDelegatePaymentResponse.class)
public interface DelegatePaymentResponse {
    UUID getPaymentId();
}
