package o;

import android.annotation.SuppressLint;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.sharing.impl.targets.SnapchatVideoDetails$buildSnapchatStory$1;
import com.netflix.mediaclient.android.sharing.impl.targets.SnapchatVideoDetails$prefetchResourcesForShareable$1;
import com.netflix.mediaclient.android.sharing.impl.targets.SnapchatVideoDetails$prefetchResourcesForShareable$onError$1;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable;
import com.netflix.model.leafs.VideoInfo;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import o.C8632dsu;
import o.QJ;
import o.dpR;

/* loaded from: classes3.dex */
public final class QQ extends QJ<VideoDetailsShareable.VideoDetailsParcelable> {
    public QQ() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ QQ(o.C1140Qf r1, o.C1133Py r2, int r3, o.C8627dsp r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: o.QQ.<init>(o.Qf, o.Py, int, o.dsp):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QQ(C1140Qf c1140Qf, C1133Py c1133Py) {
        super(c1140Qf, c1133Py);
        C8632dsu.c((Object) c1140Qf, "");
        C8632dsu.c((Object) c1133Py, "");
    }

    @Override // o.QJ
    public Single<QJ.c> a(FragmentActivity fragmentActivity, Shareable<VideoDetailsShareable.VideoDetailsParcelable> shareable, QI<VideoDetailsShareable.VideoDetailsParcelable> qi, int i, int i2) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) shareable, "");
        C8632dsu.c((Object) qi, "");
        Single<VideoInfo.Sharing> a = d().a(fragmentActivity, shareable.d().d(), shareable.d().b());
        final SnapchatVideoDetails$buildSnapchatStory$1 snapchatVideoDetails$buildSnapchatStory$1 = new SnapchatVideoDetails$buildSnapchatStory$1(this, shareable, fragmentActivity, qi, i, i2);
        Single<QJ.c> subscribeOn = a.flatMap(new Function() { // from class: o.QW
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource c;
                c = QQ.c(drM.this, obj);
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

    public final QJ.a b(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        float f = i2;
        float f2 = i;
        float f3 = i4;
        float f4 = i3;
        float f5 = f3 / f4;
        if (f / f2 > f5) {
            i7 = (int) (f5 * f2);
        } else {
            i = (int) ((f4 / f3) * f);
            i7 = i2;
        }
        int i8 = (int) (i7 * 0.15d);
        int i9 = i - (((int) (i * 0.2d)) * 2);
        int i10 = (int) (i6 * (i9 / i5));
        return new QJ.a(i9, i10, 0.5f, ((i2 > i7 ? (f - ((i2 - i7) / 2.0f)) - i8 : (i7 - ((i7 - i2) / 2.0f)) - i8) - (i10 / 2.0f)) / f);
    }

    @Override // o.QJ
    @SuppressLint({"CheckResult"})
    /* renamed from: c */
    public void b(FragmentActivity fragmentActivity, VideoDetailsShareable.VideoDetailsParcelable videoDetailsParcelable) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) videoDetailsParcelable, "");
        final SnapchatVideoDetails$prefetchResourcesForShareable$onError$1 snapchatVideoDetails$prefetchResourcesForShareable$onError$1 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.android.sharing.impl.targets.SnapchatVideoDetails$prefetchResourcesForShareable$onError$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                C8632dsu.c((Object) th, "");
                QJ.b bVar = QJ.a;
            }
        };
        Single<VideoInfo.Sharing> observeOn = d().a(fragmentActivity, videoDetailsParcelable.d(), videoDetailsParcelable.b()).subscribeOn(Schedulers.io()).observeOn(Schedulers.io());
        final SnapchatVideoDetails$prefetchResourcesForShareable$1 snapchatVideoDetails$prefetchResourcesForShareable$1 = new SnapchatVideoDetails$prefetchResourcesForShareable$1(snapchatVideoDetails$prefetchResourcesForShareable$onError$1);
        observeOn.subscribe(new Consumer() { // from class: o.QP
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                QQ.b(drM.this, obj);
            }
        }, new Consumer() { // from class: o.QU
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                QQ.h(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
