package o;

import com.netflix.mediaclient.graphql.models.type.TextEvidenceClassification;
import java.util.List;

/* renamed from: o.aiQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2560aiQ implements InterfaceC9037hy {
    private final List<c> a;
    private final String e;

    public final String a() {
        return this.e;
    }

    public final List<c> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2560aiQ) {
            C2560aiQ c2560aiQ = (C2560aiQ) obj;
            return C8632dsu.c((Object) this.e, (Object) c2560aiQ.e) && C8632dsu.c(this.a, c2560aiQ.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        List<c> list = this.a;
        return (hashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.e;
        List<c> list = this.a;
        return "TaglineMessages(__typename=" + str + ", taglineMessages=" + list + ")";
    }

    public C2560aiQ(String str, List<c> list) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.a = list;
    }

    /* renamed from: o.aiQ$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final String b;
        private final TextEvidenceClassification c;

        public final TextEvidenceClassification b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c((Object) this.b, (Object) cVar.b) && this.c == cVar.c;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            TextEvidenceClassification textEvidenceClassification = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (textEvidenceClassification != null ? textEvidenceClassification.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            TextEvidenceClassification textEvidenceClassification = this.c;
            return "TaglineMessage(__typename=" + str + ", tagline=" + str2 + ", typedClassification=" + textEvidenceClassification + ")";
        }

        public c(String str, String str2, TextEvidenceClassification textEvidenceClassification) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = str2;
            this.c = textEvidenceClassification;
        }
    }
}
