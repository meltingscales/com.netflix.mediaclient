package o;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen;
import java.util.Map;
import o.C9834xU;

/* renamed from: o.cra  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7192cra implements MessagingTooltipScreen.a {
    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen.a
    public ViewPropertyAnimator e(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, Map<String, ? extends Object> map, drO<dpR> dro) {
        C8632dsu.c((Object) viewGroup2, "");
        C8632dsu.c((Object) viewGroup3, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) dro, "");
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.1f, 1, 0.0f);
        translateAnimation.setStartOffset(100L);
        translateAnimation.setDuration(200L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setAnimationListener(new b(dro));
        animationSet.setInterpolator(new DecelerateInterpolator(3.0f));
        animationSet.setFillAfter(true);
        viewGroup3.startAnimation(animationSet);
        return null;
    }

    /* renamed from: o.cra$b */
    /* loaded from: classes4.dex */
    public static final class b extends Abstractanimation.Animation$AnimationListenerC9916yx {
        final /* synthetic */ drO<dpR> e;

        b(drO<dpR> dro) {
            this.e = dro;
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.e.invoke();
        }
    }

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen.a
    public void a(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, Map<String, ? extends Object> map, drO<dpR> dro) {
        C8632dsu.c((Object) viewGroup2, "");
        C8632dsu.c((Object) viewGroup3, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen.a
    public ViewPropertyAnimator d(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, Map<String, ? extends Object> map, drO<dpR> dro) {
        C8632dsu.c((Object) viewGroup2, "");
        C8632dsu.c((Object) viewGroup3, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) dro, "");
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 0.05f);
        translateAnimation.setStartOffset(100);
        long j = 200;
        translateAnimation.setDuration(j);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setFillAfter(true);
        animationSet.setInterpolator(new AccelerateInterpolator());
        viewGroup3.startAnimation(animationSet);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(100L);
        alphaAnimation2.setDuration(j);
        alphaAnimation2.setInterpolator(new AccelerateInterpolator());
        alphaAnimation2.setAnimationListener(new d(dro));
        if (viewGroup == null) {
            viewGroup = viewGroup2;
        }
        viewGroup.startAnimation(alphaAnimation2);
        return null;
    }

    /* renamed from: o.cra$d */
    /* loaded from: classes4.dex */
    public static final class d extends Abstractanimation.Animation$AnimationListenerC9916yx {
        final /* synthetic */ drO<dpR> b;

        d(drO<dpR> dro) {
            this.b = dro;
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.b.invoke();
        }
    }

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen.a
    public Drawable a(Drawable drawable, Context context) {
        C8632dsu.c((Object) drawable, "");
        C8632dsu.c((Object) context, "");
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(ContextCompat.getColor(context, C9834xU.c.w)), drawable});
        transitionDrawable.startTransition(1000);
        transitionDrawable.setCrossFadeEnabled(true);
        return transitionDrawable;
    }
}
