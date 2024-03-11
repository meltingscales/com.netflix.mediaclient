package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.netflix.model.leafs.originals.interactive.Audio;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.TrackingInfo;
import com.netflix.model.leafs.originals.interactive.template.ScoreContainer;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import io.reactivex.Observable;
import o.C5651cDh;
import o.cIE;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.cCr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5634cCr extends C5625cCi {
    private cDC h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5634cCr(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5634cCr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final void setTriviaQuestScoreInteractiveUIVIew(cDC cdc) {
        this.h = cdc;
    }

    public /* synthetic */ C5634cCr(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5634cCr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    @Override // o.C5625cCi, o.cBY
    public void setupUI() {
        super.setupUI();
        n();
        t();
    }

    private final void t() {
        ScoreContainer scoreContainer = c().elements().scoreContainer();
        if (scoreContainer != null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(cIE.b.cg);
            frameLayout.setVisibility(0);
            Observable<C5651cDh> j = j();
            InteractiveMoments d = d();
            Moment q = q();
            C8632dsu.d(frameLayout);
            cDC cdc = new cDC(j, d, q, frameLayout, scoreContainer, f(), i(), h(), r(), false, 512, null);
            b().add(cdc);
            this.h = cdc;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n() {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5634cCr.n():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C5625cCi
    public void a(int i, Choice choice) {
        Integer correctIndex;
        C8632dsu.c((Object) choice, "");
        cHR u = u();
        if (u != null) {
            u.c(choice.impressionData());
        }
        Integer correctIndex2 = q().correctIndex();
        int i2 = (correctIndex2 != null && correctIndex2.intValue() == i) ? 1 : 0;
        if (i2 == 0 && (correctIndex = q().correctIndex()) != null) {
            b(new C5651cDh.h(correctIndex.intValue(), VisualStateDefinition.ELEMENT_STATE.CORRECT));
        }
        cDC cdc = this.h;
        if (cdc != null) {
            cdc.c();
        }
        TrackingInfo trackingInfo = q().trackingInfo(d());
        if (trackingInfo != null) {
            Moment.Builder builder = q().toBuilder();
            JSONObject copyValues = trackingInfo.copyValues(new JSONObject());
            copyValues.put("correctAnswerCount", i2);
            copyValues.put("selectedAnswers", new JSONArray(new String[]{choice.id()}));
            dpR dpr = dpR.c;
            Moment build = builder.trackingInfo(new TrackingInfo(copyValues)).build();
            C8632dsu.a(build, "");
            e(build);
        }
        super.a(i, choice);
    }

    @Override // o.C5625cCi
    protected void c(int i) {
        Integer correctIndex = q().correctIndex();
        c((correctIndex != null && correctIndex.intValue() == i) ? Audio.TYPE.explicitSelectionCorrect : Audio.TYPE.explicitSelectionWrong);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C5625cCi
    public void m() {
        TrackingInfo trackingInfo = q().trackingInfo(d());
        if (trackingInfo != null) {
            Moment.Builder builder = q().toBuilder();
            JSONObject copyValues = trackingInfo.copyValues(new JSONObject());
            copyValues.put("correctAnswerCount", 0);
            copyValues.put("selectedAnswers", new JSONArray(new Integer[0]));
            dpR dpr = dpR.c;
            Moment build = builder.trackingInfo(new TrackingInfo(copyValues)).build();
            C8632dsu.a(build, "");
            e(build);
        }
        super.m();
    }
}
