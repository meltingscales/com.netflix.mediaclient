package o;

import com.netflix.android.imageloader.api.ImageDataSource;
import java.io.File;

/* renamed from: o.uz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9684uz {
    private int a;
    private String c;
    private int d;

    public final C9684uz e(String str) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        return this;
    }

    public final a e() {
        boolean g;
        String str = this.c;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                return new a(str, this.d, this.a);
            }
        }
        throw new IllegalArgumentException("invalid URL");
    }

    /* renamed from: o.uz$a */
    /* loaded from: classes.dex */
    public static final class a {
        private final String a;
        private final int b;
        private final int c;

        public final int a() {
            return this.c;
        }

        public final int b() {
            return this.b;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && this.c == aVar.c && this.b == aVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            String str = this.a;
            int i = this.c;
            int i2 = this.b;
            return "Request(url=" + str + ", maxWidth=" + i + ", maxHeight=" + i2 + ")";
        }

        public a(String str, int i, int i2) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = i;
            this.b = i2;
        }
    }

    /* renamed from: o.uz$d */
    /* loaded from: classes.dex */
    public static final class d {
        private final ImageDataSource b;
        private final File e;

        public final File c() {
            return this.e;
        }

        public final ImageDataSource d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.e, dVar.e) && this.b == dVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            File file = this.e;
            ImageDataSource imageDataSource = this.b;
            return "Result(file=" + file + ", imageDataSource=" + imageDataSource + ")";
        }

        public d(File file, ImageDataSource imageDataSource) {
            C8632dsu.c((Object) file, "");
            C8632dsu.c((Object) imageDataSource, "");
            this.e = file;
            this.b = imageDataSource;
        }
    }
}
