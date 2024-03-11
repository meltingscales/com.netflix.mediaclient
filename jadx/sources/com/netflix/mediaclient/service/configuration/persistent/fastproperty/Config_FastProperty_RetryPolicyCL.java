package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;

/* loaded from: classes.dex */
public class Config_FastProperty_RetryPolicyCL extends Config_FastProperty_LoggingRetryPolicy {
    protected static String FP_NAME = "retryPolicyCL";
    @SerializedName("updateEnvelopeSendTime")
    public boolean updateEnvelopeSendTime = true;

    @Override // o.aRW
    public String getName() {
        return FP_NAME;
    }

    public static boolean shouldRetryOnFailureToDeliver() {
        Config_FastProperty_LoggingRetryPolicy config_FastProperty_LoggingRetryPolicy = (Config_FastProperty_LoggingRetryPolicy) C1822aPn.b(FP_NAME);
        if (config_FastProperty_LoggingRetryPolicy != null) {
            return config_FastProperty_LoggingRetryPolicy.retryOnFailureToDeliver;
        }
        return false;
    }

    public static boolean shouldRetryAllFailuresWhenNetworkAvailable() {
        Config_FastProperty_LoggingRetryPolicy config_FastProperty_LoggingRetryPolicy = (Config_FastProperty_LoggingRetryPolicy) C1822aPn.b(FP_NAME);
        if (config_FastProperty_LoggingRetryPolicy != null) {
            return config_FastProperty_LoggingRetryPolicy.retryAllFailuresWhenNetworkAvailable;
        }
        return false;
    }

    public static boolean shouldRetryWhenScheduled() {
        Config_FastProperty_LoggingRetryPolicy config_FastProperty_LoggingRetryPolicy = (Config_FastProperty_LoggingRetryPolicy) C1822aPn.b(FP_NAME);
        if (config_FastProperty_LoggingRetryPolicy != null) {
            return config_FastProperty_LoggingRetryPolicy.retryWhenScheduled;
        }
        return true;
    }

    public static int getRetryTimeoutInHours() {
        Config_FastProperty_LoggingRetryPolicy config_FastProperty_LoggingRetryPolicy = (Config_FastProperty_LoggingRetryPolicy) C1822aPn.b(FP_NAME);
        if (config_FastProperty_LoggingRetryPolicy != null) {
            return config_FastProperty_LoggingRetryPolicy.retryTimeoutInHours;
        }
        return 24;
    }

    public static int getUndeliveredPayloadExpirationInHours() {
        Config_FastProperty_LoggingRetryPolicy config_FastProperty_LoggingRetryPolicy = (Config_FastProperty_LoggingRetryPolicy) C1822aPn.b(FP_NAME);
        if (config_FastProperty_LoggingRetryPolicy != null) {
            return config_FastProperty_LoggingRetryPolicy.undeliveredPayloadExpirationInHours;
        }
        return 72;
    }

    public static boolean shouldLogDetailsOnErrorToDeliverEvents() {
        Config_FastProperty_LoggingRetryPolicy config_FastProperty_LoggingRetryPolicy = (Config_FastProperty_LoggingRetryPolicy) C1822aPn.b(FP_NAME);
        if (config_FastProperty_LoggingRetryPolicy != null) {
            return config_FastProperty_LoggingRetryPolicy.logDetailsForFailureToDeliverEvents;
        }
        return false;
    }

    public static boolean shouldCountFailuresToDeliverEvents() {
        Config_FastProperty_LoggingRetryPolicy config_FastProperty_LoggingRetryPolicy = (Config_FastProperty_LoggingRetryPolicy) C1822aPn.b(FP_NAME);
        if (config_FastProperty_LoggingRetryPolicy != null) {
            return config_FastProperty_LoggingRetryPolicy.countFailuresToDeliverEvents;
        }
        return true;
    }

    public static boolean isRetryDisabled() {
        Config_FastProperty_LoggingRetryPolicy config_FastProperty_LoggingRetryPolicy = (Config_FastProperty_LoggingRetryPolicy) C1822aPn.b(FP_NAME);
        if (config_FastProperty_LoggingRetryPolicy != null) {
            return config_FastProperty_LoggingRetryPolicy.disableRetries;
        }
        return false;
    }

    public static boolean shouldUpdateEnvelopeSendTimeOnResend() {
        Config_FastProperty_RetryPolicyCL config_FastProperty_RetryPolicyCL = (Config_FastProperty_RetryPolicyCL) C1822aPn.b(FP_NAME);
        if (config_FastProperty_RetryPolicyCL != null) {
            return config_FastProperty_RetryPolicyCL.updateEnvelopeSendTime;
        }
        return true;
    }
}
