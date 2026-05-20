package com.bs.VibeCode.service;

import com.bs.VibeCode.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
