package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class DrawModifierKt {
    public static final Modifier drawBehind(Modifier modifier, drM<? super DrawScope, dpR> drm) {
        return modifier.then(new DrawBehindElement(drm));
    }

    public static final Modifier drawWithCache(Modifier modifier, drM<? super CacheDrawScope, DrawResult> drm) {
        return modifier.then(new DrawWithCacheElement(drm));
    }

    public static final CacheDrawModifierNode CacheDrawModifierNode(drM<? super CacheDrawScope, DrawResult> drm) {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), drm);
    }

    public static final Modifier drawWithContent(Modifier modifier, drM<? super ContentDrawScope, dpR> drm) {
        return modifier.then(new DrawWithContentElement(drm));
    }
}
