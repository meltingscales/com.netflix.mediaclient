package o;

import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC4776bmK;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bcy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4359bcy implements InterfaceC4776bmK {
    private final Map<AbstractC5100bsQ, List<InterfaceC5085bsB>> e = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(AbstractC5100bsQ abstractC5100bsQ) {
        synchronized (this) {
            this.e.put(abstractC5100bsQ, new ArrayList());
            abstractC5100bsQ.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4882boK e(AbstractC5100bsQ abstractC5100bsQ, String str) {
        synchronized (this) {
            List<InterfaceC5085bsB> list = this.e.get(abstractC5100bsQ);
            if (list == null) {
                InterfaceC1598aHf.a(new C1596aHd("video group found but there is no session list").b(false));
                return null;
            }
            for (InterfaceC5085bsB interfaceC5085bsB : list) {
                if ((interfaceC5085bsB instanceof C4882boK) && interfaceC5085bsB.c().equals(str) && !interfaceC5085bsB.x()) {
                    return (C4882boK) interfaceC5085bsB;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(AbstractC5100bsQ abstractC5100bsQ, PlaybackExperience playbackExperience, InterfaceC5085bsB interfaceC5085bsB) {
        synchronized (this) {
            if (playbackExperience.f()) {
                C4350bcp.e(interfaceC5085bsB);
            } else {
                C4350bcp.b(interfaceC5085bsB);
            }
            List<InterfaceC5085bsB> list = this.e.get(abstractC5100bsQ);
            if (list == null) {
                InterfaceC1598aHf.a(new C1596aHd("video group found but there is no session list").b(false));
            } else {
                list.add(interfaceC5085bsB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(AbstractC5100bsQ abstractC5100bsQ) {
        synchronized (this) {
            C1044Mm.c("nf_playbackSessionMgr", "releaseVideoGroup... activeGroups=%d hashCode=%d", Integer.valueOf(this.e.size()), Integer.valueOf(abstractC5100bsQ.hashCode()));
            List<InterfaceC5085bsB> remove = this.e.remove(abstractC5100bsQ);
            abstractC5100bsQ.d(false);
            if (remove != null) {
                for (InterfaceC5085bsB interfaceC5085bsB : remove) {
                    C1044Mm.c("nf_playbackSessionMgr", "closing session type=%s movieId=%d", interfaceC5085bsB.l(), Long.valueOf(interfaceC5085bsB.H()));
                    interfaceC5085bsB.d();
                    C4350bcp.c(interfaceC5085bsB);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        synchronized (this) {
            for (List<InterfaceC5085bsB> list : this.e.values()) {
                for (InterfaceC5085bsB interfaceC5085bsB : list) {
                    interfaceC5085bsB.d();
                    if (interfaceC5085bsB == C4350bcp.c()) {
                        C4350bcp.c(interfaceC5085bsB);
                    }
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(AbstractC5100bsQ abstractC5100bsQ, InterfaceC5085bsB interfaceC5085bsB) {
        synchronized (this) {
            List<InterfaceC5085bsB> list = this.e.get(abstractC5100bsQ);
            if (list != null) {
                list.remove(interfaceC5085bsB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        synchronized (this) {
            for (List<InterfaceC5085bsB> list : this.e.values()) {
                for (InterfaceC5085bsB interfaceC5085bsB : list) {
                    if (interfaceC5085bsB instanceof C4882boK) {
                        ((C4882boK) interfaceC5085bsB).M();
                    }
                }
            }
        }
    }

    public void d() {
        synchronized (this) {
            for (List<InterfaceC5085bsB> list : this.e.values()) {
                for (InterfaceC5085bsB interfaceC5085bsB : list) {
                    if (interfaceC5085bsB instanceof C4882boK) {
                        ((C4882boK) interfaceC5085bsB).K();
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC4776bmK
    public InterfaceC4776bmK.e a(String str) {
        InterfaceC4776bmK.e eVar;
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            for (List<InterfaceC5085bsB> list : this.e.values()) {
                for (InterfaceC5085bsB interfaceC5085bsB : list) {
                    if (interfaceC5085bsB instanceof C4882boK) {
                        C4882boK c4882boK = (C4882boK) interfaceC5085bsB;
                        if (!c4882boK.c().equals(str)) {
                            arrayList.add(new InterfaceC4776bmK.b(c4882boK.G(), c4882boK.i(), null));
                        }
                    }
                }
            }
            eVar = new InterfaceC4776bmK.e(AbstractC4918bou.a(), arrayList);
        }
        return eVar;
    }
}
