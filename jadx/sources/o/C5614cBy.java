package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.List;
import o.C9834xU;
import o.cIE;

/* renamed from: o.cBy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5614cBy extends SP {
    private final List<Long> a;
    private final InterfaceC8554dpx d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5614cBy(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5614cBy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C5614cBy(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5614cBy(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InterfaceC8554dpx b;
        C8632dsu.c((Object) context, "");
        this.a = new ArrayList();
        b = dpB.b(new drO<Paint>() { // from class: com.netflix.mediaclient.ui.player.v2.PlayerSeekbarWithCustomIndicators$customIndicatorPaint$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final Paint invoke() {
                Paint paint = new Paint();
                paint.setColor(ContextCompat.getColor(context, cIE.e.c));
                return paint;
            }
        });
        this.d = b;
    }

    private final Paint d() {
        return (Paint) this.d.getValue();
    }

    public final void d(List<Long> list) {
        C8632dsu.c((Object) list, "");
        this.a.clear();
        this.a.addAll(list);
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        if (this.a.size() > 0) {
            float width = (getWidth() - getPaddingStart()) - getPaddingEnd();
            float max = getMax();
            float dimensionPixelSize = getResources().getDimensionPixelSize(C9834xU.a.F);
            float dimensionPixelSize2 = getResources().getDimensionPixelSize(cIE.d.a);
            float f = 2;
            float y = (getY() + (getHeight() / f)) - (dimensionPixelSize / f);
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                float paddingStart = getPaddingStart() + (((float) this.a.get(i).longValue()) * (width / max));
                canvas.drawRect(paddingStart, y, paddingStart + dimensionPixelSize2, dimensionPixelSize + y, d());
            }
        }
        super.onDraw(canvas);
    }
}
