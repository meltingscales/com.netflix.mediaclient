package o;

import android.content.Context;
import com.netflix.mediaclient.service.player.PlayerComponentFactory;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import dagger.hilt.android.EntryPointAccessors;
import java.util.Optional;

/* renamed from: o.bcD  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4312bcD {
    public static final aMF b(Context context, aOV aov, UserAgent userAgent, InterfaceC4942bpR interfaceC4942bpR, IClientLogging iClientLogging, aHJ ahj, InterfaceC4208baF interfaceC4208baF, InterfaceC4348bcn interfaceC4348bcn, C4390bdc c4390bdc, InterfaceC5098bsO interfaceC5098bsO) {
        PlayerComponentFactory c4316bcH;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) interfaceC4942bpR, "");
        C8632dsu.c((Object) iClientLogging, "");
        C8632dsu.c((Object) ahj, "");
        C8632dsu.c((Object) interfaceC4208baF, "");
        C8632dsu.c((Object) interfaceC4348bcn, "");
        C8632dsu.c((Object) c4390bdc, "");
        C8632dsu.c((Object) interfaceC5098bsO, "");
        Optional<PlayerComponentFactory> av = ((InterfaceC4315bcG) EntryPointAccessors.fromApplication(context, InterfaceC4315bcG.class)).av();
        if (av.isPresent()) {
            c4316bcH = av.get();
        } else {
            c4316bcH = new C4316bcH();
        }
        PlayerComponentFactory playerComponentFactory = c4316bcH;
        C8632dsu.d(playerComponentFactory);
        return new C4358bcx(context, aov, userAgent, interfaceC4942bpR, iClientLogging, ahj, interfaceC4208baF, interfaceC4348bcn, c4390bdc, playerComponentFactory, interfaceC5098bsO);
    }
}
