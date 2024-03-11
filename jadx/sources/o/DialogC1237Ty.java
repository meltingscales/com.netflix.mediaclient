package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.android.widget.selectionsdialog.SelectionEpoxyController;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.CompletableSubject;
import java.util.List;
import o.C1180Rt;
import o.C8632dsu;
import o.DialogC1237Ty;
import o.RG;
import o.bEU;
import o.dpR;

/* renamed from: o.Ty  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class DialogC1237Ty extends Dialog implements View.OnClickListener {
    private RG b;
    private Disposable c;
    private bEU e;
    private final TE f;
    private final AbstractC1224Tl<? extends Object> g;
    private final boolean h;
    private final CompletableSubject i;
    public static final a d = new a(null);
    public static final int a = 8;

    public final AbstractC1224Tl<? extends Object> e() {
        return this.g;
    }

    public /* synthetic */ DialogC1237Ty(Context context, AbstractC1224Tl abstractC1224Tl, TE te, boolean z, CompletableSubject completableSubject, int i, C8627dsp c8627dsp) {
        this(context, abstractC1224Tl, (i & 4) != 0 ? null : te, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : completableSubject);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC1237Ty(Context context, AbstractC1224Tl<? extends Object> abstractC1224Tl, TE te, boolean z, CompletableSubject completableSubject) {
        super(context, com.netflix.mediaclient.ui.R.l.b);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) abstractC1224Tl, "");
        this.g = abstractC1224Tl;
        this.f = te;
        this.h = z;
        this.i = completableSubject;
    }

    /* renamed from: o.Ty$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final Completable d(final Context context, final AbstractC1224Tl<? extends Object> abstractC1224Tl, final TE te, final boolean z) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) abstractC1224Tl, "");
            final CompletableSubject create = CompletableSubject.create();
            C8632dsu.a(create, "");
            final drM<Disposable, dpR> drm = new drM<Disposable, dpR>() { // from class: com.netflix.mediaclient.android.widget.selectionsdialog.SelectionsDialog$Companion$create$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Disposable disposable) {
                    a(disposable);
                    return dpR.c;
                }

                public final void a(Disposable disposable) {
                    new DialogC1237Ty(context, abstractC1224Tl, te, z, create).show();
                }
            };
            Completable doOnSubscribe = create.doOnSubscribe(new Consumer() { // from class: o.TC
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DialogC1237Ty.a.b(drM.this, obj);
                }
            });
            C8632dsu.a(doOnSubscribe, "");
            return doOnSubscribe;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            drm.invoke(obj);
        }
    }

    private final bEU d() {
        bEU beu = this.e;
        if (beu != null) {
            return beu;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bEU a2 = bEU.a(getLayoutInflater());
        FrameLayout a3 = a2.a();
        C8632dsu.a(a3, "");
        setContentView(a3);
        a2.a.setOnClickListener(this);
        this.e = a2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C8632dsu.c((Object) view, "");
        if (view.getId() == com.netflix.mediaclient.ui.R.g.az) {
            TE te = this.f;
            if (te != null) {
                te.b();
            }
            dismiss();
            if (this.h) {
                this.g.h();
            }
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        final SelectionEpoxyController selectionEpoxyController = new SelectionEpoxyController(this.f, new drO<dpR>() { // from class: com.netflix.mediaclient.android.widget.selectionsdialog.SelectionsDialog$show$selectionEpoxyController$1
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                DialogC1237Ty.this.dismiss();
            }
        });
        d().d.setAdapter(selectionEpoxyController.getAdapter());
        RecyclerView.LayoutManager layoutManager = d().d.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(this.g.j());
        }
        if (C8067ddQ.c()) {
            d().d.setTag(com.netflix.mediaclient.ui.R.g.fD, this.g);
        }
        this.b = new RG(d().c, new C1180Rt.d() { // from class: o.TF
            @Override // o.C1180Rt.d
            public final void e() {
                DialogC1237Ty.d(DialogC1237Ty.this, selectionEpoxyController);
            }
        });
        d(selectionEpoxyController, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DialogC1237Ty dialogC1237Ty, SelectionEpoxyController selectionEpoxyController) {
        C8632dsu.c((Object) dialogC1237Ty, "");
        C8632dsu.c((Object) selectionEpoxyController, "");
        dialogC1237Ty.d(selectionEpoxyController, true);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        CompletableSubject completableSubject = this.i;
        if (completableSubject != null) {
            completableSubject.onComplete();
        }
        Disposable disposable = this.c;
        if (disposable != null) {
            disposable.dispose();
        }
        super.dismiss();
    }

    private final void d(final SelectionEpoxyController selectionEpoxyController, boolean z) {
        RG rg = this.b;
        if (rg == null) {
            C8632dsu.d("");
            rg = null;
        }
        rg.a(true);
        Disposable disposable = this.c;
        if (disposable != null) {
            disposable.dispose();
        }
        this.c = SubscribersKt.subscribeBy$default(this.g.d(z), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.android.widget.selectionsdialog.SelectionsDialog$loadData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                d(th);
                return dpR.c;
            }

            public final void d(Throwable th) {
                bEU beu;
                RG rg2;
                C8632dsu.c((Object) th, "");
                SelectionEpoxyController.this.setData(this.e());
                beu = this.e;
                if (beu != null) {
                    DialogC1237Ty dialogC1237Ty = this;
                    beu.d.setVisibility(8);
                    rg2 = dialogC1237Ty.b;
                    if (rg2 == null) {
                        C8632dsu.d("");
                        rg2 = null;
                    }
                    rg2.c(false);
                }
            }
        }, (drO) null, new drM<?, dpR>() { // from class: com.netflix.mediaclient.android.widget.selectionsdialog.SelectionsDialog$loadData$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Object obj) {
                e((List) obj);
                return dpR.c;
            }

            public final void e(List<? extends Object> list) {
                bEU beu;
                RG rg2;
                RG rg3;
                C8632dsu.c((Object) list, "");
                beu = DialogC1237Ty.this.e;
                if (beu != null) {
                    SelectionEpoxyController selectionEpoxyController2 = selectionEpoxyController;
                    DialogC1237Ty dialogC1237Ty = DialogC1237Ty.this;
                    selectionEpoxyController2.setData(dialogC1237Ty.e());
                    RG rg4 = null;
                    if (dialogC1237Ty.e().a() > 0) {
                        rg3 = dialogC1237Ty.b;
                        if (rg3 == null) {
                            C8632dsu.d("");
                        } else {
                            rg4 = rg3;
                        }
                        rg4.b(false);
                        beu.d.setVisibility(0);
                        return;
                    }
                    beu.d.setVisibility(8);
                    rg2 = dialogC1237Ty.b;
                    if (rg2 == null) {
                        C8632dsu.d("");
                    } else {
                        rg4 = rg2;
                    }
                    rg4.c(false);
                }
            }
        }, 2, (Object) null);
    }
}
