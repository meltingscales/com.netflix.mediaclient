package o;

import android.graphics.drawable.Drawable;

/* renamed from: o.zH  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9927zH {
    public /* synthetic */ AbstractC9927zH(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC9927zH() {
    }

    /* renamed from: o.zH$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC9927zH {
        public static final a d = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: o.zH$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC9927zH {
        private final String c;
        private final String d;

        public final String a() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = str2;
        }

        public /* synthetic */ c(String str, String str2, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    /* renamed from: o.zH$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC9927zH {
        private final int a;

        public final int d() {
            return this.a;
        }

        public d(int i) {
            super(null);
            this.a = i;
        }
    }

    /* renamed from: o.zH$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC9927zH {
        private final Drawable d;

        public final Drawable e() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Drawable drawable) {
            super(null);
            C8632dsu.c((Object) drawable, "");
            this.d = drawable;
        }
    }
}
