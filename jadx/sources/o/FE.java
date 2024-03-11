package o;

import android.net.Uri;
import com.netflix.clcs.models.InterstitialLoggingHandler;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class FE {
    public /* synthetic */ FE(C8627dsp c8627dsp) {
        this();
    }

    /* loaded from: classes2.dex */
    public static abstract class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        /* loaded from: classes2.dex */
        public static final class c extends a {
            private final AbstractC0085a a;
            private final String b;
            private final AbstractC0085a c;
            private final String d;
            private final String e;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.c, cVar.c) && C8632dsu.c(this.a, cVar.a);
                }
                return false;
            }

            public int hashCode() {
                String str = this.e;
                int hashCode = str == null ? 0 : str.hashCode();
                String str2 = this.b;
                int hashCode2 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.d;
                int hashCode3 = str3 == null ? 0 : str3.hashCode();
                AbstractC0085a abstractC0085a = this.c;
                int hashCode4 = abstractC0085a == null ? 0 : abstractC0085a.hashCode();
                AbstractC0085a abstractC0085a2 = this.a;
                return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (abstractC0085a2 != null ? abstractC0085a2.hashCode() : 0);
            }

            public String toString() {
                String str = this.e;
                String str2 = this.b;
                String str3 = this.d;
                AbstractC0085a abstractC0085a = this.c;
                AbstractC0085a abstractC0085a2 = this.a;
                return "Alert(title=" + str + ", message=" + str2 + ", errorCode=" + str3 + ", dismissAction=" + abstractC0085a + ", secondaryAction=" + abstractC0085a2 + ")";
            }

            /* renamed from: o.FE$a$c$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static abstract class AbstractC0085a {
                public /* synthetic */ AbstractC0085a(C8627dsp c8627dsp) {
                    this();
                }

                /* renamed from: o.FE$a$c$a$c  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0086c extends AbstractC0085a {
                    private final String a;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0086c) && C8632dsu.c((Object) this.a, (Object) ((C0086c) obj).a);
                    }

                    public int hashCode() {
                        String str = this.a;
                        if (str == null) {
                            return 0;
                        }
                        return str.hashCode();
                    }

                    public String toString() {
                        String str = this.a;
                        return "Dismiss(label=" + str + ")";
                    }

                    public C0086c(String str) {
                        super(null);
                        this.a = str;
                    }
                }

                private AbstractC0085a() {
                }

                /* renamed from: o.FE$a$c$a$e */
                /* loaded from: classes2.dex */
                public static final class e extends AbstractC0085a {
                    private final String c;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof e) && C8632dsu.c((Object) this.c, (Object) ((e) obj).c);
                    }

                    public int hashCode() {
                        String str = this.c;
                        if (str == null) {
                            return 0;
                        }
                        return str.hashCode();
                    }

                    public String toString() {
                        String str = this.c;
                        return "NavigateLogin(label=" + str + ")";
                    }

                    public e(String str) {
                        super(null);
                        this.c = str;
                    }
                }

                /* renamed from: o.FE$a$c$a$b */
                /* loaded from: classes2.dex */
                public static final class b extends AbstractC0085a {
                    private final String c;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof b) && C8632dsu.c((Object) this.c, (Object) ((b) obj).c);
                    }

                    public int hashCode() {
                        String str = this.c;
                        if (str == null) {
                            return 0;
                        }
                        return str.hashCode();
                    }

                    public String toString() {
                        String str = this.c;
                        return "NavigateAppStore(label=" + str + ")";
                    }

                    public b(String str) {
                        super(null);
                        this.c = str;
                    }
                }
            }

            public c(String str, String str2, String str3, AbstractC0085a abstractC0085a, AbstractC0085a abstractC0085a2) {
                super(null);
                this.e = str;
                this.b = str2;
                this.d = str3;
                this.c = abstractC0085a;
                this.a = abstractC0085a2;
            }
        }
    }

    private FE() {
    }

    /* loaded from: classes2.dex */
    public static final class m extends FE {
        private final a c;
        private final List<FE> d;

        public final List<FE> a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return C8632dsu.c(this.d, mVar.d) && C8632dsu.c(this.c, mVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            a aVar = this.c;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            List<FE> list = this.d;
            a aVar = this.c;
            return "Sequential(effects=" + list + ", errorHandling=" + aVar + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(List<? extends FE> list, a aVar) {
            super(null);
            C8632dsu.c((Object) list, "");
            this.d = list;
            this.c = aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends FE {
        private final String a;
        private final String b;
        private final a c;
        private final List<a> d;

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final a c() {
            return this.c;
        }

        public final List<a> e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return C8632dsu.c((Object) this.b, (Object) nVar.b) && C8632dsu.c((Object) this.a, (Object) nVar.a) && C8632dsu.c(this.d, nVar.d) && C8632dsu.c(this.c, nVar.c);
            }
            return false;
        }

        public int hashCode() {
            String str = this.b;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.a.hashCode();
            List<a> list = this.d;
            int hashCode3 = list == null ? 0 : list.hashCode();
            a aVar = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.a;
            List<a> list = this.d;
            a aVar = this.c;
            return "SubmitAction(loggingCommand=" + str + ", serverAction=" + str2 + ", inputFieldRequirements=" + list + ", errorHandling=" + aVar + ")";
        }

        /* loaded from: classes2.dex */
        public static final class a {
            private final FJ b;
            private final boolean d;

            public final boolean b() {
                return this.d;
            }

            public final FJ c() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    return C8632dsu.c(this.b, aVar.b) && this.d == aVar.d;
                }
                return false;
            }

            public int hashCode() {
                return (this.b.hashCode() * 31) + Boolean.hashCode(this.d);
            }

            public String toString() {
                FJ fj = this.b;
                boolean z = this.d;
                return "InputFieldRequirement(field=" + fj + ", isRequired=" + z + ")";
            }

            public a(FJ fj, boolean z) {
                C8632dsu.c((Object) fj, "");
                this.b = fj;
                this.d = z;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, String str2, List<a> list, a aVar) {
            super(null);
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.a = str2;
            this.d = list;
            this.c = aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends FE {
        private final a a;
        private final String d;
        private final List<FJ> e;

        public final a a() {
            return this.a;
        }

        public final String b() {
            return this.d;
        }

        public final List<FJ> e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return C8632dsu.c((Object) this.d, (Object) oVar.d) && C8632dsu.c(this.e, oVar.e) && C8632dsu.c(this.a, oVar.a);
            }
            return false;
        }

        public int hashCode() {
            String str = this.d;
            int hashCode = str == null ? 0 : str.hashCode();
            List<FJ> list = this.e;
            int hashCode2 = list == null ? 0 : list.hashCode();
            a aVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            List<FJ> list = this.e;
            a aVar = this.a;
            return "SendFeedback(serverFeedback=" + str + ", inputFields=" + list + ", errorHandling=" + aVar + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public o(String str, List<? extends FJ> list, a aVar) {
            super(null);
            this.d = str;
            this.e = list;
            this.a = aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends FE {
        private final boolean a;
        private final boolean c;
        private final Uri d;
        private final a e;

        public final boolean a() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }

        public final Uri d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c(this.d, gVar.d) && this.a == gVar.a && this.c == gVar.c && C8632dsu.c(this.e, gVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = Boolean.hashCode(this.a);
            int hashCode3 = Boolean.hashCode(this.c);
            a aVar = this.e;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            Uri uri = this.d;
            boolean z = this.a;
            boolean z2 = this.c;
            a aVar = this.e;
            return "OpenUrl(uri=" + uri + ", shouldUseAutoLogin=" + z + ", shouldUseEmbeddedWebView=" + z2 + ", errorHandling=" + aVar + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Uri uri, boolean z, boolean z2, a aVar) {
            super(null);
            C8632dsu.c((Object) uri, "");
            this.d = uri;
            this.a = z;
            this.c = z2;
            this.e = aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends FE {
        private final a a;
        private final String d;

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c(this.a, hVar.a) && C8632dsu.c((Object) this.d, (Object) hVar.d);
            }
            return false;
        }

        public int hashCode() {
            a aVar = this.a;
            int hashCode = aVar == null ? 0 : aVar.hashCode();
            String str = this.d;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            a aVar = this.a;
            String str = this.d;
            return "LogOut(errorHandling=" + aVar + ", loggingCommand=" + str + ")";
        }

        public h(a aVar, String str) {
            super(null);
            this.a = aVar;
            this.d = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends FE {
        private final String a;
        private final String c;
        private final a d;
        private final boolean e;

        public final String a() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public final boolean e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.a, (Object) iVar.a) && C8632dsu.c((Object) this.c, (Object) iVar.c) && this.e == iVar.e && C8632dsu.c(this.d, iVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = this.c.hashCode();
            int hashCode3 = Boolean.hashCode(this.e);
            a aVar = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            String str2 = this.c;
            boolean z = this.e;
            a aVar = this.d;
            return "RecordRdidCtaConsentEffect(consentId=" + str + ", displayedAt=" + str2 + ", isDenied=" + z + ", errorHandling=" + aVar + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, boolean z, a aVar) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.c = str2;
            this.e = z;
            this.d = aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends FE {
        private final a a;
        private final String d;

        public final String a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.a, dVar.a) && C8632dsu.c((Object) this.d, (Object) dVar.d);
            }
            return false;
        }

        public int hashCode() {
            a aVar = this.a;
            int hashCode = aVar == null ? 0 : aVar.hashCode();
            String str = this.d;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            a aVar = this.a;
            String str = this.d;
            return "Dismiss(errorHandling=" + aVar + ", loggingCommand=" + str + ")";
        }

        public d(a aVar, String str) {
            super(null);
            this.a = aVar;
            this.d = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends FE {
        private final a a;
        private final String b;
        private final InterstitialLoggingHandler.LoggingSessionType c;
        private final String d;
        private final String e;

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.b;
        }

        public final InterstitialLoggingHandler.LoggingSessionType c() {
            return this.c;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.a, bVar.a) && this.c == bVar.c && C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c((Object) this.d, (Object) bVar.d);
            }
            return false;
        }

        public int hashCode() {
            a aVar = this.a;
            int hashCode = aVar == null ? 0 : aVar.hashCode();
            int hashCode2 = this.c.hashCode();
            String str = this.e;
            int hashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.d;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            a aVar = this.a;
            InterstitialLoggingHandler.LoggingSessionType loggingSessionType = this.c;
            String str = this.e;
            String str2 = this.b;
            String str3 = this.d;
            return "ClientLogging(errorHandling=" + aVar + ", type=" + loggingSessionType + ", viewName=" + str + ", contextName=" + str2 + ", trackingInfo=" + str3 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, InterstitialLoggingHandler.LoggingSessionType loggingSessionType, String str, String str2, String str3) {
            super(null);
            C8632dsu.c((Object) loggingSessionType, "");
            this.a = aVar;
            this.c = loggingSessionType;
            this.e = str;
            this.b = str2;
            this.d = str3;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends FE {
        private final a a;
        private final String d;

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.a, cVar.a) && C8632dsu.c((Object) this.d, (Object) cVar.d);
            }
            return false;
        }

        public int hashCode() {
            a aVar = this.a;
            int hashCode = aVar == null ? 0 : aVar.hashCode();
            String str = this.d;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            a aVar = this.a;
            String str = this.d;
            return "ClientDebugLogging(errorHandling=" + aVar + ", debugData=" + str + ")";
        }

        public c(a aVar, String str) {
            super(null);
            this.a = aVar;
            this.d = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends FE {
        private final FJ e;

        public final FJ b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && C8632dsu.c(this.e, ((l) obj).e);
        }

        public int hashCode() {
            FJ fj = this.e;
            if (fj == null) {
                return 0;
            }
            return fj.hashCode();
        }

        public String toString() {
            FJ fj = this.e;
            return "SubmitRelevantAction(field=" + fj + ")";
        }

        public l(FJ fj) {
            super(null);
            this.e = fj;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends FE {
        private final a b;
        private final String d;

        public final String a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.b, eVar.b) && C8632dsu.c((Object) this.d, (Object) eVar.d);
            }
            return false;
        }

        public int hashCode() {
            a aVar = this.b;
            return ((aVar == null ? 0 : aVar.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            a aVar = this.b;
            String str = this.d;
            return "InAppNavigation(errorHandling=" + aVar + ", path=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a aVar, String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.b = aVar;
            this.d = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends FE {
        private final String a;
        private final a b;
        private final String c;
        private final String d;
        private final List<n.a> e;

        public final List<n.a> a() {
            return this.e;
        }

        public final String b() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public final a e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c(this.b, jVar.b) && C8632dsu.c((Object) this.c, (Object) jVar.c) && C8632dsu.c(this.e, jVar.e) && C8632dsu.c((Object) this.d, (Object) jVar.d) && C8632dsu.c((Object) this.a, (Object) jVar.a);
            }
            return false;
        }

        public int hashCode() {
            a aVar = this.b;
            int hashCode = aVar == null ? 0 : aVar.hashCode();
            int hashCode2 = this.c.hashCode();
            List<n.a> list = this.e;
            int hashCode3 = list == null ? 0 : list.hashCode();
            String str = this.d;
            int hashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            a aVar = this.b;
            String str = this.c;
            List<n.a> list = this.e;
            String str2 = this.d;
            String str3 = this.a;
            return "RequestScreenUpdate(errorHandling=" + aVar + ", serverScreenUpdate=" + str + ", inputFieldRequirements=" + list + ", loggingCommand=" + str2 + ", loggingAction=" + str3 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(a aVar, String str, List<n.a> list, String str2, String str3) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.b = aVar;
            this.c = str;
            this.e = list;
            this.d = str2;
            this.a = str3;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends FE {
        private final a a;
        private final String b;
        private final String c;
        private final String e;

        public final String a() {
            return this.b;
        }

        public final a c() {
            return this.a;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c(this.a, fVar.a) && C8632dsu.c((Object) this.b, (Object) fVar.b) && C8632dsu.c((Object) this.e, (Object) fVar.e) && C8632dsu.c((Object) this.c, (Object) fVar.c);
            }
            return false;
        }

        public int hashCode() {
            a aVar = this.a;
            int hashCode = aVar == null ? 0 : aVar.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            a aVar = this.a;
            String str = this.b;
            String str2 = this.e;
            String str3 = this.c;
            return "NavigateBack(errorHandling=" + aVar + ", loggingCommand=" + str + ", loggingAction=" + str2 + ", navigationMarker=" + str3 + ")";
        }

        public f(a aVar, String str, String str2, String str3) {
            super(null);
            this.a = aVar;
            this.b = str;
            this.e = str2;
            this.c = str3;
        }
    }
}
