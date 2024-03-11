package o;

import com.netflix.msl.MslException;
import java.util.Collections;
import java.util.Set;

/* renamed from: o.dlm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8435dlm implements InterfaceC8429dlg {
    @Override // o.InterfaceC8429dlg
    public dkU a(String str) {
        return null;
    }

    @Override // o.InterfaceC8429dlg
    public void b(dkO dko) {
    }

    @Override // o.InterfaceC8429dlg
    public long c(dkO dko) {
        return 1L;
    }

    @Override // o.InterfaceC8429dlg
    public AbstractC8393djy d(dkO dko) {
        return null;
    }

    @Override // o.InterfaceC8429dlg
    public void e(String str, dkU dku) {
    }

    @Override // o.InterfaceC8429dlg
    public void e(Set<dkQ> set) {
    }

    @Override // o.InterfaceC8429dlg
    public void e(dkO dko, AbstractC8393djy abstractC8393djy) {
    }

    @Override // o.InterfaceC8429dlg
    public void e(dkU dku) {
    }

    @Override // o.InterfaceC8429dlg
    public dkO i() {
        return null;
    }

    @Override // o.InterfaceC8429dlg
    public Set<dkQ> e(dkO dko, dkU dku) {
        if (dku != null) {
            if (dko == null) {
                throw new MslException(C8373dje.cU);
            }
            if (!dku.d(dko)) {
                C8373dje c8373dje = C8373dje.cW;
                throw new MslException(c8373dje, "uit mtserialnumber " + dku.b() + "; mt " + dko.c());
            }
        }
        return Collections.emptySet();
    }

    @Override // o.InterfaceC8429dlg
    public void e(String str, dkO dko, dkU dku) {
        if (dku == null || dko == null || dku.d(dko)) {
            return;
        }
        C8373dje c8373dje = C8373dje.cW;
        throw new MslException(c8373dje, "uit mtserialnumber " + dku.b() + "; mt " + dko.c());
    }
}
