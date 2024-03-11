package o;

import android.app.Activity;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import o.AbstractC2914ap;
import o.AbstractC3073as;
import o.C2755am;
import o.C6717cia;
import o.C8632dsu;
import o.C9726vo;
import o.InterfaceC4255bb;
import o.bTX;
import o.bTY;
import o.dpR;

/* loaded from: classes4.dex */
public final class bTY implements C6717cia.a {
    public static final e c = new e(null);
    private final drO<bTX> b;
    private final drO<AbstractC2914ap> d;
    private Parcelable e;

    @Override // o.C6717cia.a
    public void b() {
        this.e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bTY(drO<bTX> dro, drO<? extends AbstractC2914ap> dro2) {
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dro2, "");
        this.b = dro;
        this.d = dro2;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("GamesMiniPlayerOrientationBehaviour");
        }
    }

    @Override // o.C6717cia.a
    public void e(Fragment fragment, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        bTX invoke = this.b.invoke();
        if (invoke != null) {
            RecyclerView.LayoutManager layoutManager = invoke.getLayoutManager();
            if (layoutManager != null) {
                C8632dsu.a(layoutManager, "");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) C9726vo.d(layoutManager, LinearLayoutManager.class);
                Parcelable parcelable = this.e;
                if (parcelable != null) {
                    linearLayoutManager.onRestoreInstanceState(parcelable);
                    this.e = null;
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        FragmentActivity requireActivity = fragment.requireActivity();
        C8632dsu.a(requireActivity, "");
        ((NetflixActivity) C9726vo.d(requireActivity, NetflixActivity.class)).showActionAndBottomBars();
        e(false);
    }

    @Override // o.C6717cia.a
    public void b(Fragment fragment, final MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C9726vo.d(this.b.invoke(), this.d.invoke(), new drX<bTX, AbstractC2914ap, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMiniPlayerOrientationBehaviour$onLandscape$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(bTX btx, AbstractC2914ap abstractC2914ap) {
                a(btx, abstractC2914ap);
                return dpR.c;
            }

            public final void a(bTX btx, AbstractC2914ap abstractC2914ap) {
                C8632dsu.c((Object) btx, "");
                C8632dsu.c((Object) abstractC2914ap, "");
                RecyclerView.LayoutManager layoutManager = btx.getLayoutManager();
                if (layoutManager != null) {
                    C8632dsu.a(layoutManager, "");
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) C9726vo.d(layoutManager, LinearLayoutManager.class);
                    bTY.this.e = linearLayoutManager.onSaveInstanceState();
                    abstractC2914ap.addModelBuildListener(new a(abstractC2914ap, miniPlayerVideoGroupViewModel, linearLayoutManager));
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }

            /* loaded from: classes4.dex */
            public static final class a implements InterfaceC4255bb {
                final /* synthetic */ MiniPlayerVideoGroupViewModel a;
                final /* synthetic */ AbstractC2914ap d;
                final /* synthetic */ LinearLayoutManager e;

                a(AbstractC2914ap abstractC2914ap, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, LinearLayoutManager linearLayoutManager) {
                    this.d = abstractC2914ap;
                    this.a = miniPlayerVideoGroupViewModel;
                    this.e = linearLayoutManager;
                }

                @Override // o.InterfaceC4255bb
                public void b(C2755am c2755am) {
                    C8632dsu.c((Object) c2755am, "");
                    AbstractC3073as<?> c = this.d.getAdapter().c(this.a.e());
                    if (c != null) {
                        this.d.removeModelBuildListener(this);
                        int c2 = this.d.getAdapter().c(c);
                        if (c2 >= 0) {
                            this.e.scrollToPositionWithOffset(c2, 0);
                        }
                    }
                }
            }
        });
        FragmentActivity requireActivity = fragment.requireActivity();
        C8632dsu.a(requireActivity, "");
        ((NetflixActivity) C9726vo.d(requireActivity, NetflixActivity.class)).hideActionAndBottomBars();
        e(true);
    }

    @Override // o.C6717cia.a
    public boolean b(Activity activity, int i) {
        C8632dsu.c((Object) activity, "");
        bTX invoke = this.b.invoke();
        return invoke != null && invoke.getScrollState() == 0;
    }

    private final void e(boolean z) {
        bTX invoke = this.b.invoke();
        if (invoke == null) {
            return;
        }
        invoke.setScrollingLocked(z);
    }
}
