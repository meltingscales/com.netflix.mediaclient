package o;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;

/* renamed from: o.dG  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7805dG implements InterfaceC7697dC {
    private final GradientType a;
    private final Path.FillType b;
    private final C8611ds c;
    private final boolean d;
    private final C8476dn e;
    private final String f;
    private final C8557dq g;
    private final C8557dq h;
    private final C8665du i;
    private final C8611ds j;

    public GradientType a() {
        return this.a;
    }

    public String b() {
        return this.f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public C8476dn d() {
        return this.e;
    }

    public C8611ds e() {
        return this.c;
    }

    public C8665du f() {
        return this.i;
    }

    public boolean i() {
        return this.d;
    }

    public C8611ds j() {
        return this.j;
    }

    public C7805dG(String str, GradientType gradientType, Path.FillType fillType, C8476dn c8476dn, C8665du c8665du, C8611ds c8611ds, C8611ds c8611ds2, C8557dq c8557dq, C8557dq c8557dq2, boolean z) {
        this.a = gradientType;
        this.b = fillType;
        this.e = c8476dn;
        this.i = c8665du;
        this.j = c8611ds;
        this.c = c8611ds2;
        this.f = str;
        this.g = c8557dq;
        this.h = c8557dq2;
        this.d = z;
    }

    @Override // o.InterfaceC7697dC
    public InterfaceC7324cu b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM) {
        return new C7536cy(lottieDrawable, c3658bG, abstractC7877dM, this);
    }
}
