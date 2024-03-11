package com.apollographql.apollo3.exception;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class CacheMissException extends ApolloException {
    public static final d c = new d(null);
    private final String a;
    private final String b;
    private final boolean e;

    public final boolean c() {
        return this.e;
    }

    public /* synthetic */ CacheMissException(String str, String str2, boolean z, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheMissException(String str, String str2, boolean z) {
        super(c.c(str, str2, z), null, 2, null);
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.b = str2;
        this.e = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CacheMissException(String str, String str2) {
        this(str, str2, false);
        C8632dsu.c((Object) str, "");
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final String c(String str, String str2, boolean z) {
            if (str2 == null) {
                return "Object '" + str + "' not found";
            } else if (z) {
                return "Field '" + str2 + "' on object '" + str + "' is stale";
            } else {
                return "Object '" + str + "' has no field named '" + str2 + '\'';
            }
        }
    }
}
