package o;

import android.os.Parcelable;
import com.netflix.mediaclient.android.sharing.impl.types.ShareableInternal;
import java.util.List;

/* renamed from: o.Qc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1137Qc implements InterfaceC8888fH {
    private final ShareableInternal<Parcelable> a;
    private final List<QI<Parcelable>> b;
    private final AbstractC8918fl<List<QI<Parcelable>>> c;
    private final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C1137Qc copy$default(C1137Qc c1137Qc, List list, AbstractC8918fl abstractC8918fl, ShareableInternal shareableInternal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c1137Qc.b;
        }
        if ((i & 2) != 0) {
            abstractC8918fl = c1137Qc.c;
        }
        if ((i & 4) != 0) {
            shareableInternal = c1137Qc.a;
        }
        if ((i & 8) != 0) {
            str = c1137Qc.e;
        }
        return c1137Qc.d(list, abstractC8918fl, shareableInternal, str);
    }

    public final ShareableInternal<Parcelable> c() {
        return this.a;
    }

    public final List<QI<Parcelable>> component1() {
        return this.b;
    }

    public final AbstractC8918fl<List<QI<Parcelable>>> component2() {
        return this.c;
    }

    public final ShareableInternal<Parcelable> component3() {
        return this.a;
    }

    public final String component4() {
        return this.e;
    }

    public final String d() {
        return this.e;
    }

    public final C1137Qc d(List<? extends QI<Parcelable>> list, AbstractC8918fl<? extends List<? extends QI<Parcelable>>> abstractC8918fl, ShareableInternal<Parcelable> shareableInternal, String str) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) shareableInternal, "");
        return new C1137Qc(list, abstractC8918fl, shareableInternal, str);
    }

    public final AbstractC8918fl<List<QI<Parcelable>>> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1137Qc) {
            C1137Qc c1137Qc = (C1137Qc) obj;
            return C8632dsu.c(this.b, c1137Qc.b) && C8632dsu.c(this.c, c1137Qc.c) && C8632dsu.c(this.a, c1137Qc.a) && C8632dsu.c((Object) this.e, (Object) c1137Qc.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.a.hashCode();
        String str = this.e;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<QI<Parcelable>> list = this.b;
        AbstractC8918fl<List<QI<Parcelable>>> abstractC8918fl = this.c;
        ShareableInternal<Parcelable> shareableInternal = this.a;
        String str = this.e;
        return "ShareState(shareTargets=" + list + ", filteredSharedTargets=" + abstractC8918fl + ", shareable=" + shareableInternal + ", shareImageUrl=" + str + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1137Qc(List<? extends QI<Parcelable>> list, AbstractC8918fl<? extends List<? extends QI<Parcelable>>> abstractC8918fl, ShareableInternal<Parcelable> shareableInternal, String str) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) shareableInternal, "");
        this.b = list;
        this.c = abstractC8918fl;
        this.a = shareableInternal;
        this.e = str;
    }

    public /* synthetic */ C1137Qc(List list, AbstractC8918fl abstractC8918fl, ShareableInternal shareableInternal, String str, int i, C8627dsp c8627dsp) {
        this(list, abstractC8918fl, shareableInternal, (i & 8) != 0 ? null : str);
    }
}
