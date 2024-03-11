package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import o.cIE;

/* renamed from: o.cHf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5757cHf extends cGW {
    private final C5614cBy e;

    @Override // o.cGW
    public int m() {
        return cIE.c.R;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5757cHf(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        View findViewById = e().findViewById(cIE.b.bS);
        C8632dsu.a(findViewById, "");
        this.e = (C5614cBy) findViewById;
    }

    @Override // o.cGW, o.cFV
    public void a(List<Long> list) {
        C8632dsu.c((Object) list, "");
        this.e.d(list);
    }
}
