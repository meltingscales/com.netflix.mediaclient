package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.clutils.CLv2Utils;
import java.util.Map;
import kotlin.Pair;

/* renamed from: o.cgA */
/* loaded from: classes4.dex */
public final class C6585cgA {
    public static final c e = new c(null);
    private Long a;
    private Long b;
    private Long c;
    private Long d;

    /* renamed from: o.cgA$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("MemberRejoinCL");
        }
    }

    public static /* synthetic */ void a(C6585cgA c6585cgA, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c6585cgA.a(str, z);
    }

    public final void d() {
        Long l = this.c;
        if (l != null) {
            long longValue = l.longValue();
            e.getLogTag();
            Logger.INSTANCE.endSession(Long.valueOf(longValue));
            this.c = null;
        }
    }

    public final void e() {
        Long l = this.d;
        if (l != null) {
            long longValue = l.longValue();
            e.getLogTag();
            Logger.INSTANCE.endSession(Long.valueOf(longValue));
            this.d = null;
        }
    }

    public final void b() {
        Long l = this.a;
        if (l != null) {
            long longValue = l.longValue();
            e.getLogTag();
            Logger.INSTANCE.endSession(Long.valueOf(longValue));
            this.a = null;
        }
    }

    public final void c() {
        Long l = this.b;
        if (l != null) {
            long longValue = l.longValue();
            e.getLogTag();
            Logger.INSTANCE.endSession(Long.valueOf(longValue));
            this.b = null;
        }
    }

    public final void a() {
        d();
        b();
        c();
        e();
    }

    public final void a(String str, boolean z) {
        int c2;
        Map c3;
        e.getLogTag();
        d();
        Logger logger = Logger.INSTANCE;
        AppView appView = AppView.previousPlanPrompt;
        Pair a = dpD.a("previousPlan", String.valueOf(str));
        c2 = C6586cgB.c(z);
        c3 = dqE.c(a, dpD.a("loadingStatus", Integer.valueOf(c2)));
        this.c = logger.startSession(new Presentation(appView, CLv2Utils.a(c3)));
    }

    public final void g() {
        e.getLogTag();
        d();
        this.d = Logger.INSTANCE.startSession(new Presentation(AppView.confirmWwoabDetailsPage, null));
    }

    public final void j() {
        e.getLogTag();
        Logger.INSTANCE.logEvent(new Selected(AppView.restartMembershipConfirmButton, null, CommandValue.RestartMembershipCommand, null));
    }

    public final void i() {
        e.getLogTag();
        Logger.INSTANCE.logEvent(new Selected(AppView.restartMembershipButton, null, CommandValue.RestartMembershipCommand, null));
    }

    public final void f() {
        e.getLogTag();
        Logger.INSTANCE.logEvent(new Selected(AppView.continueButton, null, CommandValue.ContinuePreviousPlanCommand, null));
    }
}
