package o;

import android.view.animation.AnimationSet;

/* renamed from: o.bBq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3540bBq {
    private final AnimationSet b;
    private final AnimationSet c;
    private final AnimationSet d;
    private final AnimationSet e;

    public final AnimationSet a() {
        return this.d;
    }

    public final AnimationSet b() {
        return this.c;
    }

    public final AnimationSet c() {
        return this.e;
    }

    public final AnimationSet d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3540bBq) {
            C3540bBq c3540bBq = (C3540bBq) obj;
            return C8632dsu.c(this.b, c3540bBq.b) && C8632dsu.c(this.e, c3540bBq.e) && C8632dsu.c(this.c, c3540bBq.c) && C8632dsu.c(this.d, c3540bBq.d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.b.hashCode() * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        AnimationSet animationSet = this.b;
        AnimationSet animationSet2 = this.e;
        AnimationSet animationSet3 = this.c;
        AnimationSet animationSet4 = this.d;
        return "CollectTasteRatingIndicationIconAnimationSet(rightIndicationIconInAnimationSet=" + animationSet + ", rightIndicationIconOutAnimationSet=" + animationSet2 + ", leftIndicationIconInAnimationSet=" + animationSet3 + ", leftIndicationIconOutAnimationSet=" + animationSet4 + ")";
    }

    public C3540bBq(AnimationSet animationSet, AnimationSet animationSet2, AnimationSet animationSet3, AnimationSet animationSet4) {
        C8632dsu.c((Object) animationSet, "");
        C8632dsu.c((Object) animationSet2, "");
        C8632dsu.c((Object) animationSet3, "");
        C8632dsu.c((Object) animationSet4, "");
        this.b = animationSet;
        this.e = animationSet2;
        this.c = animationSet3;
        this.d = animationSet4;
    }
}
