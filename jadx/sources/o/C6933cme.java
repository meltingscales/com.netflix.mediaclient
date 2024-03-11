package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.util.ViewUtils;
import o.C9834xU;

/* renamed from: o.cme  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6933cme extends ConstraintLayout {
    private final C1204Sr a;
    private final C6864clO b;
    private final C1204Sr c;
    private final C1204Sr d;
    private final C1204Sr e;
    private final RadioButton f;
    private final C1204Sr h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6933cme(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6933cme(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C6933cme(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6933cme(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        C6864clO c = C6864clO.c(LayoutInflater.from(context), this);
        C8632dsu.a(c, "");
        this.b = c;
        RadioButton radioButton = c.f;
        C8632dsu.a(radioButton, "");
        this.f = radioButton;
        C1204Sr c1204Sr = c.i;
        C8632dsu.a(c1204Sr, "");
        this.h = c1204Sr;
        C1204Sr c1204Sr2 = c.b;
        C8632dsu.a(c1204Sr2, "");
        this.d = c1204Sr2;
        C1204Sr c1204Sr3 = c.c;
        C8632dsu.a(c1204Sr3, "");
        this.c = c1204Sr3;
        C1204Sr c1204Sr4 = c.e;
        C8632dsu.a(c1204Sr4, "");
        this.a = c1204Sr4;
        C1204Sr c1204Sr5 = c.d;
        C8632dsu.a(c1204Sr5, "");
        this.e = c1204Sr5;
    }

    public final void setBestValue(boolean z) {
        ViewUtils.d(this.e, z);
    }

    public final void setUserSelected(boolean z) {
        int color;
        this.f.setChecked(z);
        C1204Sr c1204Sr = this.d;
        if (z) {
            color = ContextCompat.getColor(getContext(), C9834xU.c.e);
        } else {
            color = ContextCompat.getColor(getContext(), C9834xU.c.n);
        }
        c1204Sr.setTextColor(color);
    }

    public final void setTitle(String str) {
        C8632dsu.c((Object) str, "");
        this.h.setText(C1333Xq.d(com.netflix.mediaclient.ui.R.o.hI).d("duration", str).c());
    }

    public final void setDiscountPercentage(String str) {
        C8632dsu.c((Object) str, "");
        this.d.setText(C1333Xq.d(com.netflix.mediaclient.ui.R.o.hL).d("percent", str).c());
    }

    public final void setDiscountPrice(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setFullPrice(CharSequence charSequence) {
        this.a.setPaintFlags(16);
        this.a.setText(charSequence);
    }

    public final void setOfferClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
        setClickable(onClickListener != null);
    }
}
