package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zacd implements OnCompleteListener {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey zac;
    private final long zad;
    private final long zae;

    zacd(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
        this.zae = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zacd zaa(GoogleApiManager googleApiManager, int i, ApiKey apiKey) {
        boolean z;
        if (googleApiManager.zaD()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if (config == null) {
                z = true;
            } else if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            } else {
                z = config.getMethodTimingTelemetryEnabled();
                zabq zai = googleApiManager.zai(apiKey);
                if (zai != null) {
                    if (!(zai.zaf() instanceof BaseGmsClient)) {
                        return null;
                    }
                    BaseGmsClient baseGmsClient = (BaseGmsClient) zai.zaf();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zai, baseGmsClient, i);
                        if (zab == null) {
                            return null;
                        }
                        zai.zaq();
                        z = zab.getMethodTimingTelemetryEnabled();
                    }
                }
            }
            return new zacd(googleApiManager, i, apiKey, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L, null, null);
        }
        return null;
    }

    private static ConnectionTelemetryConfiguration zab(zabq zabqVar, BaseGmsClient baseGmsClient, int i) {
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled()) {
            return null;
        }
        int[] methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist();
        if (methodInvocationMethodKeyAllowlist == null) {
            int[] methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist();
            if (methodInvocationMethodKeyDisallowlist != null && ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i)) {
                return null;
            }
        } else if (!ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i)) {
            return null;
        }
        if (zabqVar.zac() < telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        zabq zai;
        int i;
        int i2;
        int i3;
        int errorCode;
        long j;
        long j2;
        int i4;
        if (this.zaa.zaD()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zai = this.zaa.zai(this.zac)) != null && (zai.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zai.zaf();
                boolean z = true;
                int i5 = 0;
                boolean z2 = this.zad > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                int i6 = 100;
                if (config != null) {
                    z2 &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zai, baseGmsClient, this.zab);
                        if (zab == null) {
                            return;
                        }
                        if (!zab.getMethodTimingTelemetryEnabled() || this.zad <= 0) {
                            z = false;
                        }
                        maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                        z2 = z;
                    }
                    i3 = batchPeriodMillis;
                    i2 = maxMethodInvocationsInBatch;
                } else {
                    i = 0;
                    i2 = 100;
                    i3 = 5000;
                }
                GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    errorCode = 0;
                } else {
                    if (!task.isCanceled()) {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            i6 = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            if (connectionResult != null) {
                                errorCode = connectionResult.getErrorCode();
                                i5 = i6;
                            }
                        } else {
                            i5 = 101;
                            errorCode = -1;
                        }
                    }
                    i5 = i6;
                    errorCode = -1;
                }
                if (z2) {
                    long j3 = this.zad;
                    long j4 = this.zae;
                    long currentTimeMillis = System.currentTimeMillis();
                    i4 = (int) (SystemClock.elapsedRealtime() - j4);
                    j2 = currentTimeMillis;
                    j = j3;
                } else {
                    j = 0;
                    j2 = 0;
                    i4 = -1;
                }
                googleApiManager.zaw(new MethodInvocation(this.zab, i5, errorCode, j, j2, null, null, gCoreServiceId, i4), i, i3, i2);
            }
        }
    }
}
