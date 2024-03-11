package com.netflix.mediaclient.android.sharing.impl.targets;

import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.sharing.impl.types.ExtrasShareable;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import com.netflix.model.leafs.VideoInfo;
import io.reactivex.SingleSource;
import kotlin.jvm.internal.Lambda;
import o.AbstractC1153Qs;
import o.C1149Qo;
import o.C8632dsu;
import o.QI;
import o.drM;

/* loaded from: classes3.dex */
public final class InstagramExtras$buildInstagramStory$1 extends Lambda implements drM<VideoInfo.Sharing, SingleSource<? extends AbstractC1153Qs.e>> {
    final /* synthetic */ QI<ExtrasShareable.ExtrasFeedItemParcelable> a;
    final /* synthetic */ int b;
    final /* synthetic */ FragmentActivity c;
    final /* synthetic */ int d;
    final /* synthetic */ Shareable<ExtrasShareable.ExtrasFeedItemParcelable> e;
    final /* synthetic */ C1149Qo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramExtras$buildInstagramStory$1(Shareable<ExtrasShareable.ExtrasFeedItemParcelable> shareable, C1149Qo c1149Qo, FragmentActivity fragmentActivity, int i, int i2, QI<ExtrasShareable.ExtrasFeedItemParcelable> qi) {
        super(1);
        this.e = shareable;
        this.f = c1149Qo;
        this.c = fragmentActivity;
        this.d = i;
        this.b = i2;
        this.a = qi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
        if (r9 == null) goto L18;
     */
    @Override // o.drM
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.reactivex.SingleSource<? extends o.AbstractC1153Qs.e> invoke(com.netflix.model.leafs.VideoInfo.Sharing r9) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r9, r0)
            com.netflix.mediaclient.android.sharing.impl.types.Shareable<com.netflix.mediaclient.android.sharing.impl.types.ExtrasShareable$ExtrasFeedItemParcelable> r1 = r8.e
            java.lang.Object r1 = r1.d()
            com.netflix.mediaclient.android.sharing.impl.types.ExtrasShareable$ExtrasFeedItemParcelable r1 = (com.netflix.mediaclient.android.sharing.impl.types.ExtrasShareable.ExtrasFeedItemParcelable) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L43
            java.lang.String r1 = r9.getVerticalBillboardUrl()
            if (r1 == 0) goto L43
            java.lang.String r1 = r9.getTitleLogoUrl()
            if (r1 == 0) goto L43
            o.Qs$b r1 = o.AbstractC1153Qs.b
            r1.getLogTag()
            o.Qo r1 = r8.f
            o.Py r2 = r1.a()
            androidx.fragment.app.FragmentActivity r3 = r8.c
            java.lang.String r4 = r9.getVerticalBillboardUrl()
            o.C8632dsu.a(r4, r0)
            java.lang.String r5 = r9.getTitleLogoUrl()
            o.C8632dsu.a(r5, r0)
            int r6 = r8.d
            int r7 = r8.b
            io.reactivex.Single r9 = r2.b(r3, r4, r5, r6, r7)
            goto L8e
        L43:
            com.netflix.mediaclient.android.sharing.impl.types.Shareable<com.netflix.mediaclient.android.sharing.impl.types.ExtrasShareable$ExtrasFeedItemParcelable> r0 = r8.e
            java.lang.Object r0 = r0.d()
            com.netflix.mediaclient.android.sharing.impl.types.ExtrasShareable$ExtrasFeedItemParcelable r0 = (com.netflix.mediaclient.android.sharing.impl.types.ExtrasShareable.ExtrasFeedItemParcelable) r0
            java.lang.String r0 = r0.e()
            if (r0 != 0) goto L55
            java.lang.String r0 = r9.getBoxArtUrl()
        L55:
            java.lang.String r3 = r9.getTitleLogoUrl()
            if (r3 == 0) goto L76
            o.Qo r9 = r8.f
            androidx.fragment.app.FragmentActivity r2 = r8.c
            int r5 = r8.d
            int r6 = r8.b
            o.Qs$b r1 = o.AbstractC1153Qs.b
            r1.getLogTag()
            o.Py r1 = r9.a()
            o.C8632dsu.d(r0)
            r4 = r0
            io.reactivex.Single r9 = r1.c(r2, r3, r4, r5, r6)
            if (r9 != 0) goto L8e
        L76:
            o.Qo r9 = r8.f
            androidx.fragment.app.FragmentActivity r1 = r8.c
            int r2 = r8.d
            int r3 = r8.b
            o.Qs$b r4 = o.AbstractC1153Qs.b
            r4.getLogTag()
            o.Py r9 = r9.a()
            o.C8632dsu.d(r0)
            io.reactivex.Single r9 = r9.e(r1, r0, r2, r3)
        L8e:
            o.Qx r0 = new o.Qx
            com.netflix.mediaclient.android.sharing.impl.targets.InstagramExtras$buildInstagramStory$1$4 r1 = new com.netflix.mediaclient.android.sharing.impl.targets.InstagramExtras$buildInstagramStory$1$4
            o.Qo r2 = r8.f
            androidx.fragment.app.FragmentActivity r3 = r8.c
            com.netflix.mediaclient.android.sharing.impl.types.Shareable<com.netflix.mediaclient.android.sharing.impl.types.ExtrasShareable$ExtrasFeedItemParcelable> r4 = r8.e
            o.QI<com.netflix.mediaclient.android.sharing.impl.types.ExtrasShareable$ExtrasFeedItemParcelable> r5 = r8.a
            r1.<init>()
            r0.<init>()
            io.reactivex.Single r9 = r9.map(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.android.sharing.impl.targets.InstagramExtras$buildInstagramStory$1.invoke(com.netflix.model.leafs.VideoInfo$Sharing):io.reactivex.SingleSource");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1153Qs.e b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (AbstractC1153Qs.e) drm.invoke(obj);
    }
}
