package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes5.dex */
public class RectEvaluator implements TypeEvaluator<Rect> {
    private final Rect rect;

    public RectEvaluator(Rect rect) {
        this.rect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.rect.set(i + ((int) ((rect2.left - i) * f)), i2 + ((int) ((rect2.top - i2) * f)), i3 + ((int) ((rect2.right - i3) * f)), i4 + ((int) ((rect2.bottom - i4) * f)));
        return this.rect;
    }
}
