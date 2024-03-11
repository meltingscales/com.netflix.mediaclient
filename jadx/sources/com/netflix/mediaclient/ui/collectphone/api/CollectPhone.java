package com.netflix.mediaclient.ui.collectphone.api;

import android.app.Activity;
import io.reactivex.Single;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes4.dex */
public interface CollectPhone {

    /* loaded from: classes4.dex */
    public interface e {
        Single<dpR> a();

        void a(String str);

        List<d> b();

        boolean c();

        d d();

        void d(String str);

        String e();

        void e(String str);

        Single<dpR> f();

        Single<dpR> g();

        Single<String> h();

        Single<dpR> i();

        Single<dpR> j();
    }

    void c(Activity activity, boolean z);

    /* loaded from: classes4.dex */
    public static abstract class Error extends Throwable {
        public /* synthetic */ Error(C8627dsp c8627dsp) {
            this();
        }

        /* loaded from: classes4.dex */
        public static final class InvalidPhoneNumber extends Error {
            public static final InvalidPhoneNumber b = new InvalidPhoneNumber();

            private InvalidPhoneNumber() {
                super(null);
            }
        }

        private Error() {
        }

        /* loaded from: classes4.dex */
        public static final class ExpiredSmsCode extends Error {
            public static final ExpiredSmsCode c = new ExpiredSmsCode();

            private ExpiredSmsCode() {
                super(null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class InvalidSmsCode extends Error {
            public static final InvalidSmsCode c = new InvalidSmsCode();

            private InvalidSmsCode() {
                super(null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class ThrottlingFailure extends Error {
            public static final ThrottlingFailure b = new ThrottlingFailure();

            private ThrottlingFailure() {
                super(null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class GenericFailure extends Error {
            public static final GenericFailure c = new GenericFailure();

            private GenericFailure() {
                super(null);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private final String c;
        private final String d;
        private final String e;

        public final String b() {
            return this.c;
        }

        public final String d() {
            return this.e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c((Object) this.e, (Object) dVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.d;
            String str3 = this.e;
            return "Country(id=" + str + ", code=" + str2 + ", name=" + str3 + ")";
        }

        public d(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            this.c = str;
            this.d = str2;
            this.e = str3;
        }
    }
}
