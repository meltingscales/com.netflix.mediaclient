package o;

import android.os.Handler;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.leafs.ListOfMoviesSummary;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import com.netflix.model.leafs.social.NotificationsListSummary;
import java.util.List;
import java.util.Map;

/* renamed from: o.aNe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1759aNe implements InterfaceC1757aNc {
    private final Handler b;
    private final InterfaceC1757aNc e;

    public C1759aNe(Handler handler, InterfaceC1757aNc interfaceC1757aNc) {
        this.b = handler;
        this.e = interfaceC1757aNc;
    }

    @Override // o.InterfaceC1757aNc
    public void h(final List<LoMo> list, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.11
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.h(list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void d(final List<InterfaceC5222bug<InterfaceC5179btq>> list, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.16
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.d(list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void a(final List<InterfaceC5222bug<InterfaceC5180btr>> list, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.28
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.a(list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void n(final List<InterfaceC5222bug<InterfaceC5216bua>> list, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.27
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.n(list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void k(final List<InterfaceC5222bug<InterfaceC5223buh>> list, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.31
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.k(list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void d(final ListOfMoviesSummary listOfMoviesSummary, final List<InterfaceC5222bug<InterfaceC5223buh>> list, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.35
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.d(listOfMoviesSummary, list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void b(final List<InterfaceC5227bul> list, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.33
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.b(list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void i(final List<InterfaceC5195buF> list, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.34
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.i(list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void e(final InterfaceC5156btT interfaceC5156btT, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.5
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.e(interfaceC5156btT, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void d(final InterfaceC5188btz interfaceC5188btz, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.3
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.d(interfaceC5188btz, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void d(final InterfaceC8366diy interfaceC8366diy, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.4
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.d(interfaceC8366diy, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void a(final InterfaceC5238buw interfaceC5238buw, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.2
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.a(interfaceC5238buw, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void b(final int i, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.1
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.b(i, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void b(final InterfaceC5230buo interfaceC5230buo, final Boolean bool, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.6
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.b(interfaceC5230buo, bool, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void a(final InterfaceC5227bul interfaceC5227bul, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.7
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.a(interfaceC5227bul, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void c(final InterfaceC5194buE interfaceC5194buE, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.10
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.c(interfaceC5194buE, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void e(final InterfaceC5194buE interfaceC5194buE, final List<InterfaceC5195buF> list, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.9
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.e(interfaceC5194buE, list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void j(final List<GenreItem> list, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.8
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.j(list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void b(final InterfaceC5157btU interfaceC5157btU, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.15
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                C1759aNe.this.e.b(interfaceC5157btU, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void e(final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.13
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.e(status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void b(final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.14
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.b(status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void a(final InterfaceC5275bvg interfaceC5275bvg, final Status status, final boolean z) {
        this.b.post(new Runnable() { // from class: o.aNe.12
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.a(interfaceC5275bvg, status, z);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void b(final InterfaceC5190buA interfaceC5190buA, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.19
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.b(interfaceC5190buA, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void c(final NotificationsListSummary notificationsListSummary, final Status status) {
        C8320diE.c(notificationsListSummary);
        this.b.post(new Runnable() { // from class: o.aNe.20
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.c(notificationsListSummary, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void e(final NotificationSummaryItem notificationSummaryItem, final Status status) {
        C8320diE.e(notificationSummaryItem);
        this.b.post(new Runnable() { // from class: o.aNe.17
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.e(notificationSummaryItem, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void g(final List<NotificationSummaryItem> list, final Status status) {
        C8320diE.b(list);
        this.b.post(new Runnable() { // from class: o.aNe.18
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.g(list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void e(final List<Advisory> list, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.24
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.e(list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void e(final Map<String, Boolean> map, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.23
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.e(map, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void l(final List<InterfaceC8366diy> list, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.25
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.l(list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void b(final InteractiveMoments interactiveMoments, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.22
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.b(interactiveMoments, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void f(final List<InteractiveDebugMenuItem> list, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.21
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.f(list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void b(final StateHistory stateHistory, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.26
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.b(stateHistory, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void c(final List<InterfaceC5184btv> list, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.30
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.c(list, status);
            }
        });
    }

    @Override // o.InterfaceC1757aNc
    public void a(final boolean z, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNe.29
            @Override // java.lang.Runnable
            public void run() {
                C1759aNe.this.e.a(z, status);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(InterfaceC5198buI interfaceC5198buI, Status status) {
        this.e.a(interfaceC5198buI, status);
    }

    @Override // o.InterfaceC1757aNc
    public void a(final InterfaceC5198buI interfaceC5198buI, final Status status) {
        this.b.post(new Runnable() { // from class: o.aNf
            @Override // java.lang.Runnable
            public final void run() {
                C1759aNe.this.b(interfaceC5198buI, status);
            }
        });
    }
}
