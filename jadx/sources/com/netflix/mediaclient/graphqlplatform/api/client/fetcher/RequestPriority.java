package com.netflix.mediaclient.graphqlplatform.api.client.fetcher;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class RequestPriority {
    private static final /* synthetic */ InterfaceC8598drn e;
    private static final /* synthetic */ RequestPriority[] j;
    public static final RequestPriority b = new RequestPriority("LOW", 0);
    public static final RequestPriority c = new RequestPriority("NORMAL", 1);
    public static final RequestPriority d = new RequestPriority("HIGH", 2);
    public static final RequestPriority a = new RequestPriority("IMMEDIATE", 3);

    private static final /* synthetic */ RequestPriority[] e() {
        return new RequestPriority[]{b, c, d, a};
    }

    public static RequestPriority valueOf(String str) {
        return (RequestPriority) Enum.valueOf(RequestPriority.class, str);
    }

    public static RequestPriority[] values() {
        return (RequestPriority[]) j.clone();
    }

    private RequestPriority(String str, int i) {
    }

    static {
        RequestPriority[] e2 = e();
        j = e2;
        e = C8600drp.e(e2);
    }
}
