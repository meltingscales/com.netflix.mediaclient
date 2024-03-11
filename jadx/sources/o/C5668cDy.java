package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Notification;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement;
import com.netflix.model.leafs.originals.interactive.template.PlayerScoreContainerElement;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;
import o.cIE;

/* renamed from: o.cDy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5668cDy extends AbstractC5649cDf {
    private final View a;

    public /* synthetic */ C5668cDy(Observable observable, InteractiveMoments interactiveMoments, View view, Moment moment, Notification notification, Map map, HashMap hashMap, float f, InterfaceC9638uF interfaceC9638uF, boolean z, int i, C8627dsp c8627dsp) {
        this(observable, interactiveMoments, view, moment, notification, map, hashMap, f, interfaceC9638uF, (i & 512) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5668cDy(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, View view, Moment moment, Notification notification, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF, boolean z) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, z);
        C1204Sr c1204Sr;
        C1204Sr c1204Sr2;
        C1204Sr c1204Sr3;
        C1204Sr c1204Sr4;
        NetflixImageView netflixImageView;
        C1204Sr c1204Sr5;
        TextView textView;
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) notification, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.a = view;
        AbstractC5649cDf.a(this, view, notification, null, null, 12, null);
        Notification.NotificationChildren children = notification.children();
        if (children != null) {
            SimpleElement header = children.header();
            if (header != null && (textView = (TextView) view.findViewById(cIE.b.aF)) != null) {
                C8632dsu.d(textView);
                C8632dsu.d(header);
                AbstractC5649cDf.a(this, textView, header, null, null, 12, null);
                textView.setText(c(header.id()));
            }
            SimpleElement subHeader = children.subHeader();
            if (subHeader != null && (c1204Sr5 = (C1204Sr) view.findViewById(cIE.b.aH)) != null) {
                C8632dsu.d(c1204Sr5);
                C8632dsu.d(subHeader);
                AbstractC5649cDf.a(this, c1204Sr5, subHeader, null, null, 12, null);
                c1204Sr5.setText(c(subHeader.id()));
            }
            BackgroundImageElement targetScoreContainer = children.targetScoreContainer();
            if (targetScoreContainer != null && (netflixImageView = (NetflixImageView) view.findViewById(cIE.b.aG)) != null) {
                C8632dsu.d(netflixImageView);
                C8632dsu.d(targetScoreContainer);
                AbstractC5649cDf.a(this, netflixImageView, targetScoreContainer, null, null, 12, null);
            }
            SimpleElement targetScoreText = children.targetScoreText();
            if (targetScoreText != null && (c1204Sr4 = (C1204Sr) view.findViewById(cIE.b.aK)) != null) {
                C8632dsu.d(c1204Sr4);
                C8632dsu.d(targetScoreText);
                AbstractC5649cDf.a(this, c1204Sr4, targetScoreText, null, null, 12, null);
                c1204Sr4.setText(c(targetScoreText.id()));
            }
            SimpleElement nextPlayerHeader = children.nextPlayerHeader();
            if (nextPlayerHeader != null && (c1204Sr3 = (C1204Sr) view.findViewById(cIE.b.aI)) != null) {
                C8632dsu.d(c1204Sr3);
                C8632dsu.d(nextPlayerHeader);
                AbstractC5649cDf.a(this, c1204Sr3, nextPlayerHeader, null, null, 12, null);
                c1204Sr3.setText(c(nextPlayerHeader.id()));
            }
            SimpleElement nextPlayerSubHeader = children.nextPlayerSubHeader();
            if (nextPlayerSubHeader != null && (c1204Sr2 = (C1204Sr) view.findViewById(cIE.b.aL)) != null) {
                C8632dsu.d(c1204Sr2);
                C8632dsu.d(nextPlayerSubHeader);
                AbstractC5649cDf.a(this, c1204Sr2, nextPlayerSubHeader, null, null, 12, null);
                c1204Sr2.setText(c(nextPlayerSubHeader.id()));
            }
            SimpleElement currentScoreDescription = children.currentScoreDescription();
            if (currentScoreDescription != null && (c1204Sr = (C1204Sr) view.findViewById(cIE.b.aJ)) != null) {
                C8632dsu.d(c1204Sr);
                C8632dsu.d(currentScoreDescription);
                AbstractC5649cDf.a(this, c1204Sr, currentScoreDescription, null, null, 12, null);
                c1204Sr.setText(c(currentScoreDescription.id()));
            }
            PlayerScoreContainerElement p1ScoreContainer = children.p1ScoreContainer();
            if (p1ScoreContainer != null) {
                View findViewById = view.findViewById(cIE.b.aV);
                C8632dsu.a(findViewById, "");
                C8632dsu.d(p1ScoreContainer);
                new C5654cDk(observable, interactiveMoments, moment, (FrameLayout) findViewById, p1ScoreContainer, map, hashMap, f, interfaceC9638uF, false, 512, null);
            }
            PlayerScoreContainerElement p2ScoreContainer = children.p2ScoreContainer();
            if (p2ScoreContainer != null) {
                View findViewById2 = view.findViewById(cIE.b.aY);
                C8632dsu.a(findViewById2, "");
                C8632dsu.d(p2ScoreContainer);
                new C5654cDk(observable, interactiveMoments, moment, (FrameLayout) findViewById2, p2ScoreContainer, map, hashMap, f, interfaceC9638uF, false, 512, null);
            }
            PlayerScoreContainerElement p2ScoreContainer2 = children.p2ScoreContainer2();
            if (p2ScoreContainer2 != null) {
                View findViewById3 = view.findViewById(cIE.b.ba);
                C8632dsu.a(findViewById3, "");
                C8632dsu.d(p2ScoreContainer2);
                new C5654cDk(observable, interactiveMoments, moment, (FrameLayout) findViewById3, p2ScoreContainer2, map, hashMap, f, interfaceC9638uF, false, 512, null);
            }
            PlayerScoreContainerElement p1ScoreContainer2 = children.p1ScoreContainer2();
            if (p1ScoreContainer2 != null) {
                View findViewById4 = view.findViewById(cIE.b.aS);
                C8632dsu.a(findViewById4, "");
                C8632dsu.d(p1ScoreContainer2);
                new C5654cDk(observable, interactiveMoments, moment, (FrameLayout) findViewById4, p1ScoreContainer2, map, hashMap, f, interfaceC9638uF, false, 512, null);
            }
        }
    }
}
