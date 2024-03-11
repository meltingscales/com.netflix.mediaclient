package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import o.C8632dsu;

/* loaded from: classes.dex */
public abstract class ShaderBrush extends Brush {
    private long createdSize;
    private Shader internalShader;

    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo1271createShaderuvyYCjk(long j);

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m1181getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo1264applyToPq9zytI(long j, Paint paint, float f) {
        Shader shader = this.internalShader;
        if (shader == null || !Size.m1173equalsimpl0(this.createdSize, j)) {
            if (Size.m1178isEmptyimpl(j)) {
                shader = null;
                this.internalShader = null;
                this.createdSize = Size.Companion.m1181getUnspecifiedNHjbRc();
            } else {
                shader = mo1271createShaderuvyYCjk(j);
                this.internalShader = shader;
                this.createdSize = j;
            }
        }
        long mo1203getColor0d7_KjU = paint.mo1203getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m1294equalsimpl0(mo1203getColor0d7_KjU, companion.m1303getBlack0d7_KjU())) {
            paint.mo1208setColor8_81llA(companion.m1303getBlack0d7_KjU());
        }
        if (!C8632dsu.c(paint.getShader(), shader)) {
            paint.setShader(shader);
        }
        if (paint.getAlpha() == f) {
            return;
        }
        paint.setAlpha(f);
    }
}
