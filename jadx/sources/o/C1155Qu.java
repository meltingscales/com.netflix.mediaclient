package o;

import android.annotation.SuppressLint;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.sharing.impl.targets.InstagramVideoDetails$buildInstagramStory$1;
import com.netflix.mediaclient.android.sharing.impl.targets.InstagramVideoDetails$prefetchResourcesForShareable$1;
import com.netflix.mediaclient.android.sharing.impl.targets.InstagramVideoDetails$prefetchResourcesForShareable$onError$1;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable;
import com.netflix.model.leafs.VideoInfo;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import o.AbstractC1153Qs;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.Qu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1155Qu extends AbstractC1153Qs<VideoDetailsShareable.VideoDetailsParcelable> {
    public C1155Qu() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C1155Qu(o.C1140Qf r1, o.C1133Py r2, int r3, o.C8627dsp r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: o.C1155Qu.<init>(o.Qf, o.Py, int, o.dsp):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1155Qu(C1140Qf c1140Qf, C1133Py c1133Py) {
        super(c1140Qf, c1133Py);
        C8632dsu.c((Object) c1140Qf, "");
        C8632dsu.c((Object) c1133Py, "");
    }

    @Override // o.AbstractC1153Qs
    public Single<AbstractC1153Qs.e> b(FragmentActivity fragmentActivity, Shareable<VideoDetailsShareable.VideoDetailsParcelable> shareable, QI<VideoDetailsShareable.VideoDetailsParcelable> qi, int i, int i2) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) shareable, "");
        C8632dsu.c((Object) qi, "");
        Single<VideoInfo.Sharing> a = d().a(fragmentActivity, shareable.d().d(), shareable.d().b());
        final InstagramVideoDetails$buildInstagramStory$1 instagramVideoDetails$buildInstagramStory$1 = new InstagramVideoDetails$buildInstagramStory$1(this, fragmentActivity, i, i2, shareable, qi);
        Single<AbstractC1153Qs.e> subscribeOn = a.flatMap(new Function() { // from class: o.Qy
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource c;
                c = C1155Qu.c(drM.this, obj);
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

    @Override // o.AbstractC1153Qs
    @SuppressLint({"CheckResult"})
    /* renamed from: d */
    public void e(FragmentActivity fragmentActivity, VideoDetailsShareable.VideoDetailsParcelable videoDetailsParcelable) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) videoDetailsParcelable, "");
        final InstagramVideoDetails$prefetchResourcesForShareable$onError$1 instagramVideoDetails$prefetchResourcesForShareable$onError$1 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.android.sharing.impl.targets.InstagramVideoDetails$prefetchResourcesForShareable$onError$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                e(th);
                return dpR.c;
            }

            public final void e(Throwable th) {
                C8632dsu.c((Object) th, "");
                AbstractC1153Qs.b bVar = AbstractC1153Qs.b;
            }
        };
        Single<VideoInfo.Sharing> observeOn = d().a(fragmentActivity, videoDetailsParcelable.d(), videoDetailsParcelable.b()).subscribeOn(Schedulers.io()).observeOn(Schedulers.io());
        final InstagramVideoDetails$prefetchResourcesForShareable$1 instagramVideoDetails$prefetchResourcesForShareable$1 = new InstagramVideoDetails$prefetchResourcesForShareable$1(instagramVideoDetails$prefetchResourcesForShareable$onError$1);
        observeOn.subscribe(new Consumer() { // from class: o.Qw
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1155Qu.a(drM.this, obj);
            }
        }, new Consumer() { // from class: o.Qv
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1155Qu.f(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
