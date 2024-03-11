package com.netflix.mediaclient.graphqlrepo.api.kotlinx;

import java.util.List;
import java.util.Map;
import o.C8627dsp;
import o.aCS;

/* loaded from: classes3.dex */
public final class NetflixGraphQLException extends RuntimeException {
    private final String c;
    private final List<aCS> d;
    private final Map<String, String> e;

    public NetflixGraphQLException() {
        this(null, null, null, 7, null);
    }

    public final Map<String, String> a() {
        return this.e;
    }

    public final List<aCS> d() {
        return this.d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.c;
    }

    public /* synthetic */ NetflixGraphQLException(String str, List list, Map map, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : map);
    }

    public NetflixGraphQLException(String str, List<aCS> list, Map<String, String> map) {
        super(str);
        this.c = str;
        this.d = list;
        this.e = map;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        List<aCS> list = this.d;
        return "NetflixGraphQLException(message=" + message + ", errors=" + list + ")";
    }
}
