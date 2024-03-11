package com.airbnb.lottie.model.content;

import o.C8584dr;
import o.C8665du;

/* loaded from: classes2.dex */
public class Mask {
    private final boolean b;
    private final C8584dr c;
    private final MaskMode d;
    private final C8665du e;

    /* loaded from: classes2.dex */
    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public boolean a() {
        return this.b;
    }

    public MaskMode c() {
        return this.d;
    }

    public C8665du d() {
        return this.e;
    }

    public C8584dr e() {
        return this.c;
    }

    public Mask(MaskMode maskMode, C8584dr c8584dr, C8665du c8665du, boolean z) {
        this.d = maskMode;
        this.c = c8584dr;
        this.e = c8665du;
        this.b = z;
    }
}
