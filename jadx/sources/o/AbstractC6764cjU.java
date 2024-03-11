package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.AbstractC6756cjM;
import o.C6763cjT;

/* renamed from: o.cjU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6764cjU extends AbstractC6677chn {
    private static int a;
    public static final b e = new b(null);
    private final C6754cjK b;
    private final C9935zP c;
    private final String i;

    public /* synthetic */ AbstractC6764cjU(C9935zP c9935zP, C6754cjK c6754cjK, C8627dsp c8627dsp) {
        this(c9935zP, c6754cjK);
    }

    public final C9935zP d() {
        return this.c;
    }

    @Override // o.AbstractC6677chn
    public String g() {
        return this.i;
    }

    private AbstractC6764cjU(C9935zP c9935zP, C6754cjK c6754cjK) {
        this.c = c9935zP;
        this.b = c6754cjK;
        this.i = "Multihousehold.General.Modal";
    }

    /* renamed from: o.cjU$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final int a() {
            return AbstractC6764cjU.a;
        }

        public final void d(int i) {
            AbstractC6764cjU.a = i;
        }

        public final d c(String str, boolean z) {
            if (C8632dsu.c((Object) str, (Object) SignupConstants.Error.OTP_INVALID)) {
                d(a() + 1);
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -1498627220:
                        if (str.equals(SignupConstants.Error.OTP_EXPIRED)) {
                            int i = C6763cjT.b.d;
                            String d = C8168dfL.d(C6763cjT.d.d);
                            C8632dsu.a(d, "");
                            String d2 = C8168dfL.d(C6763cjT.d.r);
                            C8632dsu.a(d2, "");
                            String d3 = C8168dfL.d(C6763cjT.d.c);
                            C8632dsu.a(d3, "");
                            return new d(false, false, "pin-entry-otp-expired", i, d, d2, d3);
                        }
                        break;
                    case -407566670:
                        if (str.equals("throttling_failure")) {
                            int i2 = z ? C6763cjT.b.b : C6763cjT.b.h;
                            String d4 = C8168dfL.d(C6763cjT.d.e);
                            C8632dsu.a(d4, "");
                            return new d(false, true, "pin-entry-throttle", i2, d4, null, null, 96, null);
                        }
                        break;
                    case -336657698:
                        if (str.equals(SignupConstants.Error.RESEND_ATTEMPTS_EXHASTED)) {
                            int i3 = z ? C6763cjT.b.b : C6763cjT.b.c;
                            String d5 = C8168dfL.d(C6763cjT.d.f13740o);
                            C8632dsu.a(d5, "");
                            String d6 = C8168dfL.d(C6763cjT.d.e);
                            C8632dsu.a(d6, "");
                            return new d(false, true, "pin-entry-resend-exhausted", i3, d5, d6, null, 64, null);
                        }
                        break;
                    case 893455553:
                        if (str.equals(SignupConstants.Error.OTP_CHALLENGE_VERIFICATION_EXHAUSTED)) {
                            int i4 = z ? C6763cjT.b.b : C6763cjT.b.j;
                            String d7 = C8168dfL.d(C6763cjT.d.b);
                            C8632dsu.a(d7, "");
                            String d8 = C8168dfL.d(C6763cjT.d.e);
                            C8632dsu.a(d8, "");
                            return new d(false, true, "pin-entry-otp-verification-exhausted", i4, d7, d8, null, 64, null);
                        }
                        break;
                    case 1037565889:
                        if (str.equals(SignupConstants.Error.OTP_CHALLENGE_ALL_ATTEMPTS_EXHAUSTED)) {
                            int i5 = z ? C6763cjT.b.b : C6763cjT.b.c;
                            String d9 = C8168dfL.d(C6763cjT.d.f13740o);
                            C8632dsu.a(d9, "");
                            String d10 = C8168dfL.d(C6763cjT.d.e);
                            C8632dsu.a(d10, "");
                            return new d(false, true, "pin-entry-otp-exhausted", i5, d9, d10, null, 64, null);
                        }
                        break;
                    case 1770393150:
                        if (str.equals(SignupConstants.Error.OTP_INVALID)) {
                            String str2 = "pin-entry-otp-invalid" + a();
                            int i6 = C6763cjT.b.d;
                            String d11 = C8168dfL.d(C6763cjT.d.b);
                            C8632dsu.a(d11, "");
                            String d12 = C8168dfL.d(C6763cjT.d.g);
                            C8632dsu.a(d12, "");
                            String d13 = C8168dfL.d(C6763cjT.d.c);
                            C8632dsu.a(d13, "");
                            return new d(true, false, str2, i6, d11, d12, d13);
                        }
                        break;
                }
            }
            int i7 = C6763cjT.b.d;
            String d14 = C8168dfL.d(C6763cjT.d.b);
            C8632dsu.a(d14, "");
            return new d(true, false, "pin-entry-error", i7, d14, null, null, 96, null);
        }

        public final CharSequence a(C6762cjS c6762cjS) {
            String g = c6762cjS != null ? c6762cjS.g() : null;
            if (C8632dsu.c((Object) g, (Object) "EMAIL")) {
                return C8168dfL.c(C1333Xq.d(C6763cjT.d.w).d(SignupConstants.Field.EMAIL, c6762cjS.d()).c());
            }
            if (C8632dsu.c((Object) g, (Object) "SMS")) {
                return C8168dfL.c(C1333Xq.d(C6763cjT.d.z).d(SignupConstants.Field.PHONE_NUMBER, c6762cjS.h()).c());
            }
            return null;
        }

        public final List<e> d(boolean z, boolean z2) {
            List<e> j;
            List<e> j2;
            List<e> j3;
            if (z && z2) {
                String d = C8168dfL.d(C6763cjT.d.m);
                C8632dsu.a(d, "");
                e eVar = new e(d, AbstractC6756cjM.b.c, "cta-not_your_account_cta", 0, 8, null);
                String d2 = C8168dfL.d(com.netflix.mediaclient.ui.R.o.go);
                C8632dsu.a(d2, "");
                j3 = C8569dql.j(eVar, new e(d2, AbstractC6756cjM.f.e, "cta-sign-out", 0, 8, null));
                return j3;
            } else if (z2) {
                String d3 = C8168dfL.d(C6763cjT.d.h);
                C8632dsu.a(d3, "");
                e eVar2 = new e(d3, AbstractC6756cjM.e.e, "cta-continue-netflix", C6763cjT.a.h);
                String d4 = C8168dfL.d(C6763cjT.d.m);
                C8632dsu.a(d4, "");
                j2 = C8569dql.j(eVar2, new e(d4, AbstractC6756cjM.b.c, "cta-not_your_account_cta", 0, 8, null));
                return j2;
            } else {
                String d5 = C8168dfL.d(C6763cjT.d.v);
                C8632dsu.a(d5, "");
                e eVar3 = new e(d5, new AbstractC6756cjM.d(z), "cta-send-again", 0, 8, null);
                String d6 = C8168dfL.d(C6763cjT.d.y);
                C8632dsu.a(d6, "");
                j = C8569dql.j(eVar3, new e(d6, AbstractC6756cjM.h.c, "cta-try-another-way", 0, 8, null));
                return j;
            }
        }
    }

    /* renamed from: o.cjU$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC6757cjN {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(o.C6762cjS r14, o.C9935zP r15, o.C6754cjK r16, boolean r17) {
            /*
                r13 = this;
                java.lang.String r0 = ""
                r2 = r15
                o.C8632dsu.c(r15, r0)
                r3 = r16
                o.C8632dsu.c(r3, r0)
                int r5 = o.C6763cjT.b.g
                int r1 = o.C6763cjT.d.u
                java.lang.String r6 = o.C8168dfL.d(r1)
                int r1 = o.C6763cjT.d.C
                o.Xq r1 = o.C1333Xq.d(r1)
                r4 = 0
                if (r14 == 0) goto L21
                java.lang.String r7 = r14.d()
                goto L22
            L21:
                r7 = r4
            L22:
                java.lang.String r8 = "destination"
                o.Xq r1 = r1.d(r8, r7)
                java.lang.String r1 = r1.c()
                android.text.Spanned r7 = o.C8168dfL.c(r1)
                int r1 = o.C6763cjT.d.x
                o.Xq r1 = o.C1333Xq.d(r1)
                if (r14 == 0) goto L42
                com.netflix.android.moneyball.fields.NumberField r8 = r14.b()
                if (r8 == 0) goto L42
                java.lang.Object r4 = r8.getValue()
            L42:
                java.lang.String r8 = "expiryInMinutes"
                o.Xq r1 = r1.d(r8, r4)
                java.lang.String r8 = r1.c()
                o.C8632dsu.a(r8, r0)
                o.cjU$b r0 = o.AbstractC6764cjU.e
                r1 = 0
                r12 = r17
                java.util.List r11 = r0.d(r12, r1)
                java.lang.String r4 = "VerifyCode.Email.Modal"
                r9 = 1
                java.lang.String r10 = "pin-entry-email-code"
                r1 = r13
                r2 = r15
                r3 = r16
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AbstractC6764cjU.a.<init>(o.cjS, o.zP, o.cjK, boolean):void");
        }
    }

    /* renamed from: o.cjU$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC6757cjN {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public f(o.C6762cjS r14, o.C9935zP r15, o.C6754cjK r16, boolean r17) {
            /*
                r13 = this;
                java.lang.String r0 = ""
                r2 = r15
                o.C8632dsu.c(r15, r0)
                r3 = r16
                o.C8632dsu.c(r3, r0)
                int r5 = o.C6763cjT.b.g
                int r1 = o.C6763cjT.d.u
                java.lang.String r6 = o.C8168dfL.d(r1)
                int r1 = o.C6763cjT.d.C
                o.Xq r1 = o.C1333Xq.d(r1)
                r4 = 0
                if (r14 == 0) goto L21
                java.lang.String r7 = r14.h()
                goto L22
            L21:
                r7 = r4
            L22:
                java.lang.String r8 = "destination"
                o.Xq r1 = r1.d(r8, r7)
                java.lang.String r1 = r1.c()
                android.text.Spanned r7 = o.C8168dfL.c(r1)
                int r1 = o.C6763cjT.d.x
                o.Xq r1 = o.C1333Xq.d(r1)
                if (r14 == 0) goto L42
                com.netflix.android.moneyball.fields.NumberField r8 = r14.b()
                if (r8 == 0) goto L42
                java.lang.Object r4 = r8.getValue()
            L42:
                java.lang.String r8 = "expiryInMinutes"
                o.Xq r1 = r1.d(r8, r4)
                java.lang.String r8 = r1.c()
                o.C8632dsu.a(r8, r0)
                o.cjU$b r0 = o.AbstractC6764cjU.e
                r1 = 0
                r12 = r17
                java.util.List r11 = r0.d(r12, r1)
                java.lang.String r4 = "VerifyCode.SMS.Modal"
                r9 = 1
                java.lang.String r10 = "pin-entry-sms-code"
                r1 = r13
                r2 = r15
                r3 = r16
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AbstractC6764cjU.f.<init>(o.cjS, o.zP, o.cjK, boolean):void");
        }
    }

    /* renamed from: o.cjU$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC6757cjN {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public i(o.C6762cjS r14, o.C9935zP r15, o.C6754cjK r16, boolean r17) {
            /*
                r13 = this;
                r0 = r14
                r11 = r17
                java.lang.String r1 = ""
                r2 = r15
                o.C8632dsu.c(r15, r1)
                r3 = r16
                o.C8632dsu.c(r3, r1)
                int r4 = o.C6763cjT.b.g
                int r5 = o.C6763cjT.d.s
                java.lang.String r5 = o.C8168dfL.d(r5)
                o.cjU$b r6 = o.AbstractC6764cjU.e
                java.lang.CharSequence r7 = r6.a(r14)
                int r8 = o.C6763cjT.d.x
                o.Xq r8 = o.C1333Xq.d(r8)
                r9 = 0
                if (r0 == 0) goto L30
                com.netflix.android.moneyball.fields.NumberField r10 = r14.b()
                if (r10 == 0) goto L30
                java.lang.Object r10 = r10.getValue()
                goto L31
            L30:
                r10 = r9
            L31:
                java.lang.String r12 = "expiryInMinutes"
                o.Xq r8 = r8.d(r12, r10)
                java.lang.String r8 = r8.c()
                o.C8632dsu.a(r8, r1)
                if (r0 == 0) goto L44
                java.lang.String r9 = r14.a()
            L44:
                o.cjU$d r0 = r6.c(r9, r11)
                boolean r0 = r0.g()
                java.util.List r10 = r6.d(r11, r0)
                java.lang.String r6 = "VerifyCode.Resent.Modal"
                r9 = 1
                java.lang.String r12 = "pin-entry-resend-code"
                r0 = r13
                r1 = r15
                r2 = r16
                r3 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r12
                r11 = r17
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AbstractC6764cjU.i.<init>(o.cjS, o.zP, o.cjK, boolean):void");
        }
    }

    /* renamed from: o.cjU$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC6757cjN {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public c(o.C6762cjS r13, o.C9935zP r14, o.C6754cjK r15, boolean r16) {
            /*
                r12 = this;
                r11 = r16
                java.lang.String r0 = ""
                r1 = r14
                o.C8632dsu.c(r14, r0)
                r2 = r15
                o.C8632dsu.c(r15, r0)
                o.cjU$b r0 = o.AbstractC6764cjU.e
                r3 = 0
                if (r13 == 0) goto L16
                java.lang.String r4 = r13.a()
                goto L17
            L16:
                r4 = r3
            L17:
                o.cjU$d r4 = r0.c(r4, r11)
                int r4 = r4.e()
                if (r13 == 0) goto L26
                java.lang.String r5 = r13.a()
                goto L27
            L26:
                r5 = r3
            L27:
                o.cjU$d r5 = r0.c(r5, r11)
                java.lang.String r5 = r5.j()
                if (r13 == 0) goto L36
                java.lang.String r6 = r13.a()
                goto L37
            L36:
                r6 = r3
            L37:
                o.cjU$d r6 = r0.c(r6, r11)
                java.lang.CharSequence r6 = r6.b()
                if (r13 == 0) goto L46
                java.lang.String r7 = r13.a()
                goto L47
            L46:
                r7 = r3
            L47:
                o.cjU$d r7 = r0.c(r7, r11)
                java.lang.String r7 = r7.d()
                if (r13 == 0) goto L56
                java.lang.String r8 = r13.a()
                goto L57
            L56:
                r8 = r3
            L57:
                o.cjU$d r8 = r0.c(r8, r11)
                boolean r8 = r8.c()
                if (r13 == 0) goto L66
                java.lang.String r9 = r13.a()
                goto L67
            L66:
                r9 = r3
            L67:
                o.cjU$d r9 = r0.c(r9, r11)
                java.lang.String r9 = r9.a()
                if (r13 == 0) goto L75
                java.lang.String r3 = r13.a()
            L75:
                o.cjU$d r3 = r0.c(r3, r11)
                boolean r3 = r3.g()
                java.util.List r10 = r0.d(r11, r3)
                java.lang.String r3 = "VerifyCode.Incorrect.Modal"
                r0 = r12
                r1 = r14
                r2 = r15
                r11 = r16
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AbstractC6764cjU.c.<init>(o.cjS, o.zP, o.cjK, boolean):void");
        }
    }

    /* renamed from: o.cjU$d */
    /* loaded from: classes4.dex */
    public static final class d {
        private final int a;
        private final boolean b;
        private final String c;
        private final String d;
        private final boolean e;
        private final CharSequence f;
        private final String h;

        public final String a() {
            return this.d;
        }

        public final CharSequence b() {
            return this.f;
        }

        public final boolean c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public final int e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.b == dVar.b && this.e == dVar.e && C8632dsu.c((Object) this.d, (Object) dVar.d) && this.a == dVar.a && C8632dsu.c((Object) this.h, (Object) dVar.h) && C8632dsu.c(this.f, dVar.f) && C8632dsu.c((Object) this.c, (Object) dVar.c);
            }
            return false;
        }

        public final boolean g() {
            return this.e;
        }

        public int hashCode() {
            return (((((((((((Boolean.hashCode(this.b) * 31) + Boolean.hashCode(this.e)) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.a)) * 31) + this.h.hashCode()) * 31) + this.f.hashCode()) * 31) + this.c.hashCode();
        }

        public final String j() {
            return this.h;
        }

        public String toString() {
            boolean z = this.b;
            boolean z2 = this.e;
            String str = this.d;
            int i = this.a;
            String str2 = this.h;
            CharSequence charSequence = this.f;
            String str3 = this.c;
            return "ErrorCode(showPinEntry=" + z + ", isMaxLimitErrorCode=" + z2 + ", id=" + str + ", icon=" + i + ", titleText=" + str2 + ", subtitleText=" + ((Object) charSequence) + ", subtitleExpiry=" + str3 + ")";
        }

        public d(boolean z, boolean z2, String str, int i, String str2, CharSequence charSequence, String str3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) charSequence, "");
            C8632dsu.c((Object) str3, "");
            this.b = z;
            this.e = z2;
            this.d = str;
            this.a = i;
            this.h = str2;
            this.f = charSequence;
            this.c = str3;
        }

        public /* synthetic */ d(boolean z, boolean z2, String str, int i, String str2, CharSequence charSequence, String str3, int i2, C8627dsp c8627dsp) {
            this(z, z2, str, i, str2, (i2 & 32) != 0 ? "" : charSequence, (i2 & 64) != 0 ? "" : str3);
        }
    }

    /* renamed from: o.cjU$e */
    /* loaded from: classes4.dex */
    public static final class e {
        private final AbstractC6756cjM a;
        private final String c;
        private final String d;
        private final int e;

        public final int a() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public final AbstractC6756cjM e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.a, eVar.a) && C8632dsu.c((Object) this.d, (Object) eVar.d) && this.e == eVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.e);
        }

        public String toString() {
            String str = this.c;
            AbstractC6756cjM abstractC6756cjM = this.a;
            String str2 = this.d;
            int i = this.e;
            return "Cta(ctaText=" + str + ", ctaEvent=" + abstractC6756cjM + ", ctaId=" + str2 + ", layout=" + i + ")";
        }

        public e(String str, AbstractC6756cjM abstractC6756cjM, String str2, int i) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) abstractC6756cjM, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.a = abstractC6756cjM;
            this.d = str2;
            this.e = i;
        }

        public /* synthetic */ e(String str, AbstractC6756cjM abstractC6756cjM, String str2, int i, int i2, C8627dsp c8627dsp) {
            this(str, abstractC6756cjM, str2, (i2 & 8) != 0 ? C6763cjT.a.c : i);
        }
    }
}
