package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.common.PriorityTaskManager;
import com.netflix.mediaclient.service.player.PlayerPrepareListener;
import java.util.List;

/* renamed from: o.bcJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4318bcJ {
    public static final a e = new a(null);
    private C4427beM a;
    private C4572bgz b;
    private final Context c;
    private final aHJ d;
    private BroadcastReceiver f;
    private C4629biC h;
    private final BroadcastReceiver i;
    private final PriorityTaskManager j;

    public C4318bcJ(Context context, PriorityTaskManager priorityTaskManager, aHJ ahj) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) priorityTaskManager, "");
        C8632dsu.c((Object) ahj, "");
        this.c = context;
        this.j = priorityTaskManager;
        this.d = ahj;
        this.i = new d();
    }

    public final void b(C4619bht c4619bht, C4572bgz c4572bgz, C4427beM c4427beM) {
        this.b = c4572bgz;
        this.a = c4427beM;
        this.h = new C4629biC(this.c, c4619bht, c4572bgz, this.j, this.d);
        a();
    }

    public final void c() {
        e();
        C4629biC c4629biC = this.h;
        if (c4629biC != null) {
            C8632dsu.d(c4629biC);
            c4629biC.b();
            this.h = null;
        }
    }

    public final void a(List<C5102bsS> list) {
        C8632dsu.c((Object) list, "");
        b(list, null);
    }

    public final void b(List<C5102bsS> list, List<? extends PlayerPrepareListener> list2) {
        C8632dsu.c((Object) list, "");
        if (list2 != null && list.size() != list2.size()) {
            throw new IllegalStateException("prepare requests and listener size must match!".toString());
        }
        C4572bgz c4572bgz = this.b;
        if (c4572bgz != null) {
            C8632dsu.d(c4572bgz);
            c4572bgz.a(list);
        }
        C4427beM c4427beM = this.a;
        if (c4427beM != null) {
            C8632dsu.d(c4427beM);
            c4427beM.e(list);
        }
        C4629biC c4629biC = this.h;
        if (c4629biC != null) {
            C8632dsu.d(c4629biC);
            c4629biC.b(list, (List<PlayerPrepareListener>) list2);
        }
    }

    private final void a() {
        LocalBroadcastManager.getInstance(this.c).registerReceiver(this.i, C5020bqq.b());
        C1044Mm.e("PrepareManager", "Register receiver");
        c cVar = new c();
        this.f = cVar;
        C8116deM.c(this.c, cVar, "com.netflix.mediaclient.intent.category.PLAYER", "com.netflix.mediaclient.intent.action.PLAYER_AUDIO_SUBTITLE_CHANGED");
    }

    /* renamed from: o.bcJ$c */
    /* loaded from: classes3.dex */
    public static final class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            C1044Mm.b("PrepareManager", "Received intent ", intent);
            if (C8632dsu.c((Object) "com.netflix.mediaclient.intent.action.PLAYER_AUDIO_SUBTITLE_CHANGED", (Object) intent.getAction())) {
                C1044Mm.e("PrepareManager", "user audio subtitle preferences have changed.");
                C4318bcJ.this.b();
            }
        }
    }

    private final void e() {
        try {
            LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.i);
        } catch (Exception e2) {
            C1044Mm.b("PrepareManager", e2, "unregisterUserAgentReceiver", new Object[0]);
        }
        C8116deM.a(this.c, this.f);
    }

    /* renamed from: o.bcJ$d */
    /* loaded from: classes3.dex */
    public static final class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            String action = intent.getAction();
            if (C8632dsu.c((Object) "com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_DEACTIVE", (Object) action) || C8632dsu.c((Object) "com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE", (Object) action) || C8632dsu.c((Object) "com.netflix.mediaclient.intent.action.NOTIFY_CELLULAR_DATA_USAGE_CHANGED", (Object) action)) {
                C1044Mm.e("PrepareManager", "account or profile is now de-activated, or cellular data usage is changed");
                C4318bcJ.this.b();
            }
        }
    }

    public final void b() {
        C4572bgz c4572bgz = this.b;
        if (c4572bgz != null) {
            C8632dsu.d(c4572bgz);
            c4572bgz.d();
        }
        C4427beM c4427beM = this.a;
        if (c4427beM != null) {
            C8632dsu.d(c4427beM);
            c4427beM.e();
        }
    }

    /* renamed from: o.bcJ$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
