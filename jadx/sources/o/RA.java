package o;

import android.content.Context;
import android.util.AttributeSet;
import com.netflix.mediaclient.android.activity.NetflixActivity;

/* loaded from: classes3.dex */
public final class RA extends C1220Th {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RA(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ RA(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    @Override // o.C1220Th
    protected View$OnClickListenerC1217Te e() {
        Object e = C8141del.e(getContext(), NetflixActivity.class);
        C8632dsu.a(e, "");
        return new C1183Rw((NetflixActivity) e, this);
    }
}
