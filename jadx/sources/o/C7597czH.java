package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;

/* renamed from: o.czH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7597czH extends AbstractC7600czK {
    @Override // o.AbstractC7600czK, o.InterfaceC1905aSp
    public /* bridge */ /* synthetic */ C1907aSr a() {
        return super.a();
    }

    @Override // o.AbstractC7600czK, o.InterfaceC1905aSp
    public /* bridge */ /* synthetic */ Runnable c() {
        return super.c();
    }

    @Override // o.AbstractC7600czK, o.InterfaceC1905aSp
    public /* bridge */ /* synthetic */ int d() {
        return super.d();
    }

    C7597czH(C1907aSr c1907aSr) {
        super(c1907aSr);
    }

    public static C7597czH b(Context context, StatusCode statusCode) {
        C1044Mm.j("nf_play_error", "Blacklisted device, offline not supported");
        return new C7597czH(new C1907aSr("", context.getString(com.netflix.mediaclient.ui.R.o.ia, "(" + statusCode.getValue() + ")"), context.getString(com.netflix.mediaclient.ui.R.o.f13253fi), null));
    }
}
