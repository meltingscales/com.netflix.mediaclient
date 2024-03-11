package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import com.airbnb.lottie.LottieDrawable;
import java.util.List;
import o.AbstractC7877dM;
import o.C3658bG;
import o.C5778cI;
import o.C8530dp;
import o.C8557dq;
import o.C8665du;
import o.InterfaceC7324cu;
import o.InterfaceC7697dC;

/* loaded from: classes2.dex */
public class ShapeStroke implements InterfaceC7697dC {
    private final C8530dp a;
    private final LineCapType b;
    private final LineJoinType c;
    private final List<C8557dq> d;
    private final boolean e;
    private final C8557dq f;
    private final float g;
    private final C8665du h;
    private final String i;
    private final C8557dq j;

    public C8557dq a() {
        return this.j;
    }

    public LineJoinType b() {
        return this.c;
    }

    public List<C8557dq> c() {
        return this.d;
    }

    public LineCapType d() {
        return this.b;
    }

    public C8530dp e() {
        return this.a;
    }

    public String f() {
        return this.i;
    }

    public C8557dq g() {
        return this.f;
    }

    public C8665du h() {
        return this.h;
    }

    public float i() {
        return this.g;
    }

    public boolean j() {
        return this.e;
    }

    /* loaded from: classes2.dex */
    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap e() {
            int i = AnonymousClass2.e[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return Paint.Cap.ROUND;
                }
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] d;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            d = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            e = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join b() {
            int i = AnonymousClass2.d[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    public ShapeStroke(String str, C8557dq c8557dq, List<C8557dq> list, C8530dp c8530dp, C8665du c8665du, C8557dq c8557dq2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.i = str;
        this.j = c8557dq;
        this.d = list;
        this.a = c8530dp;
        this.h = c8665du;
        this.f = c8557dq2;
        this.b = lineCapType;
        this.c = lineJoinType;
        this.g = f;
        this.e = z;
    }

    @Override // o.InterfaceC7697dC
    public InterfaceC7324cu b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM) {
        return new C5778cI(lottieDrawable, abstractC7877dM, this);
    }
}
