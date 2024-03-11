package o;

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

/* renamed from: o.aNc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1757aNc {
    void a(List<InterfaceC5222bug<InterfaceC5180btr>> list, Status status);

    void a(InterfaceC5198buI interfaceC5198buI, Status status);

    void a(InterfaceC5227bul interfaceC5227bul, Status status);

    void a(InterfaceC5238buw interfaceC5238buw, Status status);

    void a(InterfaceC5275bvg interfaceC5275bvg, Status status, boolean z);

    void a(boolean z, Status status);

    void b(int i, Status status);

    void b(Status status);

    void b(InteractiveMoments interactiveMoments, Status status);

    void b(StateHistory stateHistory, Status status);

    void b(List<InterfaceC5227bul> list, Status status);

    void b(InterfaceC5157btU interfaceC5157btU, Status status);

    void b(InterfaceC5190buA interfaceC5190buA, Status status);

    void b(InterfaceC5230buo interfaceC5230buo, Boolean bool, Status status);

    void c(NotificationsListSummary notificationsListSummary, Status status);

    void c(List<InterfaceC5184btv> list, Status status);

    void c(InterfaceC5194buE interfaceC5194buE, Status status);

    void d(ListOfMoviesSummary listOfMoviesSummary, List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status);

    void d(List<InterfaceC5222bug<InterfaceC5179btq>> list, Status status);

    void d(InterfaceC5188btz interfaceC5188btz, Status status);

    void d(InterfaceC8366diy interfaceC8366diy, Status status);

    void e(Status status);

    void e(NotificationSummaryItem notificationSummaryItem, Status status);

    void e(List<Advisory> list, Status status);

    void e(Map<String, Boolean> map, Status status);

    void e(InterfaceC5156btT interfaceC5156btT, Status status);

    void e(InterfaceC5194buE interfaceC5194buE, List<InterfaceC5195buF> list, Status status);

    void f(List<InteractiveDebugMenuItem> list, Status status);

    void g(List<NotificationSummaryItem> list, Status status);

    void h(List<LoMo> list, Status status);

    void i(List<InterfaceC5195buF> list, Status status);

    void j(List<GenreItem> list, Status status);

    void k(List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status);

    void l(List<InterfaceC8366diy> list, Status status);

    void n(List<InterfaceC5222bug<InterfaceC5216bua>> list, Status status);
}
