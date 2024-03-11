package o;

import androidx.core.util.Predicate;
import java.util.LinkedHashMap;
import java.util.Map;
import o.InterfaceC4342bch;

/* renamed from: o.bgY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4545bgY implements InterfaceC4342bch {
    private final InterfaceC5098bsO b;
    private final Map<Long, InterfaceC4342bch.c> c = new LinkedHashMap(2) { // from class: com.netflix.mediaclient.service.player.mediasession.MediaSessionMetaDataProvider$1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 2;
        }
    };
    private InterfaceC4342bch.e d;
    private final Predicate<Boolean> e;

    @Override // o.InterfaceC4342bch
    public void a(InterfaceC4342bch.e eVar) {
        this.d = eVar;
    }

    @Override // o.InterfaceC4342bch
    public InterfaceC5098bsO c() {
        return this.b;
    }

    public C4545bgY(InterfaceC5098bsO interfaceC5098bsO, Predicate<Boolean> predicate) {
        this.b = interfaceC5098bsO;
        this.e = predicate;
    }

    public void e(long j, InterfaceC4342bch.c cVar) {
        cVar.e(j);
        this.c.put(Long.valueOf(j), cVar);
        InterfaceC4342bch.e eVar = this.d;
        if (eVar != null) {
            eVar.c(j);
        }
    }

    @Override // o.InterfaceC4342bch
    public InterfaceC4342bch.c d(long j) {
        return this.c.get(Long.valueOf(j));
    }

    @Override // o.InterfaceC4342bch
    public boolean b() {
        return this.e.test(Boolean.TRUE);
    }
}
