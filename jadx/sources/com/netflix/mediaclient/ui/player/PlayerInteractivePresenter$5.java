package com.netflix.mediaclient.ui.player;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.SelectCommand;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$5;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.C7557cyU;
import o.C8632dsu;
import o.cBA;
import o.dpR;
import o.drM;
import o.duD;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class PlayerInteractivePresenter$5 extends Lambda implements drM<cBA, dpR> {
    final /* synthetic */ C7557cyU c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerInteractivePresenter$5(C7557cyU c7557cyU) {
        super(1);
        this.c = c7557cyU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject b(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject d(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject f(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        return jSONObject;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(cBA cba) {
        a(cba);
        return dpR.c;
    }

    public final void a(cBA cba) {
        Choice choice;
        String e;
        Long l;
        Long l2;
        String optionType;
        boolean e2;
        List<Choice> choices;
        Object obj;
        InteractiveMoments interactiveMoments;
        PlayerControls playerControls;
        PlayerControls.ChoicePointsMetadata choicePointsMetadata;
        Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> choicePoints;
        PlayerControls.ChoicePointsMetadata.ChoicePoint choicePoint;
        Long startTimeMs;
        if (cba instanceof cBA.C5553o) {
            cBA.C5553o c5553o = (cBA.C5553o) cba;
            this.c.d(c5553o.d());
            this.c.e(c5553o.d());
        } else if (cba instanceof cBA.ay) {
            final JSONObject jSONObject = new JSONObject();
            String c = ((cBA.ay) cba).c();
            if (c != null) {
                try {
                    jSONObject.put("viewableId", Integer.parseInt(c));
                } catch (NumberFormatException unused) {
                    jSONObject.put("viewableId", c);
                }
            }
            Logger.INSTANCE.logEvent(new Selected(AppView.ixTriviaShareButton, null, CommandValue.ShareCommand, new TrackingInfo() { // from class: o.cyZ
                @Override // com.netflix.cl.model.JsonSerializer
                public final JSONObject toJSONObject() {
                    JSONObject b;
                    b = PlayerInteractivePresenter$5.b(JSONObject.this);
                    return b;
                }
            }));
        } else if (C8632dsu.c(cba, cBA.ao.d)) {
            this.c.g();
        } else if (C8632dsu.c(cba, cBA.T.b)) {
            this.c.f();
        } else if (cba instanceof cBA.ai) {
            this.c.o();
        } else if (cba instanceof cBA.C5547i) {
            cBA.C5547i c5547i = (cBA.C5547i) cba;
            String type = c5547i.a().type();
            int hashCode = type.hashCode();
            if (hashCode == 109254796) {
                if (type.equals(Moment.TYPE.SCENE)) {
                    this.c.c(c5547i.b(), c5547i.a());
                }
            } else if (hashCode == 595233003 && type.equals(Moment.TYPE.NOTIFICATION)) {
                this.c.d(c5547i.b(), c5547i.a());
            }
        } else if ((cba instanceof cBA.C5559u) || (cba instanceof cBA.C5550l)) {
            this.c.h();
            this.c.i();
        } else if (C8632dsu.c(cba, cBA.E.e) || C8632dsu.c(cba, cBA.C5541c.c)) {
            this.c.h();
        } else if (C8632dsu.c(cba, cBA.C5548j.d)) {
            this.c.o();
        } else if (cba instanceof cBA.G) {
            final JSONObject jSONObject2 = new JSONObject();
            cBA.G g = (cBA.G) cba;
            if (g.d()) {
                jSONObject2.put("segmentId", g.e());
                jSONObject2.put(SignupConstants.Field.LANG_ID, g.e());
                interactiveMoments = this.c.h;
                if (interactiveMoments != null && (playerControls = interactiveMoments.playerControls()) != null && (choicePointsMetadata = playerControls.choicePointsMetadata()) != null && (choicePoints = choicePointsMetadata.choicePoints()) != null && (choicePoint = choicePoints.get(g.e())) != null && (startTimeMs = choicePoint.startTimeMs()) != null) {
                    jSONObject2.put("startTimeMs", startTimeMs.longValue());
                }
                Logger logger = Logger.INSTANCE;
                Long startSession = logger.startSession(new Focus(AppView.ikoChoicePointUnlocked, new TrackingInfo() { // from class: o.czd
                    @Override // com.netflix.cl.model.JsonSerializer
                    public final JSONObject toJSONObject() {
                        JSONObject f;
                        f = PlayerInteractivePresenter$5.f(JSONObject.this);
                        return f;
                    }
                }));
                Long startSession2 = logger.startSession(new SelectCommand());
                if (startSession2 != null) {
                    logger.endSession(Long.valueOf(startSession2.longValue()));
                }
                logger.endSession(startSession);
                return;
            }
            Moment a = g.a();
            if (a == null || (choices = a.choices()) == null) {
                choice = null;
            } else {
                Iterator<T> it = choices.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Choice choice2 = (Choice) obj;
                    if (choice2 != null && (C8632dsu.c((Object) choice2.id(), (Object) g.c()) || C8632dsu.c((Object) choice2.segmentId(), (Object) g.e()))) {
                        break;
                    }
                }
                choice = (Choice) obj;
            }
            final Moment a2 = g.a();
            if (a2 != null) {
                final C7557cyU c7557cyU = this.c;
                String subType = a2.subType();
                C8632dsu.a(subType, "");
                e2 = duD.e((CharSequence) subType, (CharSequence) "trivia", true);
                if (e2) {
                    Logger.INSTANCE.logEvent(new Selected(AppView.ixTriviaQuestion, null, CommandValue.AnswerTriviaQuestionsCommand, new TrackingInfo() { // from class: o.czc
                        @Override // com.netflix.cl.model.JsonSerializer
                        public final JSONObject toJSONObject() {
                            JSONObject b;
                            b = PlayerInteractivePresenter$5.b(C7557cyU.this, a2);
                            return b;
                        }
                    }));
                }
            }
            String e3 = g.e();
            if (e3 == null) {
                e3 = choice != null ? choice.segmentId() : null;
            }
            if (e3 != null) {
                jSONObject2.put("segmentId", e3);
            }
            if (choice == null || (e = choice.id()) == null) {
                e = g.e();
            }
            if (e != null) {
                jSONObject2.put(SignupConstants.Field.LANG_ID, e);
            }
            if (g.b() != null) {
                jSONObject2.put("code", g.b());
            }
            if (choice != null && (optionType = choice.optionType()) != null) {
                jSONObject2.put("optionType", optionType);
            }
            if (e3 != null) {
                Logger logger2 = Logger.INSTANCE;
                Long startSession3 = logger2.startSession(new Focus(AppView.ikoChoicePointOption, new TrackingInfo() { // from class: o.cze
                    @Override // com.netflix.cl.model.JsonSerializer
                    public final JSONObject toJSONObject() {
                        JSONObject d;
                        d = PlayerInteractivePresenter$5.d(JSONObject.this);
                        return d;
                    }
                }));
                if (!g.h()) {
                    l = this.c.c;
                    if (l != null) {
                        C7557cyU c7557cyU2 = this.c;
                        long longValue = l.longValue();
                        C7557cyU.d.getLogTag();
                        logger2.endSession(Long.valueOf(longValue));
                        c7557cyU2.c = null;
                    }
                } else {
                    Long startSession4 = logger2.startSession(new SelectCommand());
                    l2 = this.c.c;
                    if (l2 != null) {
                        C7557cyU c7557cyU3 = this.c;
                        long longValue2 = l2.longValue();
                        C7557cyU.d.getLogTag();
                        logger2.cancelSession(Long.valueOf(longValue2));
                        c7557cyU3.c = null;
                    }
                    if (startSession4 != null) {
                        logger2.endSession(Long.valueOf(startSession4.longValue()));
                    }
                }
                logger2.endSession(startSession3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject b(C7557cyU c7557cyU, Moment moment) {
        JSONObject c;
        C8632dsu.c((Object) c7557cyU, "");
        C8632dsu.c((Object) moment, "");
        c = c7557cyU.c(moment);
        return c;
    }
}
