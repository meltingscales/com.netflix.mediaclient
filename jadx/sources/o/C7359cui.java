package o;

import android.content.Context;
import android.os.Handler;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.VideoCacheStateReported;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import o.C7309ctl;

/* renamed from: o.cui  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7359cui implements InterfaceC5298bwC, C7309ctl.a {
    private final InterfaceC7221csC a;
    private final C7309ctl c;
    private final Context d;
    private List<C7460cwd> b = new ArrayList();
    private List<InterfaceC7464cwh> i = new ArrayList();
    private Map<String, InterfaceC5206buQ> g = new HashMap();
    private InterfaceC7281ctJ e = new C7284ctM();

    public InterfaceC7281ctJ d() {
        return this.e;
    }

    public C7359cui(Context context, InterfaceC7221csC interfaceC7221csC) {
        this.d = context;
        this.c = new C7309ctl(context, this);
        this.a = interfaceC7221csC;
    }

    @Override // o.InterfaceC5298bwC
    public void b(Handler handler) {
        this.c.d(handler);
    }

    @Override // o.InterfaceC5298bwC
    public InterfaceC4247bas d(Handler handler, Context context, InterfaceC5098bsO interfaceC5098bsO, boolean z, InterfaceC4208baF interfaceC4208baF) {
        return AbstractC7245csa.c(handler, context, interfaceC5098bsO, z, interfaceC4208baF);
    }

    @Override // o.InterfaceC5298bwC
    public String e(long j, Locale locale) {
        return C1333Xq.d(com.netflix.mediaclient.ui.R.o.aE).a(1).d("date", DateFormat.getDateInstance(1, locale).format(new Date(j))).c();
    }

    @Override // o.InterfaceC5298bwC
    public void d(Map<String, InterfaceC5206buQ> map) {
        this.c.b(map);
    }

    @Override // o.InterfaceC5298bwC
    public InterfaceC5206buQ c(String str) {
        return this.e.c(str);
    }

    @Override // o.InterfaceC5298bwC
    public InterfaceC4251baw c(InterfaceC4208baF interfaceC4208baF) {
        return new C7333cuI(this.d, interfaceC4208baF, new C7332cuH(), this.a, C7340cuP.d);
    }

    @Override // o.InterfaceC5298bwC
    public InterfaceC4245baq b(InterfaceC4208baF interfaceC4208baF, UserAgent userAgent) {
        return C7255csk.e(this.d, interfaceC4208baF, userAgent, this.a);
    }

    private InterfaceC1912aSw e() {
        InterfaceC1912aSw f = new C6004cQk().f();
        Objects.requireNonNull(f);
        return f;
    }

    @Override // o.InterfaceC5298bwC
    public void d(List<String> list, final InterfaceC4243bao interfaceC4243bao) {
        C1044Mm.a("offlineUi", "sendGeoPlayabilityRequest");
        if (list.size() <= 0) {
            C1044Mm.a("offlineUi", "videoIdList is empty");
            return;
        }
        C1044Mm.e("offlineUi", "sendGeoPlayabilityRequest calling... updateOfflineGeoPlayability");
        e().d(list, new AbstractC1761aNg() { // from class: o.cui.4
            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
            public void e(Map<String, Boolean> map, Status status) {
                interfaceC4243bao.b(map);
            }
        });
    }

    @Override // o.InterfaceC5298bwC
    public void c(Map<String, InterfaceC5206buQ> map, List<InterfaceC5206buQ> list) {
        this.c.e(map, list);
    }

    @Override // o.InterfaceC5298bwC
    public void d(InterfaceC5283bvo interfaceC5283bvo, CreateRequest createRequest, int i) {
        this.c.b(interfaceC5283bvo, createRequest, i);
    }

    @Override // o.InterfaceC5298bwC
    public void a(Map<String, C4240bal> map) {
        Logger.INSTANCE.logEvent(new VideoCacheStateReported(C7283ctL.d(map)));
    }

    @Override // o.InterfaceC5298bwC
    public boolean a(String str) {
        if (str == null) {
            return false;
        }
        return c(this.g.get(str), true);
    }

    public boolean c(InterfaceC5206buQ interfaceC5206buQ, boolean z) {
        int i;
        int av_;
        if (interfaceC5206buQ == null) {
            return false;
        }
        if (interfaceC5206buQ.au_() == DownloadState.Complete) {
            return true;
        }
        if (this.a.b()) {
            String aH_ = interfaceC5206buQ.aH_();
            C5096bsM a = C7353cuc.a(C8126deW.a(AbstractApplicationC1040Mh.getInstance().i().k()), aH_);
            if (z) {
                synchronized (this) {
                    Iterator<C7460cwd> it = this.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = 0;
                            break;
                        }
                        C7460cwd next = it.next();
                        if (aH_ != null && aH_.equals(next.aH_()) && a != null && (av_ = next.av_()) != 0) {
                            i = (((int) TimeUnit.MILLISECONDS.toSeconds(a.c)) * 100) / av_;
                            break;
                        }
                    }
                }
            } else {
                i = 0;
            }
            return interfaceC5206buQ.b(i);
        }
        return false;
    }

    @Override // o.C7309ctl.a
    public void e(Map<String, InterfaceC5206buQ> map, List<C7460cwd> list, List<InterfaceC7464cwh> list2) {
        this.b = list;
        this.i = list2;
        this.g = map;
        this.e.c(map, list, list2);
    }

    public InterfaceC7464cwh b(String str) {
        for (InterfaceC7464cwh interfaceC7464cwh : this.i) {
            if (interfaceC7464cwh.a().equals(str)) {
                return interfaceC7464cwh;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<C7460cwd> e(String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        for (C7460cwd c7460cwd : this.b) {
            if (str.equals(c7460cwd.aO_()) && c7460cwd.V() == VideoType.EPISODE.getKey()) {
                arrayList.add(c7460cwd);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: o.cuh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c;
                c = C7359cui.c((C7460cwd) obj, (C7460cwd) obj2);
                return c;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int c(C7460cwd c7460cwd, C7460cwd c7460cwd2) {
        int x = c7460cwd.x() - c7460cwd2.x();
        return x != 0 ? x : c7460cwd.aw_() - c7460cwd2.aw_();
    }
}
