package com.netflix.mediaclient.acquisition.screens.verifyCard;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.cl.model.event.session.action.Action;
import com.netflix.cl.model.event.session.action.RedeemGiftCard;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.EditPaymentCommand;
import com.netflix.cl.model.event.session.command.StartMembershipCommand;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.services.logging.ClNetworkActionCommandLogger;
import java.util.Map;
import javax.inject.Inject;
import o.C8632dsu;
import o.dqE;
import o.drO;

/* loaded from: classes3.dex */
public final class VerifyCardViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode flowMode;
    private final SignupLogger signupLogger;
    private final SignupNetworkManager signupNetworkManager;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public VerifyCardViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, SignupLogger signupLogger, StringProvider stringProvider, ViewModelProvider.Factory factory, ErrorMessageViewModelInitializer errorMessageViewModelInitializer) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) signupLogger, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        this.flowMode = flowMode;
        this.signupNetworkManager = signupNetworkManager;
        this.signupLogger = signupLogger;
        this.stringProvider = stringProvider;
        this.viewModelProviderFactory = factory;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
    }

    public final VerifyCardViewModel createVerifyCardViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return new VerifyCardViewModel(this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel(), (VerifyCardLifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(VerifyCardLifecycleData.class), new ClNetworkActionCommandLogger(this.signupLogger, new drO<Action>() { // from class: com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardViewModelInitializer$createVerifyCardViewModel$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Action invoke() {
                return new RedeemGiftCard(null, null, null, null);
            }
        }, new drO<Command>() { // from class: com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardViewModelInitializer$createVerifyCardViewModel$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Command invoke() {
                return new StartMembershipCommand();
            }
        }), new ClNetworkActionCommandLogger(this.signupLogger, null, new drO<Command>() { // from class: com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardViewModelInitializer$createVerifyCardViewModel$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Command invoke() {
                return new EditPaymentCommand();
            }
        }, 2, null), this.stringProvider, extractVerifyCardData());
    }

    public final VerifyCardParsedData extractVerifyCardData() {
        StringField stringField;
        StringField stringField2;
        String str;
        ActionField actionField;
        ActionField actionField2;
        boolean z;
        Field field;
        FlowMode flowMode = this.flowMode;
        Object obj = null;
        if (flowMode != null) {
            SignupErrorReporter signupErrorReporter = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = flowMode.getField(SignupConstants.Field.MD);
            if (field2 == null) {
                signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.MD, null);
            } else {
                if (!(field2 instanceof StringField)) {
                    signupErrorReporter.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.MD, null);
                }
                stringField = (StringField) field2;
            }
            field2 = null;
            stringField = (StringField) field2;
        } else {
            stringField = null;
        }
        FlowMode flowMode2 = this.flowMode;
        if (flowMode2 != null) {
            SignupErrorReporter signupErrorReporter2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field3 = flowMode2.getField(SignupConstants.Field.PA_RES);
            if (field3 == null) {
                signupErrorReporter2.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.PA_RES, null);
            } else {
                if (!(field3 instanceof StringField)) {
                    signupErrorReporter2.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.PA_RES, null);
                }
                stringField2 = (StringField) field3;
            }
            field3 = null;
            stringField2 = (StringField) field3;
        } else {
            stringField2 = null;
        }
        FlowMode flowMode3 = this.flowMode;
        if (flowMode3 != null) {
            SignupErrorReporter signupErrorReporter3 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field4 = flowMode3.getField(SignupConstants.Field.ACS_URL);
            Object value = field4 != null ? field4.getValue() : null;
            if (value == null) {
                signupErrorReporter3.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.ACS_URL, null);
            } else {
                if (!(value instanceof String)) {
                    signupErrorReporter3.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.ACS_URL, null);
                }
                str = (String) value;
            }
            value = null;
            str = (String) value;
        } else {
            str = null;
        }
        FlowMode flowMode4 = this.flowMode;
        Object value2 = (flowMode4 == null || (field = flowMode4.getField(SignupConstants.Field.ACS_POST_PARAMS)) == null) ? null : field.getValue();
        Map map = value2 instanceof Map ? (Map) value2 : null;
        if (map == null) {
            map = dqE.d();
        }
        Map map2 = map;
        FlowMode flowMode5 = this.flowMode;
        if (flowMode5 != null) {
            SignupErrorReporter signupErrorReporter4 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field5 = flowMode5.getField(SignupConstants.Action.NEXT_ACTION);
            if (field5 == null) {
                signupErrorReporter4.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Action.NEXT_ACTION, null);
            } else {
                if (!(field5 instanceof ActionField)) {
                    signupErrorReporter4.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Action.NEXT_ACTION, null);
                }
                actionField = (ActionField) field5;
            }
            field5 = null;
            actionField = (ActionField) field5;
        } else {
            actionField = null;
        }
        FlowMode flowMode6 = this.flowMode;
        if (flowMode6 != null) {
            SignupErrorReporter signupErrorReporter5 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field6 = flowMode6.getField(SignupConstants.Action.PREV_ACTION);
            if (field6 == null) {
                signupErrorReporter5.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Action.PREV_ACTION, null);
            } else {
                if (!(field6 instanceof ActionField)) {
                    signupErrorReporter5.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Action.PREV_ACTION, null);
                }
                actionField2 = (ActionField) field6;
            }
            field6 = null;
            actionField2 = (ActionField) field6;
        } else {
            actionField2 = null;
        }
        FlowMode flowMode7 = this.flowMode;
        if (flowMode7 != null) {
            SignupErrorReporter signupErrorReporter6 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field7 = flowMode7.getField(SignupConstants.Field.IS_3DS_CHARGE);
            Object value3 = field7 != null ? field7.getValue() : null;
            if (value3 == null) {
                signupErrorReporter6.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.IS_3DS_CHARGE, null);
            } else if (value3 instanceof Boolean) {
                obj = value3;
            } else {
                signupErrorReporter6.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.IS_3DS_CHARGE, null);
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                z = bool.booleanValue();
                return new VerifyCardParsedData(actionField, actionField2, stringField, stringField2, z, map2, str);
            }
        }
        z = true;
        return new VerifyCardParsedData(actionField, actionField2, stringField, stringField2, z, map2, str);
    }
}
