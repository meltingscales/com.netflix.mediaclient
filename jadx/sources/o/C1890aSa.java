package o;

import android.content.Context;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.List;

/* renamed from: o.aSa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1890aSa {
    private Context d;
    private aOV e;

    public C1890aSa(Context context, aOV aov) {
        this.d = context;
        this.e = aov;
    }

    public NetflixDataRequest c(InterfaceC5093bsJ interfaceC5093bsJ, List<String> list, boolean z, InterfaceC1813aPe interfaceC1813aPe, boolean z2) {
        if (interfaceC5093bsJ != null && !z) {
            aRY ary = new aRY(this.d, list, interfaceC1813aPe, z2);
            ary.c(interfaceC5093bsJ);
            return ary;
        }
        return new C1892aSc(this.d, list, false, interfaceC1813aPe, z2);
    }

    public NetflixDataRequest b(InterfaceC1813aPe interfaceC1813aPe) {
        return new C1896aSg(this.d, interfaceC1813aPe);
    }

    public NetflixDataRequest e(C5007bqd c5007bqd, InterfaceC1813aPe interfaceC1813aPe, InterfaceC5093bsJ interfaceC5093bsJ) {
        C1899aSj c1899aSj = new C1899aSj(this.d, this.e, c5007bqd, interfaceC1813aPe);
        c1899aSj.c(interfaceC5093bsJ);
        return c1899aSj;
    }

    public NetflixDataRequest a(List<String> list, InterfaceC1832aPx interfaceC1832aPx, boolean z) {
        return new C1897aSh(this.d, list, false, z, interfaceC1832aPx);
    }

    public NetflixDataRequest b(String str, AbstractC5079brw abstractC5079brw) {
        return new C1895aSf(this.d, str, abstractC5079brw);
    }
}
