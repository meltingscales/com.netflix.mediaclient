package o;

import android.content.Context;
import androidx.media3.datasource.DataSource;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.cronetdatasource.CronetDataSource;
import org.chromium.net.ExperimentalCronetEngine;
import org.linphone.core.Privacy;

/* renamed from: o.bmk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4802bmk implements DataSource.Factory {
    private static volatile ExperimentalCronetEngine b;
    public static final a d = new a(null);
    private final InterfaceC4795bmd a;
    private final Context c;
    private final C4653bia e;
    private final InterfaceC4834bnP j;

    public C4802bmk(Context context, InterfaceC4834bnP interfaceC4834bnP, InterfaceC4795bmd interfaceC4795bmd, C4653bia c4653bia) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c4653bia, "");
        this.c = context;
        this.j = interfaceC4834bnP;
        this.a = interfaceC4795bmd;
        this.e = c4653bia;
    }

    public /* synthetic */ C4802bmk(Context context, InterfaceC4834bnP interfaceC4834bnP, InterfaceC4795bmd interfaceC4795bmd, C4653bia c4653bia, int i, C8627dsp c8627dsp) {
        this(context, (i & 2) != 0 ? null : interfaceC4834bnP, (i & 4) != 0 ? null : interfaceC4795bmd, (i & 8) != 0 ? new C4653bia(12000, 12000, Privacy.DEFAULT, false) : c4653bia);
    }

    @Override // androidx.media3.datasource.DataSource.Factory
    public DataSource createDataSource() {
        ExperimentalCronetEngine a2 = d.a(this.c);
        ExecutorC4803bml executorC4803bml = new ExecutorC4803bml();
        C4653bia c4653bia = this.e;
        return new CronetDataSource(a2, executorC4803bml, c4653bia.d, c4653bia.c, false, null, this.j, this.a, c4653bia.a, c4653bia.b);
    }

    public final C4759blV e() {
        return new C4759blV(d.a(this.c), new ExecutorC4803bml(), this.e.d);
    }

    /* renamed from: o.bmk$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final ExperimentalCronetEngine a(Context context) {
            C8632dsu.c((Object) context, "");
            ExperimentalCronetEngine experimentalCronetEngine = C4802bmk.b;
            if (experimentalCronetEngine == null) {
                synchronized (this) {
                    experimentalCronetEngine = C4802bmk.b;
                    if (experimentalCronetEngine == null) {
                        ExperimentalCronetEngine e = new aHG(context).e(false).e();
                        e.addRequestFinishedListener(new C4804bmm());
                        a aVar = C4802bmk.d;
                        C4802bmk.b = e;
                        experimentalCronetEngine = e;
                    }
                }
                C8632dsu.a(experimentalCronetEngine, "");
            }
            return experimentalCronetEngine;
        }
    }
}
