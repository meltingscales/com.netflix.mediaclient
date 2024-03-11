package org.chromium.net;

/* loaded from: classes6.dex */
public class ConnectionMigrationOptions {
    private final Boolean mAllowNonDefaultNetworkUsage;
    private final Boolean mAllowServerMigration;
    private final Boolean mEnableDefaultNetworkMigration;
    private final Boolean mEnablePathDegradationMigration;
    private final Long mIdleMigrationPeriodSeconds;
    private final Integer mMaxPathDegradingEagerMigrationsCount;
    private final Long mMaxTimeOnNonDefaultNetworkSeconds;
    private final Integer mMaxWriteErrorEagerMigrationsCount;
    private final Boolean mMigrateIdleConnections;
    private final Boolean mRetryPreHandshakeErrorsOnAlternateNetwork;

    /* loaded from: classes.dex */
    public @interface Experimental {
    }

    public Boolean getAllowNonDefaultNetworkUsage() {
        return this.mAllowNonDefaultNetworkUsage;
    }

    public Boolean getAllowServerMigration() {
        return this.mAllowServerMigration;
    }

    public Boolean getEnableDefaultNetworkMigration() {
        return this.mEnableDefaultNetworkMigration;
    }

    public Boolean getEnablePathDegradationMigration() {
        return this.mEnablePathDegradationMigration;
    }

    public Long getIdleMigrationPeriodSeconds() {
        return this.mIdleMigrationPeriodSeconds;
    }

    public Integer getMaxPathDegradingEagerMigrationsCount() {
        return this.mMaxPathDegradingEagerMigrationsCount;
    }

    public Long getMaxTimeOnNonDefaultNetworkSeconds() {
        return this.mMaxTimeOnNonDefaultNetworkSeconds;
    }

    public Integer getMaxWriteErrorEagerMigrationsCount() {
        return this.mMaxWriteErrorEagerMigrationsCount;
    }

    public Boolean getMigrateIdleConnections() {
        return this.mMigrateIdleConnections;
    }

    public Boolean getRetryPreHandshakeErrorsOnAlternateNetwork() {
        return this.mRetryPreHandshakeErrorsOnAlternateNetwork;
    }

    public ConnectionMigrationOptions(Builder builder) {
        this.mEnableDefaultNetworkMigration = builder.mEnableDefaultNetworkConnectionMigration;
        this.mEnablePathDegradationMigration = builder.mEnablePathDegradationMigration;
        this.mAllowServerMigration = builder.mAllowServerMigration;
        this.mMigrateIdleConnections = builder.mMigrateIdleConnections;
        this.mIdleMigrationPeriodSeconds = builder.mIdleConnectionMigrationPeriodSeconds;
        this.mRetryPreHandshakeErrorsOnAlternateNetwork = builder.mRetryPreHandshakeErrorsOnAlternateNetwork;
        this.mAllowNonDefaultNetworkUsage = builder.mAllowNonDefaultNetworkUsage;
        this.mMaxTimeOnNonDefaultNetworkSeconds = builder.mMaxTimeOnNonDefaultNetworkSeconds;
        this.mMaxWriteErrorEagerMigrationsCount = builder.mMaxWriteErrorEagerMigrationsCount;
        this.mMaxPathDegradingEagerMigrationsCount = builder.mMaxPathDegradingEagerMigrationsCount;
    }

    /* loaded from: classes6.dex */
    public static class Builder {
        private Boolean mAllowNonDefaultNetworkUsage;
        private Boolean mAllowServerMigration;
        private Boolean mEnableDefaultNetworkConnectionMigration;
        private Boolean mEnablePathDegradationMigration;
        private Long mIdleConnectionMigrationPeriodSeconds;
        private Integer mMaxPathDegradingEagerMigrationsCount;
        private Long mMaxTimeOnNonDefaultNetworkSeconds;
        private Integer mMaxWriteErrorEagerMigrationsCount;
        private Boolean mMigrateIdleConnections;
        private Boolean mRetryPreHandshakeErrorsOnAlternateNetwork;

        Builder() {
        }

        public Builder enableDefaultNetworkMigration(boolean z) {
            this.mEnableDefaultNetworkConnectionMigration = Boolean.valueOf(z);
            return this;
        }

        public Builder enablePathDegradationMigration(boolean z) {
            this.mEnablePathDegradationMigration = Boolean.valueOf(z);
            return this;
        }

        @Experimental
        public Builder allowServerMigration(boolean z) {
            this.mAllowServerMigration = Boolean.valueOf(z);
            return this;
        }

        @Experimental
        public Builder migrateIdleConnections(boolean z) {
            this.mMigrateIdleConnections = Boolean.valueOf(z);
            return this;
        }

        @Experimental
        public Builder setIdleConnectionMigrationPeriodSeconds(long j) {
            this.mIdleConnectionMigrationPeriodSeconds = Long.valueOf(j);
            return this;
        }

        @Experimental
        public Builder allowNonDefaultNetworkUsage(boolean z) {
            this.mAllowNonDefaultNetworkUsage = Boolean.valueOf(z);
            return this;
        }

        @Experimental
        public Builder setMaxTimeOnNonDefaultNetworkSeconds(long j) {
            this.mMaxTimeOnNonDefaultNetworkSeconds = Long.valueOf(j);
            return this;
        }

        @Experimental
        public Builder setMaxWriteErrorNonDefaultNetworkMigrationsCount(int i) {
            this.mMaxWriteErrorEagerMigrationsCount = Integer.valueOf(i);
            return this;
        }

        @Experimental
        public Builder setMaxPathDegradingNonDefaultNetworkMigrationsCount(int i) {
            this.mMaxPathDegradingEagerMigrationsCount = Integer.valueOf(i);
            return this;
        }

        @Experimental
        public Builder retryPreHandshakeErrorsOnNonDefaultNetwork(boolean z) {
            this.mRetryPreHandshakeErrorsOnAlternateNetwork = Boolean.valueOf(z);
            return this;
        }

        public ConnectionMigrationOptions build() {
            return new ConnectionMigrationOptions(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
