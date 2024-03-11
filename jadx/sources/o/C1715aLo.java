package o;

import android.content.Intent;
import com.netflix.cl.model.event.session.command.SubmitCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_GameControllerMagicPath;
import j$.time.Instant;
import java.util.List;
import javax.inject.Inject;
import o.AbstractC3855bNd;

/* renamed from: o.aLo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1715aLo implements aKP {
    public static final d a = new d(null);
    private final bEY b;
    private final InterfaceC3862bNk d;

    @Override // o.aKP
    public boolean H_() {
        return false;
    }

    @Inject
    public C1715aLo(bEY bey, InterfaceC3862bNk interfaceC3862bNk) {
        C8632dsu.c((Object) bey, "");
        C8632dsu.c((Object) interfaceC3862bNk, "");
        this.b = bey;
        this.d = interfaceC3862bNk;
    }

    /* renamed from: o.aLo$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("InternalGameControllerMagicPathHandler");
        }
    }

    @Override // o.aKP
    public boolean c(List<String> list) {
        return Config_FastProperty_GameControllerMagicPath.Companion.d();
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) intent, "");
        String str2 = (list == null || list.size() <= 1) ? null : list.get(1);
        if (!c(list) || str2 == null) {
            return NflxHandler.Response.NOT_HANDLING;
        }
        a.getLogTag();
        InterfaceC3862bNk interfaceC3862bNk = this.d;
        Instant instant = Instant.c;
        C8632dsu.a(instant, "");
        interfaceC3862bNk.c(new AbstractC3855bNd.c("CloudGameSSIDBeacon", str2, instant, 81577814));
        this.b.b(netflixActivity, str2);
        return NflxHandler.Response.HANDLING;
    }

    @Override // o.aKP
    /* renamed from: c */
    public SubmitCommand d() {
        return new SubmitCommand();
    }
}
