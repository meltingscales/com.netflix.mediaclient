package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import o.AbstractC7877dM;
import o.C3658bG;
import o.C5859cL;
import o.C8557dq;
import o.InterfaceC7324cu;
import o.InterfaceC7697dC;

/* loaded from: classes2.dex */
public class ShapeTrimPath implements InterfaceC7697dC {
    private final C8557dq a;
    private final C8557dq b;
    private final boolean c;
    private final String d;
    private final C8557dq e;
    private final Type i;

    public C8557dq a() {
        return this.b;
    }

    public C8557dq b() {
        return this.a;
    }

    public Type c() {
        return this.i;
    }

    public C8557dq d() {
        return this.e;
    }

    public String e() {
        return this.d;
    }

    public boolean g() {
        return this.c;
    }

    /* loaded from: classes2.dex */
    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type d(int i) {
            if (i != 1) {
                if (i == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i);
            }
            return SIMULTANEOUSLY;
        }
    }

    public ShapeTrimPath(String str, Type type, C8557dq c8557dq, C8557dq c8557dq2, C8557dq c8557dq3, boolean z) {
        this.d = str;
        this.i = type;
        this.a = c8557dq;
        this.e = c8557dq2;
        this.b = c8557dq3;
        this.c = z;
    }

    @Override // o.InterfaceC7697dC
    public InterfaceC7324cu b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM) {
        return new C5859cL(abstractC7877dM, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.a + ", end: " + this.e + ", offset: " + this.b + "}";
    }
}
