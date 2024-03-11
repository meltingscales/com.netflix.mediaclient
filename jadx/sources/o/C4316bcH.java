package o;

import android.content.Context;
import android.os.Looper;
import com.netflix.mediaclient.service.player.PlayerComponentFactory;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IClientLogging;

/* renamed from: o.bcH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4316bcH implements PlayerComponentFactory {
    @Override // com.netflix.mediaclient.service.player.PlayerComponentFactory
    public C4352bcr a(Context context, aOV aov, UserAgent userAgent, InterfaceC4942bpR interfaceC4942bpR, IClientLogging iClientLogging, C4390bdc c4390bdc) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) interfaceC4942bpR, "");
        C8632dsu.c((Object) iClientLogging, "");
        C8632dsu.c((Object) c4390bdc, "");
        return new C4352bcr(context, aov, userAgent, interfaceC4942bpR, iClientLogging, c4390bdc);
    }

    @Override // com.netflix.mediaclient.service.player.PlayerComponentFactory
    public C4619bht e(Context context, aOV aov, aHJ ahj) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) ahj, "");
        return new C4619bht(context, aov, ahj);
    }

    @Override // com.netflix.mediaclient.service.player.PlayerComponentFactory
    public C4427beM a(Looper looper, InterfaceC4522bgB interfaceC4522bgB, C4390bdc c4390bdc, boolean z, aTX atx) {
        C8632dsu.c((Object) looper, "");
        C8632dsu.c((Object) interfaceC4522bgB, "");
        C8632dsu.c((Object) c4390bdc, "");
        C8632dsu.c((Object) atx, "");
        return new C4427beM(looper, interfaceC4522bgB, c4390bdc, z, atx);
    }

    @Override // com.netflix.mediaclient.service.player.PlayerComponentFactory
    public C4572bgz a(Context context, Looper looper, C4390bdc c4390bdc, boolean z) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) looper, "");
        C8632dsu.c((Object) c4390bdc, "");
        return new C4572bgz(context, looper, c4390bdc, z);
    }
}
