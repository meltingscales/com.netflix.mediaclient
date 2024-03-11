package com.netflix.hawkins.internal.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.unit.Dp;
import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ShapeKeyTokens {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ ShapeKeyTokens[] d;
    private final RoundedCornerShape c = RoundedCornerShapeKt.m399RoundedCornerShape0680j_4(Dp.m2492constructorimpl(4));
    public static final ShapeKeyTokens b = new ShapeKeyTokens("CornerExtraSmall", 0);
    public static final ShapeKeyTokens e = new ShapeKeyTokens("CornerExtraSmallTop", 1);

    private static final /* synthetic */ ShapeKeyTokens[] c() {
        return new ShapeKeyTokens[]{b, e};
    }

    public static ShapeKeyTokens valueOf(String str) {
        return (ShapeKeyTokens) Enum.valueOf(ShapeKeyTokens.class, str);
    }

    public static ShapeKeyTokens[] values() {
        return (ShapeKeyTokens[]) d.clone();
    }

    public final RoundedCornerShape e() {
        return this.c;
    }

    private ShapeKeyTokens(String str, int i) {
    }

    static {
        ShapeKeyTokens[] c = c();
        d = c;
        a = C8600drp.e(c);
    }
}
