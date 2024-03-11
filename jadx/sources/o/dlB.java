package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.android.MinusOneCardInfo;
import com.netflix.cl.model.android.MinusOneCardType;
import com.netflix.cl.model.android.MinusOneRequestType;
import com.netflix.cl.model.android.MinusOneVideoInfo;
import com.netflix.cl.model.android.PartnerInputSource;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import java.util.ArrayList;
import o.InterfaceC8437dlo;
import o.aMN;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class dlB {
    public static final a b = new a(null);
    public static final int d = 8;
    private static final String e = "nf_partner_PServiceCardEventHandle";
    private Long a;
    private final C8446dlx c;
    private final Handler h;
    private long j;

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject a(JSONObject jSONObject) {
        return jSONObject;
    }

    public dlB(Looper looper) {
        C8632dsu.c((Object) looper, "");
        this.c = new C8446dlx();
        this.a = 0L;
        this.h = new Handler(looper);
    }

    public final void c(Context context, int i, String str, boolean z, boolean z2, InterfaceC8433dlk interfaceC8433dlk) {
        C8632dsu.c((Object) context, "");
        if (this.c.b().size() > 1) {
            if (C8175dfS.d(20000, this.c.d())) {
                b(-9);
                Long l = this.a;
                if (l != null) {
                    long longValue = l.longValue();
                    long j = this.j;
                    String statusCode = StatusCode.ALREADY_IN_QUEUE.toString();
                    C8632dsu.a(statusCode, "");
                    a(j, longValue, statusCode);
                }
            } else {
                C1044Mm.e(e, "previous card event still in progress.. stashing");
                e(-9, interfaceC8433dlk);
                return;
            }
        }
        String str2 = e;
        C1044Mm.a(str2, "cardEvent: %s(%s), partnerCardImpression: %s", Integer.valueOf(i), e(i), str);
        dlK dlk = dlK.e;
        this.j = dlk.a(context, PartnerInputSource.bixbyHome);
        long b2 = b(context, i);
        if (b2 == null) {
            b2 = 0L;
        }
        this.a = b2;
        this.c.a(interfaceC8433dlk);
        if (interfaceC8433dlk == null) {
            C1044Mm.d(str2, "cardEvent: partner callback null ");
            Long l2 = this.a;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                long j2 = this.j;
                String statusCode2 = StatusCode.INT_ERR_CB_NULL.toString();
                C8632dsu.a(statusCode2, "");
                a(j2, longValue2, statusCode2);
            }
        } else if (z2) {
            C1044Mm.d(str2, "card functionality not supported on device - config blocked");
            b(-1);
        } else if (((aMN) C1332Xp.b(aMN.class)).c(aMN.d.e)) {
            try {
                Class<?> cls = Class.forName("com.netflix.partner.card.PCardDataHandler");
                Class<?> cls2 = Long.TYPE;
                Object newInstance = cls.getConstructor(Context.class, Handler.class, Boolean.TYPE, cls2, cls2).newInstance(context, this.h, Boolean.valueOf(z), Long.valueOf(this.j), this.a);
                C8632dsu.d(newInstance);
                ((InterfaceC8437dlo) newInstance).handleCardEvent(i, str, new InterfaceC8437dlo.d() { // from class: o.dlC
                    @Override // o.InterfaceC8437dlo.d
                    public final void c(int i2, String str3) {
                        dlB.b(dlB.this, i2, str3);
                    }
                });
            } catch (NoSuchMethodException e2) {
                C1044Mm.e(e, "NoSuchMethodException", e2);
                b(-4);
            } catch (Exception e3) {
                C1044Mm.e(e, "Exception", e3);
                b(-4);
            }
        } else {
            C1044Mm.e(str2, "module not present, cant handle the query");
            dlk.c(context);
            b(-7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(dlB dlb, int i, String str) {
        C8632dsu.c((Object) dlb, "");
        try {
            dlb.d(i, str);
        } catch (RemoteException e2) {
            C1044Mm.e(e, " remote Exception", e2);
            dlb.b(-4);
        }
    }

    private final void e(int i, InterfaceC8433dlk interfaceC8433dlk) {
        C1044Mm.a(e, "sending single error response to partner code: %s", Integer.valueOf(i));
        if (interfaceC8433dlk != null) {
            try {
                interfaceC8433dlk.d(i, null);
            } catch (RemoteException e2) {
                C1044Mm.e(e, "could not send error result ", e2);
            }
        }
    }

    private final void b(int i) {
        C1044Mm.a(e, "sending error response to partner code: %s", Integer.valueOf(i));
        try {
            d(i, null);
        } catch (RemoteException e2) {
            C1044Mm.e(e, "could not send error result ", e2);
        }
        Long l = this.a;
        if (l != null) {
            a(this.j, l.longValue(), String.valueOf(i));
        }
    }

    private final void d(int i, String str) {
        for (InterfaceC8433dlk interfaceC8433dlk : this.c.a()) {
            interfaceC8433dlk.d(i, str);
        }
    }

    private final void a(long j, long j2, String str) {
        ExtLogger.INSTANCE.failedAction(Long.valueOf(j2), CLv2Utils.a(new Error(str, null, null)));
        Logger.INSTANCE.removeContext(Long.valueOf(j));
    }

    private final MinusOneCardInfo c(JSONObject jSONObject) {
        TrackingInfo trackingInfo;
        String optString = jSONObject.optString(SignupConstants.Field.CARD_TYPE);
        C8632dsu.d((Object) optString);
        MinusOneCardType c = c(optString);
        String optString2 = jSONObject.optString("listName");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("videoImpressions");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    String string = jSONObject2.getString(SignupConstants.Field.VIDEO_ID);
                    final JSONObject optJSONObject = jSONObject2.optJSONObject("trackingInfo");
                    if (optJSONObject != null) {
                        C8632dsu.d(optJSONObject);
                        trackingInfo = new TrackingInfo() { // from class: o.dlE
                            @Override // com.netflix.cl.model.JsonSerializer
                            public final JSONObject toJSONObject() {
                                JSONObject a2;
                                a2 = dlB.a(JSONObject.this);
                                return a2;
                            }
                        };
                    } else {
                        trackingInfo = null;
                    }
                    arrayList.add(new MinusOneVideoInfo(string, trackingInfo));
                }
            }
            return new MinusOneCardInfo(c, optString2, (MinusOneVideoInfo[]) arrayList.toArray(new MinusOneVideoInfo[0]));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Long b(android.content.Context r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "partner_curr_card_log"
            r1 = 0
            java.lang.String r10 = o.C8157dfA.e(r10, r0, r1)
            boolean r0 = o.C8168dfL.h(r10)     // Catch: org.json.JSONException -> L13
            if (r0 == 0) goto L13
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L13
            r0.<init>(r10)     // Catch: org.json.JSONException -> L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 != 0) goto L1e
            java.lang.String r10 = o.dlB.e
            java.lang.String r11 = "startClLogForMinusOneRequest:: No saved JSON!"
            o.C1044Mm.j(r10, r11)
            return r1
        L1e:
            com.netflix.cl.model.android.MinusOneCardInfo r5 = r9.c(r0)
            if (r5 != 0) goto L30
            java.lang.String r11 = o.dlB.e
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r0 = "startClLogForMinusOneRequest:: minusOneCardInfo not found from JSON %s!"
            o.C1044Mm.e(r11, r0, r10)
            return r1
        L30:
            java.lang.String r10 = o.dlB.e
            org.json.JSONObject r1 = r5.toJSONObject()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "CL shown cardImpression %s"
            o.C1044Mm.a(r10, r2, r1)
            com.netflix.cl.model.android.MinusOneRequestType r6 = r9.e(r11)
            o.dlB$e r8 = new o.dlB$e
            r8.<init>(r0)
            com.netflix.cl.model.event.session.action.android.MinusOneRequest r11 = new com.netflix.cl.model.event.session.action.android.MinusOneRequest
            r3 = 0
            r4 = 0
            r7 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            org.json.JSONObject r0 = r11.toJSONObject()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "startClLogForMinusOneRequest:: minusOneRequest: %s"
            o.C1044Mm.a(r10, r1, r0)
            com.netflix.cl.Logger r10 = com.netflix.cl.Logger.INSTANCE
            java.lang.Long r10 = r10.startSession(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dlB.b(android.content.Context, int):java.lang.Long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class e implements TrackingInfo {
        private final JSONObject a;

        public e(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // com.netflix.cl.model.JsonSerializer
        public JSONObject toJSONObject() {
            return c(this.a);
        }

        private final JSONObject c(JSONObject jSONObject) {
            JSONArray optJSONArray;
            if (jSONObject != null) {
                try {
                    optJSONArray = jSONObject.optJSONArray("videoImpressions");
                } catch (JSONException unused) {
                }
            } else {
                optJSONArray = null;
            }
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.getJSONObject(i).optJSONObject("trackingInfo");
                    if (optJSONObject != null) {
                        return optJSONObject;
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(NetflixActivity.EXTRA_SOURCE, PartnerInputSource.bixbyHome);
            return jSONObject2;
        }
    }

    private final MinusOneRequestType e(int i) {
        switch (i) {
            case 1:
                return MinusOneRequestType.warmup;
            case 2:
                return MinusOneRequestType.entry;
            case 3:
                return MinusOneRequestType.userRefresh;
            case 4:
                return MinusOneRequestType.impression;
            case 5:
                return MinusOneRequestType.userHideCard;
            case 6:
                return MinusOneRequestType.userDeleteCard;
            default:
                return MinusOneRequestType.entry;
        }
    }

    /* loaded from: classes6.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    private final MinusOneCardType c(String str) {
        String str2;
        CharSequence n;
        if (str != null) {
            n = duD.n((CharSequence) str);
            str2 = n.toString();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1321333472) {
                if (hashCode != 505976999) {
                    switch (hashCode) {
                        case -1263419090:
                            if (str2.equals("full32")) {
                                return MinusOneCardType.full32;
                            }
                            break;
                        case -1263419089:
                            if (str2.equals("full33")) {
                                return MinusOneCardType.full33;
                            }
                            break;
                        case -1263419088:
                            if (str2.equals("full34")) {
                                return MinusOneCardType.full34;
                            }
                            break;
                    }
                } else if (str2.equals("single32")) {
                    return MinusOneCardType.single32;
                }
            } else if (str2.equals("onePlus")) {
                return MinusOneCardType.onePlus;
            }
        }
        return MinusOneCardType.single32;
    }
}
