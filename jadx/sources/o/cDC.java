package o;

import android.animation.Animator;
import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import com.netflix.model.leafs.originals.interactive.template.ScoreContainer;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import o.cIE;

/* loaded from: classes4.dex */
public final class cDC extends AbstractC5649cDf {
    private final FrameLayout a;

    public /* synthetic */ cDC(Observable observable, InteractiveMoments interactiveMoments, Moment moment, FrameLayout frameLayout, ScoreContainer scoreContainer, Map map, HashMap hashMap, float f, InterfaceC9638uF interfaceC9638uF, boolean z, int i, C8627dsp c8627dsp) {
        this(observable, interactiveMoments, moment, frameLayout, scoreContainer, map, hashMap, f, interfaceC9638uF, (i & 512) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cDC(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, FrameLayout frameLayout, ScoreContainer scoreContainer, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF, boolean z) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, z);
        TextView textView;
        TextView textView2;
        LinearLayout linearLayout;
        NetflixImageView netflixImageView;
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) frameLayout, "");
        C8632dsu.c((Object) scoreContainer, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.a = frameLayout;
        AbstractC5649cDf.a(this, frameLayout, scoreContainer, null, null, 12, null);
        ScoreContainer.ScoreContainerChildren children = scoreContainer.children();
        if (children != null) {
            SimpleElement maxScore = children.maxScore();
            Style style = map.get(maxScore != null ? maxScore.styleId() : null);
            boolean z2 = style != null && style.getTextDirection() == 2;
            ImageElement backgroundImage = children.backgroundImage();
            if (backgroundImage != null && (netflixImageView = (NetflixImageView) frameLayout.findViewById(cIE.b.br)) != null) {
                C8632dsu.d(netflixImageView);
                C8632dsu.d(backgroundImage);
                AbstractC5649cDf.a(this, netflixImageView, backgroundImage, null, null, 12, null);
            }
            SimpleElement labelContainer = children.labelContainer();
            if (labelContainer != null && (linearLayout = (LinearLayout) frameLayout.findViewById(cIE.b.av)) != null) {
                C8632dsu.d(linearLayout);
                C8632dsu.d(labelContainer);
                AbstractC5649cDf.a(this, linearLayout, labelContainer, null, null, 12, null);
                if (z2) {
                    ArrayList arrayList = new ArrayList();
                    for (View view : C9703vR.e(linearLayout)) {
                        arrayList.add(view);
                    }
                    linearLayout.removeAllViews();
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (listIterator.hasPrevious()) {
                        linearLayout.addView((View) listIterator.previous());
                    }
                }
            }
            SimpleElement score = children.score();
            if (score != null && (textView2 = (TextView) this.a.findViewById(cIE.b.bz)) != null) {
                C8632dsu.d(textView2);
                textView2.setText(c(score.id()));
                C8632dsu.d(score);
                AbstractC5649cDf.a(this, textView2, score, null, null, 12, null);
            }
            SimpleElement maxScore2 = children.maxScore();
            if (maxScore2 == null || (textView = (TextView) this.a.findViewById(cIE.b.ay)) == null) {
                return;
            }
            C8632dsu.d(textView);
            textView.setText(c(maxScore2.id()));
            C8632dsu.d(maxScore2);
            AbstractC5649cDf.a(this, textView, maxScore2, null, null, 12, null);
        }
    }

    public final void c() {
        Spanned c = c("scoreAccessibilityDescription");
        Spanned c2 = c("score");
        if (c != null) {
            Context context = this.a.getContext();
            C8632dsu.a(context, "");
            AccessibilityUtils.b(context, c);
        }
        TextView textView = (TextView) this.a.findViewById(cIE.b.bz);
        if (textView == null || C8632dsu.c(textView.getText(), c2) || c2 == null) {
            return;
        }
        textView.animate().alpha(0.0f).setDuration(150L).setStartDelay(500L).setListener(new b(textView, c2)).start();
    }

    /* loaded from: classes4.dex */
    public static final class b implements Animator.AnimatorListener {
        final /* synthetic */ Spanned d;
        final /* synthetic */ TextView e;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        b(TextView textView, Spanned spanned) {
            this.e = textView;
            this.d = spanned;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            this.e.setText(this.d);
            this.e.animate().alpha(1.0f).setDuration(150L).start();
        }
    }
}
