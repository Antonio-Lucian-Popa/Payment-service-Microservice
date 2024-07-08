package com.asusoftware.PaymentService.service;

import com.asusoftware.PaymentService.model.PaymentRequest;
import com.asusoftware.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(long orderId);
}
