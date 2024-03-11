package o;

import android.annotation.SuppressLint;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Hid;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.cl.model.event.discrete.Skipped;
import com.netflix.cl.model.event.discrete.Undo;
import com.netflix.cl.model.event.session.action.SetThumbRating;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C5431byd;
import o.dpR;
import org.json.JSONObject;

/* renamed from: o.byd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5431byd {
    public static final a a = new a(null);
    private final aLP b;
    private boolean c;
    private LoMo d;
    private String e;
    private final Map<Integer, Integer> i;

    public C5431byd(aLP alp, String str, LoMo loMo) {
        C8632dsu.c((Object) alp, "");
        C8632dsu.c((Object) loMo, "");
        this.b = alp;
        this.e = str;
        this.d = loMo;
        this.i = new LinkedHashMap();
    }

    /* renamed from: o.byd$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("BulkRaterLogging");
        }
    }

    public final void d(String str, LoMo loMo) {
        C8632dsu.c((Object) loMo, "");
        String annotation = loMo.getAnnotation("is_payoff");
        boolean parseBoolean = annotation != null ? Boolean.parseBoolean(annotation) : false;
        this.e = str;
        this.d = loMo;
        if (parseBoolean) {
            return;
        }
        if (C8632dsu.c((Object) str, (Object) str) && C8632dsu.c(this.d, loMo)) {
            return;
        }
        this.i.clear();
    }

    public final void b(boolean z) {
        if (z) {
            this.c = false;
            String annotation = this.d.getAnnotation("module_impression_token");
            if (annotation != null) {
                d(this, annotation, null, 2, null);
            }
        }
    }

    public final void a(int i, int i2) {
        Logger logger = Logger.INSTANCE;
        AppView appView = AppView.rateItemArt;
        logger.logEvent(new Presented(appView, Boolean.FALSE, d(appView, i, i2)));
    }

    public final c a(int i, int i2, int i3) {
        a();
        this.i.put(Integer.valueOf(i), Integer.valueOf(i3));
        AppView appView = AppView.thumbButton;
        SetThumbRating setThumbRating = new SetThumbRating(appView, null, Long.valueOf(i3), CommandValue.SetThumbRatingCommand, d(appView, i, i2));
        Logger.INSTANCE.startSession(setThumbRating);
        return new e(setThumbRating);
    }

    /* renamed from: o.byd$e */
    /* loaded from: classes4.dex */
    public static final class e implements c {
        final /* synthetic */ SetThumbRating d;

        e(SetThumbRating setThumbRating) {
            this.d = setThumbRating;
        }

        @Override // o.C5431byd.c
        public void b(boolean z, String str) {
            if (z) {
                Logger.INSTANCE.endSession(Long.valueOf(this.d.getId()));
            } else {
                ExtLogger.INSTANCE.failedAction(Long.valueOf(this.d.getId()), str);
            }
        }
    }

    public final void b(int i, int i2, final drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        a();
        this.i.put(Integer.valueOf(i), 0);
        Logger logger = Logger.INSTANCE;
        AppView appView = AppView.skipRatingButton;
        logger.logEvent(new Skipped(appView, null, CommandValue.SkipCommand, d(appView, i, i2)));
        String itemImpressionTokenForPosition = this.d.getItemImpressionTokenForPosition(i);
        a.getLogTag();
        if (itemImpressionTokenForPosition != null) {
            a(itemImpressionTokenForPosition, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterLogging$onTitleSkipped$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }

                public final void b() {
                    dro.invoke();
                }
            });
        } else {
            dro.invoke();
        }
    }

    public final c e(int i, int i2) {
        Integer num;
        a();
        Logger logger = Logger.INSTANCE;
        AppView appView = AppView.undoButton;
        CommandValue commandValue = CommandValue.UndoCommand;
        logger.logEvent(new Undo(null, null, appView, commandValue, TrackingInfoHolder.e(c(appView), null, 1, null)));
        if (this.i.get(Integer.valueOf(i)) == null || ((num = this.i.get(Integer.valueOf(i))) != null && num.intValue() == 0)) {
            return null;
        }
        SetThumbRating setThumbRating = new SetThumbRating(appView, null, 0L, commandValue, d(appView, i, i2));
        logger.startSession(setThumbRating);
        return new d(setThumbRating);
    }

    /* renamed from: o.byd$d */
    /* loaded from: classes4.dex */
    public static final class d implements c {
        final /* synthetic */ SetThumbRating d;

        d(SetThumbRating setThumbRating) {
            this.d = setThumbRating;
        }

        @Override // o.C5431byd.c
        public void b(boolean z, String str) {
            if (z) {
                Logger.INSTANCE.endSession(Long.valueOf(this.d.getSessionId()));
            } else {
                ExtLogger.INSTANCE.failedAction(Long.valueOf(this.d.getSessionId()), str);
            }
        }
    }

    public final boolean d() {
        if (!this.i.isEmpty()) {
            Map<Integer, Integer> map = this.i;
            if (map.isEmpty()) {
                return true;
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                Integer value = entry.getValue();
                if (value != null) {
                    if (value.intValue() != 0) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void c(boolean z) {
        if (z) {
            Logger logger = Logger.INSTANCE;
            AppView appView = AppView.hideRatingButton;
            logger.logEvent(new Hid(appView, null, CommandValue.HideCommand, TrackingInfoHolder.e(c(appView), null, 1, null)));
            return;
        }
        Logger logger2 = Logger.INSTANCE;
        AppView appView2 = AppView.undoButton;
        logger2.logEvent(new Undo(null, appView2, null, CommandValue.UndoCommand, TrackingInfoHolder.e(c(appView2), null, 1, null)));
        AppView appView3 = AppView.hideRatingButton;
        logger2.logEvent(new Hid(appView3, null, CommandValue.CancelCommand, TrackingInfoHolder.e(c(appView3), null, 1, null)));
    }

    private final TrackingInfoHolder c(AppView appView) {
        TrackingInfoHolder a2 = new TrackingInfoHolder(PlayLocationType.LOLOMO_ROW).a(this.d);
        String str = this.e;
        return str != null ? a2.c(str) : a2;
    }

    private final TrackingInfo d(AppView appView, int i, int i2) {
        Map c2;
        TrackingInfoHolder c3 = c(appView);
        c2 = dqE.c(dpD.a(SignupConstants.Field.VIDEO_ID, Integer.valueOf(i2)), dpD.a("rank", Integer.valueOf(i)));
        return c3.c(new JSONObject(c2));
    }

    private final void a() {
        String annotation;
        if (this.c || (annotation = this.d.getAnnotation("user_interaction_token")) == null) {
            return;
        }
        this.c = true;
        d(this, annotation, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void d(C5431byd c5431byd, String str, drO dro, int i, Object obj) {
        if ((i & 2) != 0) {
            dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterLogging$logImpression$1
                public final void e() {
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }
            };
        }
        c5431byd.a(str, dro);
    }

    @SuppressLint({"CheckResult"})
    private final void a(final String str, final drO<dpR> dro) {
        Observable e2 = this.b.e(new C0992Kl(str));
        final drM<Boolean, dpR> drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterLogging$logImpression$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Boolean bool) {
                b(bool);
                return dpR.c;
            }

            public final void b(Boolean bool) {
                C5431byd.a.getLogTag();
                dro.invoke();
            }
        };
        Consumer consumer = new Consumer() { // from class: o.byc
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5431byd.e(drM.this, obj);
            }
        };
        final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterLogging$logImpression$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                C5431byd.a aVar = C5431byd.a;
                dro.invoke();
            }
        };
        e2.subscribe(consumer, new Consumer() { // from class: o.byb
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5431byd.c(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* renamed from: o.byd$c */
    /* loaded from: classes6.dex */
    public interface c {
        void b(boolean z, String str);

        /* renamed from: o.byd$c$a */
        /* loaded from: classes6.dex */
        public static final class a {
            public static /* synthetic */ void c(c cVar, boolean z, String str, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ended");
                }
                if ((i & 2) != 0) {
                    str = null;
                }
                cVar.b(z, str);
            }
        }
    }
}
