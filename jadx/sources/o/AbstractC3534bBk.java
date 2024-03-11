package o;

import com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteTitlesStackManager;

/* renamed from: o.bBk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3534bBk extends C9941zV {
    public /* synthetic */ AbstractC3534bBk(C8627dsp c8627dsp) {
        this();
    }

    /* renamed from: o.bBk$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3534bBk {
        public static final c b = new c();

        private c() {
            super(null);
        }
    }

    private AbstractC3534bBk() {
    }

    /* renamed from: o.bBk$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3534bBk {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: o.bBk$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3534bBk {
        private final CollectTasteTitlesStackManager.Companion.HintAnimationDirection d;

        public final CollectTasteTitlesStackManager.Companion.HintAnimationDirection b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.d == ((d) obj).d;
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            CollectTasteTitlesStackManager.Companion.HintAnimationDirection hintAnimationDirection = this.d;
            return "HintAnimationDirectionStart(direction=" + hintAnimationDirection + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CollectTasteTitlesStackManager.Companion.HintAnimationDirection hintAnimationDirection) {
            super(null);
            C8632dsu.c((Object) hintAnimationDirection, "");
            this.d = hintAnimationDirection;
        }
    }
}
