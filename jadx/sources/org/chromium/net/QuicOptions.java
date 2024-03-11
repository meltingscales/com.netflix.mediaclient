package org.chromium.net;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public class QuicOptions {
    private final Set<String> mClientConnectionOptions;
    private final Boolean mCloseSessionsOnIpChange;
    private final Set<String> mConnectionOptions;
    private final Long mCryptoHandshakeTimeoutSeconds;
    private final Boolean mDelayJobsWithAvailableSpdySession;
    private final Boolean mEnableTlsZeroRtt;
    private final Set<String> mEnabledQuicVersions;
    private final Set<String> mExtraQuicheFlags;
    private final Boolean mGoawaySessionsOnIpChange;
    private final String mHandshakeUserAgent;
    private final Long mIdleConnectionTimeoutSeconds;
    private final Integer mInMemoryServerConfigsCacheSize;
    private final Boolean mIncreaseBrokenServicePeriodExponentially;
    private final Long mInitialBrokenServicePeriodSeconds;
    private final Long mPreCryptoHandshakeIdleTimeoutSeconds;
    private final Set<String> mQuicHostAllowlist;
    private final Long mRetransmittableOnWireTimeoutMillis;
    private final Boolean mRetryWithoutAltSvcOnQuicErrors;

    /* loaded from: classes.dex */
    public @interface Experimental {
    }

    /* loaded from: classes.dex */
    public @interface QuichePassthroughOption {
    }

    public Set<String> getClientConnectionOptions() {
        return this.mClientConnectionOptions;
    }

    public Boolean getCloseSessionsOnIpChange() {
        return this.mCloseSessionsOnIpChange;
    }

    public Set<String> getConnectionOptions() {
        return this.mConnectionOptions;
    }

    public Long getCryptoHandshakeTimeoutSeconds() {
        return this.mCryptoHandshakeTimeoutSeconds;
    }

    public Boolean getDelayJobsWithAvailableSpdySession() {
        return this.mDelayJobsWithAvailableSpdySession;
    }

    public Boolean getEnableTlsZeroRtt() {
        return this.mEnableTlsZeroRtt;
    }

    public Set<String> getEnabledQuicVersions() {
        return this.mEnabledQuicVersions;
    }

    public Set<String> getExtraQuicheFlags() {
        return this.mExtraQuicheFlags;
    }

    public Boolean getGoawaySessionsOnIpChange() {
        return this.mGoawaySessionsOnIpChange;
    }

    public String getHandshakeUserAgent() {
        return this.mHandshakeUserAgent;
    }

    public Long getIdleConnectionTimeoutSeconds() {
        return this.mIdleConnectionTimeoutSeconds;
    }

    public Integer getInMemoryServerConfigsCacheSize() {
        return this.mInMemoryServerConfigsCacheSize;
    }

    public Boolean getIncreaseBrokenServicePeriodExponentially() {
        return this.mIncreaseBrokenServicePeriodExponentially;
    }

    public Long getInitialBrokenServicePeriodSeconds() {
        return this.mInitialBrokenServicePeriodSeconds;
    }

    public Long getPreCryptoHandshakeIdleTimeoutSeconds() {
        return this.mPreCryptoHandshakeIdleTimeoutSeconds;
    }

    public Set<String> getQuicHostAllowlist() {
        return this.mQuicHostAllowlist;
    }

    public Long getRetransmittableOnWireTimeoutMillis() {
        return this.mRetransmittableOnWireTimeoutMillis;
    }

    public Boolean getRetryWithoutAltSvcOnQuicErrors() {
        return this.mRetryWithoutAltSvcOnQuicErrors;
    }

    QuicOptions(Builder builder) {
        this.mQuicHostAllowlist = Collections.unmodifiableSet(new LinkedHashSet(builder.mQuicHostAllowlist));
        this.mEnabledQuicVersions = Collections.unmodifiableSet(new LinkedHashSet(builder.mEnabledQuicVersions));
        this.mConnectionOptions = Collections.unmodifiableSet(new LinkedHashSet(builder.mConnectionOptions));
        this.mClientConnectionOptions = Collections.unmodifiableSet(new LinkedHashSet(builder.mClientConnectionOptions));
        this.mInMemoryServerConfigsCacheSize = builder.mInMemoryServerConfigsCacheSize;
        this.mHandshakeUserAgent = builder.mHandshakeUserAgent;
        this.mRetryWithoutAltSvcOnQuicErrors = builder.mRetryWithoutAltSvcOnQuicErrors;
        this.mEnableTlsZeroRtt = builder.mEnableTlsZeroRtt;
        this.mPreCryptoHandshakeIdleTimeoutSeconds = builder.mPreCryptoHandshakeIdleTimeoutSeconds;
        this.mCryptoHandshakeTimeoutSeconds = builder.mCryptoHandshakeTimeoutSeconds;
        this.mIdleConnectionTimeoutSeconds = builder.mIdleConnectionTimeoutSeconds;
        this.mRetransmittableOnWireTimeoutMillis = builder.mRetransmittableOnWireTimeoutMillis;
        this.mCloseSessionsOnIpChange = builder.mCloseSessionsOnIpChange;
        this.mGoawaySessionsOnIpChange = builder.mGoawaySessionsOnIpChange;
        this.mInitialBrokenServicePeriodSeconds = builder.mInitialBrokenServicePeriodSeconds;
        this.mIncreaseBrokenServicePeriodExponentially = builder.mIncreaseBrokenServicePeriodExponentially;
        this.mDelayJobsWithAvailableSpdySession = builder.mDelayJobsWithAvailableSpdySession;
        this.mExtraQuicheFlags = Collections.unmodifiableSet(new LinkedHashSet(builder.mExtraQuicheFlags));
    }

    public static Builder builder() {
        return new Builder();
    }

    /* loaded from: classes6.dex */
    public static class Builder {
        private Boolean mCloseSessionsOnIpChange;
        private Long mCryptoHandshakeTimeoutSeconds;
        private Boolean mDelayJobsWithAvailableSpdySession;
        private Boolean mEnableTlsZeroRtt;
        private Boolean mGoawaySessionsOnIpChange;
        private String mHandshakeUserAgent;
        private Long mIdleConnectionTimeoutSeconds;
        private Integer mInMemoryServerConfigsCacheSize;
        private Boolean mIncreaseBrokenServicePeriodExponentially;
        private Long mInitialBrokenServicePeriodSeconds;
        private Long mPreCryptoHandshakeIdleTimeoutSeconds;
        private Long mRetransmittableOnWireTimeoutMillis;
        private Boolean mRetryWithoutAltSvcOnQuicErrors;
        private final Set<String> mQuicHostAllowlist = new LinkedHashSet();
        private final Set<String> mEnabledQuicVersions = new LinkedHashSet();
        private final Set<String> mConnectionOptions = new LinkedHashSet();
        private final Set<String> mClientConnectionOptions = new LinkedHashSet();
        private final Set<String> mExtraQuicheFlags = new LinkedHashSet();

        public Builder setHandshakeUserAgent(String str) {
            this.mHandshakeUserAgent = str;
            return this;
        }

        Builder() {
        }

        public Builder addAllowedQuicHost(String str) {
            this.mQuicHostAllowlist.add(str);
            return this;
        }

        @QuichePassthroughOption
        public Builder addEnabledQuicVersion(String str) {
            this.mEnabledQuicVersions.add(str);
            return this;
        }

        @QuichePassthroughOption
        public Builder addConnectionOption(String str) {
            this.mConnectionOptions.add(str);
            return this;
        }

        @QuichePassthroughOption
        public Builder addClientConnectionOption(String str) {
            this.mClientConnectionOptions.add(str);
            return this;
        }

        public Builder setInMemoryServerConfigsCacheSize(int i) {
            this.mInMemoryServerConfigsCacheSize = Integer.valueOf(i);
            return this;
        }

        @Experimental
        public Builder retryWithoutAltSvcOnQuicErrors(boolean z) {
            this.mRetryWithoutAltSvcOnQuicErrors = Boolean.valueOf(z);
            return this;
        }

        @Experimental
        public Builder enableTlsZeroRtt(boolean z) {
            this.mEnableTlsZeroRtt = Boolean.valueOf(z);
            return this;
        }

        @Experimental
        public Builder setPreCryptoHandshakeIdleTimeoutSeconds(long j) {
            this.mPreCryptoHandshakeIdleTimeoutSeconds = Long.valueOf(j);
            return this;
        }

        @Experimental
        public Builder setCryptoHandshakeTimeoutSeconds(long j) {
            this.mCryptoHandshakeTimeoutSeconds = Long.valueOf(j);
            return this;
        }

        public Builder setIdleConnectionTimeoutSeconds(long j) {
            this.mIdleConnectionTimeoutSeconds = Long.valueOf(j);
            return this;
        }

        @Experimental
        public Builder setRetransmittableOnWireTimeoutMillis(long j) {
            this.mRetransmittableOnWireTimeoutMillis = Long.valueOf(j);
            return this;
        }

        @Experimental
        public Builder closeSessionsOnIpChange(boolean z) {
            this.mCloseSessionsOnIpChange = Boolean.valueOf(z);
            return this;
        }

        @Experimental
        public Builder goawaySessionsOnIpChange(boolean z) {
            this.mGoawaySessionsOnIpChange = Boolean.valueOf(z);
            return this;
        }

        @Experimental
        public Builder setInitialBrokenServicePeriodSeconds(long j) {
            this.mInitialBrokenServicePeriodSeconds = Long.valueOf(j);
            return this;
        }

        @Experimental
        public Builder increaseBrokenServicePeriodExponentially(boolean z) {
            this.mIncreaseBrokenServicePeriodExponentially = Boolean.valueOf(z);
            return this;
        }

        @Experimental
        public Builder delayJobsWithAvailableSpdySession(boolean z) {
            this.mDelayJobsWithAvailableSpdySession = Boolean.valueOf(z);
            return this;
        }

        @QuichePassthroughOption
        public Builder addExtraQuicheFlag(String str) {
            this.mExtraQuicheFlags.add(str);
            return this;
        }

        public QuicOptions build() {
            return new QuicOptions(this);
        }
    }
}
