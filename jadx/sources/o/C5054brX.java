package o;

import com.netflix.mediaclient.service.user.UserAgent;
import io.reactivex.subjects.PublishSubject;

/* renamed from: o.brX  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5054brX extends AbstractC5046brP {
    public static final a b = new a(null);

    @Override // o.aMF
    public String agentName() {
        return "zuul";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5054brX(aOV aov, UserAgent userAgent, PublishSubject<dpR> publishSubject) {
        super(aov, userAgent, publishSubject);
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) publishSubject, "");
        C1044Mm.e("nf_zuul", "Created...");
    }

    /* renamed from: o.brX$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    @Override // o.aMF
    public void doInit() {
        initCompleted(InterfaceC1078Nw.aJ);
    }
}
