package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import com.netflix.android.org.json.zip.JSONzip;
import o.dpR;
import o.drO;
import o.drX;

/* loaded from: classes5.dex */
public final class CardKt {
    /* renamed from: Card-F-jzlyU  reason: not valid java name */
    public static final void m556CardFjzlyU(Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, drX<? super Composer, ? super Integer, dpR> drx, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1956755640);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.Companion : modifier;
        CornerBasedShape medium = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long m569getSurface0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m569getSurface0d7_KjU() : j;
        long m571contentColorForek8zF_U = (i2 & 8) != 0 ? ColorsKt.m571contentColorForek8zF_U(m569getSurface0d7_KjU, composer, (i >> 6) & 14) : j2;
        BorderStroke borderStroke2 = (i2 & 16) != 0 ? null : borderStroke;
        float m2492constructorimpl = (i2 & 32) != 0 ? Dp.m2492constructorimpl(1) : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1956755640, i, -1, "androidx.compose.material.Card (Card.kt:66)");
        }
        SurfaceKt.m658SurfaceFjzlyU(modifier2, medium, m569getSurface0d7_KjU, m571contentColorForek8zF_U, borderStroke2, m2492constructorimpl, drx, composer, (i & 14) | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (i & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* renamed from: Card-LPr_se0  reason: not valid java name */
    public static final void m557CardLPr_se0(drO<dpR> dro, Modifier modifier, boolean z, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, drX<? super Composer, ? super Integer, dpR> drx, Composer composer, int i, int i2) {
        MutableInteractionSource mutableInteractionSource2;
        composer.startReplaceableGroup(778538979);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.Companion : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        CornerBasedShape medium = (i2 & 8) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long m569getSurface0d7_KjU = (i2 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m569getSurface0d7_KjU() : j;
        long m571contentColorForek8zF_U = (i2 & 32) != 0 ? ColorsKt.m571contentColorForek8zF_U(m569getSurface0d7_KjU, composer, (i >> 12) & 14) : j2;
        BorderStroke borderStroke2 = (i2 & 64) != 0 ? null : borderStroke;
        float m2492constructorimpl = (i2 & 128) != 0 ? Dp.m2492constructorimpl(1) : f;
        if ((i2 & JSONzip.end) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(778538979, i, -1, "androidx.compose.material.Card (Card.kt:118)");
        }
        SurfaceKt.m659SurfaceLPr_se0(dro, modifier2, z2, medium, m569getSurface0d7_KjU, m571contentColorForek8zF_U, borderStroke2, m2492constructorimpl, mutableInteractionSource2, drx, composer, (i & 14) | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (234881024 & i) | (i & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
