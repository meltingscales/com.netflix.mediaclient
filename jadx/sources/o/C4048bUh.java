package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.bUh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4048bUh {
    public static final e b = new e(null);
    private final InterfaceC8612dsa<Integer, String, String, dpR> c;
    private final Map<String, a> e;

    public final InterfaceC8612dsa<Integer, String, String, dpR> e() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4048bUh(InterfaceC8612dsa<? super Integer, ? super String, ? super String, dpR> interfaceC8612dsa) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        this.c = interfaceC8612dsa;
        this.e = new LinkedHashMap();
    }

    /* renamed from: o.bUh$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("LolomoVolatileRowRefresh");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bUh$a */
    /* loaded from: classes4.dex */
    public final class a extends BroadcastReceiver {
        final /* synthetic */ C4048bUh b;
        private LoMo e;

        public final void a(LoMo loMo) {
            C8632dsu.c((Object) loMo, "");
            this.e = loMo;
        }

        public a(C4048bUh c4048bUh, LoMo loMo) {
            C8632dsu.c((Object) loMo, "");
            this.b = c4048bUh;
            this.e = loMo;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Map d;
            Map k;
            Throwable th;
            if (intent == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("null volatileReceiver's intent", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
            }
            if (intent != null) {
                InterfaceC8612dsa<Integer, String, String, dpR> e = this.b.e();
                int listPos = this.e.getListPos();
                e.invoke(Integer.valueOf(listPos), this.e.getListContext(), intent.getStringExtra("browse_agent_list_refresh_extra_reno_msg_id"));
            }
        }
    }

    public final void c(Context context, List<? extends LoMo> list) {
        Set<String> V;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) list, "");
        V = C8576dqs.V(this.e.keySet());
        ArrayList<LoMo> arrayList = new ArrayList();
        for (Object obj : list) {
            LoMo loMo = (LoMo) obj;
            if (loMo.isVolatile() && loMo.getListContext() != null) {
                arrayList.add(obj);
            }
        }
        for (LoMo loMo2 : arrayList) {
            b(context, loMo2);
            V.remove(loMo2.getId());
        }
        for (String str : V) {
            a aVar = this.e.get(str);
            if (aVar == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            a(context, aVar);
            this.e.remove(str);
        }
    }

    private final void b(Context context, LoMo loMo) {
        a aVar = this.e.get(loMo.getId());
        if (aVar == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.netflix.mediaclient.intent.action.BA_LIST_REFRESH");
            intentFilter.addCategory(loMo.getListContext());
            a aVar2 = new a(this, loMo);
            LocalBroadcastManager.getInstance(context).registerReceiver(aVar2, intentFilter);
            b.getLogTag();
            this.e.put(loMo.getId(), aVar2);
            return;
        }
        aVar.a(loMo);
    }

    public final void c(Context context) {
        C8632dsu.c((Object) context, "");
        for (Map.Entry<String, a> entry : this.e.entrySet()) {
            a(context, entry.getValue());
        }
        this.e.clear();
    }

    private final void a(Context context, a aVar) {
        b.getLogTag();
        LocalBroadcastManager.getInstance(context).unregisterReceiver(aVar);
    }
}
