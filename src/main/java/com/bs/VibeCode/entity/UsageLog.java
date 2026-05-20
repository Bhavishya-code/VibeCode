package com.bs.VibeCode.entity;

import java.time.Instant;

public class UsageLog {
    Long id;
    User user;

    Project project;

    Integer tokensUsed;
    Integer durationMs;

    String metaData;

    Instant createdAt;
}
