package o;

import android.view.animation.AnimationSet;

/* renamed from: o.bBy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3548bBy {
    private final AnimationSet a;
    private final AnimationSet b;
    private final AnimationSet c;
    private final AnimationSet e;

    public final AnimationSet a() {
        return this.a;
    }

    public final AnimationSet b() {
        return this.c;
    }

    public final AnimationSet d() {
        return this.e;
    }

    public final AnimationSet e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3548bBy) {
            C3548bBy c3548bBy = (C3548bBy) obj;
            return C8632dsu.c(this.a, c3548bBy.a) && C8632dsu.c(this.e, c3548bBy.e) && C8632dsu.c(this.b, c3548bBy.b) && C8632dsu.c(this.c, c3548bBy.c);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        AnimationSet animationSet = this.a;
        AnimationSet animationSet2 = this.e;
        AnimationSet animationSet3 = this.b;
        AnimationSet animationSet4 = this.c;
        return "CollectTasteRatingTitleCardAnimationSet(titleCardCenterToRightAnimationSet=" + animationSet + ", titleCardRightToCenterAnimationSet=" + animationSet2 + ", titleCardCenterToLeftAnimationSet=" + animationSet3 + ", titleCardLeftToCenterAnimationSet=" + animationSet4 + ")";
    }

    public C3548bBy(AnimationSet animationSet, AnimationSet animationSet2, AnimationSet animationSet3, AnimationSet animationSet4) {
        C8632dsu.c((Object) animationSet, "");
        C8632dsu.c((Object) animationSet2, "");
        C8632dsu.c((Object) animationSet3, "");
        C8632dsu.c((Object) animationSet4, "");
        this.a = animationSet;
        this.e = animationSet2;
        this.b = animationSet3;
        this.c = animationSet4;
    }
}
