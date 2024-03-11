package o;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.netflix.cl.EventSender;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.envelope.LoggingEnvelope;
import com.netflix.cl.model.event.Event;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.UserInteraction;
import com.netflix.cl.model.event.session.UserInteractionEnded;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RetryPolicyCL;
import com.netflix.mediaclient.service.user.UserAgent;
import java.util.concurrent.ScheduledExecutorService;
import o.AbstractC8152dew;
import o.aTH;

/* loaded from: classes3.dex */
public class aTO extends aTH implements EventSender, InterfaceC1919aTc {
    protected final C1955aUl l;

    /* renamed from: o  reason: collision with root package name */
    private final c f13442o;
    private final Handler p;
    private final TQ r;

    @Override // o.aTH
    protected AbstractC8152dew d() {
        return this.f13442o;
    }

    @Override // o.aTH
    protected void d(Intent intent) {
    }

    @Override // o.aTH
    public String g() {
        return "icleventsv2";
    }

    @Override // o.aTN
    public boolean q() {
        return true;
    }

    @Override // o.aTH, o.aTN
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // o.aTH, o.aTN
    public /* bridge */ /* synthetic */ void e(ScheduledExecutorService scheduledExecutorService) {
        super.e(scheduledExecutorService);
    }

    @Override // o.aTH, o.aTN
    public /* bridge */ /* synthetic */ void o() {
        super.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aTO(Context context, C1948aUe c1948aUe, UserAgent userAgent, aOV aov, TQ tq) {
        super(context, c1948aUe, userAgent, aov);
        this.f13442o = new c();
        C1955aUl c1955aUl = new C1955aUl();
        this.l = c1955aUl;
        c1955aUl.c(context);
        HandlerThread handlerThread = new HandlerThread("CLv2Sender");
        handlerThread.start();
        this.p = new Handler(handlerThread.getLooper());
        this.r = tq;
    }

    @Override // o.aTH
    protected void e() {
        Logger.INSTANCE.setEventSender(this);
        s();
    }

    private void s() {
        InterfaceC1926aTj h = AbstractApplicationC1040Mh.getInstance().i().h();
        if (!Config_FastProperty_RetryPolicyCL.shouldRetryWhenScheduled()) {
            C1044Mm.j("nf_log_clv2", "Retry policy is preventing us to use scheduler for retries to deliver saved events");
            return;
        }
        C1044Mm.e("nf_log_clv2", "Retry policy requires us to use scheduler for retries to deliver saved events");
        if (h != null) {
            h.d(this);
        }
    }

    @Override // o.aTN
    public void m() {
        c();
        p();
    }

    private void p() {
        if (this.g.get()) {
            C1044Mm.e("nf_log_clv2", "Local playback is in progress, consider that user just interacted with UI. Exit.");
            this.f.d(false);
            return;
        }
        C1044Mm.e("nf_log_clv2", "Local playback is NOT in progress, check last user interaction");
        long a = this.f.a();
        int i = (a > i() ? 1 : (a == i() ? 0 : -1));
        if (i >= 0) {
            Logger logger = Logger.INSTANCE;
            if (logger.existExclusiveSession(UserInteraction.class.getSimpleName())) {
                C1044Mm.e("nf_log_clv2", "It is more than 30 minutes and user session exist. End user session");
                UserInteractionEnded b = b(System.currentTimeMillis() - a);
                if (b != null) {
                    logger.endSession(b);
                }
                logger.startSession(new UserInteraction());
                this.f.d(false);
                return;
            }
        }
        if (i < 0) {
            Logger logger2 = Logger.INSTANCE;
            if (logger2.existExclusiveSession(UserInteraction.class.getSimpleName())) {
                return;
            }
            C1044Mm.e("nf_log_clv2", "It is less than 30 minutes and user session does NOT exist. Start user session");
            logger2.startSession(new UserInteraction());
        }
    }

    public static UserInteractionEnded b(long j) {
        Session exclusiveSession = Logger.INSTANCE.getExclusiveSession("UserInteraction");
        if (exclusiveSession instanceof UserInteraction) {
            return new UserInteractionEnded((UserInteraction) exclusiveSession, Long.valueOf(j));
        }
        return null;
    }

    @Override // com.netflix.cl.EventSender
    public void send(final LoggingEnvelope loggingEnvelope) {
        this.p.post(new Runnable() { // from class: o.aTM
            @Override // java.lang.Runnable
            public final void run() {
                aTO.this.e(loggingEnvelope);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void e(LoggingEnvelope loggingEnvelope) {
        C8166dfJ.c();
        try {
            String jSONObject = loggingEnvelope.toJSONObject().toString();
            String a = a(jSONObject);
            if (a != null) {
                this.m.add(a);
            }
            if (!this.g.get()) {
                C1044Mm.e("nf_log_clv2", "Local playback is NOT in progress, sending payload...");
                e(a, this.k.g(), jSONObject, new aTH.d(jSONObject));
                return;
            }
            C1044Mm.e("nf_log_clv2", "DO NOT send events during playback! Postponing...");
        } catch (OutOfMemoryError e) {
            C1044Mm.b("nf_log_clv2", e, "Failed to allocate memory for logging request, dumping log events...", new Object[0]);
            InterfaceC1599aHg.d(this.a, e);
        } catch (Throwable th) {
            C1044Mm.b("nf_log_clv2", th, "Failed to create JSON object for logging request", new Object[0]);
        }
    }

    @Override // com.netflix.cl.EventSender
    public void eventAdded(Event event, int i) {
        this.f13442o.a(event, i);
    }

    @Override // o.aTH
    protected void e(String str, String str2, String str3, aUA aua) {
        C1044Mm.e("nf_log_clv2", "sendLoggingEvents starts...");
        if (str2 == null) {
            C1044Mm.e("nf_log_clv2", "Use current profile...");
            str2 = this.k.g();
        }
        this.h.addDataRequest(this.i.e(str2, str, str3, aua));
        C1044Mm.e("nf_log_clv2", "sendLoggingEvents done.");
    }

    @Override // o.InterfaceC1919aTc
    public void b(final int i) {
        C1044Mm.c("nf_log_clv2", "runAction runId=%d", Integer.valueOf(i));
        f();
        C8187dfe.a(new Runnable() { // from class: o.aTT
            @Override // java.lang.Runnable
            public final void run() {
                aTO.this.d(i);
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i) {
        InterfaceC1926aTj h = AbstractApplicationC1040Mh.getInstance().i().h();
        if (h != null) {
            h.a(this, i);
        }
    }

    @Override // o.InterfaceC1919aTc
    public void a() {
        C1044Mm.a("nf_log_clv2", "stopAction");
    }

    /* loaded from: classes3.dex */
    static class c extends AbstractC8164dfH {
        public c() {
            super("nf_log_clv2_queue");
            c(new AbstractC8152dew.a(30));
            c(new AbstractC8152dew.b(60000L));
            c(new aTS(this, new aUB()));
        }

        @Override // o.AbstractC8164dfH
        public void b(boolean z) {
            Logger.INSTANCE.flush();
        }
    }

    @Override // o.aTN
    public void d(boolean z) {
        Logger.INSTANCE.flush();
    }

    @Override // o.aTN
    public void l() {
        ExtLogger.INSTANCE.reinitForVppa();
    }

    @Override // o.aTH, o.aTN
    public void h() {
        super.h();
        this.l.c(this.a);
    }

    @Override // o.aTH, com.netflix.cl.EventSender
    public boolean canSendEvent(String str) {
        return this.b.e(str);
    }

    @Override // o.aTH
    protected void j() {
        C1044Mm.e("nf_log_clv2", "handleLocalPlaybackEnded::");
        synchronized (this.m) {
            for (final String str : this.m) {
                if (this.g.get()) {
                    C1044Mm.e("nf_log_clv2", "Local playback is in progress, stop sending pending events...");
                    return;
                }
                this.p.post(new Runnable() { // from class: o.aTR
                    @Override // java.lang.Runnable
                    public final void run() {
                        aTO.this.e(str);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str) {
        C8166dfJ.c();
        i(str);
    }
}
