package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Presentation;

/* renamed from: o.cke  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6827cke {
    public static final e a = new e(null);
    private Long d;

    /* renamed from: o.cke$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("MhuEbiCL");
        }
    }

    public final void d(AppView appView, TrackingInfo trackingInfo) {
        C8632dsu.c((Object) appView, "");
        Logger logger = Logger.INSTANCE;
        logger.endSession(this.d);
        this.d = logger.startSession(new Presentation(appView, trackingInfo));
    }

    public final void d() {
        Logger.INSTANCE.endSession(this.d);
    }
}
