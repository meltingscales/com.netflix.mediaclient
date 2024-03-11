package com.netflix.mediaclient.android.sharing.impl.targets;

import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.sharing.impl.targets.InstagramVideoDetails$buildInstagramStory$1;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable;
import com.netflix.model.leafs.VideoInfo;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.io.File;
import kotlin.jvm.internal.Lambda;
import o.AbstractC1153Qs;
import o.C1133Py;
import o.C1140Qf;
import o.C1155Qu;
import o.C1588aGw;
import o.C8632dsu;
import o.QI;
import o.drM;

/* loaded from: classes3.dex */
public final class InstagramVideoDetails$buildInstagramStory$1 extends Lambda implements drM<VideoInfo.Sharing, SingleSource<? extends AbstractC1153Qs.e>> {
    final /* synthetic */ Shareable<VideoDetailsShareable.VideoDetailsParcelable> a;
    final /* synthetic */ int b;
    final /* synthetic */ FragmentActivity c;
    final /* synthetic */ int d;
    final /* synthetic */ QI<VideoDetailsShareable.VideoDetailsParcelable> e;
    final /* synthetic */ C1155Qu g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramVideoDetails$buildInstagramStory$1(C1155Qu c1155Qu, FragmentActivity fragmentActivity, int i, int i2, Shareable<VideoDetailsShareable.VideoDetailsParcelable> shareable, QI<VideoDetailsShareable.VideoDetailsParcelable> qi) {
        super(1);
        this.g = c1155Qu;
        this.c = fragmentActivity;
        this.d = i;
        this.b = i2;
        this.a = shareable;
        this.e = qi;
    }

    @Override // o.drM
    /* renamed from: c */
    public final SingleSource<? extends AbstractC1153Qs.e> invoke(VideoInfo.Sharing sharing) {
        C8632dsu.c((Object) sharing, "");
        if (sharing.getVerticalBillboardUrl() != null && sharing.getTitleLogoUrl() != null) {
            C1133Py a = this.g.a();
            FragmentActivity fragmentActivity = this.c;
            String verticalBillboardUrl = sharing.getVerticalBillboardUrl();
            C8632dsu.a(verticalBillboardUrl, "");
            String titleLogoUrl = sharing.getTitleLogoUrl();
            C8632dsu.a(titleLogoUrl, "");
            Single<File> b = a.b(fragmentActivity, verticalBillboardUrl, titleLogoUrl, this.d, this.b);
            final C1155Qu c1155Qu = this.g;
            final FragmentActivity fragmentActivity2 = this.c;
            final Shareable<VideoDetailsShareable.VideoDetailsParcelable> shareable = this.a;
            final QI<VideoDetailsShareable.VideoDetailsParcelable> qi = this.e;
            final drM<File, AbstractC1153Qs.e> drm = new drM<File, AbstractC1153Qs.e>() { // from class: com.netflix.mediaclient.android.sharing.impl.targets.InstagramVideoDetails$buildInstagramStory$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final AbstractC1153Qs.e invoke(File file) {
                    C8632dsu.c((Object) file, "");
                    return new AbstractC1153Qs.e(C1155Qu.this.d().a(fragmentActivity2, file), null, null, null, shareable.d(C1588aGw.a(fragmentActivity2), qi), 14, null);
                }
            };
            return b.map(new Function() { // from class: o.Qz
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    AbstractC1153Qs.e c;
                    c = InstagramVideoDetails$buildInstagramStory$1.c(drM.this, obj);
                    return c;
                }
            });
        }
        C1133Py a2 = this.g.a();
        FragmentActivity fragmentActivity3 = this.c;
        String boxArtUrl = sharing.getBoxArtUrl();
        C8632dsu.a(boxArtUrl, "");
        Single<File> d = a2.d(fragmentActivity3, boxArtUrl, this.d / 4, this.b / 4);
        C1140Qf d2 = this.g.d();
        String boxArtUrl2 = sharing.getBoxArtUrl();
        C8632dsu.a(boxArtUrl2, "");
        Single<File> e = d2.e(boxArtUrl2);
        final C1155Qu c1155Qu2 = this.g;
        final FragmentActivity fragmentActivity4 = this.c;
        final Shareable<VideoDetailsShareable.VideoDetailsParcelable> shareable2 = this.a;
        final QI<VideoDetailsShareable.VideoDetailsParcelable> qi2 = this.e;
        return Single.zip(d, e, new BiFunction() { // from class: o.QB
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                AbstractC1153Qs.e e2;
                e2 = InstagramVideoDetails$buildInstagramStory$1.e(C1155Qu.this, fragmentActivity4, shareable2, qi2, (File) obj, (File) obj2);
                return e2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1153Qs.e c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (AbstractC1153Qs.e) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1153Qs.e e(C1155Qu c1155Qu, FragmentActivity fragmentActivity, Shareable shareable, QI qi, File file, File file2) {
        C8632dsu.c((Object) c1155Qu, "");
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) shareable, "");
        C8632dsu.c((Object) qi, "");
        C8632dsu.c((Object) file, "");
        C8632dsu.c((Object) file2, "");
        return new AbstractC1153Qs.e(c1155Qu.d().a(fragmentActivity, file), c1155Qu.d().a(fragmentActivity, file2), null, null, shareable.d(C1588aGw.a(fragmentActivity), qi), 12, null);
    }
}
