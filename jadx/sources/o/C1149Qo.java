package o;

import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.sharing.impl.targets.InstagramExtras$buildInstagramStory$1;
import com.netflix.mediaclient.android.sharing.impl.types.ExtrasShareable;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import com.netflix.model.leafs.VideoInfo;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import o.AbstractC1153Qs;

/* renamed from: o.Qo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1149Qo extends AbstractC1153Qs<ExtrasShareable.ExtrasFeedItemParcelable> {
    public C1149Qo() {
        this(null, null, 3, null);
    }

    @Override // o.AbstractC1153Qs
    /* renamed from: b */
    public void e(FragmentActivity fragmentActivity, ExtrasShareable.ExtrasFeedItemParcelable extrasFeedItemParcelable) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) extrasFeedItemParcelable, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C1149Qo(o.C1140Qf r1, o.C1133Py r2, int r3, o.C8627dsp r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L9
            o.Qf r1 = new o.Qf
            r1.<init>()
        L9:
            r3 = r3 & 2
            if (r3 == 0) goto L12
            o.Py r2 = new o.Py
            r2.<init>(r1)
        L12:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1149Qo.<init>(o.Qf, o.Py, int, o.dsp):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1149Qo(C1140Qf c1140Qf, C1133Py c1133Py) {
        super(c1140Qf, c1133Py);
        C8632dsu.c((Object) c1140Qf, "");
        C8632dsu.c((Object) c1133Py, "");
    }

    @Override // o.AbstractC1153Qs
    public Single<AbstractC1153Qs.e> b(FragmentActivity fragmentActivity, Shareable<ExtrasShareable.ExtrasFeedItemParcelable> shareable, QI<ExtrasShareable.ExtrasFeedItemParcelable> qi, int i, int i2) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) shareable, "");
        C8632dsu.c((Object) qi, "");
        Single<VideoInfo.Sharing> a = d().a(fragmentActivity, shareable.d().h(), shareable.d().c());
        final InstagramExtras$buildInstagramStory$1 instagramExtras$buildInstagramStory$1 = new InstagramExtras$buildInstagramStory$1(shareable, this, fragmentActivity, i, i2, qi);
        Single<AbstractC1153Qs.e> subscribeOn = a.flatMap(new Function() { // from class: o.Qt
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource b;
                b = C1149Qo.b(drM.this, obj);
                return b;
            }
        }).subscribeOn(Schedulers.io());
        C8632dsu.a(subscribeOn, "");
        return subscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }
}
