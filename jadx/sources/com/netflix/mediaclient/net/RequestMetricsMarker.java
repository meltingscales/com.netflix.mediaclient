package com.netflix.mediaclient.net;

import java.util.Date;

/* loaded from: classes3.dex */
public class RequestMetricsMarker {
    public final Date a = new Date();
    public final Type d;

    /* loaded from: classes3.dex */
    public enum Type {
        MSL_START
    }

    public RequestMetricsMarker(Type type) {
        this.d = type;
    }
}
