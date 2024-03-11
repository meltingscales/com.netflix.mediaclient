package o;

import com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel;

/* loaded from: classes4.dex */
public abstract class bQC extends C9941zV {
    public /* synthetic */ bQC(C8627dsp c8627dsp) {
        this();
    }

    /* loaded from: classes4.dex */
    public static final class d extends bQC {
        private final String a;

        public final String c() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.a = str;
        }
    }

    private bQC() {
    }

    /* loaded from: classes4.dex */
    public static final class c extends bQC {
        private final String c;

        public final String d() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.c = str;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a extends bQC {
        private final IdentityViewModel.SetHandleErrorType c;
        private final IdentityViewModel.d e;

        public final IdentityViewModel.d b() {
            return this.e;
        }

        public /* synthetic */ a(IdentityViewModel.SetHandleErrorType setHandleErrorType, IdentityViewModel.d dVar, int i, C8627dsp c8627dsp) {
            this(setHandleErrorType, (i & 2) != 0 ? null : dVar);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IdentityViewModel.SetHandleErrorType setHandleErrorType, IdentityViewModel.d dVar) {
            super(null);
            C8632dsu.c((Object) setHandleErrorType, "");
            this.c = setHandleErrorType;
            this.e = dVar;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends bQC {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends bQC {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }
}
