package o;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import o.C6691ciA;
import o.C6717cia;

/* loaded from: classes4.dex */
public abstract class bPV implements C6717cia.a {
    public static final c b = new c(null);
    private final drM<Activity, RecyclerView> c;
    private Parcelable d;
    private final Rect e;

    @Override // o.C6717cia.a
    public void b() {
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bPV(drM<? super Activity, ? extends RecyclerView> drm) {
        C8632dsu.c((Object) drm, "");
        this.c = drm;
        this.e = new Rect();
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("MiniPlayerOrientationBehaviourForMediaCarousel");
        }
    }

    @Override // o.C6717cia.a
    public void e(Fragment fragment, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        drM<Activity, RecyclerView> drm = this.c;
        FragmentActivity requireActivity = fragment.requireActivity();
        C8632dsu.a(requireActivity, "");
        RecyclerView invoke = drm.invoke(requireActivity);
        if (invoke != null) {
            RecyclerView.LayoutManager layoutManager = invoke.getLayoutManager();
            if (layoutManager != null) {
                C8632dsu.a(layoutManager, "");
                GridLayoutManager gridLayoutManager = (GridLayoutManager) C9726vo.d(layoutManager, GridLayoutManager.class);
                Parcelable parcelable = this.d;
                if (parcelable != null) {
                    gridLayoutManager.onRestoreInstanceState(parcelable);
                    this.d = null;
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        FragmentActivity requireActivity2 = fragment.requireActivity();
        C8632dsu.a(requireActivity2, "");
        ((NetflixActivity) C9726vo.d(requireActivity2, NetflixActivity.class)).showActionAndBottomBars();
    }

    @Override // o.C6717cia.a
    public void b(Fragment fragment, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
        RecyclerView.ViewHolder findContainingViewHolder;
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        drM<Activity, RecyclerView> drm = this.c;
        FragmentActivity requireActivity = fragment.requireActivity();
        C8632dsu.a(requireActivity, "");
        RecyclerView invoke = drm.invoke(requireActivity);
        if (invoke != null) {
            RecyclerView.LayoutManager layoutManager = invoke.getLayoutManager();
            if (layoutManager != null) {
                C8632dsu.a(layoutManager, "");
                GridLayoutManager gridLayoutManager = (GridLayoutManager) C9726vo.d(layoutManager, GridLayoutManager.class);
                View findContainingItemView = invoke.findContainingItemView((C3947bQo) invoke.findViewById(com.netflix.mediaclient.ui.R.g.ca));
                ViewGroup viewGroup = findContainingItemView instanceof ViewGroup ? (ViewGroup) findContainingItemView : null;
                int absoluteAdapterPosition = (viewGroup == null || (findContainingViewHolder = invoke.findContainingViewHolder(viewGroup)) == null) ? 0 : findContainingViewHolder.getAbsoluteAdapterPosition();
                View findViewById = viewGroup != null ? viewGroup.findViewById(C6691ciA.d.l) : null;
                if (findViewById != null) {
                    this.d = gridLayoutManager.onSaveInstanceState();
                    this.e.setEmpty();
                    findViewById.getDrawingRect(this.e);
                    viewGroup.offsetDescendantRectToMyCoords(findViewById, this.e);
                    gridLayoutManager.scrollToPositionWithOffset(absoluteAdapterPosition, -this.e.top);
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        FragmentActivity requireActivity2 = fragment.requireActivity();
        C8632dsu.a(requireActivity2, "");
        ((NetflixActivity) C9726vo.d(requireActivity2, NetflixActivity.class)).hideActionAndBottomBars();
    }

    @Override // o.C6717cia.a
    public boolean b(Activity activity, int i) {
        C8632dsu.c((Object) activity, "");
        RecyclerView invoke = this.c.invoke(activity);
        return invoke != null && invoke.getScrollState() == 0;
    }
}
