package o;

import android.content.Context;
import com.netflix.mediaclient.localdiscovery.impl.UserAgentEventsReceiver;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes3.dex */
public final class aGW implements aGT {
    public static final a e = new a(null);
    private final List<String> a;
    private final Context b;
    private final boolean c;
    private final aGV d;
    private final aGZ f;

    @Inject
    public aGW(@ApplicationContext Context context, boolean z, List<String> list) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) list, "");
        this.b = context;
        this.c = z;
        this.a = list;
        UserAgentEventsReceiver.c.b(this);
        this.f = new aGZ(this);
        this.d = new aGV(context);
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("nf_local_discovery");
        }
    }

    @Override // o.aGT
    public boolean b() {
        return aGX.e.e();
    }

    @Override // o.aGT
    public boolean e() {
        boolean e2 = this.d.e();
        e.getLogTag();
        return e2;
    }

    @Override // o.aGT
    public boolean c() {
        if (d()) {
            boolean a2 = this.d.a();
            e.getLogTag();
            return a2;
        }
        e.getLogTag();
        return true;
    }

    @Override // o.aGT
    public boolean d() {
        if (this.c) {
            aGX agx = aGX.e;
            return agx.d(agx.a(), this.a);
        }
        e.getLogTag();
        return false;
    }

    public final void a() {
        e.getLogTag();
        this.d.c();
    }

    @Override // o.aGT
    public void c(boolean z) {
        a aVar = e;
        aVar.getLogTag();
        this.d.b(z);
        aGZ.b(this.f, z, null, 2, null);
        aVar.getLogTag();
    }

    @Override // o.aGT
    public void b(aGS ags) {
        C8632dsu.c((Object) ags, "");
        e.getLogTag();
        this.f.e(ags);
    }

    @Override // o.aGT
    public void e(aGS ags) {
        C8632dsu.c((Object) ags, "");
        e.getLogTag();
        this.f.c(ags);
    }
}
