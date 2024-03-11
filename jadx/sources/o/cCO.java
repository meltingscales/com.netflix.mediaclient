package o;

import android.view.View;
import android.view.animation.AnimationSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class cCO {
    public static final b d = new b(null);
    private final HashMap<View, AnimationSet> e = new HashMap<>();

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("InteractiveAnimationContainer");
        }
    }

    public final boolean b() {
        return this.e.isEmpty();
    }

    public final void e(View view, AnimationSet animationSet) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) animationSet, "");
        AnimationSet animationSet2 = this.e.get(view);
        if (animationSet2 != null) {
            animationSet2.addAnimation(animationSet);
        } else {
            this.e.put(view, animationSet);
        }
    }

    public final void d() {
        for (Map.Entry<View, AnimationSet> entry : this.e.entrySet()) {
            entry.getKey().setVisibility(0);
            entry.getKey().clearAnimation();
            entry.getKey().startAnimation(entry.getValue());
        }
    }
}
