package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public abstract class RenderEffect {
    private android.graphics.RenderEffect internalRenderEffect;

    protected abstract android.graphics.RenderEffect createRenderEffect();

    public final android.graphics.RenderEffect asAndroidRenderEffect() {
        android.graphics.RenderEffect renderEffect = this.internalRenderEffect;
        if (renderEffect == null) {
            android.graphics.RenderEffect createRenderEffect = createRenderEffect();
            this.internalRenderEffect = createRenderEffect;
            return createRenderEffect;
        }
        return renderEffect;
    }
}
