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
public final class ScaleStrategy {
    public static final e a;
    private static final C9033hu g;
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final /* synthetic */ ScaleStrategy[] i;
    private final String f;
    public static final ScaleStrategy e = new ScaleStrategy("DEFAULT", 0, "DEFAULT");
    public static final ScaleStrategy c = new ScaleStrategy("CONTAIN", 1, "CONTAIN");
    public static final ScaleStrategy d = new ScaleStrategy("COVER", 2, "COVER");
    public static final ScaleStrategy b = new ScaleStrategy("UNKNOWN__", 3, "UNKNOWN__");

    private static final /* synthetic */ ScaleStrategy[] a() {
        return new ScaleStrategy[]{e, c, d, b};
    }

    public static InterfaceC8598drn<ScaleStrategy> e() {
        return h;
    }

    public static ScaleStrategy valueOf(String str) {
        return (ScaleStrategy) Enum.valueOf(ScaleStrategy.class, str);
    }

    public static ScaleStrategy[] values() {
        return (ScaleStrategy[]) i.clone();
    }

    public final String d() {
        return this.f;
    }

    private ScaleStrategy(String str, int i2, String str2) {
        this.f = str2;
    }

    static {
        List j;
        ScaleStrategy[] a2 = a();
        i = a2;
        h = C8600drp.e(a2);
        a = new e(null);
        j = C8569dql.j("DEFAULT", "CONTAIN", "COVER");
        g = new C9033hu("ScaleStrategy", j);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final ScaleStrategy e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = ScaleStrategy.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((ScaleStrategy) obj).d(), (Object) str)) {
                    break;
                }
            }
            ScaleStrategy scaleStrategy = (ScaleStrategy) obj;
            return scaleStrategy == null ? ScaleStrategy.b : scaleStrategy;
        }
    }
}
