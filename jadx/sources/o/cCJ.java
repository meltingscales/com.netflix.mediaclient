package o;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Notification;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import com.netflix.model.leafs.originals.interactive.template.ScoreContainer;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import com.netflix.model.leafs.originals.interactive.template.UnlockContainer;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import o.C5650cDg;
import o.cIE;

/* loaded from: classes4.dex */
public final class cCJ extends AbstractC5649cDf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cCJ(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, View view, Moment moment, Notification notification, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, false, 128, null);
        FrameLayout frameLayout;
        UnlockContainer.UnlockContainerChildren children;
        SimpleElement label;
        UnlockContainer.UnlockContainerChildren children2;
        ImageElement backgroundImage;
        FrameLayout frameLayout2;
        ScoreContainer.ScoreContainerChildren children3;
        SimpleElement maxScore;
        ScoreContainer.ScoreContainerChildren children4;
        SimpleElement score;
        LinearLayout linearLayout;
        SimpleElement labelContainer;
        ScoreContainer.ScoreContainerChildren children5;
        ImageElement backgroundImage2;
        SimpleElement unlockLabel;
        SimpleElement pointsLabel;
        final String obj;
        NetflixImageView netflixImageView;
        ScoreContainer.ScoreContainerChildren children6;
        SimpleElement maxScore2;
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) notification, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        AbstractC5649cDf.a(this, view, notification, null, null, 12, null);
        Context context = view.getContext();
        C8632dsu.a(context, "");
        Spanned c = c("scoreAccessibilityDescription");
        Spanned c2 = c("unlockAccessibilityDescription()");
        String str = c2 != null ? c2 : "";
        AccessibilityUtils.b(context, ((Object) c) + ", " + str);
        Notification.NotificationChildren children7 = notification.children();
        if (children7 != null) {
            ScoreContainer scoreContainer = children7.scoreContainer();
            Style style = map.get((scoreContainer == null || (children6 = scoreContainer.children()) == null || (maxScore2 = children6.maxScore()) == null) ? null : maxScore2.styleId());
            boolean z = style != null && style.getTextDirection() == 2;
            ImageElement shareButton = children7.shareButton();
            if (shareButton != null) {
                Spanned c3 = c(shareButton.id());
                c3 = c3 == null ? c("share") : c3;
                if (c3 != null && (obj = c3.toString()) != null && (netflixImageView = (NetflixImageView) view.findViewById(cIE.b.bB)) != null) {
                    netflixImageView.setVisibility(0);
                    C8632dsu.d(shareButton);
                    AbstractC5649cDf.a(this, netflixImageView, shareButton, null, null, 12, null);
                    netflixImageView.setOnClickListener(new View.OnClickListener() { // from class: o.cCF
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            cCJ.a(cCJ.this, obj, view2);
                        }
                    });
                }
            }
            C1204Sr c1204Sr = (C1204Sr) view.findViewById(cIE.b.bv);
            if (c1204Sr != null && (pointsLabel = children7.pointsLabel()) != null) {
                c1204Sr.setText(c(pointsLabel.id()));
                C8632dsu.d(pointsLabel);
                AbstractC5649cDf.a(this, c1204Sr, pointsLabel, null, null, 12, null);
            }
            C1204Sr c1204Sr2 = (C1204Sr) view.findViewById(cIE.b.cm);
            if (c1204Sr2 != null && (unlockLabel = children7.unlockLabel()) != null) {
                c1204Sr2.setText(c(unlockLabel.id()));
                C8632dsu.d(unlockLabel);
                AbstractC5649cDf.a(this, c1204Sr2, unlockLabel, null, null, 12, null);
            }
            ScoreContainer scoreContainer2 = children7.scoreContainer();
            if (scoreContainer2 != null && (frameLayout2 = (FrameLayout) view.findViewById(cIE.b.cg)) != null) {
                C8632dsu.d(scoreContainer2);
                AbstractC5649cDf.a(this, frameLayout2, scoreContainer2, null, null, 12, null);
                NetflixImageView netflixImageView2 = (NetflixImageView) frameLayout2.findViewById(cIE.b.br);
                if (netflixImageView2 != null && (children5 = scoreContainer2.children()) != null && (backgroundImage2 = children5.backgroundImage()) != null) {
                    C8632dsu.d(backgroundImage2);
                    AbstractC5649cDf.a(this, netflixImageView2, backgroundImage2, null, null, 12, null);
                }
                LinearLayout linearLayout2 = (LinearLayout) frameLayout2.findViewById(cIE.b.av);
                if (linearLayout2 != null) {
                    C8632dsu.d(linearLayout2);
                    ScoreContainer.ScoreContainerChildren children8 = scoreContainer2.children();
                    if (children8 == null || (labelContainer = children8.labelContainer()) == null) {
                        linearLayout = linearLayout2;
                    } else {
                        C8632dsu.d(labelContainer);
                        linearLayout = linearLayout2;
                        AbstractC5649cDf.a(this, linearLayout2, labelContainer, null, null, 12, null);
                    }
                    if (z) {
                        ArrayList arrayList = new ArrayList();
                        for (View view2 : C9703vR.e(linearLayout)) {
                            arrayList.add(view2);
                        }
                        linearLayout.removeAllViews();
                        ListIterator listIterator = arrayList.listIterator(arrayList.size());
                        while (listIterator.hasPrevious()) {
                            linearLayout.addView((View) listIterator.previous());
                        }
                    }
                }
                TextView textView = (TextView) frameLayout2.findViewById(cIE.b.bz);
                if (textView != null && (children4 = scoreContainer2.children()) != null && (score = children4.score()) != null) {
                    if (z) {
                        textView.setLayoutDirection(1);
                    }
                    textView.setText(c(score.id()));
                    C8632dsu.d(score);
                    AbstractC5649cDf.a(this, textView, score, null, null, 12, null);
                }
                TextView textView2 = (TextView) frameLayout2.findViewById(cIE.b.t);
                if (textView2 != null && (children3 = scoreContainer2.children()) != null && (maxScore = children3.maxScore()) != null) {
                    if (z) {
                        textView2.setLayoutDirection(1);
                    }
                    textView2.setText(c(maxScore.id()));
                    C8632dsu.d(maxScore);
                    AbstractC5649cDf.a(this, textView2, maxScore, null, null, 12, null);
                }
            }
            UnlockContainer unlockContainer = children7.unlockContainer();
            if (unlockContainer == null || (frameLayout = (FrameLayout) view.findViewById(cIE.b.cj)) == null) {
                return;
            }
            C8632dsu.d(unlockContainer);
            AbstractC5649cDf.a(this, frameLayout, unlockContainer, null, null, 12, null);
            NetflixImageView netflixImageView3 = (NetflixImageView) frameLayout.findViewById(cIE.b.ck);
            if (netflixImageView3 != null && (children2 = unlockContainer.children()) != null && (backgroundImage = children2.backgroundImage()) != null) {
                C8632dsu.d(backgroundImage);
                AbstractC5649cDf.a(this, netflixImageView3, backgroundImage, null, null, 12, null);
                C5794cIp c5794cIp = C5794cIp.a;
                ImageAssetId unlockCharImage = moment.unlockCharImage();
                c5794cIp.a(interfaceC9638uF, netflixImageView3, hashMap.get(unlockCharImage != null ? unlockCharImage.assetId() : null), (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? 1.0f : f, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : moment);
            }
            C1204Sr c1204Sr3 = (C1204Sr) frameLayout.findViewById(cIE.b.cn);
            if (c1204Sr3 == null || (children = unlockContainer.children()) == null || (label = children.label()) == null) {
                return;
            }
            Spanned c4 = c(unlockContainer.id());
            c1204Sr3.setText(c4 == null ? c(label.id()) : c4);
            C8632dsu.d(label);
            AbstractC5649cDf.a(this, c1204Sr3, label, null, null, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cCJ ccj, String str, View view) {
        C8632dsu.c((Object) ccj, "");
        C8632dsu.c((Object) str, "");
        ccj.e(new C5650cDg.h(str));
    }
}
