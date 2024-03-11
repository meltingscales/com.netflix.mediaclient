package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.aRW;

/* loaded from: classes.dex */
abstract class Config_FastProperty_LoggingRetryPolicy extends aRW {
    @SerializedName("retryOnFailureToDeliver")
    public boolean retryOnFailureToDeliver = false;
    @SerializedName("retryAllFailuresWhenNetworkAvailable")
    public boolean retryAllFailuresWhenNetworkAvailable = false;
    @SerializedName("retryWhenScheduled")
    public boolean retryWhenScheduled = true;
    @SerializedName("retryTimeoutInHours")
    public int retryTimeoutInHours = 24;
    @SerializedName("undeliveredPayloadExpirationInHours")
    public int undeliveredPayloadExpirationInHours = 72;
    @SerializedName("logDetailsForFailureToDeliverEvents")
    public boolean logDetailsForFailureToDeliverEvents = false;
    @SerializedName("countFailuresToDeliverEvents")
    public boolean countFailuresToDeliverEvents = true;
    @SerializedName("disableRetries")
    public boolean disableRetries = false;
    @SerializedName("sendSavedEventsOnSuccessfulDelivery")
    public boolean sendSavedEventsOnSuccessfulDelivery = true;
}
