package com.netflix.mediaclient.acquisition.lib.services.networking;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.MoneyballUpdater;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.Response;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.RequestResponseLogger;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.AUIContextData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballCallData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.C8563dqf;
import o.C8627dsp;
import o.C8632dsu;
import o.aIB;
import o.aMU;
import o.aMX;
import o.dpR;
import o.drM;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SignupNetworkManager {
    public static final Companion Companion = new Companion(null);
    private final MoneyballDataSource moneyballDataSource;
    private final NetworkRequestResponseListener moneyballUpdater;
    private final RequestResponseLogger requestResponseLogger;
    private final aIB serviceManagerRunner;
    private final SignupErrorReporter signupErrorReporter;

    @Inject
    public SignupNetworkManager(aIB aib, SignupErrorReporter signupErrorReporter, RequestResponseLogger requestResponseLogger, @MoneyballUpdater NetworkRequestResponseListener networkRequestResponseListener, MoneyballDataSource moneyballDataSource) {
        C8632dsu.c((Object) aib, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) requestResponseLogger, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        this.serviceManagerRunner = aib;
        this.signupErrorReporter = signupErrorReporter;
        this.requestResponseLogger = requestResponseLogger;
        this.moneyballUpdater = networkRequestResponseListener;
        this.moneyballDataSource = moneyballDataSource;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWarnUserMode(MoneyballData moneyballData) {
            return C8632dsu.c((Object) (moneyballData != null ? moneyballData.getMode() : null), (Object) SignupConstants.Mode.WARN_USER);
        }
    }

    public final void performModeRequest(String str, NetworkRequestResponseListener... networkRequestResponseListenerArr) {
        List u;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) networkRequestResponseListenerArr, "");
        final ArrayList<NetworkRequestResponseListener> arrayList = new ArrayList();
        arrayList.add(this.requestResponseLogger);
        NetworkRequestResponseListener networkRequestResponseListener = this.moneyballUpdater;
        if (networkRequestResponseListener != null) {
            arrayList.add(networkRequestResponseListener);
        }
        u = C8563dqf.u(networkRequestResponseListenerArr);
        arrayList.addAll(u);
        final Request request = new Request(SignupConstants.Flow.SIMPLE_SILVER_SIGN_UP, str, null, null);
        for (NetworkRequestResponseListener networkRequestResponseListener2 : arrayList) {
            networkRequestResponseListener2.onBeforeNetworkAction(request);
        }
        fetchMode(str, new aMX() { // from class: com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager$$ExternalSyntheticLambda1
            @Override // o.aMX
            public final void onDataFetched(MoneyballData moneyballData, Status status, int i) {
                SignupNetworkManager.performModeRequest$lambda$3(SignupNetworkManager.this, request, arrayList, moneyballData, status, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performModeRequest$lambda$3(SignupNetworkManager signupNetworkManager, Request request, List list, MoneyballData moneyballData, Status status, int i) {
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) request, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) status, "");
        signupNetworkManager.handleMoneyballResponse(request, moneyballData, status, i, list);
    }

    public final void performActionRequest(ActionField actionField, String str, NetworkRequestResponseListener... networkRequestResponseListenerArr) {
        List u;
        C8632dsu.c((Object) actionField, "");
        C8632dsu.c((Object) networkRequestResponseListenerArr, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.requestResponseLogger);
        NetworkRequestResponseListener networkRequestResponseListener = this.moneyballUpdater;
        if (networkRequestResponseListener != null) {
            arrayList.add(networkRequestResponseListener);
        }
        u = C8563dqf.u(networkRequestResponseListenerArr);
        arrayList.addAll(u);
        performActionRequest(actionField, str, arrayList);
    }

    protected final void performActionRequest(ActionField actionField, String str, final List<? extends NetworkRequestResponseListener> list) {
        AUIContextData contextData;
        AUIContextData contextData2;
        C8632dsu.c((Object) actionField, "");
        C8632dsu.c((Object) list, "");
        MoneyballData value = this.moneyballDataSource.getLiveMoneyballData().getValue();
        String str2 = null;
        if (actionField.getMode().length() == 0) {
            MoneyballCallData moneyballCallData = new MoneyballCallData(actionField.getFlowMode(), str, actionField);
            String flow = value != null ? value.getFlow() : null;
            String mode = value != null ? value.getMode() : null;
            String id = actionField.getId();
            if (value != null && (contextData2 = value.getContextData()) != null) {
                str2 = contextData2.getMembershipStatus();
            }
            final Request request = new Request(flow, mode, id, str2);
            for (NetworkRequestResponseListener networkRequestResponseListener : list) {
                networkRequestResponseListener.onBeforeNetworkAction(request);
            }
            nextMode(moneyballCallData, new aMX() { // from class: com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager$$ExternalSyntheticLambda2
                @Override // o.aMX
                public final void onDataFetched(MoneyballData moneyballData, Status status, int i) {
                    SignupNetworkManager.performActionRequest$lambda$7(SignupNetworkManager.this, request, list, moneyballData, status, i);
                }
            });
            return;
        }
        String flow2 = actionField.getFlow();
        String mode2 = actionField.getMode();
        String id2 = actionField.getId();
        if (value != null && (contextData = value.getContextData()) != null) {
            str2 = contextData.getMembershipStatus();
        }
        final Request request2 = new Request(flow2, mode2, id2, str2);
        for (NetworkRequestResponseListener networkRequestResponseListener2 : list) {
            networkRequestResponseListener2.onBeforeNetworkAction(request2);
        }
        fetchFlowAndMode(actionField.getFlow().length() == 0 ? actionField.getFlowMode().getFlow() : actionField.getFlow(), actionField.getMode(), new aMX() { // from class: com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager$$ExternalSyntheticLambda3
            @Override // o.aMX
            public final void onDataFetched(MoneyballData moneyballData, Status status, int i) {
                SignupNetworkManager.performActionRequest$lambda$9(SignupNetworkManager.this, request2, list, moneyballData, status, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performActionRequest$lambda$7(SignupNetworkManager signupNetworkManager, Request request, List list, MoneyballData moneyballData, Status status, int i) {
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) request, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) status, "");
        signupNetworkManager.handleMoneyballResponse(request, moneyballData, status, i, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performActionRequest$lambda$9(SignupNetworkManager signupNetworkManager, Request request, List list, MoneyballData moneyballData, Status status, int i) {
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) request, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) status, "");
        signupNetworkManager.handleMoneyballResponse(request, moneyballData, status, i, list);
    }

    public final void performActionRequest(String str, MoneyballCallData moneyballCallData, final List<? extends NetworkRequestResponseListener> list) {
        AUIContextData contextData;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) moneyballCallData, "");
        C8632dsu.c((Object) list, "");
        MoneyballData value = this.moneyballDataSource.getLiveMoneyballData().getValue();
        String str2 = null;
        String flow = value != null ? value.getFlow() : null;
        String mode = value != null ? value.getMode() : null;
        if (value != null && (contextData = value.getContextData()) != null) {
            str2 = contextData.getMembershipStatus();
        }
        final Request request = new Request(flow, mode, str, str2);
        for (NetworkRequestResponseListener networkRequestResponseListener : list) {
            networkRequestResponseListener.onBeforeNetworkAction(request);
        }
        nextMode(moneyballCallData, new aMX() { // from class: com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager$$ExternalSyntheticLambda0
            @Override // o.aMX
            public final void onDataFetched(MoneyballData moneyballData, Status status, int i) {
                SignupNetworkManager.performActionRequest$lambda$11(SignupNetworkManager.this, request, list, moneyballData, status, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performActionRequest$lambda$11(SignupNetworkManager signupNetworkManager, Request request, List list, MoneyballData moneyballData, Status status, int i) {
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) request, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) status, "");
        signupNetworkManager.handleMoneyballResponse(request, moneyballData, status, i, list);
    }

    private final void handleMoneyballResponse(Request request, MoneyballData moneyballData, Status status, int i, List<? extends NetworkRequestResponseListener> list) {
        Response response = new Response(status, i, moneyballData, request, getErrorKeyFromResponse(request.getAction(), moneyballData));
        for (NetworkRequestResponseListener networkRequestResponseListener : list) {
            networkRequestResponseListener.onAfterNetworkAction(response);
        }
    }

    private final String getErrorKeyFromResponse(String str, MoneyballData moneyballData) {
        FlowMode flowMode;
        FlowMode flowMode2;
        String str2 = null;
        if (!Companion.isWarnUserMode(moneyballData)) {
            if (moneyballData == null || (flowMode = moneyballData.getFlowMode()) == null) {
                return null;
            }
            Field field = flowMode.getField("errorCode");
            Object value = field != null ? field.getValue() : null;
            if (value != null && (value instanceof String)) {
                str2 = value;
            }
            return str2;
        }
        if (moneyballData != null && (flowMode2 = moneyballData.getFlowMode()) != null) {
            Field field2 = flowMode2.getField("message");
            Object value2 = field2 != null ? field2.getValue() : null;
            if (value2 != null && (value2 instanceof String)) {
                str2 = value2;
            }
            str2 = str2;
        }
        logErrorResponse(str, str2);
        return str2;
    }

    private final void logErrorResponse(String str, String str2) {
        this.signupErrorReporter.onDataError(SignupConstants.Error.WARN_USER_MODE, str2, new JSONObject().put(SignupConstants.Error.DEBUG_INFO_ACTION, str));
    }

    private final void fetchMode(final String str, final aMX amx) {
        this.serviceManagerRunner.e(new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager$fetchMode$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                invoke2(serviceManager);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                aMU r = serviceManager.r();
                if (r != null) {
                    r.b(str, amx);
                }
            }
        });
    }

    public final void nextMode(final MoneyballCallData moneyballCallData, final aMX amx) {
        C8632dsu.c((Object) moneyballCallData, "");
        C8632dsu.c((Object) amx, "");
        this.serviceManagerRunner.e(new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager$nextMode$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                invoke2(serviceManager);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                aMU r = serviceManager.r();
                if (r != null) {
                    r.a(MoneyballCallData.this, amx);
                }
            }
        });
    }

    public final void fetchFlowAndMode(final String str, final String str2, final aMX amx) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) amx, "");
        this.serviceManagerRunner.e(new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager$fetchFlowAndMode$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                invoke2(serviceManager);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                aMU r = serviceManager.r();
                if (r != null) {
                    r.c(str, str2, amx);
                }
            }
        });
    }

    public final void fetchPhoneCodes(final aMX amx) {
        C8632dsu.c((Object) amx, "");
        this.serviceManagerRunner.e(new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager$fetchPhoneCodes$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                invoke2(serviceManager);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                aMU r = serviceManager.r();
                if (r != null) {
                    r.c(aMX.this);
                }
            }
        });
    }
}
