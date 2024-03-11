package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.InterfaceC9316nL;

/* loaded from: classes5.dex */
public enum JsonValueFormat {
    COLOR("color"),
    DATE("date"),
    DATE_TIME("date-time"),
    EMAIL(SignupConstants.Field.EMAIL),
    HOST_NAME("host-name"),
    IP_ADDRESS("ip-address"),
    IPV6("ipv6"),
    PHONE("phone"),
    REGEX("regex"),
    STYLE("style"),
    TIME("time"),
    URI("uri"),
    UTC_MILLISEC("utc-millisec"),
    UUID("uuid");
    
    private final String r;

    @Override // java.lang.Enum
    @InterfaceC9316nL
    public String toString() {
        return this.r;
    }

    JsonValueFormat(String str) {
        this.r = str;
    }
}
