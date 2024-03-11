package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import o.AbstractC7877dM;
import o.C3658bG;
import o.C5751cH;
import o.C8557dq;
import o.InterfaceC7324cu;
import o.InterfaceC7643dA;
import o.InterfaceC7697dC;

/* loaded from: classes2.dex */
public class PolystarShape implements InterfaceC7697dC {
    private final String a;
    private final C8557dq b;
    private final C8557dq c;
    private final boolean d;
    private final boolean e;
    private final C8557dq f;
    private final C8557dq g;
    private final InterfaceC7643dA<PointF, PointF> h;
    private final C8557dq i;
    private final C8557dq j;
    private final Type k;

    public String a() {
        return this.a;
    }

    public C8557dq b() {
        return this.g;
    }

    public C8557dq c() {
        return this.c;
    }

    public C8557dq d() {
        return this.b;
    }

    public C8557dq e() {
        return this.i;
    }

    public C8557dq f() {
        return this.f;
    }

    public InterfaceC7643dA<PointF, PointF> g() {
        return this.h;
    }

    public Type h() {
        return this.k;
    }

    public C8557dq i() {
        return this.j;
    }

    public boolean j() {
        return this.d;
    }

    public boolean m() {
        return this.e;
    }

    /* loaded from: classes2.dex */
    public enum Type {
        STAR(1),
        POLYGON(2);
        
        private final int e;

        Type(int i) {
            this.e = i;
        }

        public static Type e(int i) {
            Type[] values;
            for (Type type : values()) {
                if (type.e == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, C8557dq c8557dq, InterfaceC7643dA<PointF, PointF> interfaceC7643dA, C8557dq c8557dq2, C8557dq c8557dq3, C8557dq c8557dq4, C8557dq c8557dq5, C8557dq c8557dq6, boolean z, boolean z2) {
        this.a = str;
        this.k = type;
        this.f = c8557dq;
        this.h = interfaceC7643dA;
        this.j = c8557dq2;
        this.c = c8557dq3;
        this.i = c8557dq4;
        this.b = c8557dq5;
        this.g = c8557dq6;
        this.d = z;
        this.e = z2;
    }

    @Override // o.InterfaceC7697dC
    public InterfaceC7324cu b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM) {
        return new C5751cH(lottieDrawable, abstractC7877dM, this);
    }
}
