package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipChoicesResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import com.netflix.model.survey.Survey;
import java.util.List;

/* renamed from: o.bqI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4986bqI {
    void a(Status status);

    void a(MembershipChoicesResponse membershipChoicesResponse, Status status);

    void a(ResolveSimpleUrlPatternResponse resolveSimpleUrlPatternResponse, Status status);

    void a(UpdateProductChoiceResponse updateProductChoiceResponse, Status status);

    void b(AuthCookieHolder authCookieHolder, Status status);

    void b(String str, Status status);

    void b(boolean z, Status status);

    void c(Status status);

    void c(AccountData accountData, Status status);

    void d(List<AvatarInfo> list, Status status);

    void d(C1569aGd c1569aGd, Status status);

    void e(AccountData accountData, Status status);

    void e(Survey survey, Status status);

    void e(InterfaceC5283bvo interfaceC5283bvo, Status status);
}
