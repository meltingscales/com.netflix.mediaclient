package com.netflix.mediaclient.android.sharing.impl.targets;

import android.graphics.Rect;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.sharing.impl.targets.SnapchatVideoDetails$buildSnapchatStory$1;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable;
import com.netflix.model.leafs.VideoInfo;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import java.io.File;
import kotlin.jvm.internal.Lambda;
import o.C1133Py;
import o.C1140Qf;
import o.C1588aGw;
import o.C8632dsu;
import o.QI;
import o.QJ;
import o.QQ;
import o.drM;

/* loaded from: classes3.dex */
public final class SnapchatVideoDetails$buildSnapchatStory$1 extends Lambda implements drM<VideoInfo.Sharing, SingleSource<? extends QJ.c>> {
    final /* synthetic */ Shareable<VideoDetailsShareable.VideoDetailsParcelable> a;
    final /* synthetic */ QI<VideoDetailsShareable.VideoDetailsParcelable> b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ FragmentActivity e;
    final /* synthetic */ QQ i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapchatVideoDetails$buildSnapchatStory$1(QQ qq, Shareable<VideoDetailsShareable.VideoDetailsParcelable> shareable, FragmentActivity fragmentActivity, QI<VideoDetailsShareable.VideoDetailsParcelable> qi, int i, int i2) {
        super(1);
        this.i = qq;
        this.a = shareable;
        this.e = fragmentActivity;
        this.b = qi;
        this.d = i;
        this.c = i2;
    }

    @Override // o.drM
    /* renamed from: b */
    public final SingleSource<? extends QJ.c> invoke(VideoInfo.Sharing sharing) {
        C8632dsu.c((Object) sharing, "");
        final String b = this.i.b(this.a.d(C1588aGw.a(this.e), this.b));
        if (sharing.getVerticalBillboardUrl() != null && sharing.getTitleLogoUrl() != null) {
            C1133Py c = this.i.c();
            FragmentActivity fragmentActivity = this.e;
            String verticalBillboardUrl = sharing.getVerticalBillboardUrl();
            C8632dsu.a(verticalBillboardUrl, "");
            Single<File> c2 = c.c(fragmentActivity, verticalBillboardUrl, 720, 1280);
            C1140Qf d = this.i.d();
            String titleLogoUrl = sharing.getTitleLogoUrl();
            C8632dsu.a(titleLogoUrl, "");
            Single<File> e = d.e(titleLogoUrl);
            final QQ qq = this.i;
            final FragmentActivity fragmentActivity2 = this.e;
            final int i = this.d;
            final int i2 = this.c;
            return Single.zip(c2, e, new BiFunction() { // from class: o.QS
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    QJ.c e2;
                    e2 = SnapchatVideoDetails$buildSnapchatStory$1.e(QQ.this, fragmentActivity2, i, i2, b, (File) obj, (File) obj2);
                    return e2;
                }
            });
        }
        Rect b2 = this.i.c().b(this.d, this.c, 720, 1280);
        C1133Py c3 = this.i.c();
        FragmentActivity fragmentActivity3 = this.e;
        String boxArtUrl = sharing.getBoxArtUrl();
        C8632dsu.a(boxArtUrl, "");
        Single<File> d2 = c3.d(fragmentActivity3, boxArtUrl, b2.width(), b2.height());
        C1140Qf d3 = this.i.d();
        String boxArtUrl2 = sharing.getBoxArtUrl();
        C8632dsu.a(boxArtUrl2, "");
        Single<File> e2 = d3.e(boxArtUrl2);
        final QQ qq2 = this.i;
        final FragmentActivity fragmentActivity4 = this.e;
        final int i3 = this.d;
        final int i4 = this.c;
        return Single.zip(d2, e2, new BiFunction() { // from class: o.QT
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                QJ.c d4;
                d4 = SnapchatVideoDetails$buildSnapchatStory$1.d(QQ.this, fragmentActivity4, i3, i4, b, (File) obj, (File) obj2);
                return d4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QJ.c e(QQ qq, FragmentActivity fragmentActivity, int i, int i2, String str, File file, File file2) {
        C8632dsu.c((Object) qq, "");
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) file, "");
        C8632dsu.c((Object) file2, "");
        Uri a = qq.d().a(fragmentActivity, file);
        Rect a2 = qq.c().a(a);
        Uri a3 = qq.d().a(fragmentActivity, file2);
        Rect a4 = qq.c().a(a3);
        return new QJ.c(a, a3, qq.b(i, i2, a2.width(), a2.height(), a4.width(), a4.height()), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QJ.c d(QQ qq, FragmentActivity fragmentActivity, int i, int i2, String str, File file, File file2) {
        C8632dsu.c((Object) qq, "");
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) file, "");
        C8632dsu.c((Object) file2, "");
        return new QJ.c(qq.d().a(fragmentActivity, file), qq.d().a(fragmentActivity, file2), new QJ.a((int) (i * 0.7f), (int) (i2 * 0.7f), 0.5f, 0.5f), str);
    }
}
