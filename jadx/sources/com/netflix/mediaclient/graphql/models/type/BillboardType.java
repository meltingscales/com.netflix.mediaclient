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
public final class BillboardType {
    public static final e b;
    private static final /* synthetic */ BillboardType[] r;
    private static final /* synthetic */ InterfaceC8598drn s;
    private static final C9033hu t;
    private final String q;
    public static final BillboardType p = new BillboardType("VERTICAL", 0, "VERTICAL");
    public static final BillboardType c = new BillboardType("AWARDS", 1, "AWARDS");
    public static final BillboardType j = new BillboardType("EPISODIC", 2, "EPISODIC");
    public static final BillboardType g = new BillboardType("GENRE", 3, "GENRE");
    public static final BillboardType k = new BillboardType("REMINDER", 4, "REMINDER");
    public static final BillboardType n = new BillboardType("STANDARD", 5, "STANDARD");
    public static final BillboardType a = new BillboardType("AWARD", 6, "AWARD");
    public static final BillboardType d = new BillboardType("COUNTDOWN", 7, "COUNTDOWN");
    public static final BillboardType l = new BillboardType("UNKNOWN", 8, "UNKNOWN");
    public static final BillboardType e = new BillboardType("CONTENT_REFRESH", 9, "CONTENT_REFRESH");
    public static final BillboardType i = new BillboardType("PREVIEWS", 10, "PREVIEWS");
    public static final BillboardType h = new BillboardType("PLAYBILL", 11, "PLAYBILL");
    public static final BillboardType f = new BillboardType("MULTI_TITLE", 12, "MULTI_TITLE");

    /* renamed from: o  reason: collision with root package name */
    public static final BillboardType f13174o = new BillboardType("SHOW_AS_A_ROW", 13, "SHOW_AS_A_ROW");
    public static final BillboardType m = new BillboardType("UNKNOWN__", 14, "UNKNOWN__");

    private static final /* synthetic */ BillboardType[] a() {
        return new BillboardType[]{p, c, j, g, k, n, a, d, l, e, i, h, f, f13174o, m};
    }

    public static InterfaceC8598drn<BillboardType> b() {
        return s;
    }

    public static BillboardType valueOf(String str) {
        return (BillboardType) Enum.valueOf(BillboardType.class, str);
    }

    public static BillboardType[] values() {
        return (BillboardType[]) r.clone();
    }

    public final String c() {
        return this.q;
    }

    private BillboardType(String str, int i2, String str2) {
        this.q = str2;
    }

    static {
        List j2;
        BillboardType[] a2 = a();
        r = a2;
        s = C8600drp.e(a2);
        b = new e(null);
        j2 = C8569dql.j("VERTICAL", "AWARDS", "EPISODIC", "GENRE", "REMINDER", "STANDARD", "AWARD", "COUNTDOWN", "UNKNOWN", "CONTENT_REFRESH", "PREVIEWS", "PLAYBILL", "MULTI_TITLE", "SHOW_AS_A_ROW");
        t = new C9033hu("BillboardType", j2);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final C9033hu c() {
            return BillboardType.t;
        }

        public final BillboardType a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = BillboardType.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((BillboardType) obj).c(), (Object) str)) {
                    break;
                }
            }
            BillboardType billboardType = (BillboardType) obj;
            return billboardType == null ? BillboardType.m : billboardType;
        }
    }
}
