package o;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.context.MediaOffset;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.action.CachedPlay;
import com.netflix.cl.model.event.session.action.Play;
import com.netflix.cl.model.event.session.action.StartPlay;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.ui.player.v2.SkipCreditsType;
import com.netflix.mediaclient.util.PlayContext;
import java.util.Arrays;
import javax.inject.Inject;
import org.json.JSONObject;

/* renamed from: o.cxO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7498cxO extends C1045Mp {
    private long a;
    private long b;
    private Long c;
    private long d;
    private long e;

    public final void e(long j) {
        this.d = j;
    }

    @Inject
    public C7498cxO() {
        super("PlayerFragmentCL");
    }

    public final void b(AppView appView, C7535cxz c7535cxz, long j, long j2, boolean z, InterfaceC7303ctf interfaceC7303ctf, PlayContext playContext) {
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) c7535cxz, "");
        C8632dsu.c((Object) playContext, "");
        if (this.e <= 0) {
            if (this.d == 0) {
                c(c7535cxz, j, appView, playContext);
            }
            Logger logger = Logger.INSTANCE;
            logger.addContext(new MediaOffset(Long.valueOf(j2), Long.valueOf(j)));
            if (z) {
                InterfaceC5206buQ b = interfaceC7303ctf != null ? interfaceC7303ctf.b(c7535cxz.m()) : null;
                if (b != null) {
                    String y = b.y();
                    C8632dsu.a(y, "");
                    Long startSession = logger.startSession(new CachedPlay(Long.valueOf(Long.parseLong(y)), null, null, null, Long.valueOf(j), e(AppView.playback, c7535cxz, playContext)));
                    this.e = startSession == null ? 0L : startSession.longValue();
                }
            } else {
                getLogTag();
                Long startSession2 = logger.startSession(new Play(null, null, null, Long.valueOf(j), e(appView, c7535cxz, playContext)));
                this.e = startSession2 == null ? 0L : startSession2.longValue();
            }
            logger.removeExclusiveContext("MediaOffset");
            long j3 = this.d;
            if (j3 > 0) {
                logger.endSession(Long.valueOf(j3));
                this.d = 0L;
            }
        }
    }

    public final void e(Error error) {
        long j = this.e;
        if (j > 0) {
            if (error != null) {
                ExtLogger.INSTANCE.failedAction(Long.valueOf(j), CLv2Utils.a(error));
            } else {
                Logger.INSTANCE.endSession(Long.valueOf(j));
            }
            this.e = 0L;
        }
    }

    public final void d() {
        long j = this.b;
        if (j > 0) {
            Logger.INSTANCE.cancelSession(Long.valueOf(j));
            this.b = 0L;
        }
        e();
    }

    public final void e() {
        long j = this.e;
        if (j > 0) {
            Logger.INSTANCE.cancelSession(Long.valueOf(j));
            this.e = 0L;
        }
    }

    public final void c(SkipCreditsType skipCreditsType) {
        C8632dsu.c((Object) skipCreditsType, "");
        if (skipCreditsType == SkipCreditsType.c) {
            this.c = Logger.INSTANCE.startSession(new Presentation(AppView.skipIntroButton, null));
        } else if (skipCreditsType == SkipCreditsType.a) {
            this.c = Logger.INSTANCE.startSession(new Presentation(AppView.skipRecapButton, null));
        } else if (skipCreditsType == SkipCreditsType.d) {
            this.c = Logger.INSTANCE.startSession(new Presentation(AppView.skipContentButton, null));
        }
    }

    public final void c() {
        Logger.INSTANCE.endSession(this.c);
        this.c = 0L;
    }

    public final void j() {
        Long startSession = Logger.INSTANCE.startSession(new Presentation(AppView.playbackInterrupter, null));
        this.a = startSession == null ? 0L : startSession.longValue();
    }

    public final void a() {
        long j = this.b;
        if (j > 0) {
            Logger.INSTANCE.cancelSession(Long.valueOf(j));
            this.a = 0L;
        }
    }

    public final void h() {
        long j = this.a;
        if (j > 0) {
            Logger.INSTANCE.endSession(Long.valueOf(j));
            this.a = 0L;
        }
    }

    public final void d(String str) {
        C8632dsu.c((Object) str, "");
        Logger logger = Logger.INSTANCE;
        AppView appView = AppView.contentWarning;
        dsE dse = dsE.b;
        String format = String.format("{\"videoId\":\"%s\", \"advisoryType\":\"contentExpiry\"}", Arrays.copyOf(new Object[]{str}, 1));
        C8632dsu.a(format, "");
        Long startSession = logger.startSession(new Presentation(appView, CLv2Utils.e(format)));
        this.b = startSession == null ? 0L : startSession.longValue();
    }

    public final void d(C7535cxz c7535cxz, long j, AppView appView, PlayContext playContext) {
        C8632dsu.c((Object) c7535cxz, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) playContext, "");
        long j2 = this.d;
        if (j2 > 0) {
            Logger.INSTANCE.cancelSession(Long.valueOf(j2));
            this.d = 0L;
        }
        c(c7535cxz, j, appView, playContext);
    }

    public final void b() {
        long j = this.e;
        if (j > 0) {
            Logger.INSTANCE.cancelSession(Long.valueOf(j));
            this.e = 0L;
        }
    }

    private final c e(AppView appView, C7535cxz c7535cxz, PlayContext playContext) {
        if (c7535cxz.m() != null) {
            String m = c7535cxz.m();
            C8632dsu.d((Object) m);
            return new c(appView, playContext, m, playContext.g());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cxO$c */
    /* loaded from: classes4.dex */
    public static final class c implements TrackingInfo {
        private final String a;
        private final int b;
        private final AppView c;
        private final String d;
        private final String e;
        private final String f;
        private final int g;
        private final String h;
        private final String i;
        private final int j;
        private final int k;
        private final String l;

        public c(AppView appView, PlayContext playContext, String str, String str2) {
            int c;
            C8632dsu.c((Object) appView, "");
            C8632dsu.c((Object) playContext, "");
            C8632dsu.c((Object) str, "");
            this.c = appView;
            this.j = playContext.getTrackId();
            this.f = playContext.getRequestId();
            this.d = playContext.d();
            this.k = playContext.i();
            this.b = playContext.getListPos();
            this.a = playContext.a();
            this.e = playContext.getListId();
            c = C8672dug.c(10);
            this.g = Integer.parseInt(str, c);
            this.h = str2;
            this.l = playContext.h();
            this.i = playContext.f();
        }

        @Override // com.netflix.cl.model.JsonSerializer
        public JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uiLabel", this.c);
            jSONObject.put("uiPlayContextTag", this.h);
            jSONObject.put("trackId", this.j);
            jSONObject.put(SignupConstants.Field.VIDEO_ID, this.g);
            if (C8168dfL.h(this.f)) {
                jSONObject.put(Payload.PARAM_RENO_REQUEST_ID, this.f);
            }
            if (C8168dfL.h(this.d)) {
                jSONObject.put("imageKey", this.d);
            }
            jSONObject.put("rank", this.k);
            jSONObject.put("row", this.b);
            if (C8168dfL.h(this.a)) {
                jSONObject.put("lolomoId", this.a);
            }
            if (C8168dfL.h(this.e)) {
                jSONObject.put("listId", this.e);
            }
            if (C8168dfL.h(this.i)) {
                jSONObject.put("unifiedEntityId", this.i);
            }
            if (C8168dfL.h(this.l)) {
                jSONObject.put("videoMerchComputeId", this.l);
            }
            return jSONObject;
        }
    }

    private final void c(C7535cxz c7535cxz, long j, AppView appView, PlayContext playContext) {
        getLogTag();
        Long startSession = Logger.INSTANCE.startSession(new StartPlay(null, Long.valueOf(c7535cxz.i()), null, null, Long.valueOf(j), e(appView, c7535cxz, playContext)));
        this.d = startSession == null ? 0L : startSession.longValue();
    }
}
