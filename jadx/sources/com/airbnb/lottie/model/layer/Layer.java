package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.model.content.Mask;
import java.util.List;
import java.util.Locale;
import o.C3658bG;
import o.C7724dD;
import o.C8557dq;
import o.C8719dw;
import o.C8746dx;
import o.C8800dz;
import o.C8864ek;
import o.C8910fd;
import o.InterfaceC7697dC;

/* loaded from: classes2.dex */
public class Layer {
    private final boolean a;
    private final C8864ek b;
    private final C3658bG c;
    private final C7724dD d;
    private final List<C8910fd<Float>> e;
    private final List<Mask> f;
    private final long g;
    private final MatteType h;
    private final String i;
    private final LayerType j;
    private final List<InterfaceC7697dC> k;
    private final long l;
    private final float m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final float f13090o;
    private final float p;
    private final C8719dw q;
    private final int r;
    private final int s;
    private final int t;
    private final C8557dq u;
    private final C8746dx v;
    private final C8800dz w;
    private final float x;

    /* loaded from: classes2.dex */
    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* loaded from: classes2.dex */
    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public C7724dD a() {
        return this.d;
    }

    public C3658bG b() {
        return this.c;
    }

    public List<C8910fd<Float>> c() {
        return this.e;
    }

    public long d() {
        return this.g;
    }

    public C8864ek e() {
        return this.b;
    }

    public long f() {
        return this.l;
    }

    public List<Mask> g() {
        return this.f;
    }

    public String h() {
        return this.i;
    }

    public MatteType i() {
        return this.h;
    }

    public LayerType j() {
        return this.j;
    }

    public String k() {
        return this.n;
    }

    public float l() {
        return this.m;
    }

    public List<InterfaceC7697dC> m() {
        return this.k;
    }

    public float n() {
        return this.f13090o;
    }

    public int o() {
        return this.s;
    }

    public int p() {
        return this.t;
    }

    public C8800dz q() {
        return this.w;
    }

    public int s() {
        return this.r;
    }

    public C8719dw t() {
        return this.q;
    }

    public boolean u() {
        return this.a;
    }

    public C8746dx v() {
        return this.v;
    }

    public float x() {
        return this.x;
    }

    public C8557dq y() {
        return this.u;
    }

    public Layer(List<InterfaceC7697dC> list, C3658bG c3658bG, String str, long j, LayerType layerType, long j2, String str2, List<Mask> list2, C8746dx c8746dx, int i, int i2, int i3, float f, float f2, float f3, float f4, C8719dw c8719dw, C8800dz c8800dz, List<C8910fd<Float>> list3, MatteType matteType, C8557dq c8557dq, boolean z, C7724dD c7724dD, C8864ek c8864ek) {
        this.k = list;
        this.c = c3658bG;
        this.i = str;
        this.g = j;
        this.j = layerType;
        this.l = j2;
        this.n = str2;
        this.f = list2;
        this.v = c8746dx;
        this.r = i;
        this.t = i2;
        this.s = i3;
        this.x = f;
        this.p = f2;
        this.f13090o = f3;
        this.m = f4;
        this.q = c8719dw;
        this.w = c8800dz;
        this.e = list3;
        this.h = matteType;
        this.u = c8557dq;
        this.a = z;
        this.d = c7724dD;
        this.b = c8864ek;
    }

    public float r() {
        return this.p / this.c.b();
    }

    public String toString() {
        return c("");
    }

    public String c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(h());
        sb.append("\n");
        Layer c = this.c.c(f());
        if (c != null) {
            sb.append("\t\tParents: ");
            sb.append(c.h());
            Layer c2 = this.c.c(c.f());
            while (c2 != null) {
                sb.append("->");
                sb.append(c2.h());
                c2 = this.c.c(c2.f());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!g().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(g().size());
            sb.append("\n");
        }
        if (s() != 0 && p() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(s()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.k.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (InterfaceC7697dC interfaceC7697dC : this.k) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(interfaceC7697dC);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
