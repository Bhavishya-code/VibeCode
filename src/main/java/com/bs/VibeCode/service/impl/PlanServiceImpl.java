package com.bs.VibeCode.service.impl;

import com.bs.VibeCode.dto.subscription.PlanResponse;
import com.bs.VibeCode.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
