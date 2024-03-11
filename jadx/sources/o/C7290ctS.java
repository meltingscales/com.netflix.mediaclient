package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.netflix.mediaclient.ui.offline.OfflineActivityV2;
import o.C9834xU;

/* renamed from: o.ctS  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7290ctS extends C7292ctU {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7290ctS(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7290ctS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C7290ctS(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7290ctS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    @Override // o.C7292ctU
    protected void c() {
        Context context = getContext();
        OfflineActivityV2.c cVar = OfflineActivityV2.b;
        Context context2 = getContext();
        C8632dsu.a(context2, "");
        context.startActivity(cVar.c(context2));
    }

    @Override // o.C7292ctU
    public void setupDrawable() {
        Resources resources = getResources();
        int i = com.netflix.mediaclient.ui.R.e.ag;
        Activity activity = (Activity) C9737vz.b(getContext(), Activity.class);
        setCompoundDrawablesRelativeWithIntrinsicBounds(resources.getDrawable(i, activity != null ? activity.getTheme() : null), (Drawable) null, (Drawable) null, (Drawable) null);
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(C9834xU.a.m));
    }

    @Override // o.C7292ctU
    public void d(boolean z) {
        setText(C8168dfL.d(com.netflix.mediaclient.ui.R.o.fQ));
    }
}
