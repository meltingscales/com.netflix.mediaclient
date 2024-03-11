package o;

import com.netflix.mediaclient.ui.player.v2.interactive.MomentState;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.ImpressionData;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.TransitionType;

/* loaded from: classes4.dex */
public interface cHR extends cHW {
    void a(MomentState momentState, Moment moment, long j);

    void a(boolean z, Moment moment, String str, String str2, ImpressionData impressionData, TransitionType transitionType, String str3);

    void b(Moment moment, String str, ImpressionData impressionData);

    void c(ImpressionData impressionData);

    void d(Moment moment, Choice choice, ImpressionData impressionData, boolean z);

    void d(boolean z, Moment moment, String str, String str2, ImpressionData impressionData, long j);

    void f();

    void g();

    void i();

    void j();

    /* loaded from: classes4.dex */
    public static final class d {
        public static /* synthetic */ void a(cHR chr, boolean z, Moment moment, String str, String str2, ImpressionData impressionData, TransitionType transitionType, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNextSegment");
            }
            chr.a(z, moment, str, str2, impressionData, (i & 32) != 0 ? TransitionType.LAZY : transitionType, (i & 64) != 0 ? null : str3);
        }
    }
}
