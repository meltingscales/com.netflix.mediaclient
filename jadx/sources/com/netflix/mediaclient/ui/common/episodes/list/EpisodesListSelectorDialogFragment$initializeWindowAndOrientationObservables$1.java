package com.netflix.mediaclient.ui.common.episodes.list;

import android.view.View;
import android.view.Window;
import com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorDialogFragment$initializeWindowAndOrientationObservables$1;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.C9618tM;
import o.C9935zP;
import o.bEL;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes4.dex */
public final class EpisodesListSelectorDialogFragment$initializeWindowAndOrientationObservables$1 extends Lambda implements drX<Window, View, Disposable> {
    final /* synthetic */ EpisodesListSelectorDialogFragment e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpisodesListSelectorDialogFragment$initializeWindowAndOrientationObservables$1(EpisodesListSelectorDialogFragment episodesListSelectorDialogFragment) {
        super(2);
        this.e = episodesListSelectorDialogFragment;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Disposable invoke(final Window window, View view) {
        C9935zP c9935zP;
        PublishSubject publishSubject;
        C8632dsu.c((Object) window, "");
        C8632dsu.c((Object) view, "");
        c9935zP = this.e.h;
        c9935zP.b(bEL.class, new bEL.d(window, view.getContext().getResources().getConfiguration().orientation));
        Observable<Integer> e = C9618tM.e(view);
        publishSubject = this.e.e;
        Observable<Integer> distinctUntilChanged = e.takeUntil(publishSubject).distinctUntilChanged();
        final EpisodesListSelectorDialogFragment episodesListSelectorDialogFragment = this.e;
        final drM<Integer, dpR> drm = new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorDialogFragment$initializeWindowAndOrientationObservables$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                d(num);
                return dpR.c;
            }

            public final void d(Integer num) {
                C9935zP c9935zP2;
                c9935zP2 = EpisodesListSelectorDialogFragment.this.h;
                Window window2 = window;
                C8632dsu.a(window2, "");
                C8632dsu.d(num);
                c9935zP2.b(bEL.class, new bEL.e(window2, num.intValue()));
            }
        };
        return distinctUntilChanged.subscribe(new Consumer() { // from class: o.bEl
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EpisodesListSelectorDialogFragment$initializeWindowAndOrientationObservables$1.d(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
