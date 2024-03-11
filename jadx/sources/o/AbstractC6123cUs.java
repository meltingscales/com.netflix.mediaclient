package o;

import android.annotation.SuppressLint;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C6035cRo;
import o.C9834xU;

/* renamed from: o.cUs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6123cUs extends AbstractC3336ax<e> {
    public TrackingInfoHolder b;
    public AppView c;
    public String d;
    public String f;
    private int g;
    private boolean h;
    private View.OnClickListener i;
    private String j;

    @Override // o.AbstractC3073as
    public int Z_() {
        return C6035cRo.d.f13696o;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C6035cRo.e.f13697o;
    }

    public final void ag_(String str) {
        this.j = str;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public final void c(boolean z) {
        this.h = z;
    }

    public final View.OnClickListener i() {
        return this.i;
    }

    public final boolean l() {
        return this.h;
    }

    public final String n() {
        return this.j;
    }

    public final String o() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        C1204Sr b = eVar.b();
        View.OnClickListener onClickListener = this.i;
        b.setOnClickListener(onClickListener);
        b.setClickable(onClickListener != null);
        if (this.g == 0) {
            this.g = a((TextView) eVar.b());
        }
        e(o(), this.j, eVar.b());
        eVar.b().setContentDescription(o());
        if (this.h) {
            eVar.b().setCompoundDrawablesRelativeWithIntrinsicBounds(com.netflix.mediaclient.ui.R.e.q, 0, 0, 0);
            eVar.b().setCompoundDrawablePadding(eVar.b().getContext().getResources().getDimensionPixelOffset(C9834xU.a.aa));
            return;
        }
        eVar.b().setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
    }

    private final int a(TextView textView) {
        TypedValue typedValue = new TypedValue();
        textView.getContext().getTheme().resolveAttribute(com.netflix.mediaclient.ui.R.a.d, typedValue, true);
        return typedValue.data;
    }

    /* renamed from: o.cUs$e */
    /* loaded from: classes4.dex */
    public final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(e.class, "titleView", "getTitleView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ a = bIF.d(this, C6035cRo.d.f13696o, false, 2, null);

        public e() {
        }

        public final C1204Sr b() {
            return (C1204Sr) this.a.getValue(this, b[0]);
        }
    }

    @SuppressLint({"DefaultLocale"})
    private final void e(String str, String str2, TextView textView) {
        int d;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        String lowerCase = str.toLowerCase();
        C8632dsu.a(lowerCase, "");
        String lowerCase2 = str2.toLowerCase();
        C8632dsu.a(lowerCase2, "");
        d = duD.d((CharSequence) lowerCase, lowerCase2, 0, false, 6, (Object) null);
        if (d < 0) {
            textView.setText(str);
            return;
        }
        int length = str2.length() + d;
        if (length > str.length()) {
            length = str.length();
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(this.g), d, length, 33);
        textView.setText(spannableString);
    }
}
