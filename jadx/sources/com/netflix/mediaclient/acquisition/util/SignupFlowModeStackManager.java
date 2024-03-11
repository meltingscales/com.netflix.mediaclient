package com.netflix.mediaclient.acquisition.util;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C1044Mm;
import o.C8632dsu;
import o.dqE;
import o.duD;

/* loaded from: classes3.dex */
public final class SignupFlowModeStackManager {
    public static final String TAG = "SignupFlowModeStackManager";
    private static FlowMode currentFlowMode;
    private static FlowMode prevFlowMode;
    public static final SignupFlowModeStackManager INSTANCE = new SignupFlowModeStackManager();
    private static Deque<FlowMode> signupFlowModeStack = new ArrayDeque();
    public static final int $stable = 8;

    public final FlowMode getCurrentFlowMode() {
        return currentFlowMode;
    }

    public final FlowMode getPrevFlowMode() {
        return prevFlowMode;
    }

    private SignupFlowModeStackManager() {
    }

    public final FlowMode getPreviousFlowMode() {
        return signupFlowModeStack.peek();
    }

    public final void clearStackAndFlowModes() {
        C1044Mm.e(TAG, "clearStackAndFlowModes");
        signupFlowModeStack.clear();
        prevFlowMode = null;
        currentFlowMode = null;
    }

    public final void updateFlowModes(FlowMode flowMode) {
        if (flowMode != null) {
            INSTANCE.swapFlowModes(flowMode);
        }
    }

    public final FlowMode confirmFlowMode(FlowMode flowMode) {
        boolean e;
        boolean e2;
        C8632dsu.c((Object) flowMode, "");
        FlowMode flowMode2 = prevFlowMode;
        if (flowMode2 == null || C8632dsu.c((Object) flowMode.getMode(), (Object) SignupConstants.Mode.CONFIRM_MEMBERSHIP_STARTED_SIMPLICITY) || C8632dsu.c((Object) flowMode.getMode(), (Object) SignupConstants.Mode.VERIFY_CARD_CONTEXT) || C8632dsu.c((Object) flowMode.getMode(), (Object) flowMode2.getMode())) {
            return flowMode;
        }
        e = duD.e((CharSequence) flowMode.getMode(), (CharSequence) "context", true);
        if (e) {
            e2 = duD.e((CharSequence) flowMode.getMode(), (CharSequence) flowMode2.getMode(), true);
            if (e2) {
                flowMode.getData().put("mode", flowMode2.getMode());
                return new FlowMode(flowMode.getData());
            }
            return flowMode;
        }
        return flowMode;
    }

    public final boolean isUserGoingBack(FlowMode flowMode) {
        C8632dsu.c((Object) flowMode, "");
        return signupFlowModeStack.contains(flowMode);
    }

    public final FlowMode updateMode(String str) {
        Map<String, Object> data;
        C8632dsu.c((Object) str, "");
        FlowMode flowMode = currentFlowMode;
        Map k = (flowMode == null || (data = flowMode.getData()) == null) ? null : dqE.k(data);
        if (k != null) {
            k.put("mode", str);
            return new FlowMode(k);
        }
        return new FlowMode(createFlowModeMap$default(this, null, str, 1, null));
    }

    public static /* synthetic */ Map createFlowModeMap$default(SignupFlowModeStackManager signupFlowModeStackManager, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = SignupConstants.Flow.MOBILE_SIGNUP;
        }
        return signupFlowModeStackManager.createFlowModeMap(str, str2);
    }

    public final Map<String, Object> createFlowModeMap(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("flow", str);
        linkedHashMap.put("mode", str2);
        linkedHashMap.put(SignupConstants.Key.NETFLIX_CLIENT_PLATFORM, SignupConstants.AndroidPlatform.ANDROID_NATIVE);
        return linkedHashMap;
    }

    private final void swapFlowModes(FlowMode flowMode) {
        String mode = flowMode.getMode();
        FlowMode flowMode2 = prevFlowMode;
        String mode2 = flowMode2 != null ? flowMode2.getMode() : null;
        FlowMode flowMode3 = currentFlowMode;
        String mode3 = flowMode3 != null ? flowMode3.getMode() : null;
        C1044Mm.e(TAG, "swapFlowModes: start: flowMode = " + mode + " previousMode = " + mode2 + " currentMode = " + mode3);
        if (isUserGoingBack(flowMode)) {
            C1044Mm.e(TAG, "going backward...");
            handleBackwardFlowNavigation(flowMode);
        } else {
            C1044Mm.e(TAG, "going forward...");
            handleForwardFlowNavigation(flowMode);
        }
        FlowMode flowMode4 = prevFlowMode;
        String mode4 = flowMode4 != null ? flowMode4.getMode() : null;
        FlowMode flowMode5 = currentFlowMode;
        String mode5 = flowMode5 != null ? flowMode5.getMode() : null;
        C1044Mm.e(TAG, "swapFlowModes: end: previousMode = " + mode4 + " currentMode = " + mode5);
    }

    private final void handleForwardFlowNavigation(FlowMode flowMode) {
        FlowMode flowMode2 = currentFlowMode;
        prevFlowMode = flowMode2;
        currentFlowMode = flowMode;
        if (flowMode2 != null) {
            INSTANCE.pushToStack(flowMode2);
        }
    }

    private final void handleBackwardFlowNavigation(FlowMode flowMode) {
        boolean z = false;
        while (!z && !signupFlowModeStack.isEmpty()) {
            FlowMode popFromStack = popFromStack();
            if (popFromStack != null && popFromStack.equals(flowMode)) {
                z = true;
            }
        }
        prevFlowMode = signupFlowModeStack.peek();
        currentFlowMode = flowMode;
    }

    private final void pushToStack(FlowMode flowMode) {
        signupFlowModeStack.push(flowMode);
        String mode = flowMode.getMode();
        C1044Mm.e(TAG, mode + " pushed to stack");
    }

    private final FlowMode popFromStack() {
        FlowMode pop = signupFlowModeStack.pop();
        String mode = pop.getMode();
        C1044Mm.e(TAG, mode + " popped from stack");
        return pop;
    }
}
