package com.apollographql.apollo3.api.http;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HttpMethod {
    private static final /* synthetic */ InterfaceC8598drn b;
    private static final /* synthetic */ HttpMethod[] c;
    public static final HttpMethod e = new HttpMethod("Get", 0);
    public static final HttpMethod a = new HttpMethod("Post", 1);

    private static final /* synthetic */ HttpMethod[] a() {
        return new HttpMethod[]{e, a};
    }

    public static HttpMethod valueOf(String str) {
        return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
    }

    public static HttpMethod[] values() {
        return (HttpMethod[]) c.clone();
    }

    private HttpMethod(String str, int i) {
    }

    static {
        HttpMethod[] a2 = a();
        c = a2;
        b = C8600drp.e(a2);
    }
}
