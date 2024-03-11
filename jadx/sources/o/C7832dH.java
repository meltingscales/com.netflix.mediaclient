package o;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import java.util.List;

/* renamed from: o.dH  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7832dH implements InterfaceC7697dC {
    private final C8611ds a;
    private final ShapeStroke.LineCapType b;
    private final GradientType c;
    private final C8557dq d;
    private final C8476dn e;
    private final ShapeStroke.LineJoinType f;
    private final float g;
    private final boolean h;
    private final String i;
    private final List<C8557dq> j;
    private final C8665du k;
    private final C8611ds l;
    private final C8557dq m;

    public C8557dq a() {
        return this.d;
    }

    public C8611ds b() {
        return this.a;
    }

    public C8476dn c() {
        return this.e;
    }

    public GradientType d() {
        return this.c;
    }

    public ShapeStroke.LineCapType e() {
        return this.b;
    }

    public String f() {
        return this.i;
    }

    public ShapeStroke.LineJoinType g() {
        return this.f;
    }

    public C8665du h() {
        return this.k;
    }

    public float i() {
        return this.g;
    }

    public List<C8557dq> j() {
        return this.j;
    }

    public C8611ds k() {
        return this.l;
    }

    public boolean m() {
        return this.h;
    }

    public C8557dq n() {
        return this.m;
    }

    public C7832dH(String str, GradientType gradientType, C8476dn c8476dn, C8665du c8665du, C8611ds c8611ds, C8611ds c8611ds2, C8557dq c8557dq, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, List<C8557dq> list, C8557dq c8557dq2, boolean z) {
        this.i = str;
        this.c = gradientType;
        this.e = c8476dn;
        this.k = c8665du;
        this.l = c8611ds;
        this.a = c8611ds2;
        this.m = c8557dq;
        this.b = lineCapType;
        this.f = lineJoinType;
        this.g = f;
        this.j = list;
        this.d = c8557dq2;
        this.h = z;
    }

    @Override // o.InterfaceC7697dC
    public InterfaceC7324cu b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM) {
        return new C5535cB(lottieDrawable, abstractC7877dM, this);
    }
}
