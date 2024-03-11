package o;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* renamed from: o.bKp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3786bKp extends EpoxyRecyclerView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3786bKp(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3786bKp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    public boolean i() {
        return false;
    }

    public /* synthetic */ C3786bKp(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3786bKp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }
}
