package o;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import com.netflix.model.survey.Survey;
import java.util.Collections;
import java.util.List;

/* renamed from: o.bqU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C4998bqU extends AbstractC1900aSk<Survey> {
    private final InterfaceC4986bqI d;

    @Override // o.AbstractC1902aSm
    public boolean h() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4998bqU(Context context, NetflixDataRequest.Transport transport, InterfaceC4986bqI interfaceC4986bqI) {
        super(context, transport, "FetchSurveyRequest");
        this.d = interfaceC4986bqI;
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        return Collections.singletonList("[\"survey_get\"]");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: b */
    public Survey e(String str, String str2) {
        JsonObject e = C0946Ir.e("FetchSurveyRequest", str);
        if (!C8118deO.e(e) && !C8118deO.e(e.getAsJsonObject("survey_get"))) {
            return (Survey) C8118deO.e(e, "survey_get", (Class<Object>) Survey.class);
        }
        return Survey.a();
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        InterfaceC4986bqI interfaceC4986bqI = this.d;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.e((Survey) null, status);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: e */
    public void b(Survey survey) {
        InterfaceC4986bqI interfaceC4986bqI = this.d;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.e(survey, InterfaceC1078Nw.aJ);
        }
    }
}
