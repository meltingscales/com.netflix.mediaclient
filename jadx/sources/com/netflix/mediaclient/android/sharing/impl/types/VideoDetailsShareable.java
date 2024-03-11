package com.netflix.mediaclient.android.sharing.impl.types;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.sharing.impl.ShareMenuController;
import com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_LocaleSpecificSharing;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import o.C1128Pt;
import o.C1146Ql;
import o.C1152Qr;
import o.C1155Qu;
import o.C1333Xq;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.QH;
import o.QI;
import o.QQ;
import o.bEY;
import o.drM;

/* loaded from: classes3.dex */
public class VideoDetailsShareable implements ShareableInternal<VideoDetailsParcelable> {
    private static final List<QI<VideoDetailsParcelable>> e;
    private final VideoDetailsParcelable c;
    public static final c d = new c(null);
    public static final int a = 8;
    public static final Parcelable.Creator<VideoDetailsShareable> CREATOR = new Creator();

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<VideoDetailsShareable> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public final VideoDetailsShareable createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new VideoDetailsShareable(VideoDetailsParcelable.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public final VideoDetailsShareable[] newArray(int i) {
            return new VideoDetailsShareable[i];
        }
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.Shareable
    /* renamed from: b */
    public VideoDetailsParcelable d() {
        return this.c;
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public CharSequence c(QI<VideoDetailsParcelable> qi) {
        C8632dsu.c((Object) qi, "");
        return null;
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.ShareableInternal
    public List<QI<VideoDetailsParcelable>> c() {
        return e;
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

    public VideoDetailsShareable(VideoDetailsParcelable videoDetailsParcelable) {
        C8632dsu.c((Object) videoDetailsParcelable, "");
        this.c = videoDetailsParcelable;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    static {
        List<QI<VideoDetailsParcelable>> j;
        C1128Pt.b bVar = C1128Pt.b;
        j = C8569dql.j(new C1146Ql(bVar.f()), new C1146Ql(bVar.e()), new C1155Qu(null, null, 3, null).c(), new C1146Ql(bVar.d()), new QQ(null, null, 3, null).e(), new C1146Ql(bVar.j()), new C1146Ql(bVar.b()), new C1152Qr(true), new QH(null, 1, null));
        e = j;
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.ShareableInternal
    public Observable<ShareMenuController<VideoDetailsParcelable>> c(final FragmentActivity fragmentActivity) {
        C8632dsu.c((Object) fragmentActivity, "");
        Observable a2 = QI.b.a(fragmentActivity, c());
        final drM<List<? extends QI<VideoDetailsParcelable>>, ShareMenuController<VideoDetailsParcelable>> drm = new drM<List<? extends QI<VideoDetailsParcelable>>, ShareMenuController<VideoDetailsParcelable>>() { // from class: com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable$getShareMenuController$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final ShareMenuController<VideoDetailsShareable.VideoDetailsParcelable> invoke(List<? extends QI<VideoDetailsShareable.VideoDetailsParcelable>> list) {
                VideoDetailsShareable.VideoDetailsParcelable videoDetailsParcelable;
                C8632dsu.c((Object) list, "");
                FragmentActivity fragmentActivity2 = FragmentActivity.this;
                VideoDetailsShareable videoDetailsShareable = this;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    videoDetailsParcelable = videoDetailsShareable.c;
                    ((QI) it.next()).d(fragmentActivity2, (FragmentActivity) videoDetailsParcelable);
                }
                return new ShareMenuController<>(list);
            }
        };
        Observable<ShareMenuController<VideoDetailsParcelable>> map = a2.map(new Function() { // from class: o.Re
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ShareMenuController e2;
                e2 = VideoDetailsShareable.e(drM.this, obj);
                return e2;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShareMenuController e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ShareMenuController) drm.invoke(obj);
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public String d(bEY bey, QI<VideoDetailsParcelable> qi) {
        C8632dsu.c((Object) bey, "");
        C8632dsu.c((Object) qi, "");
        String a2 = bEY.c.a(bey, SignupConstants.Field.VIDEO_TITLE, this.c.b(), qi.d(), null, null, 0, 56, null);
        if (!Config_FastProperty_LocaleSpecificSharing.Companion.c() || this.c.i() == null) {
            return a2;
        }
        String i = this.c.i();
        return a2 + "&clip=" + i;
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public CharSequence b(bEY bey, QI<VideoDetailsParcelable> qi) {
        C8632dsu.c((Object) bey, "");
        C8632dsu.c((Object) qi, "");
        String c2 = C1333Xq.d(R.o.lw).d(SignupConstants.Field.VIDEO_TITLE, this.c.e()).d(SignupConstants.Field.URL, d(bey, qi)).c();
        C8632dsu.a(c2, "");
        return c2;
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public String e() {
        return this.c.e();
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public TrackingInfoHolder i() {
        return this.c.a();
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public String a() {
        return this.c.c();
    }

    /* loaded from: classes3.dex */
    public static final class VideoDetailsParcelable implements Parcelable {
        public static final Parcelable.Creator<VideoDetailsParcelable> CREATOR = new Creator();
        private final String a;
        private final String b;
        private final String c;
        private final TrackingInfoHolder d;
        private final VideoType e;
        private final String j;

        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<VideoDetailsParcelable> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: e */
            public final VideoDetailsParcelable createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                return new VideoDetailsParcelable(parcel.readString(), VideoType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (TrackingInfoHolder) parcel.readParcelable(VideoDetailsParcelable.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: e */
            public final VideoDetailsParcelable[] newArray(int i) {
                return new VideoDetailsParcelable[i];
            }
        }

        public final TrackingInfoHolder a() {
            return this.d;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        public final VideoType d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.c;
        }

        public final String i() {
            return this.j;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeString(this.a);
            parcel.writeString(this.e.name());
            parcel.writeString(this.c);
            parcel.writeString(this.j);
            parcel.writeParcelable(this.d, i);
            parcel.writeString(this.b);
        }

        public VideoDetailsParcelable(String str, VideoType videoType, String str2, String str3, TrackingInfoHolder trackingInfoHolder, String str4) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.e = videoType;
            this.c = str2;
            this.j = str3;
            this.d = trackingInfoHolder;
            this.b = str4;
        }

        public /* synthetic */ VideoDetailsParcelable(String str, VideoType videoType, String str2, String str3, TrackingInfoHolder trackingInfoHolder, String str4, int i, C8627dsp c8627dsp) {
            this(str, videoType, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : trackingInfoHolder, (i & 32) != 0 ? null : str4);
        }
    }
}
