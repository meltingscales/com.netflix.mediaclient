package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem;
import java.util.Comparator;
import java.util.List;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.AbstractC5164btb;
import o.C0977Jw;
import o.C5641cCy;
import o.C8632dsu;
import o.InterfaceC5125bsp;
import o.cBQ;
import o.cIE;
import o.dpR;

/* renamed from: o.cCy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5641cCy extends AbstractC5765cHn implements InterfaceC5619cCc {
    private final C1204Sr c;
    private final PopupMenu e;

    @Override // o.AbstractC9944zY
    /* renamed from: h */
    public C1204Sr e() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5641cCy(ConstraintLayout constraintLayout) {
        super(constraintLayout);
        C8632dsu.c((Object) constraintLayout, "");
        View e2 = C9703vR.e(constraintLayout, cIE.c.A, 0, 2, null);
        C8632dsu.d(e2);
        this.c = (C1204Sr) e2;
        this.e = new PopupMenu(e().getContext(), e());
        e().setOnClickListener(new View.OnClickListener() { // from class: o.cCC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5641cCy.b(C5641cCy.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5641cCy c5641cCy, View view) {
        C8632dsu.c((Object) c5641cCy, "");
        c5641cCy.e.show();
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        e().setVisibility(0);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        e().setVisibility(8);
    }

    @Override // o.InterfaceC5619cCc
    public void b(String str) {
        C8632dsu.c((Object) str, "");
        e().setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(List<? extends InteractiveDebugMenuItem> list) {
        List c;
        this.e.getMenu().clear();
        c = C8576dqs.c((Iterable) list, (Comparator) new e());
        int i = 0;
        for (Object obj : c) {
            if (i < 0) {
                C8569dql.h();
            }
            final InteractiveDebugMenuItem interactiveDebugMenuItem = (InteractiveDebugMenuItem) obj;
            this.e.getMenu().add(0, i, i, interactiveDebugMenuItem.label()).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.cCD
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean e2;
                    e2 = C5641cCy.e(InteractiveDebugMenuItem.this, this, menuItem);
                    return e2;
                }
            });
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(InteractiveDebugMenuItem interactiveDebugMenuItem, C5641cCy c5641cCy, MenuItem menuItem) {
        C8632dsu.c((Object) interactiveDebugMenuItem, "");
        C8632dsu.c((Object) c5641cCy, "");
        C8632dsu.c((Object) menuItem, "");
        c5641cCy.b((C5641cCy) new cBQ.e(null, null, interactiveDebugMenuItem.segmentId(), true, null, interactiveDebugMenuItem.startTimeMs(), false));
        return true;
    }

    @Override // o.InterfaceC5619cCc
    public void e(final String str) {
        if (str != null) {
            Context context = e().getContext();
            C8632dsu.a(context, "");
            C1645aIz.a((NetflixActivity) C9737vz.e(context, NetflixActivity.class), new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveDebugUIView$fetchDebugMenuItems$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                    c(serviceManager);
                    return dpR.c;
                }

                public final void c(ServiceManager serviceManager) {
                    C8632dsu.c((Object) serviceManager, "");
                    InterfaceC5125bsp j = serviceManager.j();
                    C0977Jw c0977Jw = new C0977Jw(str);
                    final C5641cCy c5641cCy = this;
                    j.b(c0977Jw, new AbstractC5164btb() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.PlayerInteractiveDebugUIView$fetchDebugMenuItems$1.4
                        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
                        public void j(List<? extends InteractiveDebugMenuItem> list, Status status) {
                            C8632dsu.c((Object) status, "");
                            if (list != null) {
                                C5641cCy.this.a(list);
                            }
                        }
                    });
                }
            });
        }
    }

    /* renamed from: o.cCy$e */
    /* loaded from: classes4.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String str;
            int compareValues;
            String id = ((InteractiveDebugMenuItem) t).id();
            String str2 = null;
            if (id != null) {
                C8632dsu.d((Object) id);
                str = id.toLowerCase();
                C8632dsu.a(str, "");
            } else {
                str = null;
            }
            String id2 = ((InteractiveDebugMenuItem) t2).id();
            if (id2 != null) {
                C8632dsu.d((Object) id2);
                str2 = id2.toLowerCase();
                C8632dsu.a(str2, "");
            }
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(str, str2);
            return compareValues;
        }
    }
}
