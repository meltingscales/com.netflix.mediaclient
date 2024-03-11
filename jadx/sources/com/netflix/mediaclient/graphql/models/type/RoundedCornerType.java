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
public final class RoundedCornerType {
    public static final d b;
    private static final /* synthetic */ InterfaceC8598drn d;
    private static final /* synthetic */ RoundedCornerType[] g;
    private static final C9033hu h;
    private final String i;
    public static final RoundedCornerType c = new RoundedCornerType("ALL", 0, "ALL");
    public static final RoundedCornerType a = new RoundedCornerType("TOP", 1, "TOP");
    public static final RoundedCornerType e = new RoundedCornerType("UNKNOWN__", 2, "UNKNOWN__");

    public static InterfaceC8598drn<RoundedCornerType> a() {
        return d;
    }

    private static final /* synthetic */ RoundedCornerType[] c() {
        return new RoundedCornerType[]{c, a, e};
    }

    public static RoundedCornerType valueOf(String str) {
        return (RoundedCornerType) Enum.valueOf(RoundedCornerType.class, str);
    }

    public static RoundedCornerType[] values() {
        return (RoundedCornerType[]) g.clone();
    }

    public final String d() {
        return this.i;
    }

    private RoundedCornerType(String str, int i, String str2) {
        this.i = str2;
    }

    static {
        List j;
        RoundedCornerType[] c2 = c();
        g = c2;
        d = C8600drp.e(c2);
        b = new d(null);
        j = C8569dql.j("ALL", "TOP");
        h = new C9033hu("RoundedCornerType", j);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final RoundedCornerType b(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = RoundedCornerType.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((RoundedCornerType) obj).d(), (Object) str)) {
                    break;
                }
            }
            RoundedCornerType roundedCornerType = (RoundedCornerType) obj;
            return roundedCornerType == null ? RoundedCornerType.e : roundedCornerType;
        }
    }
}
