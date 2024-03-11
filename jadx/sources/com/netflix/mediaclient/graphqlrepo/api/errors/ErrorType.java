package com.netflix.mediaclient.graphqlrepo.api.errors;

import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ErrorType {
    public static final e c;
    private static final /* synthetic */ InterfaceC8598drn i;
    private static final /* synthetic */ ErrorType[] k;
    private final String m;
    public static final ErrorType d = new ErrorType("BAD_REQUEST", 0, "BAD_REQUEST");
    public static final ErrorType e = new ErrorType("FAILED_PRECONDITION", 1, "FAILED_PRECONDITION");
    public static final ErrorType a = new ErrorType("INTERNAL", 2, "INTERNAL");
    public static final ErrorType b = new ErrorType("NOT_FOUND", 3, "NOT_FOUND");
    public static final ErrorType h = new ErrorType("PERMISSION_DENIED", 4, "PERMISSION_DENIED");
    public static final ErrorType g = new ErrorType("UNAUTHENTICATED", 5, "UNAUTHENTICATED");
    public static final ErrorType f = new ErrorType("UNAVAILABLE", 6, "UNAVAILABLE");
    public static final ErrorType j = new ErrorType("UNKNOWN", 7, "UNKNOWN");

    private static final /* synthetic */ ErrorType[] a() {
        return new ErrorType[]{d, e, a, b, h, g, f, j};
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) k.clone();
    }

    public final String c() {
        return this.m;
    }

    private ErrorType(String str, int i2, String str2) {
        this.m = str2;
    }

    static {
        ErrorType[] a2 = a();
        k = a2;
        i = C8600drp.e(a2);
        c = new e(null);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final ErrorType d(String str) {
            ErrorType errorType;
            C8632dsu.c((Object) str, "");
            ErrorType[] values = ErrorType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    errorType = null;
                    break;
                }
                errorType = values[i];
                if (C8632dsu.c((Object) errorType.c(), (Object) str)) {
                    break;
                }
                i++;
            }
            return errorType == null ? ErrorType.j : errorType;
        }
    }
}
