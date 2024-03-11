package o;

import android.content.Context;
import androidx.media3.ui.SubtitlePainter;

/* renamed from: o.bep  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4456bep extends SubtitlePainter {
    public int b() {
        return this.textTop;
    }

    public C4456bep(Context context) {
        super(context);
        this.spacingAdd = 0.0f;
        this.spacingMult = 1.25f;
    }

    @Override // androidx.media3.ui.SubtitlePainter
    public void setupBitmapLayout() {
        setupBitmapLayout(true);
    }
}
