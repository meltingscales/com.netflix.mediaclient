package com.netflix.android.widgetry.widget.menu;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.widget.menu.MenuDialogFragment$loadController$2;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.Lambda;
import o.AbstractC9971zz;
import o.C8632dsu;
import o.C9726vo;
import o.dpR;
import o.drM;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class MenuDialogFragment$loadController$2<T> extends Lambda implements drM<MenuController<T>, dpR> {
    final /* synthetic */ AbstractC9971zz<T> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuDialogFragment$loadController$2(AbstractC9971zz<T> abstractC9971zz) {
        super(1);
        this.c = abstractC9971zz;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(Object obj) {
        d((MenuController) obj);
        return dpR.c;
    }

    public final void d(MenuController<T> menuController) {
        ViewGroup.LayoutParams layoutParams;
        Integer num;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        ImageButton imageButton;
        PublishSubject<T> publishSubject;
        boolean z;
        RecyclerView recyclerView4;
        this.c.f();
        ((AbstractC9971zz) this.c).f = menuController;
        layoutParams = ((AbstractC9971zz) this.c).r;
        RecyclerView recyclerView5 = null;
        if (layoutParams != null) {
            recyclerView4 = ((AbstractC9971zz) this.c).s;
            if (recyclerView4 == null) {
                C8632dsu.d("");
                recyclerView4 = null;
            }
            recyclerView4.setLayoutParams(layoutParams);
        }
        Context context = this.c.getContext();
        num = ((AbstractC9971zz) this.c).p;
        final AbstractC9971zz<T> abstractC9971zz = this.c;
        C9726vo.d(context, num, new drX<Context, Integer, dpR>() { // from class: com.netflix.android.widgetry.widget.menu.MenuDialogFragment$loadController$2.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Context context2, Integer num2) {
                d(context2, num2.intValue());
                return dpR.c;
            }

            public final void d(Context context2, int i) {
                RecyclerView recyclerView6;
                C8632dsu.c((Object) context2, "");
                recyclerView6 = ((AbstractC9971zz) abstractC9971zz).s;
                if (recyclerView6 == null) {
                    C8632dsu.d("");
                    recyclerView6 = null;
                }
                recyclerView6.setBackground(context2.getDrawable(i));
            }
        });
        recyclerView = ((AbstractC9971zz) this.c).s;
        if (recyclerView == null) {
            C8632dsu.d("");
            recyclerView = null;
        }
        recyclerView.setItemAnimator(null);
        recyclerView2 = ((AbstractC9971zz) this.c).s;
        if (recyclerView2 == null) {
            C8632dsu.d("");
            recyclerView2 = null;
        }
        recyclerView2.setVisibility(0);
        recyclerView3 = ((AbstractC9971zz) this.c).s;
        if (recyclerView3 == null) {
            C8632dsu.d("");
        } else {
            recyclerView5 = recyclerView3;
        }
        recyclerView5.setAdapter(menuController.getAdapter());
        imageButton = ((AbstractC9971zz) this.c).h;
        if (imageButton != null) {
            imageButton.setVisibility(0);
        }
        AbstractC9971zz<T> abstractC9971zz2 = this.c;
        Observable<T> itemClicks = menuController.getItemClicks();
        publishSubject = ((AbstractC9971zz) this.c).t;
        z = ((AbstractC9971zz) this.c).k;
        ((AbstractC9971zz) abstractC9971zz2).a = abstractC9971zz2.a(itemClicks, publishSubject, z);
        AbstractC9971zz<T> abstractC9971zz3 = this.c;
        Observable<dpR> take = menuController.getDismissClicks().take(1L);
        final AbstractC9971zz<T> abstractC9971zz4 = this.c;
        final drM<dpR, dpR> drm = new drM<dpR, dpR>() { // from class: com.netflix.android.widgetry.widget.menu.MenuDialogFragment$loadController$2.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(dpR dpr) {
                abstractC9971zz4.dismiss();
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(dpR dpr) {
                a(dpr);
                return dpR.c;
            }
        };
        ((AbstractC9971zz) abstractC9971zz3).m = take.subscribe(new Consumer() { // from class: o.zD
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MenuDialogFragment$loadController$2.a(drM.this, obj);
            }
        });
        menuController.requestModelBuild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
