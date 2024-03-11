package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.SelectCommand;
import com.netflix.cl.model.event.session.command.SkipCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.model.survey.Survey;
import com.netflix.model.survey.SurveyQuestion;
import java.util.Map;

/* loaded from: classes4.dex */
public final class cVN extends C1045Mp {
    private static boolean b;
    private static Long c;
    private static Long i;
    public static final cVN e = new cVN();
    private static boolean a = true;
    public static final int d = 8;

    private cVN() {
        super("SurveyCLHelper");
    }

    private final TrackingInfo b(Survey survey) {
        Map b2;
        SurveyQuestion c2 = survey.c();
        b2 = dqD.b(dpD.a("surveyInfo", c2 != null ? c2.m() : null));
        TrackingInfo a2 = CLv2Utils.a(b2);
        C8632dsu.a(a2, "");
        return a2;
    }

    private final TrackingInfo a(Survey survey) {
        Map b2;
        SurveyQuestion c2 = survey.c();
        b2 = dqD.b(dpD.a("surveyIdentifier", c2 != null ? c2.j() : null));
        TrackingInfo a2 = CLv2Utils.a(b2);
        C8632dsu.a(a2, "");
        return a2;
    }

    private final TrackingInfo a(int i2) {
        Map b2;
        b2 = dqD.b(dpD.a("surveyResponse", String.valueOf(i2)));
        TrackingInfo a2 = CLv2Utils.a(b2);
        C8632dsu.a(a2, "");
        return a2;
    }

    public final void d(Survey survey) {
        C8632dsu.c((Object) survey, "");
        getLogTag();
        Logger logger = Logger.INSTANCE;
        c = logger.startSession(new Presentation(AppView.survey, b(survey)));
        AppView appView = AppView.surveyQuestion;
        i = logger.startSession(new Presentation(appView, a(survey)));
        CLv2Utils.c(false, appView, a(survey), null, false);
    }

    public final void b(int i2) {
        getLogTag();
        CLv2Utils.INSTANCE.b(new Focus(AppView.surveyQuestion, a(i2)), (Command) new SelectCommand(), true);
        a = false;
        b = true;
    }

    public final void d() {
        getLogTag();
        CLv2Utils.INSTANCE.b(new Focus(AppView.surveyQuestion, null), (Command) new SkipCommand(), true);
        b = false;
        a = true;
    }

    public final void c() {
        getLogTag();
        if (b) {
            Logger logger = Logger.INSTANCE;
            logger.endSession(i);
            logger.endSession(c);
        } else if (a) {
            Logger logger2 = Logger.INSTANCE;
            logger2.cancelSession(i);
            logger2.cancelSession(c);
        }
        i = null;
        c = null;
    }
}
