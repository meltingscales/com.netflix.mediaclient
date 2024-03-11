package com.netflix.mediaclient.android.sharing.impl.types;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.sharing.impl.ShareMenuController;
import com.netflix.mediaclient.android.sharing.impl.types.InteractiveShareable;
import com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import o.C1128Pt;
import o.C1146Ql;
import o.C1152Qr;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.QH;
import o.QI;
import o.bEY;
import o.drM;

/* loaded from: classes3.dex */
public final class InteractiveShareable extends VideoDetailsShareable {
    private static final List<QI<VideoDetailsShareable.VideoDetailsParcelable>> e;
    private final VideoDetailsShareable.VideoDetailsParcelable i;
    private final String j;
    public static final c c = new c(null);
    public static final int b = 8;
    public static final Parcelable.Creator<InteractiveShareable> CREATOR = new Creator();

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<InteractiveShareable> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public final InteractiveShareable[] newArray(int i) {
            return new InteractiveShareable[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public final InteractiveShareable createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new InteractiveShareable(parcel.readString(), VideoDetailsShareable.VideoDetailsParcelable.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable, com.netflix.mediaclient.android.sharing.impl.types.ShareableInternal
    public List<QI<VideoDetailsShareable.VideoDetailsParcelable>> c() {
        return e;
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.j);
        this.i.writeToParcel(parcel, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveShareable(String str, VideoDetailsShareable.VideoDetailsParcelable videoDetailsParcelable) {
        super(videoDetailsParcelable);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoDetailsParcelable, "");
        this.j = str;
        this.i = videoDetailsParcelable;
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
        List<QI<VideoDetailsShareable.VideoDetailsParcelable>> j;
        C1128Pt.b bVar = C1128Pt.b;
        j = C8569dql.j(new C1146Ql(bVar.f()), new C1146Ql(bVar.e()), new C1146Ql(bVar.c()), new C1146Ql(bVar.d()), new C1146Ql(bVar.a()), new C1146Ql(bVar.j()), new C1146Ql(bVar.b()), new C1152Qr(true), new QH(null, 1, null));
        e = j;
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable, com.netflix.mediaclient.android.sharing.impl.types.ShareableInternal
    public Observable<ShareMenuController<VideoDetailsShareable.VideoDetailsParcelable>> c(final FragmentActivity fragmentActivity) {
        C8632dsu.c((Object) fragmentActivity, "");
        Observable a = QI.b.a(fragmentActivity, c());
        final drM<List<? extends QI<VideoDetailsShareable.VideoDetailsParcelable>>, ShareMenuController<VideoDetailsShareable.VideoDetailsParcelable>> drm = new drM<List<? extends QI<VideoDetailsShareable.VideoDetailsParcelable>>, ShareMenuController<VideoDetailsShareable.VideoDetailsParcelable>>() { // from class: com.netflix.mediaclient.android.sharing.impl.types.InteractiveShareable$getShareMenuController$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final ShareMenuController<VideoDetailsShareable.VideoDetailsParcelable> invoke(List<? extends QI<VideoDetailsShareable.VideoDetailsParcelable>> list) {
                C8632dsu.c((Object) list, "");
                FragmentActivity fragmentActivity2 = FragmentActivity.this;
                InteractiveShareable interactiveShareable = this;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((QI) it.next()).d(fragmentActivity2, (FragmentActivity) interactiveShareable.d());
                }
                return new ShareMenuController<>(list);
            }
        };
        Observable<ShareMenuController<VideoDetailsShareable.VideoDetailsParcelable>> map = a.map(new Function() { // from class: o.Ra
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ShareMenuController a2;
                a2 = InteractiveShareable.a(drM.this, obj);
                return a2;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShareMenuController a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ShareMenuController) drm.invoke(obj);
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable, com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public CharSequence b(bEY bey, QI<VideoDetailsShareable.VideoDetailsParcelable> qi) {
        C8632dsu.c((Object) bey, "");
        C8632dsu.c((Object) qi, "");
        String str = this.j;
        String e2 = d().e();
        String d = d(bey, qi);
        return str + "\n" + e2 + "\n" + d;
    }
}
