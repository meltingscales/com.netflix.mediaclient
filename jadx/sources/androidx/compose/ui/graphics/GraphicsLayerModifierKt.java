package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import o.dpR;
import o.drM;
import org.linphone.core.Privacy;

/* loaded from: classes.dex */
public final class GraphicsLayerModifierKt {
    /* renamed from: graphicsLayer-pANQ8Wg */
    public static final /* synthetic */ Modifier m1347graphicsLayerpANQ8Wg(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3) {
        return m1345graphicsLayerAp8cVGQ(modifier, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, CompositingStrategy.Companion.m1324getAutoNrFUSI());
    }

    /* renamed from: graphicsLayer-Ap8cVGQ$default */
    public static /* synthetic */ Modifier m1346graphicsLayerAp8cVGQ$default(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, int i2, Object obj) {
        return m1345graphicsLayerAp8cVGQ(modifier, (i2 & 1) != 0 ? 1.0f : f, (i2 & 2) != 0 ? 1.0f : f2, (i2 & 4) == 0 ? f3 : 1.0f, (i2 & 8) != 0 ? 0.0f : f4, (i2 & 16) != 0 ? 0.0f : f5, (i2 & 32) != 0 ? 0.0f : f6, (i2 & 64) != 0 ? 0.0f : f7, (i2 & 128) != 0 ? 0.0f : f8, (i2 & JSONzip.end) == 0 ? f9 : 0.0f, (i2 & 512) != 0 ? 8.0f : f10, (i2 & 1024) != 0 ? TransformOrigin.Companion.m1480getCenterSzJe1aQ() : j, (i2 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i2 & 4096) != 0 ? false : z, (i2 & 8192) != 0 ? null : renderEffect, (i2 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j2, (i2 & Privacy.DEFAULT) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j3, (i2 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? CompositingStrategy.Companion.m1324getAutoNrFUSI() : i);
    }

    /* renamed from: graphicsLayer-Ap8cVGQ */
    public static final Modifier m1345graphicsLayerAp8cVGQ(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i) {
        return modifier.then(new GraphicsLayerElement(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, i, null));
    }

    public static final Modifier graphicsLayer(Modifier modifier, drM<? super GraphicsLayerScope, dpR> drm) {
        return modifier.then(new BlockGraphicsLayerElement(drm));
    }

    public static final Modifier toolingGraphicsLayer(Modifier modifier) {
        return InspectableValueKt.isDebugInspectorInfoEnabled() ? modifier.then(m1346graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : modifier;
    }
}
