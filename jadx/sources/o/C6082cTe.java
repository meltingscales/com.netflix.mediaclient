package o;

import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.ui.search.SearchActivity;

/* renamed from: o.cTe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6082cTe implements InterfaceC6084cTg {
    private final Class<? extends MO> c = SearchActivity.class;

    @Override // o.InterfaceC6084cTg
    public Class<? extends MO> b() {
        return this.c;
    }

    @Override // o.InterfaceC6084cTg
    public Intent d(Context context, String str) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        Intent d = SearchActivity.d(context, str);
        C8632dsu.a(d, "");
        return d;
    }
}
