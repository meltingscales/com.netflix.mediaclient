package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.session.NavigationLevel;
import com.netflix.cl.model.event.session.action.Navigate;

/* renamed from: o.bzg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5487bzg {
    private Long a;
    private Long b;
    private Long c;

    public final void b() {
        a();
        c();
        e();
    }

    public final void j() {
        this.b = Logger.INSTANCE.startSession(new NavigationLevel(AppView.demographicInterstitialLanding, null));
    }

    public final void g() {
        this.a = Logger.INSTANCE.startSession(new NavigationLevel(AppView.collectDemographicInfo, null));
    }

    public final void c() {
        Long l = this.a;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
        }
    }

    public final void e() {
        Long l = this.b;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
        }
    }

    public final void d() {
        this.c = Logger.INSTANCE.startSession(new Navigate(AppView.collectDemographicInfo, null, CommandValue.ForwardCommand, null));
    }

    public final void a() {
        Long l = this.c;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
        }
    }
}
