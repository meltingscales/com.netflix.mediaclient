package o;

import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.sharing.impl.targets.SnapchatExtras$buildSnapchatStory$1;
import com.netflix.mediaclient.android.sharing.impl.types.ExtrasShareable;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import com.netflix.model.leafs.VideoInfo;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import o.QJ;

/* loaded from: classes3.dex */
public final class QO extends QJ<ExtrasShareable.ExtrasFeedItemParcelable> {
    public QO() {
        this(null, null, 3, null);
    }

    @Override // o.QJ
    /* renamed from: e */
    public void b(FragmentActivity fragmentActivity, ExtrasShareable.ExtrasFeedItemParcelable extrasFeedItemParcelable) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) extrasFeedItemParcelable, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ QO(o.C1140Qf r1, o.C1133Py r2, int r3, o.C8627dsp r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: o.QO.<init>(o.Qf, o.Py, int, o.dsp):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QO(C1140Qf c1140Qf, C1133Py c1133Py) {
        super(c1140Qf, c1133Py);
        C8632dsu.c((Object) c1140Qf, "");
        C8632dsu.c((Object) c1133Py, "");
    }

    @Override // o.QJ
    public Single<QJ.c> a(FragmentActivity fragmentActivity, Shareable<ExtrasShareable.ExtrasFeedItemParcelable> shareable, QI<ExtrasShareable.ExtrasFeedItemParcelable> qi, int i, int i2) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) shareable, "");
        C8632dsu.c((Object) qi, "");
        Single<VideoInfo.Sharing> a = d().a(fragmentActivity, shareable.d().h(), shareable.d().c());
        final SnapchatExtras$buildSnapchatStory$1 snapchatExtras$buildSnapchatStory$1 = new SnapchatExtras$buildSnapchatStory$1(shareable, this, fragmentActivity, i, i2, qi);
        Single<QJ.c> subscribeOn = a.flatMap(new Function() { // from class: o.QR
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource c;
                c = QO.c(drM.this, obj);
                return c;
            }
        }).subscribeOn(Schedulers.io());
        C8632dsu.a(subscribeOn, "");
        return subscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }
}
