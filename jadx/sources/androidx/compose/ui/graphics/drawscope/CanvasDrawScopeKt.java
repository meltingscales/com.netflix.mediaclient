package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;

/* loaded from: classes.dex */
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1
            /* renamed from: getSize-NH-jbRc  reason: not valid java name */
            public long m1542getSizeNHjbRc() {
                return DrawContext.this.mo1538getSizeNHjbRc();
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void inset(float f, float f2, float f3, float f4) {
                Canvas canvas = DrawContext.this.getCanvas();
                DrawContext drawContext2 = DrawContext.this;
                long Size = SizeKt.Size(Size.m1176getWidthimpl(m1542getSizeNHjbRc()) - (f3 + f), Size.m1174getHeightimpl(m1542getSizeNHjbRc()) - (f4 + f2));
                if (Size.m1176getWidthimpl(Size) < 0.0f || Size.m1174getHeightimpl(Size) < 0.0f) {
                    throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
                }
                drawContext2.mo1539setSizeuvyYCjk(Size);
                canvas.translate(f, f2);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg  reason: not valid java name */
            public void mo1541clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
                DrawContext.this.getCanvas().mo1188clipRectN_I0leg(f, f2, f3, f4, i);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
            public void mo1540clipPathmtrdDE(Path path, int i) {
                DrawContext.this.getCanvas().mo1187clipPathmtrdDE(path, i);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void translate(float f, float f2) {
                DrawContext.this.getCanvas().translate(f, f2);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA  reason: not valid java name */
            public void mo1543rotateUv8p0NA(float f, long j) {
                Canvas canvas = DrawContext.this.getCanvas();
                canvas.translate(Offset.m1137getXimpl(j), Offset.m1138getYimpl(j));
                canvas.rotate(f);
                canvas.translate(-Offset.m1137getXimpl(j), -Offset.m1138getYimpl(j));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0  reason: not valid java name */
            public void mo1544scale0AR0LA0(float f, float f2, long j) {
                Canvas canvas = DrawContext.this.getCanvas();
                canvas.translate(Offset.m1137getXimpl(j), Offset.m1138getYimpl(j));
                canvas.scale(f, f2);
                canvas.translate(-Offset.m1137getXimpl(j), -Offset.m1138getYimpl(j));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc  reason: not valid java name */
            public void mo1545transform58bKbWc(float[] fArr) {
                DrawContext.this.getCanvas().mo1189concat58bKbWc(fArr);
            }
        };
    }
}
