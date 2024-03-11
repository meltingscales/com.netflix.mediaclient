package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import o.C2354aef;
import o.C3226auv;

/* loaded from: classes3.dex */
public final class aDI implements InterfaceC5184btv {
    private final VideoType a;
    private final boolean b;
    private final String c;
    private final String d;

    @Override // o.InterfaceC5184btv
    public String getParentVideoId() {
        return this.c;
    }

    @Override // o.InterfaceC5184btv
    public String getVideoId() {
        return this.d;
    }

    @Override // o.InterfaceC5184btv
    public VideoType getVideoType() {
        return this.a;
    }

    @Override // o.InterfaceC5184btv
    public boolean isOfflineAvailable() {
        return this.b;
    }

    public aDI(C2293adX c2293adX) {
        String valueOf;
        boolean booleanValue;
        C2354aef.d a;
        Boolean c;
        C2354aef.d a2;
        C8632dsu.c((Object) c2293adX, "");
        String b = c2293adX.b();
        C3226auv.c cVar = C3226auv.e;
        if (C8632dsu.c((Object) b, (Object) cVar.e().b())) {
            C2354aef a3 = c2293adX.a();
            valueOf = (a3 == null || (a2 = a3.a()) == null) ? null : Integer.valueOf(a2.a()).toString();
        } else {
            valueOf = String.valueOf(c2293adX.d().d());
        }
        this.d = valueOf;
        this.c = String.valueOf(c2293adX.d().d());
        if (C8632dsu.c((Object) c2293adX.b(), (Object) cVar.e().b())) {
            C2354aef a4 = c2293adX.a();
            if (a4 != null && (a = a4.a()) != null && (c = a.c()) != null) {
                booleanValue = c.booleanValue();
            }
            booleanValue = false;
        } else {
            Boolean b2 = c2293adX.d().b();
            if (b2 != null) {
                booleanValue = b2.booleanValue();
            }
            booleanValue = false;
        }
        this.b = booleanValue;
        this.a = C8632dsu.c((Object) getVideoId(), (Object) getParentVideoId()) ? VideoType.MOVIE : VideoType.EPISODE;
    }
}
