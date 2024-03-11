package com.netflix.mediaclient.ui.nux.impl;

import android.view.View;
import android.widget.FrameLayout;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.nux.impl.NewUserExperienceImpl$subscribe$1$4$1;
import kotlin.jvm.internal.Lambda;
import o.AbstractC7196cre;
import o.C7197crf;
import o.C7212cru;
import o.C7214crw;
import o.C8310dhv;
import o.C8632dsu;
import o.drX;

/* loaded from: classes4.dex */
public final class NewUserExperienceImpl$subscribe$1$4$1 extends Lambda implements drX<View, FrameLayout, Boolean> {
    final /* synthetic */ C7197crf d;
    final /* synthetic */ AbstractC7196cre e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewUserExperienceImpl$subscribe$1$4$1(C7197crf c7197crf, AbstractC7196cre abstractC7196cre) {
        super(2);
        this.d = c7197crf;
        this.e = abstractC7196cre;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Boolean invoke(View view, final FrameLayout frameLayout) {
        NetflixActivity netflixActivity;
        float f;
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) frameLayout, "");
        view.getOverlay().clear();
        netflixActivity = this.d.e;
        final C7214crw c7214crw = new C7214crw(netflixActivity, C7212cru.c.d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int[] iArr = new int[2];
        view.getLocationInWindow(r3);
        frameLayout.getLocationInWindow(iArr);
        int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
        if (C8310dhv.a()) {
            f = (-frameLayout.getWidth()) + iArr2[0] + view.getWidth() + ((AbstractC7196cre.e) this.e).d().x;
        } else {
            f = iArr2[0] - ((AbstractC7196cre.e) this.e).d().x;
        }
        c7214crw.setX(f);
        c7214crw.setY(iArr2[1] - ((AbstractC7196cre.e) this.e).d().y);
        c7214crw.setLayoutParams(layoutParams);
        return Boolean.valueOf(frameLayout.postDelayed(new Runnable() { // from class: o.crh
            @Override // java.lang.Runnable
            public final void run() {
                NewUserExperienceImpl$subscribe$1$4$1.d(frameLayout, c7214crw);
            }
        }, 100L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(FrameLayout frameLayout, C7214crw c7214crw) {
        C8632dsu.c((Object) frameLayout, "");
        C8632dsu.c((Object) c7214crw, "");
        frameLayout.addView(c7214crw);
        c7214crw.a();
    }
}
