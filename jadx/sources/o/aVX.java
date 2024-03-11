package o;

import android.text.TextUtils;
import com.netflix.mediaclient.service.mdx.MdxErrorCode;
import com.netflix.mediaclient.service.mdx.MdxErrorSubCode;
import com.netflix.mediaclient.service.mdx.MdxErrorSuffix;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public class aVX {
    private MdxErrorSuffix a;
    private final String b;
    private final MdxErrorCode c;
    private String d;
    private String e;
    private MdxErrorSubCode f;

    public String a() {
        return this.d;
    }

    public MdxErrorSubCode b() {
        return this.f;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public MdxErrorCode e() {
        return this.c;
    }

    /* loaded from: classes3.dex */
    public static class d {
        private MdxErrorSubCode a;
        private MdxErrorSuffix b = MdxErrorSuffix.Unknown;
        private String c;
        private MdxErrorCode d;
        private String e;

        public d b(MdxErrorSubCode mdxErrorSubCode) {
            this.a = mdxErrorSubCode;
            return this;
        }

        public d b(MdxErrorSuffix mdxErrorSuffix) {
            this.b = mdxErrorSuffix;
            return this;
        }

        public d d(String str) {
            this.e = str;
            return this;
        }

        public d e(String str) {
            this.c = str;
            return this;
        }

        public d(MdxErrorCode mdxErrorCode) {
            this.d = mdxErrorCode;
        }

        public aVX d() {
            return new aVX(this);
        }

        public d c(int i) {
            this.c = String.valueOf(i);
            return this;
        }
    }

    private aVX(d dVar) {
        ArrayList arrayList = new ArrayList();
        this.a = dVar.b;
        String str = dVar.e;
        Objects.requireNonNull(str);
        this.b = str;
        MdxErrorCode mdxErrorCode = dVar.d;
        Objects.requireNonNull(mdxErrorCode);
        this.c = mdxErrorCode;
        arrayList.add(mdxErrorCode.toString());
        if (dVar.a != null) {
            MdxErrorSubCode mdxErrorSubCode = dVar.a;
            this.f = mdxErrorSubCode;
            arrayList.add(mdxErrorSubCode.toString());
        } else if (C8168dfL.h(dVar.c)) {
            MdxErrorSubCode mdxErrorSubCode2 = MdxErrorSubCode.Unknown;
            this.f = mdxErrorSubCode2;
            arrayList.add(mdxErrorSubCode2.toString());
        }
        if (C8168dfL.h(dVar.c)) {
            String str2 = dVar.c;
            this.e = str2;
            arrayList.add(str2);
        }
        MdxErrorSuffix mdxErrorSuffix = this.a;
        if (mdxErrorSuffix != null && mdxErrorSuffix != MdxErrorSuffix.Unknown) {
            arrayList.add(mdxErrorSuffix.toString());
        }
        this.d = "SSCR-S" + TextUtils.join("-", arrayList);
    }

    public String toString() {
        return "[MdxError " + this.d + "] " + this.b;
    }

    public static aVX b(String str) {
        if (str.startsWith("SSCR-S")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.substring(6).split("-")));
            if (arrayList.size() >= 2 && arrayList.size() <= 4) {
                try {
                    MdxErrorCode c = MdxErrorCode.c((String) arrayList.remove(0));
                    MdxErrorSubCode b = MdxErrorSubCode.b((String) arrayList.remove(0));
                    if (c != null && b != null) {
                        d d2 = new d(c).b(b).d(str);
                        if (arrayList.size() > 0) {
                            String str2 = (String) arrayList.get(arrayList.size() - 1);
                            MdxErrorSuffix[] values = MdxErrorSuffix.values();
                            int length = values.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                MdxErrorSuffix mdxErrorSuffix = values[i];
                                if (mdxErrorSuffix.toString().equals(str2)) {
                                    d2.b(mdxErrorSuffix);
                                    arrayList.remove(str2);
                                    break;
                                }
                                i++;
                            }
                            if (arrayList.size() > 0) {
                                d2.e((String) arrayList.get(0));
                            }
                        }
                        return d2.d();
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        return null;
    }
}
