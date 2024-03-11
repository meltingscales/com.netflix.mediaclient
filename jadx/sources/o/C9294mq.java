package o;

import android.util.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.C9246lv;

/* renamed from: o.mq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9294mq implements C9246lv.a {
    public static final c b = new c(null);
    private final String a;
    private final String c;
    private final String d;

    public C9294mq() {
        this(null, null, null, 7, null);
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public C9294mq(String str, String str2, String str3) {
        this.a = str;
        this.d = str2;
        this.c = str3;
    }

    public /* synthetic */ C9294mq(String str, String str2, String str3, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.e();
        c9246lv.c(SignupConstants.Field.LANG_ID).e(this.a);
        c9246lv.c(SignupConstants.Field.EMAIL).e(this.d);
        c9246lv.c("name").e(this.c);
        c9246lv.d();
    }

    /* renamed from: o.mq$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public C9294mq a(JsonReader jsonReader) {
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                String nextString = jsonReader.nextString();
                if (nextName != null) {
                    int hashCode = nextName.hashCode();
                    if (hashCode != 3355) {
                        if (hashCode != 3373707) {
                            if (hashCode == 96619420 && nextName.equals(SignupConstants.Field.EMAIL)) {
                                str2 = nextString;
                            }
                        } else if (nextName.equals("name")) {
                            str3 = nextString;
                        }
                    } else if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                        str = nextString;
                    }
                }
            }
            C9294mq c9294mq = new C9294mq(str, str2, str3);
            jsonReader.endObject();
            return c9294mq;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C8632dsu.c(C9294mq.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                C9294mq c9294mq = (C9294mq) obj;
                return C8632dsu.c((Object) this.a, (Object) c9294mq.a) && C8632dsu.c((Object) this.d, (Object) c9294mq.d) && C8632dsu.c((Object) this.c, (Object) c9294mq.c);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bugsnag.android.User");
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.d;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.c;
        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }
}
