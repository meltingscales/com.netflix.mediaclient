package o;

import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.model.survey.Survey;

/* renamed from: o.bXv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4143bXv extends AbstractC4140bXs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4143bXv(C4141bXt c4141bXt) {
        super(c4141bXt);
    }

    @Override // o.AbstractC4140bXs
    public boolean a() {
        NetflixActivity netflixActivity = (NetflixActivity) e();
        return (AccessibilityUtils.a(NetflixApplication.getInstance()) || netflixActivity == null || !cVF.c(netflixActivity)) ? false : true;
    }

    @Override // o.AbstractC4140bXs
    public boolean b() {
        NetflixActivity netflixActivity = (NetflixActivity) e();
        if (netflixActivity == null) {
            return false;
        }
        netflixActivity.getServiceManager().a(new AbstractC5164btb() { // from class: o.bXv.3
            @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
            public void a(Survey survey, Status status) {
                if (C4143bXv.this.e() == null || !status.j() || survey == null || survey.d()) {
                    return;
                }
                cVF.a(C4143bXv.this.e(), survey);
            }
        });
        return true;
    }
}
