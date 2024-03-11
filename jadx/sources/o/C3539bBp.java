package o;

import android.view.animation.AnimationSet;

/* renamed from: o.bBp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3539bBp {
    private final AnimationSet a;
    private final AnimationSet b;
    private final AnimationSet c;
    private final AnimationSet d;

    public final AnimationSet b() {
        return this.b;
    }

    public final AnimationSet c() {
        return this.d;
    }

    public final AnimationSet d() {
        return this.c;
    }

    public final AnimationSet e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3539bBp) {
            C3539bBp c3539bBp = (C3539bBp) obj;
            return C8632dsu.c(this.a, c3539bBp.a) && C8632dsu.c(this.b, c3539bBp.b) && C8632dsu.c(this.c, c3539bBp.c) && C8632dsu.c(this.d, c3539bBp.d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        AnimationSet animationSet = this.a;
        AnimationSet animationSet2 = this.b;
        AnimationSet animationSet3 = this.c;
        AnimationSet animationSet4 = this.d;
        return "CollectTasteRatingCardOverlayAnimationSet(rightOverlayInAnimationSet=" + animationSet + ", rightOverlayOutAnimationSet=" + animationSet2 + ", leftOverlayInAnimationSet=" + animationSet3 + ", leftOverlayOutAnimationSet=" + animationSet4 + ")";
    }

    public C3539bBp(AnimationSet animationSet, AnimationSet animationSet2, AnimationSet animationSet3, AnimationSet animationSet4) {
        C8632dsu.c((Object) animationSet, "");
        C8632dsu.c((Object) animationSet2, "");
        C8632dsu.c((Object) animationSet3, "");
        C8632dsu.c((Object) animationSet4, "");
        this.a = animationSet;
        this.b = animationSet2;
        this.c = animationSet3;
        this.d = animationSet4;
    }
}
