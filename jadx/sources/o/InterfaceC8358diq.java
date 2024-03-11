package o;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.android.imageloader.api.ShowImageRequest;
import io.reactivex.Single;
import java.util.List;

/* renamed from: o.diq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC8358diq {

    /* renamed from: o.diq$d */
    /* loaded from: classes5.dex */
    public interface d {
        void b(GetImageRequest.e eVar, long j, GetImageRequest.a aVar, Throwable th);

        void c(ImageView imageView, ShowImageRequest.c cVar, long j, ShowImageRequest.a aVar, Throwable th);
    }

    Single<c> d(drO<? extends View> dro, Lifecycle lifecycle, d dVar);

    /* renamed from: o.diq$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ Single b(InterfaceC8358diq interfaceC8358diq, drO dro, Lifecycle lifecycle, d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    dVar = null;
                }
                return interfaceC8358diq.d(dro, lifecycle, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTracking");
        }
    }

    /* renamed from: o.diq$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private final boolean a;
        private final List<b> b;
        private final String c;
        private final long e;

        public final boolean a() {
            return this.a;
        }

        public final List<b> b() {
            return this.b;
        }

        public final long d() {
            return this.e;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.a == cVar.a && C8632dsu.c((Object) this.c, (Object) cVar.c) && this.e == cVar.e && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.a);
            String str = this.c;
            return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.e)) * 31) + this.b.hashCode();
        }

        public String toString() {
            boolean z = this.a;
            String str = this.c;
            long j = this.e;
            List<b> list = this.b;
            return "Result(didComplete=" + z + ", statusMessage=" + str + ", trueTtrEndTimeMillis=" + j + ", images=" + list + ")";
        }

        public c(boolean z, String str, long j, List<b> list) {
            C8632dsu.c((Object) list, "");
            this.a = z;
            this.c = str;
            this.e = j;
            this.b = list;
        }
    }

    /* renamed from: o.diq$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private final int a;
        private final long b;
        private final Throwable c;
        private final long d;
        private final ImageDataSource e;
        private final String i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.i, (Object) bVar.i) && this.d == bVar.d && this.b == bVar.b && this.e == bVar.e && this.a == bVar.a && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.i.hashCode();
            int hashCode2 = Long.hashCode(this.d);
            int hashCode3 = Long.hashCode(this.b);
            ImageDataSource imageDataSource = this.e;
            int hashCode4 = imageDataSource == null ? 0 : imageDataSource.hashCode();
            int hashCode5 = Integer.hashCode(this.a);
            Throwable th = this.c;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            String str = this.i;
            long j = this.d;
            long j2 = this.b;
            ImageDataSource imageDataSource = this.e;
            int i = this.a;
            Throwable th = this.c;
            return "ImageData(url=" + str + ", startTimeMillis=" + j + ", endTimeMillis=" + j2 + ", dataSource=" + imageDataSource + ", bitmapByteCount=" + i + ", error=" + th + ")";
        }

        public b(String str, long j, long j2, ImageDataSource imageDataSource, int i, Throwable th) {
            C8632dsu.c((Object) str, "");
            this.i = str;
            this.d = j;
            this.b = j2;
            this.e = imageDataSource;
            this.a = i;
            this.c = th;
        }
    }
}
