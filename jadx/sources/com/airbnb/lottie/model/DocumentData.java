package com.airbnb.lottie.model;

import android.graphics.PointF;

/* loaded from: classes2.dex */
public class DocumentData {
    public float a;
    public int b;
    public PointF c;
    public String d;
    public PointF e;
    public boolean f;
    public float g;
    public Justification h;
    public int i;
    public float j;
    public int k;
    public String m;
    public float n;

    /* loaded from: classes2.dex */
    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public void c(String str, String str2, float f, Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.m = str;
        this.d = str2;
        this.g = f;
        this.h = justification;
        this.k = i;
        this.j = f2;
        this.a = f3;
        this.b = i2;
        this.i = i3;
        this.n = f4;
        this.f = z;
        this.e = pointF;
        this.c = pointF2;
    }

    public DocumentData(String str, String str2, float f, Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        c(str, str2, f, justification, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public DocumentData() {
    }

    public int hashCode() {
        int hashCode = this.m.hashCode();
        int ordinal = this.h.ordinal();
        int i = this.k;
        long floatToRawIntBits = Float.floatToRawIntBits(this.j);
        return (((((((((int) ((((hashCode * 31) + this.d.hashCode()) * 31) + this.g)) * 31) + ordinal) * 31) + i) * 31) + ((int) ((floatToRawIntBits >>> 32) ^ floatToRawIntBits))) * 31) + this.b;
    }
}
