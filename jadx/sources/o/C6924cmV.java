package o;

import android.content.Context;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;

/* renamed from: o.cmV  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6924cmV implements InterfaceC6911cmI {
    private final InterfaceC1476aCs a;
    private final Context e;

    @Inject
    public C6924cmV(@ApplicationContext Context context, InterfaceC1476aCs interfaceC1476aCs) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC1476aCs, "");
        this.e = context;
        this.a = interfaceC1476aCs;
    }
}
