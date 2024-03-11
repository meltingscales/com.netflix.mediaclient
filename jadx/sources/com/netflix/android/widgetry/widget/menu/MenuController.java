package com.netflix.android.widgetry.widget.menu;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.widget.menu.MenuController;
import com.netflix.mediaclient.ui.R;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import o.AbstractC2914ap;
import o.C1332Xp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9930zK;
import o.bKU;
import o.dpR;
import o.drM;

/* loaded from: classes2.dex */
public abstract class MenuController<T> extends AbstractC2914ap {
    public static final int $stable = 8;
    private final drM<View, dpR> dismissClickListener;
    private final Observable<dpR> dismissClicks;
    private final PublishSubject<dpR> dismissSubject;
    private final PublishSubject<T> itemClickSubject;
    private final Observable<T> itemClicks;
    private final CharSequence title;

    public MenuController() {
        this(null, 1, null);
    }

    public abstract void addItems();

    public final drM<View, dpR> getDismissClickListener() {
        return this.dismissClickListener;
    }

    public final Observable<dpR> getDismissClicks() {
        return this.dismissClicks;
    }

    public final PublishSubject<dpR> getDismissSubject() {
        return this.dismissSubject;
    }

    public final PublishSubject<T> getItemClickSubject() {
        return this.itemClickSubject;
    }

    public final Observable<T> getItemClicks() {
        return this.itemClicks;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public MenuController(CharSequence charSequence) {
        this.title = charSequence;
        PublishSubject<T> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.itemClickSubject = create;
        PublishSubject<dpR> create2 = PublishSubject.create();
        C8632dsu.a(create2, "");
        this.dismissSubject = create2;
        C8632dsu.d(create);
        this.itemClicks = create;
        C8632dsu.d(create2);
        this.dismissClicks = create2;
        this.dismissClickListener = new drM<View, dpR>(this) { // from class: com.netflix.android.widgetry.widget.menu.MenuController$dismissClickListener$1
            final /* synthetic */ MenuController<T> c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.c = this;
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(View view) {
                c(view);
                return dpR.c;
            }

            public final void c(View view) {
                C8632dsu.c((Object) view, "");
                this.c.getDismissSubject().onNext(dpR.c);
            }
        };
    }

    public /* synthetic */ MenuController(CharSequence charSequence, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : charSequence);
    }

    @Override // o.AbstractC2914ap
    public void buildModels() {
        addHeaders();
        addItems();
        addFooters();
    }

    @Override // o.AbstractC2914ap
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setContentDescription(this.title);
        recyclerView.announceForAccessibility(recyclerView.getContentDescription());
    }

    public void addHeaders() {
        C9930zK b = new C9930zK().a((CharSequence) "menuTitle").b(this.title);
        C1332Xp c1332Xp = C1332Xp.b;
        C9930zK c = b.c((int) TypedValue.applyDimension(1, 90, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        final drM<View, dpR> drm = this.dismissClickListener;
        add(c.e(new View.OnClickListener() { // from class: o.zt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuController.addHeaders$lambda$0(drM.this, view);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addHeaders$lambda$0(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    public void addFooters() {
        bKU d = new bKU().d((CharSequence) "menuBottomPadding");
        C1332Xp c1332Xp = C1332Xp.b;
        bKU a = d.a(Integer.valueOf(((Context) C1332Xp.b(Context.class)).getResources().getDimensionPixelSize(R.b.R)));
        final drM<View, dpR> drm = this.dismissClickListener;
        add(a.d(new View.OnClickListener() { // from class: o.zw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuController.addFooters$lambda$1(drM.this, view);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addFooters$lambda$1(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }
}
