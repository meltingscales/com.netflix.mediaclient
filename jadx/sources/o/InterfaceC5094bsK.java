package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipChoicesResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.leafs.ListOfMoviesSummary;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import com.netflix.model.leafs.social.NotificationsListSummary;
import com.netflix.model.survey.Survey;
import java.util.List;

/* renamed from: o.bsK  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5094bsK {
    void a(Status status);

    void a(Survey survey, Status status);

    void a(String str, String str2, long j, long j2, Status status);

    void a(List<InterfaceC5222bug<InterfaceC5179btq>> list, Status status);

    void a(InterfaceC5194buE interfaceC5194buE, List<InterfaceC5195buF> list, Status status);

    void a(InterfaceC5230buo interfaceC5230buo, Boolean bool, Status status);

    void a(boolean z, Status status);

    void b(Status status);

    void b(AccountData accountData, Status status);

    void b(String str, Status status);

    void b(String str, String str2, Status status);

    void b(List<InterfaceC5222bug<InterfaceC5180btr>> list, Status status);

    void b(InterfaceC5157btU interfaceC5157btU, Status status);

    void b(InterfaceC5190buA interfaceC5190buA, Status status);

    void c(int i, Status status);

    void c(Status status);

    void c(MembershipChoicesResponse membershipChoicesResponse, Status status);

    void c(UpdateProductChoiceResponse updateProductChoiceResponse, Status status);

    void c(NotificationSummaryItem notificationSummaryItem, Status status);

    void c(List<Advisory> list, Status status);

    void c(InterfaceC5275bvg interfaceC5275bvg, Status status, boolean z);

    void d(Status status);

    void d(Status status, AccountData accountData);

    void d(ResolveSimpleUrlPatternResponse resolveSimpleUrlPatternResponse, Status status);

    void d(ListOfMoviesSummary listOfMoviesSummary, List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status);

    void d(InteractiveMoments interactiveMoments, Status status);

    void d(StateHistory stateHistory, Status status);

    void d(NotificationsListSummary notificationsListSummary, Status status);

    void d(List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status);

    void d(InterfaceC5198buI interfaceC5198buI, Status status);

    void d(InterfaceC5223buh interfaceC5223buh, Status status);

    void d(InterfaceC5238buw interfaceC5238buw, Status status);

    void e(List<InterfaceC5222bug<InterfaceC5216bua>> list, Status status);

    void e(InterfaceC5156btT interfaceC5156btT, Status status);

    void e(InterfaceC5194buE interfaceC5194buE, Status status);

    void e(InterfaceC5227bul interfaceC5227bul, Status status);

    void e(InterfaceC8366diy interfaceC8366diy, Status status);

    void f(List<InterfaceC5184btv> list, Status status);

    void g(List<AvatarInfo> list, Status status);

    void h(List<InterfaceC5227bul> list, Status status);

    void i(List<GenreItem> list, Status status);

    void j(List<InteractiveDebugMenuItem> list, Status status);

    void k(List<InterfaceC5195buF> list, Status status);

    void l(List<NotificationSummaryItem> list, Status status);

    void n(List<InterfaceC8366diy> list, Status status);

    void o(List<LoMo> list, Status status);
}
