package o;

import android.view.ViewGroup;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.player.v2.interactive.MomentState;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.ImpressionData;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.TransitionType;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import java.util.List;
import java.util.Map;
import o.AbstractC5780cIb;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.cBO;
import o.cBQ;
import o.dpR;

/* renamed from: o.cIb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5780cIb extends AbstractC5765cHn implements cHR {
    private final ViewGroup b;
    private String c;
    private cBZ d;
    private boolean e;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(cBZ cbz) {
        this.d = cbz;
    }

    @Override // o.cHW
    public void d(boolean z) {
        this.e = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean k() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cBZ l() {
        return this.d;
    }

    public final ViewGroup o() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5780cIb(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        this.b = viewGroup;
    }

    @Override // o.cHR
    public void a(boolean z, Moment moment, String str, String str2, ImpressionData impressionData, TransitionType transitionType, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) transitionType, "");
        b((AbstractC5780cIb) new cBQ.b(moment, str, str2, z, impressionData, str3, transitionType));
        this.c = str2;
    }

    @Override // o.cHR
    public void b(Moment moment, String str, ImpressionData impressionData) {
        C8632dsu.c((Object) str, "");
        b((AbstractC5780cIb) new cBQ.b(moment, str, null, true, impressionData, null, null));
    }

    @Override // o.cHR
    public void d(Moment moment, Choice choice, ImpressionData impressionData, boolean z) {
        Choice.ChoiceAction action;
        Map d;
        Map k;
        Throwable th;
        if (choice == null || (action = choice.action()) == null) {
            return;
        }
        String videoId = action.videoId();
        if (videoId == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("no video Id for next episode", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
                return;
            } else {
                dVar.e().b(c1596aHd, th);
                return;
            }
        }
        String id = choice.id();
        Integer trackId = action.trackId();
        String requestId = action.requestId();
        Long bookmarkPositionMs = action.bookmarkPositionMs();
        C8632dsu.a(bookmarkPositionMs, "");
        b((AbstractC5780cIb) new cBQ.c(moment, id, videoId, trackId, requestId, z, bookmarkPositionMs.longValue(), action.ancestorId(), action.uiLabel()));
    }

    @Override // o.cHR
    public void d(boolean z, Moment moment, String str, String str2, ImpressionData impressionData, long j) {
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) str, "");
        b((AbstractC5780cIb) new cBQ.e(moment, str, str2, false, impressionData, j, z));
        this.c = str2;
    }

    @Override // o.cHR
    public void i() {
        this.c = null;
        e().setVisibility(8);
    }

    public void b(Long l, Choice.ChoiceAction choiceAction) {
        C8632dsu.c((Object) choiceAction, "");
        C9726vo.d(choiceAction.momentsIntent(), l, choiceAction.segmentId(), new InterfaceC8612dsa<String, Long, String, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.interactive.PlayerInteractiveMomentUIView$fetchMoments$1
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(String str, Long l2, String str2) {
                a(str, l2.longValue(), str2);
                return dpR.c;
            }

            public final void a(String str, long j, String str2) {
                C8632dsu.c((Object) str, "");
                C8632dsu.c((Object) str2, "");
                AbstractC5780cIb.this.b((AbstractC5780cIb) new cBQ.d(str, j, str2, null, null, 24, null));
            }
        });
    }

    public void e(Long l, List<String> list, String str, StateHistory stateHistory) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str, "");
        if (l != null) {
            b((AbstractC5780cIb) new cBQ.d(Moment.InteractiveIntent.MOMENT_REFRESH, l.longValue(), str, list, stateHistory));
        }
    }

    @Override // o.cHR
    public void a(MomentState momentState, Moment moment, long j) {
        C8632dsu.c((Object) momentState, "");
        C8632dsu.c((Object) moment, "");
        C5791cIm.d.getLogTag();
        b((AbstractC5780cIb) new cBQ.p(momentState, moment));
    }

    @Override // o.cHW
    public void b(int i, int i2, int i3, int i4) {
        b((AbstractC5780cIb) new cBQ.q(i, i2, i3, i4));
    }

    public void n() {
        b((AbstractC5780cIb) cBO.L.b);
    }

    @Override // o.cHR
    public void c(ImpressionData impressionData) {
        b((AbstractC5780cIb) new cBQ.r(impressionData));
    }
}
