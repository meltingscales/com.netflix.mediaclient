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
public final class BrandSizeBoost {
    public static final d e;
    private static final /* synthetic */ BrandSizeBoost[] g;
    private static final C9033hu i;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String f;
    public static final BrandSizeBoost a = new BrandSizeBoost("MEDIUM", 0, "MEDIUM");
    public static final BrandSizeBoost d = new BrandSizeBoost("LARGE", 1, "LARGE");
    public static final BrandSizeBoost c = new BrandSizeBoost("X_LARGE", 2, "X_LARGE");
    public static final BrandSizeBoost b = new BrandSizeBoost("UNKNOWN__", 3, "UNKNOWN__");

    private static final /* synthetic */ BrandSizeBoost[] b() {
        return new BrandSizeBoost[]{a, d, c, b};
    }

    public static InterfaceC8598drn<BrandSizeBoost> e() {
        return j;
    }

    public static BrandSizeBoost valueOf(String str) {
        return (BrandSizeBoost) Enum.valueOf(BrandSizeBoost.class, str);
    }

    public static BrandSizeBoost[] values() {
        return (BrandSizeBoost[]) g.clone();
    }

    public final String a() {
        return this.f;
    }

    private BrandSizeBoost(String str, int i2, String str2) {
        this.f = str2;
    }

    static {
        List j2;
        BrandSizeBoost[] b2 = b();
        g = b2;
        j = C8600drp.e(b2);
        e = new d(null);
        j2 = C8569dql.j("MEDIUM", "LARGE", "X_LARGE");
        i = new C9033hu("BrandSizeBoost", j2);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final BrandSizeBoost e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = BrandSizeBoost.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((BrandSizeBoost) obj).a(), (Object) str)) {
                    break;
                }
            }
            BrandSizeBoost brandSizeBoost = (BrandSizeBoost) obj;
            return brandSizeBoost == null ? BrandSizeBoost.b : brandSizeBoost;
        }
    }
}
