package com.netflix.clcs.codegen.type;

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
/* loaded from: classes2.dex */
public final class CLCSFieldValueProvider {
    public static final a d;
    private static final C9033hu g;
    private static final /* synthetic */ CLCSFieldValueProvider[] i;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String h;
    public static final CLCSFieldValueProvider e = new CLCSFieldValueProvider("ANDROID_APP_HASH", 0, "ANDROID_APP_HASH");
    public static final CLCSFieldValueProvider a = new CLCSFieldValueProvider("WEB_RENDERING_URL_TEMPLATE", 1, "WEB_RENDERING_URL_TEMPLATE");
    public static final CLCSFieldValueProvider b = new CLCSFieldValueProvider("TV_REFRESHED_PARTNER_PAYMENT_TOKEN_PAYLOAD", 2, "TV_REFRESHED_PARTNER_PAYMENT_TOKEN_PAYLOAD");
    public static final CLCSFieldValueProvider c = new CLCSFieldValueProvider("UNKNOWN__", 3, "UNKNOWN__");

    private static final /* synthetic */ CLCSFieldValueProvider[] c() {
        return new CLCSFieldValueProvider[]{e, a, b, c};
    }

    public static InterfaceC8598drn<CLCSFieldValueProvider> d() {
        return j;
    }

    public static CLCSFieldValueProvider valueOf(String str) {
        return (CLCSFieldValueProvider) Enum.valueOf(CLCSFieldValueProvider.class, str);
    }

    public static CLCSFieldValueProvider[] values() {
        return (CLCSFieldValueProvider[]) i.clone();
    }

    public final String e() {
        return this.h;
    }

    private CLCSFieldValueProvider(String str, int i2, String str2) {
        this.h = str2;
    }

    static {
        List j2;
        CLCSFieldValueProvider[] c2 = c();
        i = c2;
        j = C8600drp.e(c2);
        d = new a(null);
        j2 = C8569dql.j("ANDROID_APP_HASH", "WEB_RENDERING_URL_TEMPLATE", "TV_REFRESHED_PARTNER_PAYMENT_TOKEN_PAYLOAD");
        g = new C9033hu("CLCSFieldValueProvider", j2);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C9033hu c() {
            return CLCSFieldValueProvider.g;
        }

        public final CLCSFieldValueProvider e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSFieldValueProvider.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSFieldValueProvider) obj).e(), (Object) str)) {
                    break;
                }
            }
            CLCSFieldValueProvider cLCSFieldValueProvider = (CLCSFieldValueProvider) obj;
            return cLCSFieldValueProvider == null ? CLCSFieldValueProvider.c : cLCSFieldValueProvider;
        }
    }
}
