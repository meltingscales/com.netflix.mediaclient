package o;

import android.util.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.C9246lv;

/* renamed from: o.kT  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9165kT implements C9246lv.a {
    public static final a a = new a(null);
    private final String c;

    public final String a() {
        return this.c;
    }

    public C9165kT(String str) {
        this.c = str;
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.e();
        c9246lv.c(SignupConstants.Field.LANG_ID);
        c9246lv.e(a());
        c9246lv.d();
    }

    /* renamed from: o.kT$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public C9165kT b(JsonReader jsonReader) {
            jsonReader.beginObject();
            return new C9165kT((jsonReader.hasNext() && C8632dsu.c((Object) SignupConstants.Field.LANG_ID, (Object) jsonReader.nextName())) ? jsonReader.nextString() : null);
        }
    }
}
