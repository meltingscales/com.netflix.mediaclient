package o;

import android.content.Context;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.List;

/* renamed from: o.bri  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5065bri {
    private aOV c;
    private Context d;

    public C5065bri(Context context, aOV aov) {
        this.d = context;
        this.c = aov;
    }

    private NetflixDataRequest.Transport a() {
        return NetflixDataRequest.Transport.web;
    }

    public NetflixDataRequest c(InterfaceC4986bqI interfaceC4986bqI) {
        return new C4996bqS(this.d, a(), interfaceC4986bqI).a();
    }

    public NetflixDataRequest d(InterfaceC4986bqI interfaceC4986bqI) {
        return new C5061bre(this.d, a(), interfaceC4986bqI).a();
    }

    public NetflixDataRequest a(String str, InterfaceC4986bqI interfaceC4986bqI) {
        return new C4990bqM(this.d, a(), str, interfaceC4986bqI).a();
    }

    public NetflixDataRequest a(long j, InterfaceC4986bqI interfaceC4986bqI) {
        return new C4992bqO(this.d, a(), j, interfaceC4986bqI).a();
    }

    public NetflixDataRequest d(List<String> list, InterfaceC4986bqI interfaceC4986bqI) {
        return new C4989bqL(this.d, a(), interfaceC4986bqI, list).a();
    }

    public NetflixDataRequest b(InterfaceC4986bqI interfaceC4986bqI) {
        return new C4994bqQ(this.d, a(), interfaceC4986bqI).a();
    }

    public AbstractC2100aZw e(String str, InterfaceC4986bqI interfaceC4986bqI) {
        if (aRD.j()) {
            if (aRD.h()) {
                return new C1894aSe(str, interfaceC4986bqI, this.c);
            }
            return new C1893aSd(str, interfaceC4986bqI);
        }
        return new C4995bqR(str, interfaceC4986bqI);
    }

    public NetflixDataRequest a(InterfaceC4986bqI interfaceC4986bqI) {
        return new C4998bqU(this.d, a(), interfaceC4986bqI).a();
    }

    public NetflixDataRequest d() {
        return new C4999bqV(this.d, a()).a();
    }

    public NetflixDataRequest b(String str, String str2) {
        return new C5002bqY(this.d, a(), str, str2).a();
    }

    public NetflixDataRequest d(String str) {
        return new C5001bqX(this.d, a(), str).a();
    }

    public NetflixDataRequest c() {
        return new C5000bqW(this.d, a()).a();
    }

    public NetflixDataRequest e(InterfaceC4986bqI interfaceC4986bqI, String str) {
        return new C5059brc(this.d, a(), interfaceC4986bqI, str).a();
    }

    public NetflixDataRequest h(InterfaceC4986bqI interfaceC4986bqI) {
        return new C5058brb(this.d, a(), interfaceC4986bqI).a();
    }

    public NetflixDataRequest i(InterfaceC4986bqI interfaceC4986bqI) {
        return new C5063brg(this.d, a(), interfaceC4986bqI).a();
    }

    public NetflixDataRequest b(Context context, InterfaceC5013bqj interfaceC5013bqj, String str, boolean z, String str2) {
        return new C5060brd(this.d, a(), interfaceC5013bqj, str, z, str2).a();
    }

    public NetflixDataRequest b(String str, InterfaceC5284bvp interfaceC5284bvp, InterfaceC4986bqI interfaceC4986bqI) {
        return new C5064brh(this.d, a(), str, interfaceC5284bvp, interfaceC4986bqI).a();
    }

    public NetflixDataRequest a(String str, UserAgent.PinType pinType, String str2, InterfaceC4986bqI interfaceC4986bqI) {
        return new C5067brk(this.d, a(), str, pinType, str2, interfaceC4986bqI).a();
    }

    public NetflixDataRequest e(InterfaceC4986bqI interfaceC4986bqI) {
        return new C4997bqT(this.d, a(), interfaceC4986bqI).a();
    }

    public NetflixDataRequest d(InterfaceC4986bqI interfaceC4986bqI, String str) {
        return C5066brj.e(this.d, a(), str, interfaceC4986bqI).a();
    }

    public NetflixDataRequest b(InterfaceC4986bqI interfaceC4986bqI, String str, String str2, String str3, String str4, Boolean bool) {
        return new C5066brj(this.d, a(), str, str2, str3, str4, bool.booleanValue(), interfaceC4986bqI).a();
    }
}
