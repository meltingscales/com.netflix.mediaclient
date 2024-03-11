package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;

/* renamed from: o.daw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7940daw {
    public static final c a = new c(null);
    private b b;
    private final drO<dpR> c;
    private b d;
    private final drO<dpR> e;

    public C7940daw(drO<dpR> dro, drO<dpR> dro2) {
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dro2, "");
        this.c = dro;
        this.e = dro2;
    }

    /* renamed from: o.daw$c */
    /* loaded from: classes5.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("CWRefreshHandler");
        }
    }

    /* renamed from: o.daw$b */
    /* loaded from: classes5.dex */
    public static final class b extends BroadcastReceiver {
        private final drO<dpR> c;

        public b(drO<dpR> dro) {
            C8632dsu.c((Object) dro, "");
            this.c = dro;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.c.invoke();
        }
    }

    public final void e(Context context) {
        C8632dsu.c((Object) context, "");
        if (this.d == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.netflix.mediaclient.intent.action.BA_LIST_REFRESH");
            intentFilter.addCategory(LoMoType.CONTINUE_WATCHING.a());
            b bVar = new b(this.e);
            LocalBroadcastManager.getInstance(context).registerReceiver(bVar, intentFilter);
            a.getLogTag();
            this.d = bVar;
        }
        if (this.b == null) {
            b bVar2 = new b(this.c);
            LocalBroadcastManager.getInstance(context).registerReceiver(bVar2, new IntentFilter("com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO"));
            a.getLogTag();
            this.b = bVar2;
        }
    }

    public final void a(Context context) {
        C8632dsu.c((Object) context, "");
        b bVar = this.d;
        if (bVar != null) {
            a.getLogTag();
            LocalBroadcastManager.getInstance(context).unregisterReceiver(bVar);
            this.d = null;
        }
        b bVar2 = this.b;
        if (bVar2 != null) {
            a.getLogTag();
            LocalBroadcastManager.getInstance(context).unregisterReceiver(bVar2);
            this.b = null;
        }
    }
}
