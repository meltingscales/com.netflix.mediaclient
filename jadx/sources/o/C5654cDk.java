package o;

import android.widget.FrameLayout;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement;
import com.netflix.model.leafs.originals.interactive.template.LabelElement;
import com.netflix.model.leafs.originals.interactive.template.PlayerScoreContainerElement;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC5649cDf;
import o.cIE;

/* renamed from: o.cDk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5654cDk extends AbstractC5649cDf {
    private final FrameLayout a;
    private final PlayerScoreContainerElement e;

    public /* synthetic */ C5654cDk(Observable observable, InteractiveMoments interactiveMoments, Moment moment, FrameLayout frameLayout, PlayerScoreContainerElement playerScoreContainerElement, Map map, HashMap hashMap, float f, InterfaceC9638uF interfaceC9638uF, boolean z, int i, C8627dsp c8627dsp) {
        this(observable, interactiveMoments, moment, frameLayout, playerScoreContainerElement, map, hashMap, f, interfaceC9638uF, (i & 512) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5654cDk(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, FrameLayout frameLayout, PlayerScoreContainerElement playerScoreContainerElement, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF, boolean z) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, z);
        LabelElement playerScoreLabel;
        C1204Sr c1204Sr;
        LabelElement playerIdLabel;
        C1204Sr c1204Sr2;
        BackgroundImageElement background;
        C5640cCx c5640cCx;
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) frameLayout, "");
        C8632dsu.c((Object) playerScoreContainerElement, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.a = frameLayout;
        this.e = playerScoreContainerElement;
        frameLayout.setTag(playerScoreContainerElement.id());
        AbstractC5649cDf.a(this, frameLayout, playerScoreContainerElement, null, null, 12, null);
        PlayerScoreContainerElement.LabelWithBackgroundContainerChildren children = playerScoreContainerElement.children();
        if (children != null && (background = children.background(interactiveMoments)) != null && (c5640cCx = (C5640cCx) frameLayout.findViewById(cIE.b.s)) != null) {
            C8632dsu.d(c5640cCx);
            AbstractC5649cDf.a(this, c5640cCx, background, null, null, 12, null);
        }
        PlayerScoreContainerElement.LabelWithBackgroundContainerChildren children2 = playerScoreContainerElement.children();
        if (children2 != null && (playerIdLabel = children2.playerIdLabel()) != null && (c1204Sr2 = (C1204Sr) frameLayout.findViewById(cIE.b.L)) != null) {
            C8632dsu.d(c1204Sr2);
            AbstractC5649cDf.a(this, c1204Sr2, playerIdLabel, null, null, 12, null);
            c1204Sr2.setText(c(playerIdLabel.id()));
        }
        PlayerScoreContainerElement.LabelWithBackgroundContainerChildren children3 = playerScoreContainerElement.children();
        if (children3 == null || (playerScoreLabel = children3.playerScoreLabel()) == null || (c1204Sr = (C1204Sr) frameLayout.findViewById(cIE.b.ak)) == null) {
            return;
        }
        C8632dsu.d(c1204Sr);
        AbstractC5649cDf.a(this, c1204Sr, playerScoreLabel, null, null, 12, null);
        c1204Sr.setText(c(playerScoreLabel.id()));
    }

    @Override // o.AbstractC5649cDf
    public void e(int i) {
        super.e(i);
        e();
    }

    @Override // o.AbstractC5649cDf
    public void a(int i) {
        super.a(i);
        e();
    }

    private final void e() {
        LabelElement playerScoreLabel;
        C1204Sr c1204Sr;
        PlayerScoreContainerElement.LabelWithBackgroundContainerChildren children = this.e.children();
        if (children == null || (playerScoreLabel = children.playerScoreLabel()) == null || (c1204Sr = (C1204Sr) this.a.findViewById(cIE.b.ak)) == null) {
            return;
        }
        C8632dsu.d(c1204Sr);
        AbstractC5649cDf.d dVar = AbstractC5649cDf.d;
        dVar.b(c1204Sr, o().get(playerScoreLabel.styleId()), m());
        c1204Sr.setText(c(playerScoreLabel.id()));
        dVar.getLogTag();
    }
}
