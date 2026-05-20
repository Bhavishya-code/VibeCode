package com.bs.VibeCode.service;

import com.bs.VibeCode.dto.subscription.PlanLimitsResponse;
import com.bs.VibeCode.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
