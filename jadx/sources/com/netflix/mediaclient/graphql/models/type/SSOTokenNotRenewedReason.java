package com.netflix.mediaclient.graphql.models.type;

import java.util.Iterator;
import java.util.List;
import o.C8569dql;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9033hu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SSOTokenNotRenewedReason {
    private static final /* synthetic */ InterfaceC8598drn b;
    public static final a c;
    private static final /* synthetic */ SSOTokenNotRenewedReason[] i;
    private static final C9033hu j;
    private final String f;
    public static final SSOTokenNotRenewedReason e = new SSOTokenNotRenewedReason("TOKEN_INVALID", 0, "TOKEN_INVALID");
    public static final SSOTokenNotRenewedReason a = new SSOTokenNotRenewedReason("TOKEN_ACTIVE", 1, "TOKEN_ACTIVE");
    public static final SSOTokenNotRenewedReason d = new SSOTokenNotRenewedReason("UNKNOWN__", 2, "UNKNOWN__");

    private static final /* synthetic */ SSOTokenNotRenewedReason[] a() {
        return new SSOTokenNotRenewedReason[]{e, a, d};
    }

    public static InterfaceC8598drn<SSOTokenNotRenewedReason> c() {
        return b;
    }

    public static SSOTokenNotRenewedReason valueOf(String str) {
        return (SSOTokenNotRenewedReason) Enum.valueOf(SSOTokenNotRenewedReason.class, str);
    }

    public static SSOTokenNotRenewedReason[] values() {
        return (SSOTokenNotRenewedReason[]) i.clone();
    }

    public final String b() {
        return this.f;
    }

    private SSOTokenNotRenewedReason(String str, int i2, String str2) {
        this.f = str2;
    }

    static {
        List j2;
        SSOTokenNotRenewedReason[] a2 = a();
        i = a2;
        b = C8600drp.e(a2);
        c = new a(null);
        j2 = C8569dql.j("TOKEN_INVALID", "TOKEN_ACTIVE");
        j = new C9033hu("SSOTokenNotRenewedReason", j2);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C9033hu b() {
            return SSOTokenNotRenewedReason.j;
        }

        public final SSOTokenNotRenewedReason a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = SSOTokenNotRenewedReason.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((SSOTokenNotRenewedReason) obj).b(), (Object) str)) {
                    break;
                }
            }
            SSOTokenNotRenewedReason sSOTokenNotRenewedReason = (SSOTokenNotRenewedReason) obj;
            return sSOTokenNotRenewedReason == null ? SSOTokenNotRenewedReason.d : sSOTokenNotRenewedReason;
        }
    }
}
