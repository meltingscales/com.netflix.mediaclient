package org.chromium.net;

import android.content.Context;
import com.netflix.mediaclient.service.webclient.model.leafs.UserProfile$$ExternalSyntheticBackport0;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ConnectionMigrationOptions;
import org.chromium.net.CronetEngine;
import org.chromium.net.DnsOptions;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.QuicOptions;
import org.chromium.net.UrlRequest;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes5.dex */
public abstract class ExperimentalCronetEngine extends CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    public static final long UNBIND_NETWORK_HANDLE = -1;

    public void bindToNetwork(long j) {
    }

    public abstract ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor);

    @Override // org.chromium.net.CronetEngine
    public abstract ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    /* loaded from: classes5.dex */
    public static class Builder extends CronetEngine.Builder {
        private final List<ExperimentalOptionsPatch> mExperimentalOptionsPatches;
        private JSONObject mParsedExperimentalOptions;

        /* JADX INFO: Access modifiers changed from: package-private */
        @FunctionalInterface
        /* loaded from: classes5.dex */
        public interface ExperimentalOptionsPatch {
            void applyTo(JSONObject jSONObject);
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableSdch(boolean z) {
            return this;
        }

        public ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ CronetEngine.Builder addPublicKeyPins(String str, Set set, boolean z, Date date) {
            return addPublicKeyPins(str, (Set<byte[]>) set, z, date);
        }

        public Builder(Context context) {
            super(context);
            this.mExperimentalOptionsPatches = new ArrayList();
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
            this.mExperimentalOptionsPatches = new ArrayList();
        }

        public Builder setExperimentalOptions(String str) {
            this.mParsedExperimentalOptions = (str == null || str.isEmpty()) ? null : parseExperimentalOptions(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setUserAgent(String str) {
            super.setUserAgent(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setStoragePath(String str) {
            super.setStoragePath(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
            super.setLibraryLoader(libraryLoader);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableQuic(boolean z) {
            super.enableQuic(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableHttp2(boolean z) {
            super.enableHttp2(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        @QuicOptions.Experimental
        public Builder setQuicOptions(final QuicOptions quicOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(3)) {
                this.mBuilderDelegate.setQuicOptions(quicOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new ExperimentalOptionsPatch() { // from class: org.chromium.net.ExperimentalCronetEngine$Builder$$ExternalSyntheticLambda2
                @Override // org.chromium.net.ExperimentalCronetEngine.Builder.ExperimentalOptionsPatch
                public final void applyTo(JSONObject jSONObject) {
                    ExperimentalCronetEngine.Builder.lambda$setQuicOptions$0(QuicOptions.this, jSONObject);
                }
            });
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$setQuicOptions$0(QuicOptions quicOptions, JSONObject jSONObject) {
            JSONObject createDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "QUIC");
            if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
                createDefaultIfAbsent.put("host_whitelist", UserProfile$$ExternalSyntheticBackport0.m(",", quicOptions.getQuicHostAllowlist()));
            }
            if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
                createDefaultIfAbsent.put("quic_version", UserProfile$$ExternalSyntheticBackport0.m(",", quicOptions.getEnabledQuicVersions()));
            }
            if (!quicOptions.getConnectionOptions().isEmpty()) {
                createDefaultIfAbsent.put("connection_options", UserProfile$$ExternalSyntheticBackport0.m(",", quicOptions.getConnectionOptions()));
            }
            if (!quicOptions.getClientConnectionOptions().isEmpty()) {
                createDefaultIfAbsent.put("client_connection_options", UserProfile$$ExternalSyntheticBackport0.m(",", quicOptions.getClientConnectionOptions()));
            }
            if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
                createDefaultIfAbsent.put("set_quic_flags", UserProfile$$ExternalSyntheticBackport0.m(",", quicOptions.getExtraQuicheFlags()));
            }
            if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
                createDefaultIfAbsent.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
            }
            if (quicOptions.getHandshakeUserAgent() != null) {
                createDefaultIfAbsent.put("user_agent_id", quicOptions.getHandshakeUserAgent());
            }
            if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
                createDefaultIfAbsent.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
            }
            if (quicOptions.getEnableTlsZeroRtt() != null) {
                createDefaultIfAbsent.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
            }
            if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
                createDefaultIfAbsent.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
            }
            if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
                createDefaultIfAbsent.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
            }
            if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
                createDefaultIfAbsent.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
            }
            if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
                createDefaultIfAbsent.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
            }
            if (quicOptions.getCloseSessionsOnIpChange() != null) {
                createDefaultIfAbsent.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
            }
            if (quicOptions.getGoawaySessionsOnIpChange() != null) {
                createDefaultIfAbsent.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
            }
            if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
                createDefaultIfAbsent.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
            }
            if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
                createDefaultIfAbsent.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
            }
            if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
                createDefaultIfAbsent.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
            }
        }

        @Override // org.chromium.net.CronetEngine.Builder
        @DnsOptions.Experimental
        public Builder setDnsOptions(final DnsOptions dnsOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(2)) {
                this.mBuilderDelegate.setDnsOptions(dnsOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new ExperimentalOptionsPatch() { // from class: org.chromium.net.ExperimentalCronetEngine$Builder$$ExternalSyntheticLambda0
                @Override // org.chromium.net.ExperimentalCronetEngine.Builder.ExperimentalOptionsPatch
                public final void applyTo(JSONObject jSONObject) {
                    ExperimentalCronetEngine.Builder.lambda$setDnsOptions$1(DnsOptions.this, jSONObject);
                }
            });
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$setDnsOptions$1(DnsOptions dnsOptions, JSONObject jSONObject) {
            JSONObject createDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "AsyncDNS");
            if (dnsOptions.getUseBuiltInDnsResolver() != null) {
                createDefaultIfAbsent.put("enable", dnsOptions.getUseBuiltInDnsResolver());
            }
            JSONObject createDefaultIfAbsent2 = createDefaultIfAbsent(jSONObject, "StaleDNS");
            if (dnsOptions.getEnableStaleDns() != null) {
                createDefaultIfAbsent2.put("enable", dnsOptions.getEnableStaleDns());
            }
            if (dnsOptions.getPersistHostCache() != null) {
                createDefaultIfAbsent2.put("persist_to_disk", dnsOptions.getPersistHostCache());
            }
            if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
                createDefaultIfAbsent2.put("persist_delay_ms", dnsOptions.getPersistHostCachePeriodMillis());
            }
            if (dnsOptions.getStaleDnsOptions() != null) {
                DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
                if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                    createDefaultIfAbsent2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
                }
                if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                    createDefaultIfAbsent2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
                }
                if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                    createDefaultIfAbsent2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
                }
                if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                    createDefaultIfAbsent2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
                }
            }
            JSONObject createDefaultIfAbsent3 = createDefaultIfAbsent(jSONObject, "QUIC");
            if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
                createDefaultIfAbsent3.put("race_stale_dns_on_connection", dnsOptions.getPreestablishConnectionsToStaleDnsResults());
            }
        }

        @Override // org.chromium.net.CronetEngine.Builder
        @ConnectionMigrationOptions.Experimental
        public Builder setConnectionMigrationOptions(final ConnectionMigrationOptions connectionMigrationOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(1)) {
                this.mBuilderDelegate.setConnectionMigrationOptions(connectionMigrationOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new ExperimentalOptionsPatch() { // from class: org.chromium.net.ExperimentalCronetEngine$Builder$$ExternalSyntheticLambda1
                @Override // org.chromium.net.ExperimentalCronetEngine.Builder.ExperimentalOptionsPatch
                public final void applyTo(JSONObject jSONObject) {
                    ExperimentalCronetEngine.Builder.lambda$setConnectionMigrationOptions$2(ConnectionMigrationOptions.this, jSONObject);
                }
            });
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$setConnectionMigrationOptions$2(ConnectionMigrationOptions connectionMigrationOptions, JSONObject jSONObject) {
            JSONObject createDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "QUIC");
            if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
                createDefaultIfAbsent.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
            }
            if (connectionMigrationOptions.getAllowServerMigration() != null) {
                createDefaultIfAbsent.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
            }
            if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
                createDefaultIfAbsent.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
            }
            if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
                createDefaultIfAbsent.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
            }
            if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
                createDefaultIfAbsent.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
            }
            if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
                createDefaultIfAbsent.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
            }
            if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
                createDefaultIfAbsent.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
            }
            if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
                createDefaultIfAbsent.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
            }
            if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
                boolean booleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
                if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                    boolean booleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                    if (!booleanValue && booleanValue2) {
                        throw new IllegalArgumentException("Unable to turn on non-default network usage without path degradation migration!");
                    }
                    if (booleanValue && booleanValue2) {
                        createDefaultIfAbsent.put("migrate_sessions_early_v2", true);
                        return;
                    }
                    createDefaultIfAbsent.put("migrate_sessions_early_v2", false);
                }
                createDefaultIfAbsent.put("allow_port_migration", booleanValue);
            }
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableHttpCache(int i, long j) {
            super.enableHttpCache(i, j);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder addQuicHint(String str, int i, int i2) {
            super.addQuicHint(str, i, i2);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
            super.addPublicKeyPins(str, set, z, date);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableNetworkQualityEstimator(boolean z) {
            super.enableNetworkQualityEstimator(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setThreadPriority(int i) {
            super.setThreadPriority(i);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public ExperimentalCronetEngine build() {
            if (this.mParsedExperimentalOptions == null && this.mExperimentalOptionsPatches.isEmpty()) {
                return this.mBuilderDelegate.build();
            }
            if (this.mParsedExperimentalOptions == null) {
                this.mParsedExperimentalOptions = new JSONObject();
            }
            for (ExperimentalOptionsPatch experimentalOptionsPatch : this.mExperimentalOptionsPatches) {
                try {
                    experimentalOptionsPatch.applyTo(this.mParsedExperimentalOptions);
                } catch (JSONException e) {
                    throw new IllegalStateException("Unable to apply JSON patch!", e);
                }
            }
            this.mBuilderDelegate.setExperimentalOptions(this.mParsedExperimentalOptions.toString());
            return this.mBuilderDelegate.build();
        }

        private static JSONObject parseExperimentalOptions(String str) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                throw new IllegalArgumentException("Experimental options parsing failed", e);
            }
        }

        private static JSONObject createDefaultIfAbsent(JSONObject jSONObject, String str) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                try {
                    jSONObject.put(str, optJSONObject);
                } catch (JSONException e) {
                    throw new IllegalArgumentException("Failed adding a default object for key [" + str + "]", e);
                }
            }
            return optJSONObject;
        }
    }

    public URLConnection openConnection(URL url, Proxy proxy) {
        return url.openConnection(proxy);
    }
}
