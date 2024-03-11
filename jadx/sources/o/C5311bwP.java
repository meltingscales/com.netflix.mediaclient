package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.command.ForwardCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;

/* renamed from: o.bwP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5311bwP {
    private Long a;
    private Long c;
    private Long d;

    public final void h() {
    }

    public final void e() {
        c();
        b();
        a();
    }

    public final void c() {
        Long l = this.c;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
        }
    }

    public final void g() {
        b();
    }

    public final void b() {
        Long l = this.d;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
        }
    }

    public final void j() {
        a();
    }

    public final void a() {
        Long l = this.a;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
        }
    }

    public final void d() {
        CLv2Utils.d(new ForwardCommand());
    }
}
