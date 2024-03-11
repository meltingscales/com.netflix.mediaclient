package com.netflix.mediaclient.clutils;

import com.google.android.gms.tasks.Task;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.GestureInputKind;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.context.CLContext;
import com.netflix.cl.model.context.GestureInput;
import com.netflix.cl.model.context.Volume;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.cl.model.event.discrete.VolumeChanged;
import com.netflix.cl.model.event.discrete.experimentation.FlexEvent;
import com.netflix.cl.model.event.session.DebugSession;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.action.Navigate;
import com.netflix.cl.model.event.session.command.BackCommand;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.SkipAheadCommand;
import com.netflix.cl.model.event.session.command.SkipBackCommand;
import com.netflix.cl.model.event.session.command.android.SystemBackCommand;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.util.PlayContext;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C1044Mm;
import o.C1277Vm;
import o.C1332Xp;
import o.C1596aHd;
import o.InterfaceC1276Vl;
import o.InterfaceC1598aHf;
import o.InterfaceC5088bsE;
import o.InterfaceC5281bvm;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public enum CLv2Utils {
    INSTANCE;
    
    private static boolean d = false;
    private static String e = "CLv2Utils";

    public static String a(Error error) {
        if (error == null) {
            return null;
        }
        try {
            return error.toJSONObject().toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void d(Command command) {
        if (command == null) {
            return;
        }
        Logger logger = Logger.INSTANCE;
        logger.endSession(logger.startSession(command));
    }

    public static void d() {
        d(new BackCommand());
    }

    public static void b() {
        d(new SystemBackCommand());
    }

    @Deprecated
    public static void d(boolean z, String str, InterfaceC5281bvm interfaceC5281bvm, String str2, String str3, JSONObject jSONObject, CLContext cLContext, int i, AppView appView) {
        try {
            if (str2 != null) {
                b(z, appView, new C1277Vm(str, interfaceC5281bvm, Integer.parseInt(str2), str3, i, System.currentTimeMillis(), jSONObject), cLContext);
            } else {
                b(z, appView, new C1277Vm(str, interfaceC5281bvm, 0, null, i, System.currentTimeMillis(), jSONObject), cLContext);
            }
        } catch (NumberFormatException | JSONException e2) {
            if (!(e2 instanceof NumberFormatException) || d) {
                return;
            }
            InterfaceC1598aHf.a(new C1596aHd("Invalid video id format : " + str2 + " found in " + interfaceC5281bvm).b(false));
            d = true;
        }
    }

    public static void c(boolean z, String str, InterfaceC5281bvm interfaceC5281bvm, List<String> list, List<String> list2, JSONObject jSONObject, CLContext cLContext, int i, AppView appView) {
        if (list != null) {
            int i2 = 0;
            int i3 = i;
            while (i2 < list.size()) {
                d(z, str, interfaceC5281bvm, list.get(i2), (list2 == null || list2.size() <= i2) ? null : list2.get(i2), jSONObject, cLContext, i3, appView);
                i3++;
                i2++;
            }
            return;
        }
        d(z, str, interfaceC5281bvm, null, null, jSONObject, cLContext, i, appView);
    }

    public static void c(boolean z, AppView appView, TrackingInfo trackingInfo, CLContext cLContext, boolean z2) {
        if (cLContext != null) {
            Logger.INSTANCE.addContext(cLContext);
        }
        Logger logger = Logger.INSTANCE;
        logger.logEvent(new Presented(appView, Boolean.valueOf(z), trackingInfo));
        if (cLContext != null) {
            logger.removeContext(Long.valueOf(cLContext.getId()));
        }
    }

    public static void b(boolean z, AppView appView, TrackingInfo trackingInfo, CLContext cLContext) {
        c(z, appView, trackingInfo, cLContext, true);
    }

    public static TrackingInfo b(final JSONObject jSONObject) {
        return new TrackingInfo() { // from class: com.netflix.mediaclient.clutils.CLv2Utils.3
            @Override // com.netflix.cl.model.JsonSerializer
            public JSONObject toJSONObject() {
                JSONObject jSONObject2 = JSONObject.this;
                return jSONObject2 != null ? jSONObject2 : new JSONObject();
            }
        };
    }

    public static TrackingInfo a(final Map<String, Object> map) {
        return new TrackingInfo() { // from class: com.netflix.mediaclient.clutils.CLv2Utils.2
            @Override // com.netflix.cl.model.JsonSerializer
            public JSONObject toJSONObject() {
                if (map != null) {
                    return new JSONObject(map);
                }
                return null;
            }
        };
    }

    public static TrackingInfo e(final String str) {
        return new TrackingInfo() { // from class: o.Vg
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject a;
                a = CLv2Utils.a(str);
                return a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject a(String str) {
        if (str != null) {
            return new JSONObject(str);
        }
        return null;
    }

    public void b(AppView appView, CommandValue commandValue, TrackingInfo trackingInfo) {
        synchronized (this) {
            Logger.INSTANCE.startSession(new Navigate(appView, null, commandValue, trackingInfo));
        }
    }

    @Deprecated
    public void e(Focus focus, Command command) {
        synchronized (this) {
            b(focus, command, false);
        }
    }

    @Deprecated
    public void b(Focus focus, Command command, boolean z) {
        synchronized (this) {
            e(focus, command, z, null);
        }
    }

    public void d(AppView appView, CommandValue commandValue, TrackingInfo trackingInfo, Focus focus, Command command, boolean z, Runnable runnable) {
        synchronized (this) {
            Long l = null;
            Long startSession = focus == null ? null : Logger.INSTANCE.startSession(focus);
            if (command != null) {
                l = Logger.INSTANCE.startSession(command);
            }
            if (z) {
                b(appView, commandValue, trackingInfo);
            }
            if (runnable != null) {
                runnable.run();
            }
            Logger logger = Logger.INSTANCE;
            logger.endSession(l);
            logger.endSession(startSession);
        }
    }

    private void e(Focus focus, Command command, boolean z, Runnable runnable) {
        synchronized (this) {
            Logger logger = Logger.INSTANCE;
            Long startSession = logger.startSession(focus);
            Long startSession2 = logger.startSession(command);
            if (z) {
                ((InterfaceC1276Vl) C1332Xp.b(InterfaceC1276Vl.class)).c();
            }
            if (runnable != null) {
                runnable.run();
            }
            logger.endSession(startSession2);
            logger.endSession(startSession);
        }
    }

    public void b(Focus focus, boolean z, boolean z2) {
        synchronized (this) {
            Logger logger = Logger.INSTANCE;
            long addContext = logger.addContext(new GestureInput(z2 ? GestureInputKind.doubleTap : GestureInputKind.tap, Double.valueOf(1.0d)));
            Long startSession = logger.startSession(focus);
            logger.endSession(logger.startSession(z ? new SkipBackCommand() : new SkipAheadCommand()));
            logger.endSession(startSession);
            logger.removeContext(Long.valueOf(addContext));
        }
    }

    public TrackingInfo d(String str, PlayContext playContext) {
        HashMap hashMap = new HashMap(6);
        hashMap.put(SignupConstants.Field.VIDEO_ID, Integer.valueOf(Integer.parseInt(str, 10)));
        if (playContext != null) {
            hashMap.put(Payload.PARAM_RENO_REQUEST_ID, playContext.getRequestId());
            if (playContext.getListId() != null) {
                hashMap.put("listId", playContext.getListId());
            }
            hashMap.put("trackId", Integer.valueOf(playContext.getTrackId()));
            hashMap.put("row", Integer.valueOf(playContext.getListPos()));
            hashMap.put("rank", Integer.valueOf(playContext.i()));
        }
        return a(hashMap);
    }

    public TrackingInfo d(Integer num, String str, Integer num2, Integer num3) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("trackId", num);
        hashMap.put(SignupConstants.Field.VIDEO_ID, Integer.valueOf(Integer.parseInt(str, 10)));
        if (num2 != null) {
            hashMap.put("row", num2);
        }
        if (num3 != null) {
            hashMap.put("rank", num3);
        }
        return a(hashMap);
    }

    public static void e(Long l, String str, Task task) {
        if (task == null) {
            ExtLogger.INSTANCE.failedAction(l, d(str, (Throwable) null));
        } else if (task.isSuccessful()) {
            Logger.INSTANCE.endSession(l);
        } else if (task.isCanceled()) {
            Logger.INSTANCE.cancelSession(l);
        } else {
            ExtLogger.INSTANCE.failedAction(l, d(str, task.getException()));
        }
    }

    public static void c(Long l, String str, Task task) {
        if (task == null) {
            ExtLogger.INSTANCE.failedAction(l, d(str, (Throwable) null));
        } else if (task.isSuccessful()) {
            Logger.INSTANCE.endSession(l);
        } else if (task.isCanceled()) {
            Logger.INSTANCE.cancelSession(l);
        } else {
            ExtLogger.INSTANCE.failedAction(l, d(str, task.getException()));
        }
    }

    public static TrackingInfo b(final TrackingInfo trackingInfo, final boolean z) {
        try {
            if (trackingInfo.toJSONObject() == null) {
                InterfaceC1598aHf.a("SPY-18265: inputTrackingInfo.toJSONObject() is null");
            }
        } catch (JSONException e2) {
            InterfaceC1598aHf.e("SPY-18265: JSONException", e2);
        }
        return new TrackingInfo() { // from class: o.Vi
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject d2;
                d2 = CLv2Utils.d(TrackingInfo.this, z);
                return d2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject d(TrackingInfo trackingInfo, boolean z) {
        return trackingInfo.toJSONObject().put("isUIAutoPlay", z);
    }

    public static void d(double d2, boolean z) {
        Volume volume = new Volume(Boolean.valueOf(z), Double.valueOf(d2));
        Logger logger = Logger.INSTANCE;
        logger.addContext(volume);
        logger.logEvent(new VolumeChanged());
        logger.removeContext(Long.valueOf(volume.getId()));
    }

    public static void d(String str, String str2, String str3, boolean z) {
        Integer valueOf;
        Integer num = null;
        if (str3 == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Integer.valueOf(Integer.parseInt(str3));
            } catch (NumberFormatException | JSONException e2) {
                InterfaceC1598aHf.e("Unable to send appView live cta debug event", e2);
                return;
            }
        }
        if (str2 != null) {
            num = Integer.valueOf(Integer.parseInt(str2));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("view", str).put("topNodeId", num).put("viewableId", valueOf).put("playType", z ? "live" : "play").put("feature", "LiveStreamingPlayButton");
        Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
    }

    public static TrackingInfo b(final InterfaceC5088bsE interfaceC5088bsE) {
        if (interfaceC5088bsE == null) {
            return null;
        }
        return new TrackingInfo() { // from class: o.Vh
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject jSONObject;
                jSONObject = InterfaceC5088bsE.this.toJSONObject();
                return jSONObject;
            }
        };
    }

    public static TrackingInfo a(final InterfaceC5088bsE interfaceC5088bsE) {
        return new TrackingInfo() { // from class: o.Ve
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject jSONObject;
                jSONObject = InterfaceC5088bsE.this.toJSONObject();
                return jSONObject;
            }
        };
    }

    public static DebugSession a(JSONObject jSONObject, ExtCLUtils.DebugSessionType debugSessionType) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", debugSessionType.getValue());
        } catch (JSONException unused) {
        }
        return new DebugSession(jSONObject);
    }

    /* loaded from: classes3.dex */
    public static class c {
        private JSONObject a = new JSONObject();

        public c d(String str, String str2) {
            try {
                this.a.put(str, str2);
            } catch (JSONException unused) {
            }
            return this;
        }

        public c c(String str, int i) {
            try {
                this.a.put(str, i);
            } catch (JSONException unused) {
            }
            return this;
        }

        public JSONObject e() {
            JSONObject jSONObject = this.a;
            if (jSONObject != null) {
                this.a = null;
                return jSONObject;
            }
            throw new IllegalStateException("Trying to reuse builder!");
        }
    }

    public static String d(String str, Throwable th) {
        try {
            return a(str, null, th).toJSONObject().toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Error a(String str, JSONObject jSONObject, Throwable th) {
        if (th == null && str == null) {
            return null;
        }
        if (th != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("className", th.getClass().getName());
                if (th.getMessage() != null) {
                    jSONObject.put("message", th.getMessage());
                }
                if (th.getStackTrace() != null) {
                    jSONObject.put(SignupConstants.Error.DEBUG_FIELD_STACK_TRACE, e(th));
                }
            } catch (JSONException unused) {
            }
        }
        return new Error(str, null, jSONObject);
    }

    public static String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static void d(String str, Map<String, Integer> map, Map<String, String> map2, String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                jSONObject2.put(entry2.getKey(), entry2.getValue());
            }
            FlexEvent flexEvent = new FlexEvent(str, strArr, jSONObject, jSONObject2);
            Logger.INSTANCE.logEvent(flexEvent);
            String str2 = e;
            C1044Mm.e(str2, "FlexEvent: " + flexEvent.toJSONObject());
        } catch (JSONException unused) {
        }
    }
}
