package com.netflix.mediaclient.graphqlrepo.api.errors;

import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ErrorDetail {
    public static final b c;
    private static final /* synthetic */ InterfaceC8598drn l;

    /* renamed from: o  reason: collision with root package name */
    private static final /* synthetic */ ErrorDetail[] f13188o;
    private final String r;
    public static final ErrorDetail m = new ErrorDetail("UNKNOWN", 0, "UNKNOWN");
    public static final ErrorDetail d = new ErrorDetail("FIELD_NOT_FOUND", 1, "FIELD_NOT_FOUND");
    public static final ErrorDetail h = new ErrorDetail("INVALID_CURSOR", 2, "INVALID_CURSOR");
    public static final ErrorDetail k = new ErrorDetail("UNIMPLEMENTED", 3, "UNIMPLEMENTED");
    public static final ErrorDetail b = new ErrorDetail("INVALID_ARGUMENT", 4, "INVALID_ARGUMENT");
    public static final ErrorDetail a = new ErrorDetail("DEADLINE_EXCEEDED", 5, "DEADLINE_EXCEEDED");
    public static final ErrorDetail f = new ErrorDetail("SERVICE_ERROR", 6, "SERVICE_ERROR");
    public static final ErrorDetail n = new ErrorDetail("THROTTLED_CPU", 7, "THROTTLED_CPU");
    public static final ErrorDetail j = new ErrorDetail("THROTTLED_CONCURRENCY", 8, "THROTTLED_CONCURRENCY");
    public static final ErrorDetail e = new ErrorDetail("ENHANCE_YOUR_CALM", 9, "ENHANCE_YOUR_CALM");
    public static final ErrorDetail i = new ErrorDetail("TCP_FAILURE", 10, "TCP_FAILURE");
    public static final ErrorDetail g = new ErrorDetail("MISSING_RESOURCE", 11, "MISSING_RESOURCE");

    private static final /* synthetic */ ErrorDetail[] a() {
        return new ErrorDetail[]{m, d, h, k, b, a, f, n, j, e, i, g};
    }

    public static ErrorDetail valueOf(String str) {
        return (ErrorDetail) Enum.valueOf(ErrorDetail.class, str);
    }

    public static ErrorDetail[] values() {
        return (ErrorDetail[]) f13188o.clone();
    }

    public final String c() {
        return this.r;
    }

    private ErrorDetail(String str, int i2, String str2) {
        this.r = str2;
    }

    static {
        ErrorDetail[] a2 = a();
        f13188o = a2;
        l = C8600drp.e(a2);
        c = new b(null);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final ErrorDetail e(String str) {
            ErrorDetail errorDetail;
            C8632dsu.c((Object) str, "");
            ErrorDetail[] values = ErrorDetail.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    errorDetail = null;
                    break;
                }
                errorDetail = values[i];
                if (C8632dsu.c((Object) errorDetail.c(), (Object) str)) {
                    break;
                }
                i++;
            }
            return errorDetail == null ? ErrorDetail.m : errorDetail;
        }
    }
}
