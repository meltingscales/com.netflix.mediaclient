package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;
import o.drO;

/* loaded from: classes.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    private final float alpha;
    private final ShaderBrush shaderBrush;
    private final State<Shader> shaderState;
    private final MutableState size$delegate;

    public final ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    public ShaderBrushSpan(ShaderBrush shaderBrush, float f) {
        MutableState mutableStateOf$default;
        this.shaderBrush = shaderBrush;
        this.alpha = f;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1170boximpl(Size.Companion.m1181getUnspecifiedNHjbRc()), null, 2, null);
        this.size$delegate = mutableStateOf$default;
        this.shaderState = SnapshotStateKt.derivedStateOf(new drO<Shader>() { // from class: androidx.compose.ui.text.platform.style.ShaderBrushSpan$shaderState$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Shader invoke() {
                if (ShaderBrushSpan.this.m2329getSizeNHjbRc() == Size.Companion.m1181getUnspecifiedNHjbRc() || Size.m1178isEmptyimpl(ShaderBrushSpan.this.m2329getSizeNHjbRc())) {
                    return null;
                }
                return ShaderBrushSpan.this.getShaderBrush().mo1271createShaderuvyYCjk(ShaderBrushSpan.this.m2329getSizeNHjbRc());
            }
        });
    }

    /* renamed from: setSize-uvyYCjk  reason: not valid java name */
    public final void m2330setSizeuvyYCjk(long j) {
        this.size$delegate.setValue(Size.m1170boximpl(j));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public final long m2329getSizeNHjbRc() {
        return ((Size) this.size$delegate.getValue()).m1180unboximpl();
    }
}
