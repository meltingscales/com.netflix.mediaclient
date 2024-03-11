package o;

import android.graphics.PointF;
import com.netflix.mediaclient.ui.nux.impl.NewUserExperienceCtaType;

/* renamed from: o.cre  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7196cre extends C9941zV {

    /* renamed from: o.cre$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC7196cre {
    }

    public /* synthetic */ AbstractC7196cre(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC7196cre() {
    }

    /* renamed from: o.cre$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC7196cre {
        private final NewUserExperienceCtaType c;
        private final Integer d;
        private final int e;

        public final int a() {
            return this.e;
        }

        public final Integer c() {
            return this.d;
        }

        public final NewUserExperienceCtaType d() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(NewUserExperienceCtaType newUserExperienceCtaType, int i, Integer num) {
            super(null);
            C8632dsu.c((Object) newUserExperienceCtaType, "");
            this.c = newUserExperienceCtaType;
            this.e = i;
            this.d = num;
        }
    }

    /* renamed from: o.cre$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC7196cre {
        private final Integer a;
        private final PointF c;
        private final int e;

        public final PointF d() {
            return this.c;
        }

        public final Integer e() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Integer num, int i, PointF pointF) {
            super(null);
            C8632dsu.c((Object) pointF, "");
            this.a = num;
            this.e = i;
            this.c = pointF;
        }
    }

    /* renamed from: o.cre$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC7196cre {
        private final Integer d;

        public final Integer e() {
            return this.d;
        }

        public c(Integer num) {
            super(null);
            this.d = num;
        }
    }

    /* renamed from: o.cre$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC7196cre {
        private final int a;

        public final int d() {
            return this.a;
        }

        public a(int i) {
            super(null);
            this.a = i;
        }
    }
}
