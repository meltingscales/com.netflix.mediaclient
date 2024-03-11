package com.netflix.mediaclient.android.sharing.impl.types;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.sharing.impl.ShareMenuController;
import com.netflix.mediaclient.android.sharing.impl.types.ExtrasShareable;
import com.netflix.mediaclient.android.sharing.impl.types.ShareableInternal;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import o.C1128Pt;
import o.C1146Ql;
import o.C1149Qo;
import o.C1152Qr;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.QH;
import o.QI;
import o.QO;
import o.bEY;
import o.drM;
import o.duD;

/* loaded from: classes3.dex */
public class ExtrasShareable implements ShareableInternal<ExtrasFeedItemParcelable> {
    private static final List<QI<ExtrasFeedItemParcelable>> b;
    private final ExtrasFeedItemParcelable c;
    public static final e a = new e(null);
    public static final int d = 8;
    public static final Parcelable.Creator<ExtrasShareable> CREATOR = new Creator();

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<ExtrasShareable> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public final ExtrasShareable createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new ExtrasShareable(ExtrasFeedItemParcelable.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public final ExtrasShareable[] newArray(int i) {
            return new ExtrasShareable[i];
        }
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.Shareable
    /* renamed from: b */
    public ExtrasFeedItemParcelable d() {
        return this.c;
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public CharSequence c(QI<ExtrasFeedItemParcelable> qi) {
        C8632dsu.c((Object) qi, "");
        return null;
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.ShareableInternal
    public List<QI<ExtrasFeedItemParcelable>> c() {
        return b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        this.c.writeToParcel(parcel, i);
    }

    public ExtrasShareable(ExtrasFeedItemParcelable extrasFeedItemParcelable) {
        C8632dsu.c((Object) extrasFeedItemParcelable, "");
        this.c = extrasFeedItemParcelable;
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public String a() {
        return ShareableInternal.c.c(this);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    static {
        List<QI<ExtrasFeedItemParcelable>> j;
        C1128Pt.b bVar = C1128Pt.b;
        j = C8569dql.j(new C1146Ql(bVar.f()), new C1146Ql(bVar.e()), new QO(null, null, 3, null).e(), new C1149Qo(null, null, 3, null).c(), new C1146Ql(bVar.d()), new C1146Ql(bVar.j()), new C1146Ql(bVar.b()), new C1152Qr(true), new QH(null, 1, null));
        b = j;
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.ShareableInternal
    public Observable<ShareMenuController<ExtrasFeedItemParcelable>> c(final FragmentActivity fragmentActivity) {
        C8632dsu.c((Object) fragmentActivity, "");
        Observable a2 = QI.b.a(fragmentActivity, c());
        final drM<List<? extends QI<ExtrasFeedItemParcelable>>, ShareMenuController<ExtrasFeedItemParcelable>> drm = new drM<List<? extends QI<ExtrasFeedItemParcelable>>, ShareMenuController<ExtrasFeedItemParcelable>>() { // from class: com.netflix.mediaclient.android.sharing.impl.types.ExtrasShareable$getShareMenuController$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final ShareMenuController<ExtrasShareable.ExtrasFeedItemParcelable> invoke(List<? extends QI<ExtrasShareable.ExtrasFeedItemParcelable>> list) {
                ExtrasShareable.ExtrasFeedItemParcelable extrasFeedItemParcelable;
                C8632dsu.c((Object) list, "");
                FragmentActivity fragmentActivity2 = FragmentActivity.this;
                ExtrasShareable extrasShareable = this;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    extrasFeedItemParcelable = extrasShareable.c;
                    ((QI) it.next()).d(fragmentActivity2, (FragmentActivity) extrasFeedItemParcelable);
                }
                return new ShareMenuController<>(list);
            }
        };
        Observable<ShareMenuController<ExtrasFeedItemParcelable>> map = a2.map(new Function() { // from class: o.QY
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ShareMenuController d2;
                d2 = ExtrasShareable.d(drM.this, obj);
                return d2;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShareMenuController d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ShareMenuController) drm.invoke(obj);
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public String d(bEY bey, QI<ExtrasFeedItemParcelable> qi) {
        C8632dsu.c((Object) bey, "");
        C8632dsu.c((Object) qi, "");
        if (this.c.b() != null) {
            return bEY.c.a(bey, "extras", this.c.b(), qi.d(), "253492423", null, 0, 48, null);
        }
        return bEY.c.a(bey, SignupConstants.Field.VIDEO_TITLE, this.c.c(), qi.d(), "253492423", null, 0, 48, null);
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public CharSequence b(bEY bey, QI<ExtrasFeedItemParcelable> qi) {
        CharSequence n;
        C8632dsu.c((Object) bey, "");
        C8632dsu.c((Object) qi, "");
        String d2 = this.c.d();
        String str = d2 != null ? d2 : "";
        String d3 = d(bey, qi);
        n = duD.n((CharSequence) (str + "\n" + d3));
        return n.toString();
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public String e() {
        return this.c.d();
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public TrackingInfoHolder i() {
        return this.c.j();
    }

    /* loaded from: classes3.dex */
    public static final class ExtrasFeedItemParcelable implements Parcelable {
        public static final Parcelable.Creator<ExtrasFeedItemParcelable> CREATOR = new Creator();
        private final String a;
        private final boolean b;
        private final String c;
        private final String d;
        private final String e;
        private final VideoType h;
        private final TrackingInfoHolder i;

        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<ExtrasFeedItemParcelable> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final ExtrasFeedItemParcelable createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                return new ExtrasFeedItemParcelable(parcel.readString(), parcel.readString(), parcel.readString(), VideoType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), (TrackingInfoHolder) parcel.readParcelable(ExtrasFeedItemParcelable.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public final ExtrasFeedItemParcelable[] newArray(int i) {
                return new ExtrasFeedItemParcelable[i];
            }
        }

        public final boolean a() {
            return this.b;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.e;
        }

        public final String d() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.a;
        }

        public final VideoType h() {
            return this.h;
        }

        public final TrackingInfoHolder j() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.h.name());
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeString(this.a);
            parcel.writeParcelable(this.i, i);
        }

        public ExtrasFeedItemParcelable(String str, String str2, String str3, VideoType videoType, boolean z, String str4, TrackingInfoHolder trackingInfoHolder) {
            C8632dsu.c((Object) str3, "");
            C8632dsu.c((Object) videoType, "");
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.h = videoType;
            this.b = z;
            this.a = str4;
            this.i = trackingInfoHolder;
        }
    }
}
