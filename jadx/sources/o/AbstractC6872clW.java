package o;

import android.text.Spannable;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;
import o.C6863clN;

/* renamed from: o.clW  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6872clW extends AbstractC3336ax<C6946cmr> {
    private String b = "";

    public final void W_(String str) {
        C8632dsu.c((Object) str, "");
        this.b = str;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C6863clN.a.c;
    }

    public final String i() {
        return this.b;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void e(C6946cmr c6946cmr) {
        int d;
        C8632dsu.c((Object) c6946cmr, "");
        String c = C1333Xq.d(com.netflix.mediaclient.ui.R.o.Z).d("price", this.b).c();
        c6946cmr.e().setText(c, TextView.BufferType.SPANNABLE);
        CharSequence text = c6946cmr.e().getText();
        C8632dsu.d(text);
        C8632dsu.d((Object) c);
        d = duD.d((CharSequence) c, this.b, 0, false, 6, (Object) null);
        ((Spannable) text).setSpan(new StrikethroughSpan(), d, this.b.length() + d, 33);
    }
}
