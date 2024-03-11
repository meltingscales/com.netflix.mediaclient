package o;

import android.content.Context;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import o.InterfaceC4004bSr;

/* renamed from: o.bIg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3723bIg {
    private final Context b;

    @Inject
    public C3723bIg(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.b = context;
    }

    public final void c() {
        InterfaceC4004bSr.a aVar = InterfaceC4004bSr.c;
        Context context = this.b;
        String a = LoMoType.INSTANT_QUEUE.a();
        C8632dsu.a(a, "");
        aVar.c(context, a, null, null, null);
    }

    public final void e() {
        InterfaceC4004bSr.a aVar = InterfaceC4004bSr.c;
        Context context = this.b;
        String a = LoMoType.REMINDERS.a();
        C8632dsu.a(a, "");
        aVar.c(context, a, null, null, null);
    }
}
