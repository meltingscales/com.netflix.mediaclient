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
public final class DimensionMatchStrategy {
    public static final d a;
    private static final /* synthetic */ DimensionMatchStrategy[] g;
    private static final C9033hu i;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String f;
    public static final DimensionMatchStrategy d = new DimensionMatchStrategy("CLOSEST", 0, "CLOSEST");
    public static final DimensionMatchStrategy e = new DimensionMatchStrategy("LARGER", 1, "LARGER");
    public static final DimensionMatchStrategy c = new DimensionMatchStrategy("SMALLER", 2, "SMALLER");
    public static final DimensionMatchStrategy b = new DimensionMatchStrategy("UNKNOWN__", 3, "UNKNOWN__");

    public static InterfaceC8598drn<DimensionMatchStrategy> c() {
        return j;
    }

    private static final /* synthetic */ DimensionMatchStrategy[] d() {
        return new DimensionMatchStrategy[]{d, e, c, b};
    }

    public static DimensionMatchStrategy valueOf(String str) {
        return (DimensionMatchStrategy) Enum.valueOf(DimensionMatchStrategy.class, str);
    }

    public static DimensionMatchStrategy[] values() {
        return (DimensionMatchStrategy[]) g.clone();
    }

    public final String b() {
        return this.f;
    }

    private DimensionMatchStrategy(String str, int i2, String str2) {
        this.f = str2;
    }

    static {
        List j2;
        DimensionMatchStrategy[] d2 = d();
        g = d2;
        j = C8600drp.e(d2);
        a = new d(null);
        j2 = C8569dql.j("CLOSEST", "LARGER", "SMALLER");
        i = new C9033hu("DimensionMatchStrategy", j2);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final DimensionMatchStrategy b(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = DimensionMatchStrategy.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((DimensionMatchStrategy) obj).b(), (Object) str)) {
                    break;
                }
            }
            DimensionMatchStrategy dimensionMatchStrategy = (DimensionMatchStrategy) obj;
            return dimensionMatchStrategy == null ? DimensionMatchStrategy.b : dimensionMatchStrategy;
        }
    }
}
