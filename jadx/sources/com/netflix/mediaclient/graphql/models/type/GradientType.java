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
public final class GradientType {
    public static final e d;
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final /* synthetic */ GradientType[] j;
    private static final C9033hu l;

    /* renamed from: o  reason: collision with root package name */
    private final String f13178o;
    public static final GradientType a = new GradientType("BOTTOM", 0, "BOTTOM");
    public static final GradientType c = new GradientType("LEFT", 1, "LEFT");
    public static final GradientType f = new GradientType("RIGHT", 2, "RIGHT");
    public static final GradientType h = new GradientType("RIGHT_HALF", 3, "RIGHT_HALF");
    public static final GradientType e = new GradientType("LEFT_HALF", 4, "LEFT_HALF");
    public static final GradientType b = new GradientType("BOTTOM_TALL", 5, "BOTTOM_TALL");
    public static final GradientType i = new GradientType("UNKNOWN__", 6, "UNKNOWN__");

    public static InterfaceC8598drn<GradientType> a() {
        return g;
    }

    private static final /* synthetic */ GradientType[] c() {
        return new GradientType[]{a, c, f, h, e, b, i};
    }

    public static GradientType valueOf(String str) {
        return (GradientType) Enum.valueOf(GradientType.class, str);
    }

    public static GradientType[] values() {
        return (GradientType[]) j.clone();
    }

    public final String d() {
        return this.f13178o;
    }

    private GradientType(String str, int i2, String str2) {
        this.f13178o = str2;
    }

    static {
        List j2;
        GradientType[] c2 = c();
        j = c2;
        g = C8600drp.e(c2);
        d = new e(null);
        j2 = C8569dql.j("BOTTOM", "LEFT", "RIGHT", "RIGHT_HALF", "LEFT_HALF", "BOTTOM_TALL");
        l = new C9033hu("GradientType", j2);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final GradientType a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = GradientType.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((GradientType) obj).d(), (Object) str)) {
                    break;
                }
            }
            GradientType gradientType = (GradientType) obj;
            return gradientType == null ? GradientType.i : gradientType;
        }
    }
}
