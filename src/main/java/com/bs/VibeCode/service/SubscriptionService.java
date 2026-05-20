package com.bs.VibeCode.service;

import com.bs.VibeCode.dto.subscription.CheckoutRequest;
import com.bs.VibeCode.dto.subscription.CheckoutResponse;
import com.bs.VibeCode.dto.subscription.PortalResponse;
import com.bs.VibeCode.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
