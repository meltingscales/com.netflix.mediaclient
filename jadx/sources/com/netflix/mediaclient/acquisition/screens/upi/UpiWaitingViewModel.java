package com.netflix.mediaclient.acquisition.screens.upi;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModel;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import o.C1333Xq;
import o.C8168dfL;
import o.C8632dsu;
import o.InterfaceC1270Vf;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes3.dex */
public final class UpiWaitingViewModel extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final InterfaceC1270Vf clock;
    private final Observable<CharSequence> expirationTimer;
    private final LifecycleData lifecycleData;
    private final Observable<String> loadingMessage;
    private ParsedData parsedData;
    private final CompositeDisposable pollTimerDisposable;

    public final Observable<CharSequence> getExpirationTimer() {
        return this.expirationTimer;
    }

    public final Observable<String> getLoadingMessage() {
        return this.loadingMessage;
    }

    public final void updateParsedData(ParsedData parsedData) {
        C8632dsu.c((Object) parsedData, "");
        this.parsedData = parsedData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpiWaitingViewModel(SignupNetworkManager signupNetworkManager, final StringProvider stringProvider, ErrorMessageViewModel errorMessageViewModel, InterfaceC1270Vf interfaceC1270Vf, ParsedData parsedData, LifecycleData lifecycleData) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        C8632dsu.c((Object) parsedData, "");
        C8632dsu.c((Object) lifecycleData, "");
        this.clock = interfaceC1270Vf;
        this.parsedData = parsedData;
        this.lifecycleData = lifecycleData;
        this.pollTimerDisposable = new CompositeDisposable();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Observable<Long> interval = Observable.interval(0L, 1L, timeUnit);
        final drM<Long, CharSequence> drm = new drM<Long, CharSequence>() { // from class: com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModel$expirationTimer$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public final CharSequence invoke(Long l) {
                InterfaceC1270Vf interfaceC1270Vf2;
                UpiWaitingViewModel.LifecycleData lifecycleData2;
                long expirationInSeconds;
                C8632dsu.c((Object) l, "");
                interfaceC1270Vf2 = UpiWaitingViewModel.this.clock;
                long c = interfaceC1270Vf2.c();
                lifecycleData2 = UpiWaitingViewModel.this.lifecycleData;
                long startTimeMillis = (c - lifecycleData2.getStartTimeMillis()) / 1000;
                expirationInSeconds = UpiWaitingViewModel.this.getExpirationInSeconds();
                long max = Math.max(expirationInSeconds - startTimeMillis, 0L);
                C1333Xq formatter = stringProvider.getFormatter(R.string.label_upi_waiting_expiration_timer);
                String format = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) Math.floor(max / 60.0d)), Long.valueOf(max % 60)}, 2));
                C8632dsu.a(format, "");
                return C8168dfL.c(formatter.d("expirationTime", format).c());
            }
        };
        Observable map = interval.map(new Function() { // from class: com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModel$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                CharSequence expirationTimer$lambda$1;
                expirationTimer$lambda$1 = UpiWaitingViewModel.expirationTimer$lambda$1(drM.this, obj);
                return expirationTimer$lambda$1;
            }
        });
        C8632dsu.a(map, "");
        this.expirationTimer = map;
        Observable<Long> interval2 = Observable.interval(0L, 5L, timeUnit);
        final drM<Long, String> drm2 = new drM<Long, String>() { // from class: com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModel$loadingMessage$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public final String invoke(Long l) {
                C8632dsu.c((Object) l, "");
                return StringProvider.this.getString(new Integer[]{Integer.valueOf(R.string.label_upi_waiting_loading_message_1), Integer.valueOf(R.string.label_upi_waiting_loading_message_2), Integer.valueOf(R.string.label_upi_waiting_loading_message_3)}[((int) l.longValue()) % 3].intValue());
            }
        };
        Observable map2 = interval2.map(new Function() { // from class: com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModel$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String loadingMessage$lambda$2;
                loadingMessage$lambda$2 = UpiWaitingViewModel.loadingMessage$lambda$2(drM.this, obj);
                return loadingMessage$lambda$2;
            }
        });
        C8632dsu.a(map2, "");
        this.loadingMessage = map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getExpirationInSeconds() {
        Long expirationInMinutes = this.parsedData.getExpirationInMinutes();
        if (expirationInMinutes != null) {
            return expirationInMinutes.longValue() * 60;
        }
        return 420L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence expirationTimer$lambda$1(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (CharSequence) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String loadingMessage$lambda$2(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (String) drm.invoke(obj);
    }

    public final void pollNextAction() {
        this.pollTimerDisposable.clear();
        Long pollAfterMs = this.parsedData.getPollAfterMs();
        Observable<Long> timer = Observable.timer(pollAfterMs != null ? pollAfterMs.longValue() : 2000L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread());
        C8632dsu.a(timer, "");
        DisposableKt.addTo(SubscribersKt.subscribeBy$default(timer, (drM) null, (drO) null, new drM<Long, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModel$pollNextAction$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Long l) {
                invoke2(l);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Long l) {
                InterfaceC1270Vf interfaceC1270Vf;
                UpiWaitingViewModel.LifecycleData lifecycleData;
                long expirationInSeconds;
                UpiWaitingViewModel.ParsedData parsedData;
                UpiWaitingViewModel.LifecycleData lifecycleData2;
                UpiWaitingViewModel.ParsedData parsedData2;
                UpiWaitingViewModel.LifecycleData lifecycleData3;
                interfaceC1270Vf = UpiWaitingViewModel.this.clock;
                long c = interfaceC1270Vf.c();
                lifecycleData = UpiWaitingViewModel.this.lifecycleData;
                long startTimeMillis = c - lifecycleData.getStartTimeMillis();
                expirationInSeconds = UpiWaitingViewModel.this.getExpirationInSeconds();
                if (startTimeMillis < expirationInSeconds * 1000) {
                    UpiWaitingViewModel upiWaitingViewModel = UpiWaitingViewModel.this;
                    parsedData2 = upiWaitingViewModel.parsedData;
                    ActionField nextAction = parsedData2.getNextAction();
                    lifecycleData3 = UpiWaitingViewModel.this.lifecycleData;
                    AbstractNetworkViewModel2.performAction$default(upiWaitingViewModel, nextAction, lifecycleData3.getPollLoading(), null, 4, null);
                    return;
                }
                UpiWaitingViewModel upiWaitingViewModel2 = UpiWaitingViewModel.this;
                parsedData = upiWaitingViewModel2.parsedData;
                ActionField skipWaitAction = parsedData.getSkipWaitAction();
                lifecycleData2 = UpiWaitingViewModel.this.lifecycleData;
                AbstractNetworkViewModel2.performAction$default(upiWaitingViewModel2, skipWaitAction, lifecycleData2.getPollLoading(), null, 4, null);
            }
        }, 3, (Object) null), this.pollTimerDisposable);
    }

    public final void clearPollTimer() {
        this.pollTimerDisposable.clear();
    }

    /* loaded from: classes3.dex */
    public static final class LifecycleData extends ViewModel {
        public static final int $stable = 8;
        private final MutableLiveData<Boolean> pollLoading;
        private final long startTimeMillis;

        public final MutableLiveData<Boolean> getPollLoading() {
            return this.pollLoading;
        }

        public final long getStartTimeMillis() {
            return this.startTimeMillis;
        }

        @Inject
        public LifecycleData(InterfaceC1270Vf interfaceC1270Vf) {
            C8632dsu.c((Object) interfaceC1270Vf, "");
            this.startTimeMillis = interfaceC1270Vf.c();
            this.pollLoading = new MutableLiveData<>(Boolean.FALSE);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ParsedData {
        public static final int $stable = 8;
        private final Long expirationInMinutes;
        private final ActionField nextAction;
        private final Long pollAfterMs;
        private final ActionField skipWaitAction;

        public static /* synthetic */ ParsedData copy$default(ParsedData parsedData, Long l, Long l2, ActionField actionField, ActionField actionField2, int i, Object obj) {
            if ((i & 1) != 0) {
                l = parsedData.expirationInMinutes;
            }
            if ((i & 2) != 0) {
                l2 = parsedData.pollAfterMs;
            }
            if ((i & 4) != 0) {
                actionField = parsedData.nextAction;
            }
            if ((i & 8) != 0) {
                actionField2 = parsedData.skipWaitAction;
            }
            return parsedData.copy(l, l2, actionField, actionField2);
        }

        public final Long component1() {
            return this.expirationInMinutes;
        }

        public final Long component2() {
            return this.pollAfterMs;
        }

        public final ActionField component3() {
            return this.nextAction;
        }

        public final ActionField component4() {
            return this.skipWaitAction;
        }

        public final ParsedData copy(Long l, Long l2, ActionField actionField, ActionField actionField2) {
            return new ParsedData(l, l2, actionField, actionField2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ParsedData) {
                ParsedData parsedData = (ParsedData) obj;
                return C8632dsu.c(this.expirationInMinutes, parsedData.expirationInMinutes) && C8632dsu.c(this.pollAfterMs, parsedData.pollAfterMs) && C8632dsu.c(this.nextAction, parsedData.nextAction) && C8632dsu.c(this.skipWaitAction, parsedData.skipWaitAction);
            }
            return false;
        }

        public final Long getExpirationInMinutes() {
            return this.expirationInMinutes;
        }

        public final ActionField getNextAction() {
            return this.nextAction;
        }

        public final Long getPollAfterMs() {
            return this.pollAfterMs;
        }

        public final ActionField getSkipWaitAction() {
            return this.skipWaitAction;
        }

        public int hashCode() {
            Long l = this.expirationInMinutes;
            int hashCode = l == null ? 0 : l.hashCode();
            Long l2 = this.pollAfterMs;
            int hashCode2 = l2 == null ? 0 : l2.hashCode();
            ActionField actionField = this.nextAction;
            int hashCode3 = actionField == null ? 0 : actionField.hashCode();
            ActionField actionField2 = this.skipWaitAction;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (actionField2 != null ? actionField2.hashCode() : 0);
        }

        public String toString() {
            Long l = this.expirationInMinutes;
            Long l2 = this.pollAfterMs;
            ActionField actionField = this.nextAction;
            ActionField actionField2 = this.skipWaitAction;
            return "ParsedData(expirationInMinutes=" + l + ", pollAfterMs=" + l2 + ", nextAction=" + actionField + ", skipWaitAction=" + actionField2 + ")";
        }

        public ParsedData(Long l, Long l2, ActionField actionField, ActionField actionField2) {
            this.expirationInMinutes = l;
            this.pollAfterMs = l2;
            this.nextAction = actionField;
            this.skipWaitAction = actionField2;
        }
    }
}
