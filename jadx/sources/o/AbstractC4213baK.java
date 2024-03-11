package o;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;

/* renamed from: o.baK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4213baK {
    public /* synthetic */ AbstractC4213baK(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC4213baK() {
    }

    /* renamed from: o.baK$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC4213baK {
        private final String b;
        private final String d;
        private final CreateRequest.DownloadRequestType e;

        public final CreateRequest.DownloadRequestType a() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.d, (Object) iVar.d) && C8632dsu.c((Object) this.b, (Object) iVar.b) && this.e == iVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (((this.d.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            String str2 = this.b;
            CreateRequest.DownloadRequestType downloadRequestType = this.e;
            return "NewRequest(videoId=" + str + ", oxId=" + str2 + ", requestType=" + downloadRequestType + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, CreateRequest.DownloadRequestType downloadRequestType) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) downloadRequestType, "");
            this.d = str;
            this.b = str2;
            this.e = downloadRequestType;
        }
    }

    /* renamed from: o.baK$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC4213baK {
        private final String b;
        private final String d;

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c((Object) this.d, (Object) aVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            return "BrowseDataFetchStart(videoId=" + str + ", oxId=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.d = str2;
        }
    }

    /* renamed from: o.baK$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC4213baK {
        private final String a;
        private final String c;
        private final StatusCode d;

        public final String d() {
            return this.a;
        }

        public final StatusCode e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c((Object) this.a, (Object) bVar.a) && this.d == bVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.a;
            StatusCode statusCode = this.d;
            return "BrowseDataFetchComplete(videoId=" + str + ", oxId=" + str2 + ", statusCode=" + statusCode + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, StatusCode statusCode) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) statusCode, "");
            this.c = str;
            this.a = str2;
            this.d = statusCode;
        }
    }

    /* renamed from: o.baK$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC4213baK {
        private final String d;
        private final String e;

        public final String a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.e, (Object) hVar.e) && C8632dsu.c((Object) this.d, (Object) hVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            return "ManifestFetchStart(videoId=" + str + ", oxId=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.e = str;
            this.d = str2;
        }
    }

    /* renamed from: o.baK$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC4213baK {
        private final String a;
        private final StatusCode c;
        private final String e;

        public final String b() {
            return this.a;
        }

        public final StatusCode e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.e, (Object) jVar.e) && C8632dsu.c((Object) this.a, (Object) jVar.a) && this.c == jVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (((this.e.hashCode() * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.e;
            String str2 = this.a;
            StatusCode statusCode = this.c;
            return "ManifestFetchComplete(videoId=" + str + ", oxId=" + str2 + ", statusCode=" + statusCode + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, StatusCode statusCode) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) statusCode, "");
            this.e = str;
            this.a = str2;
            this.c = statusCode;
        }
    }

    /* renamed from: o.baK$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC4213baK {
        private final String a;
        private final StatusCode b;
        private final String d;
        private final boolean e;

        public final StatusCode c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public final boolean e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c((Object) this.a, (Object) eVar.a) && this.b == eVar.b && this.e == eVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.a;
            StatusCode statusCode = this.b;
            boolean z = this.e;
            return "LicenseFetchComplete(videoId=" + str + ", oxId=" + str2 + ", statusCode=" + statusCode + ", licensedContent=" + z + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, StatusCode statusCode, boolean z) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) statusCode, "");
            this.d = str;
            this.a = str2;
            this.b = statusCode;
            this.e = z;
        }
    }

    /* renamed from: o.baK$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC4213baK {
        private final String a;
        private final String c;
        private final String d;

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c((Object) this.a, (Object) dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (((this.d.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            String str2 = this.c;
            String str3 = this.a;
            return "CacheImageStart(videoId=" + str + ", oxId=" + str2 + ", url=" + str3 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            this.d = str;
            this.c = str2;
            this.a = str3;
        }
    }

    /* renamed from: o.baK$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC4213baK {
        private final String a;
        private final StatusCode c;
        private final String d;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final StatusCode d() {
            return this.c;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c((Object) this.a, (Object) cVar.a) && this.c == cVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.d;
            String str2 = this.e;
            String str3 = this.a;
            StatusCode statusCode = this.c;
            return "CacheImageComplete(videoId=" + str + ", oxId=" + str2 + ", url=" + str3 + ", statusCode=" + statusCode + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, StatusCode statusCode) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            C8632dsu.c((Object) statusCode, "");
            this.d = str;
            this.e = str2;
            this.a = str3;
            this.c = statusCode;
        }
    }

    /* renamed from: o.baK$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC4213baK {
        private final StatusCode a;
        private final String d;
        private final String e;

        public final StatusCode c() {
            return this.a;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.e, (Object) gVar.e) && C8632dsu.c((Object) this.d, (Object) gVar.d) && this.a == gVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (((this.e.hashCode() * 31) + this.d.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            StatusCode statusCode = this.a;
            return "RequestComplete(videoId=" + str + ", oxId=" + str2 + ", statusCode=" + statusCode + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, StatusCode statusCode) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) statusCode, "");
            this.e = str;
            this.d = str2;
            this.a = statusCode;
        }
    }
}
