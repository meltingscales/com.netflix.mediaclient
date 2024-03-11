package com.netflix.mediaclient.api.logging.error;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ErrorType {
    private static final /* synthetic */ ErrorType[] x;
    private static final /* synthetic */ InterfaceC8598drn y;
    private final String u;
    public static final ErrorType m = new ErrorType("FALCOR", 0, "Falcor");
    public static final ErrorType n = new ErrorType("FALCOR_SQLITE", 1, "Falcor-sqlite");
    public static final ErrorType s = new ErrorType("UMA", 2, "UMA");
    public static final ErrorType t = new ErrorType("THREADING", 3, "Threading");
    public static final ErrorType q = new ErrorType("PERFORMANCE_TRACE", 4, "PerformanceTrace");
    public static final ErrorType j = new ErrorType("CL", 5, "Logging");
    public static final ErrorType p = new ErrorType("MSL", 6, "MSL");

    /* renamed from: o  reason: collision with root package name */
    public static final ErrorType f13164o = new ErrorType("LOGIN", 7, "Login");
    public static final ErrorType f = new ErrorType("EXTERNAL_BROWSER", 8, "ExternalBrowser");
    public static final ErrorType l = new ErrorType("GRAPHQL", 9, "GraphQL");
    public static final ErrorType e = new ErrorType("ASE", 10, "ASE");
    public static final ErrorType c = new ErrorType("ANDROID", 11, "Android");
    public static final ErrorType d = new ErrorType("CAST", 12, "Cast");
    public static final ErrorType k = new ErrorType("MDX", 13, "MDX");
    public static final ErrorType i = new ErrorType("DEXGUARD", 14, "Dexguard");
    public static final ErrorType b = new ErrorType("ALE", 15, "ALE");
    public static final ErrorType g = new ErrorType("CONFIG", 16, "Config");
    public static final ErrorType v = new ErrorType("ZUUL", 17, "Zuul");
    public static final ErrorType r = new ErrorType("PLAY_INTEGRITY", 18, "PlayIntegrity");
    public static final ErrorType h = new ErrorType("DOWNLOADS", 19, "Downloads");
    public static final ErrorType a = new ErrorType("CDX", 20, "CDX");
    public static final ErrorType w = new ErrorType("WIDEVINE", 21, "Widevine");

    private static final /* synthetic */ ErrorType[] a() {
        return new ErrorType[]{m, n, s, t, q, j, p, f13164o, f, l, e, c, d, k, i, b, g, v, r, h, a, w};
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) x.clone();
    }

    public final String c() {
        return this.u;
    }

    private ErrorType(String str, int i2, String str2) {
        this.u = str2;
    }

    static {
        ErrorType[] a2 = a();
        x = a2;
        y = C8600drp.e(a2);
    }
}
