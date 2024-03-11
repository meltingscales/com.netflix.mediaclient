package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipChoicesResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse;
import com.netflix.model.survey.Survey;
import java.util.List;

/* renamed from: o.bqo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5018bqo {
    void a(Status status, AccountData accountData);

    void a(ResolveSimpleUrlPatternResponse resolveSimpleUrlPatternResponse, Status status);

    void a(UpdateProductChoiceResponse updateProductChoiceResponse, Status status);

    void a(Survey survey, Status status);

    void a(boolean z, Status status);

    void b(Status status);

    void b(String str, Status status);

    void c(Status status);

    void d(MembershipChoicesResponse membershipChoicesResponse, Status status);

    void d(List<AvatarInfo> list, Status status);

    void e(Status status);

    void e(AccountData accountData, Status status);
}
