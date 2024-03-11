package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen;
import java.util.Map;
import kotlin.Pair;

/* renamed from: o.chE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6642chE implements MessagingTooltipScreen.a {
    public static final C6642chE e = new C6642chE();

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen.a
    public Drawable a(Drawable drawable, Context context) {
        C8632dsu.c((Object) drawable, "");
        C8632dsu.c((Object) context, "");
        return drawable;
    }

    private C6642chE() {
    }

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen.a
    public ViewPropertyAnimator e(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, Map<String, ? extends Object> map, drO<dpR> dro) {
        C8632dsu.c((Object) viewGroup2, "");
        C8632dsu.c((Object) viewGroup3, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) dro, "");
        dro.invoke();
        return null;
    }

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen.a
    public ViewPropertyAnimator d(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, Map<String, ? extends Object> map, drO<dpR> dro) {
        Pair pair;
        C8632dsu.c((Object) viewGroup2, "");
        C8632dsu.c((Object) viewGroup3, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) dro, "");
        Object obj = map.get("pivot");
        if (obj == null || (pair = (Pair) C9726vo.c(obj, Pair.class)) == null) {
            pair = new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, ((Number) pair.d()).floatValue(), 1, ((Number) pair.a()).floatValue());
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.2f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300L);
        animationSet.setFillAfter(true);
        viewGroup3.startAnimation(animationSet);
        ViewPropertyAnimator duration = viewGroup2.animate().setStartDelay(100L).alpha(0.2f).setDuration(300L);
        C8632dsu.a(duration, "");
        duration.setListener(new b(dro));
        duration.start();
        return duration;
    }

    /* renamed from: o.chE$b */
    /* loaded from: classes4.dex */
    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ drO<dpR> b;

        b(drO<dpR> dro) {
            this.b = dro;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            this.b.invoke();
        }
    }

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen.a
    public void a(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, Map<String, ? extends Object> map, drO<dpR> dro) {
        Pair pair;
        C8632dsu.c((Object) viewGroup2, "");
        C8632dsu.c((Object) viewGroup3, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) dro, "");
        Object obj = map.get("pivot");
        if (obj == null || (pair = (Pair) C9726vo.c(obj, Pair.class)) == null) {
            pair = new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, ((Number) pair.d()).floatValue(), 1, ((Number) pair.a()).floatValue());
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300L);
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(new e(dro));
        viewGroup3.startAnimation(animationSet);
    }

    /* renamed from: o.chE$e */
    /* loaded from: classes4.dex */
    public static final class e extends Abstractanimation.Animation$AnimationListenerC9916yx {
        final /* synthetic */ drO<dpR> e;

        e(drO<dpR> dro) {
            this.e = dro;
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.e.invoke();
        }
    }
}
