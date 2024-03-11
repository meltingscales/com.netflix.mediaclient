package o;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Closed;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.discrete.Skipped;
import com.netflix.cl.model.event.session.action.SetThumbRating;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C1346Yd;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;

/* loaded from: classes4.dex */
public final class bBD {
    public static final e d = new e(null);
    private final TrackingInfoHolder b;

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("CollectTasteRatingCLHelper");
        }
    }

    public bBD(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        this.b = trackingInfoHolder;
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(boolean z, String str);

        /* renamed from: o.bBD$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0101b {
            public static /* synthetic */ void b(b bVar, boolean z, String str, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ended");
                }
                if ((i & 2) != 0) {
                    str = null;
                }
                bVar.a(z, str);
            }
        }
    }

    public final void e() {
        Logger.INSTANCE.logEvent(new Presented(AppView.bulkRaterScreen, Boolean.FALSE, TrackingInfoHolder.a(this.b, null, null, null, 7, null)));
    }

    public final void d(C3528bBe c3528bBe, int i) {
        C8632dsu.c((Object) c3528bBe, "");
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        String logTag = d.getLogTag();
        aVar.a(logTag + ": onCloseButtonClicked: position = " + i);
        Logger.INSTANCE.logEvent(new Closed(AppView.closeButton, AppView.bulkRaterScreen, CommandValue.ExitBulkRaterCommand, e(this, c3528bBe, i, false, 4, null)));
    }

    public final void a(C3528bBe c3528bBe, int i) {
        C8632dsu.c((Object) c3528bBe, "");
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        String logTag = d.getLogTag();
        aVar.a(logTag + ": onBackButtonClicked: position = " + i);
        Logger.INSTANCE.logEvent(new Selected(AppView.backButton, AppView.bulkRaterScreen, CommandValue.ExitBulkRaterCommand, e(this, c3528bBe, i, false, 4, null)));
    }

    public final void c(C3528bBe c3528bBe, int i) {
        C8632dsu.c((Object) c3528bBe, "");
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        String logTag = d.getLogTag();
        aVar.a(logTag + ": onTitleAppeared: position = " + i);
        CLv2Utils.b(false, AppView.bulkRaterArt, e(c3528bBe, i, true), null);
    }

    public final b c(C3528bBe c3528bBe, int i, int i2) {
        C8632dsu.c((Object) c3528bBe, "");
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        String logTag = d.getLogTag();
        aVar.a(logTag + ": onTitleRated: position = " + i + " rating = " + i2);
        SetThumbRating setThumbRating = new SetThumbRating(AppView.thumbButton, AppView.bulkRaterScreen, Long.valueOf((long) i2), CommandValue.SetThumbRatingCommand, e(this, c3528bBe, i, false, 4, null));
        Logger.INSTANCE.startSession(setThumbRating);
        return new a(setThumbRating);
    }

    /* loaded from: classes4.dex */
    public static final class a implements b {
        final /* synthetic */ SetThumbRating c;

        a(SetThumbRating setThumbRating) {
            this.c = setThumbRating;
        }

        @Override // o.bBD.b
        public void a(boolean z, String str) {
            if (z) {
                Logger.INSTANCE.endSession(Long.valueOf(this.c.getId()));
            } else {
                ExtLogger.INSTANCE.failedAction(Long.valueOf(this.c.getId()), str);
            }
        }
    }

    public final void b(C3528bBe c3528bBe, int i) {
        C8632dsu.c((Object) c3528bBe, "");
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        String logTag = d.getLogTag();
        aVar.a(logTag + ": onTitleSkipped: position = " + i);
        Logger.INSTANCE.logEvent(new Skipped(AppView.skipRatingButton, AppView.bulkRaterScreen, CommandValue.SkipCommand, e(this, c3528bBe, i, false, 4, null)));
    }

    public final void c() {
        CLv2Utils.b(false, AppView.bulkRaterLoadingScreen, TrackingInfoHolder.a(this.b, null, null, null, 7, null), null);
    }

    private final InterfaceC5222bug<? extends InterfaceC5223buh> e(C3528bBe c3528bBe, int i) {
        List<InterfaceC5222bug<? extends InterfaceC5223buh>> d2;
        Map<String, String> i2;
        Throwable th;
        Pair<List<InterfaceC5222bug<? extends InterfaceC5223buh>>, List<C1346Yd.e>> c = c3528bBe.b().c();
        if (c == null || (d2 = c.d()) == null) {
            return null;
        }
        int size = d2.size();
        if (i < size) {
            return d2.get(i);
        }
        InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
        C1596aHd b2 = new C1596aHd("SPY-36845: Collect Taste: IndexOutOfBoundsException during getVideoEntity call", null, null, false, null, false, false, 126, null).b(ErrorType.c);
        i2 = dqE.i(dpD.a("position", String.valueOf(i)), dpD.a("size", String.valueOf(size)));
        C1596aHd b3 = b2.e(i2).b(true);
        ErrorType errorType = b3.a;
        if (errorType != null) {
            b3.e.put("errorType", errorType.c());
            String b4 = b3.b();
            if (b4 != null) {
                String c2 = errorType.c();
                b3.a(c2 + " " + b4);
            }
        }
        if (b3.b() != null && b3.i != null) {
            th = new Throwable(b3.b(), b3.i);
        } else if (b3.b() != null) {
            th = new Throwable(b3.b());
        } else {
            th = b3.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
        InterfaceC1597aHe c3 = dVar2.c();
        if (c3 != null) {
            c3.d(b3, th);
            return null;
        }
        dVar2.e().b(b3, th);
        return null;
    }

    static /* synthetic */ TrackingInfo e(bBD bbd, C3528bBe c3528bBe, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return bbd.e(c3528bBe, i, z);
    }

    private final TrackingInfo e(C3528bBe c3528bBe, int i, boolean z) {
        String boxartId;
        InterfaceC5223buh video;
        InterfaceC5149btM evidence;
        String imageKey;
        InterfaceC5223buh video2;
        InterfaceC5222bug<? extends InterfaceC5223buh> e2 = e(c3528bBe, i);
        TrackingInfoHolder trackingInfoHolder = this.b;
        if (e2 != null && (video2 = e2.getVideo()) != null) {
            trackingInfoHolder = trackingInfoHolder.e(video2, i);
        }
        TrackingInfoHolder trackingInfoHolder2 = trackingInfoHolder;
        if (z) {
            if (e2 == null || (evidence = e2.getEvidence()) == null || (imageKey = evidence.getImageKey()) == null) {
                boxartId = (e2 == null || (video = e2.getVideo()) == null) ? null : video.getBoxartId();
            } else {
                boxartId = imageKey;
            }
            return TrackingInfoHolder.a(trackingInfoHolder2, boxartId, null, null, 6, null);
        }
        return TrackingInfoHolder.a(trackingInfoHolder2, null, null, null, 7, null);
    }
}
