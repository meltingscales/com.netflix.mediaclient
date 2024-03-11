package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCta;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaPresentAt;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.LinkedHashMap;
import java.util.Map;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bdB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4363bdB {
    public static final b a = new b(null);
    private static final String b = "https://www.netflix.com/youraccountpayment";
    private final JSONObject c;
    private boolean d;
    private final String e = "nf_nq_uma";

    public C4363bdB(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    /* renamed from: o.bdB$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    public final JSONObject b() {
        boolean z;
        Object obj;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String optString;
        Map d;
        Map k;
        Throwable th;
        JSONObject jSONObject = this.c;
        if (jSONObject == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(jSONObject.optString("payloadVersion"));
        C8632dsu.a(valueOf, "");
        if (valueOf.intValue() < 3) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str7 = "received old uma payload via NQ: " + this.c;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(str7, null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
                return null;
            }
            dVar.e().b(c1596aHd, th);
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            String optString2 = this.c.optString("templateId");
            this.d = e(optString2);
            jSONObject3.putOpt("abTestCell", Integer.valueOf(this.c.optInt("abTestCell")));
            jSONObject3.putOpt("abTestId", Integer.valueOf(this.c.optInt("abTestId")));
            jSONObject3.putOpt("locale", this.c.optString("locale"));
            jSONObject3.putOpt("messageName", this.c.optString("messageName"));
            jSONObject3.putOpt("messageId", this.c.optString("messageId"));
            jSONObject3.putOpt("timestamp", Long.valueOf(this.c.optLong("messageEvaluationTimeMillis")));
            jSONObject3.putOpt("templateId", optString2);
            JSONObject optJSONObject = this.c.optJSONObject("attributes");
            if (optJSONObject != null) {
                c(optJSONObject);
                jSONObject3.putOpt("blocking", Boolean.valueOf(optJSONObject.optBoolean("IS_BLOCKING", false)));
                boolean optBoolean = optJSONObject.optBoolean("IS_MODAL", false);
                boolean optBoolean2 = optJSONObject.optBoolean("IS_BANNER", false);
                boolean optBoolean3 = optJSONObject.optBoolean("IS_TOOLTIP", false);
                String optString3 = optJSONObject.optString("THEME_NAME", "");
                String optString4 = optJSONObject.optString("flowName", "");
                jSONObject3.putOpt("modalAlert", Boolean.valueOf(optBoolean));
                jSONObject3.putOpt("bannerAlert", Boolean.valueOf(optBoolean2));
                jSONObject3.putOpt("tooltipAlert", Boolean.valueOf(optBoolean3));
                jSONObject3.putOpt("themeName", optString3);
                jSONObject3.putOpt("flowName", optString4);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("trackingInfo");
                if (optJSONObject2 != null) {
                    jSONObject3.putOpt(Payload.PARAM_MESSAGE_GUID, optJSONObject2.optString(Payload.PARAM_MESSAGE_GUID, ""));
                }
                jSONObject3.putOpt("trackingInfo", optJSONObject2 != null ? optJSONObject2.toString() : null);
                JSONObject optJSONObject3 = optJSONObject.optJSONObject("bannerTrackingInfo");
                jSONObject3.putOpt("bannerTrackingInfo", optJSONObject3 != null ? optJSONObject3.toString() : null);
                JSONObject optJSONObject4 = optJSONObject.optJSONObject("umsAlertRenderFeedback");
                jSONObject3.putOpt("umsAlertRenderFeedback", optJSONObject4 != null ? optJSONObject4.toString() : null);
                JSONObject optJSONObject5 = optJSONObject.optJSONObject("bannerUmsAlertRenderFeedback");
                jSONObject3.putOpt("umsAlertRenderFeedback", optJSONObject5 != null ? optJSONObject5.toString() : null);
                jSONObject3.putOpt("suppressForBackgroundAction", Boolean.valueOf(optJSONObject.optBoolean("SUPPRESS_FOR_BACKGROUND_CALL", false)));
                jSONObject3.putOpt("backgroundAction", optJSONObject.optString("BACKGROUND_CALL"));
                jSONObject3.put("showOnBackgroundActionSuccess", C8168dfL.d(optJSONObject.optString("SHOW_ON_BACKGROUND_CALL_STATUS"), "success"));
                jSONObject3.putOpt("suppressOnAppLaunch", Boolean.valueOf(optJSONObject.optBoolean("SUPPRESS_ON_APP_LAUNCH", false)));
                jSONObject3.putOpt("modalPlacement", optJSONObject.optString("modalPlacement"));
                jSONObject3.putOpt("blockedDevicesList", optJSONObject.optJSONArray("blockedDevicesList"));
                JSONArray optJSONArray = optJSONObject.optJSONArray("presentAt");
                if (optJSONArray != null) {
                    z = false;
                    obj = optJSONArray.opt(0);
                } else {
                    z = false;
                    obj = null;
                }
                jSONObject3.putOpt("presentAt", obj);
                if (!optBoolean && !optBoolean2 && !optBoolean3) {
                    jSONObject3.putOpt("modalAlert", Boolean.TRUE);
                    optBoolean = true;
                }
                JSONObject optJSONObject6 = this.c.optJSONObject("template");
                boolean equals = (optJSONObject6 == null || (optString = optJSONObject6.optString("viewName")) == null) ? z : optString.equals("multi_month_offer");
                if (optJSONObject6 != null) {
                    if (equals) {
                        str4 = "low";
                        str3 = "medium";
                        jSONObject3.putOpt("multiMonthOffer", this.c.optJSONObject("template"));
                        jSONObject3.putOpt("ctas", d(optJSONObject6.optJSONArray("ctas")));
                        jSONObject3.putOpt("bannerCtas", d(optJSONObject6.optJSONArray("bannerCtas")));
                    } else {
                        str3 = "medium";
                        str4 = "low";
                    }
                    if (optBoolean && !equals) {
                        jSONObject3.putOpt(SignupConstants.Field.VIDEO_TITLE, e(optJSONObject6.optJSONObject(SignupConstants.Field.VIDEO_TITLE)));
                        jSONObject3.putOpt("headline", e(optJSONObject6.optJSONObject("headline")));
                        jSONObject3.putOpt("body", e(optJSONObject6.optJSONObject("body")));
                        jSONObject3.putOpt("footer", e(optJSONObject6.optJSONObject("footer")));
                        jSONObject3.putOpt("icon", optJSONObject.optString("ICON", ""));
                        jSONObject3.putOpt("headerCtas", d(optJSONObject6.optJSONArray("headerCtas")));
                        jSONObject3.putOpt("ctas", d(optJSONObject6.optJSONArray("ctas")));
                        if (this.d) {
                            jSONObject3.putOpt("timer", optJSONObject.optJSONObject("timer"));
                            jSONObject3.putOpt("headlineTextStyle", optJSONObject6.optJSONObject("headline"));
                            jSONObject3.putOpt("titleTextStyle", optJSONObject6.optJSONObject(SignupConstants.Field.VIDEO_TITLE));
                            jSONObject3.putOpt("bodyTextStyle", optJSONObject6.optJSONObject("body"));
                        }
                    }
                    if (optBoolean2 && !equals) {
                        jSONObject3.putOpt("bannerTitle", e(optJSONObject6.optJSONObject("bannerTitle")));
                        jSONObject3.putOpt("bannerBody", e(optJSONObject6.optJSONObject("bannerBody")));
                        jSONObject3.putOpt("bannerIcon", optJSONObject.optString("BANNER_ICON", ""));
                        jSONObject3.putOpt("bannerCtas", d(optJSONObject6.optJSONArray("bannerCtas")));
                    }
                    if (optBoolean3 && !equals) {
                        jSONObject3.putOpt("tooltipTitle", e(optJSONObject6.optJSONObject("tooltipTitle")));
                        jSONObject3.putOpt("tooltipCtas", d(optJSONObject6.optJSONArray("tooltipCtas")));
                        jSONObject3.putOpt("tooltipIcon", optJSONObject.optString("TOOLTIP_ICON", ""));
                        jSONObject3.putOpt("tooltipBody", e(optJSONObject6.optJSONObject("tooltipBody")));
                        jSONObject3.putOpt("tooltipAnchor", optJSONObject.optString("TOOLTIP_ANCHOR", ""));
                    }
                    JSONObject optJSONObject7 = optJSONObject6.optJSONObject("modalAttributes");
                    if (optJSONObject7 != null) {
                        JSONObject optJSONObject8 = optJSONObject7.optJSONObject("foreground");
                        if (optJSONObject8 != null) {
                            JSONObject optJSONObject9 = optJSONObject8.optJSONObject("image");
                            optJSONObject8.putOpt("imageUrlHigh", optJSONObject9 != null ? optJSONObject9.optString("high") : null);
                            JSONObject optJSONObject10 = optJSONObject8.optJSONObject("image");
                            if (optJSONObject10 != null) {
                                str = str3;
                                str5 = optJSONObject10.optString(str);
                            } else {
                                str = str3;
                                str5 = null;
                            }
                            optJSONObject8.putOpt("imageUrlMedium", str5);
                            JSONObject optJSONObject11 = optJSONObject8.optJSONObject("image");
                            if (optJSONObject11 != null) {
                                str2 = str4;
                                str6 = optJSONObject11.optString(str2);
                            } else {
                                str2 = str4;
                                str6 = null;
                            }
                            optJSONObject8.putOpt("imageUrlLow", str6);
                        } else {
                            str2 = str4;
                            str = str3;
                        }
                        JSONObject optJSONObject12 = optJSONObject7.optJSONObject("background");
                        if (optJSONObject12 != null) {
                            JSONObject jSONObject4 = new JSONObject();
                            JSONObject optJSONObject13 = optJSONObject12.optJSONObject("image");
                            jSONObject4.putOpt("imageUrlHigh", optJSONObject13 != null ? optJSONObject13.optString("high") : null);
                            JSONObject optJSONObject14 = optJSONObject12.optJSONObject("image");
                            jSONObject4.putOpt("imageUrlMedium", optJSONObject14 != null ? optJSONObject14.optString(str) : null);
                            JSONObject optJSONObject15 = optJSONObject12.optJSONObject("image");
                            jSONObject4.putOpt("imageUrlLow", optJSONObject15 != null ? optJSONObject15.optString(str2) : null);
                            if (jSONObject4.length() > 0) {
                                optJSONObject12.putOpt("image", jSONObject4);
                            }
                        }
                        jSONObject3.putOpt("modalAttributes", optJSONObject7);
                    } else {
                        str2 = str4;
                        str = str3;
                    }
                    String optString5 = optJSONObject6.optString("flow");
                    String optString6 = optJSONObject6.optString("mode");
                    if (C8168dfL.h(optString5)) {
                        jSONObject3.putOpt("flow", optString5);
                    }
                    if (C8168dfL.h(optString6)) {
                        jSONObject3.putOpt("mode", optString6);
                    }
                } else {
                    str = "medium";
                    str2 = "low";
                }
                JSONObject optJSONObject16 = optJSONObject6 != null ? optJSONObject6.optJSONObject("backgroundImage") : null;
                jSONObject3.putOpt("backgroundImageUrlHigh", optJSONObject16 != null ? optJSONObject16.optString("high") : null);
                jSONObject3.putOpt("backgroundImageUrlMedium", optJSONObject16 != null ? optJSONObject16.optString(str) : null);
                jSONObject3.putOpt("backgroundImageUrlLow", optJSONObject16 != null ? optJSONObject16.optString(str2) : null);
            }
            jSONObject2.putOpt("uma", jSONObject3);
            return jSONObject2;
        } catch (JSONException e) {
            C1044Mm.e(this.e, "unable to convert uma", e);
            return null;
        }
    }

    private final boolean e(String str) {
        return C8632dsu.c((Object) str, (Object) "flexible");
    }

    private final void c(JSONObject jSONObject) {
        Map k;
        Throwable th;
        JSONArray optJSONArray = jSONObject.optJSONArray("presentAt");
        Object opt = optJSONArray != null ? optJSONArray.opt(0) : null;
        if (opt != null) {
            JSONObject jSONObject2 = opt instanceof JSONObject ? (JSONObject) opt : null;
            String optString = jSONObject2 != null ? jSONObject2.optString("point") : null;
            if (optString == null) {
                optString = "empty";
            } else {
                C8632dsu.d((Object) optString);
            }
            try {
                UmaPresentAt.Point.valueOf(optString);
            } catch (IllegalArgumentException e) {
                InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                k = dqE.k(new LinkedHashMap());
                C1596aHd c1596aHd = new C1596aHd("Unknown presentAt point sent in UMA payload", e, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b2);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1597aHe c2 = dVar2.c();
                if (c2 != null) {
                    c2.d(c1596aHd, th);
                } else {
                    dVar2.e().b(c1596aHd, th);
                }
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                aVar.a("rawPresentAtPoint: " + optString);
                dpR dpr = dpR.c;
            }
        }
    }

    private final String e(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        if (jSONObject == null) {
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            return sb2;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("copy");
        if (optJSONArray == null) {
            throw new NullPointerException("Property 'copy' expected");
        }
        String optString = this.d ? jSONObject.optString("color", "") : "";
        C8632dsu.d((Object) optString);
        if (optString.length() > 0) {
            sb.append("<font color=\"#" + optString + "\">");
        }
        try {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    String optString2 = jSONObject2.optString("elementType");
                    if (optString2 != null) {
                        int hashCode = optString2.hashCode();
                        if (hashCode != -1731062412) {
                            if (hashCode != 2044549) {
                                if (hashCode == 2336762 && optString2.equals(UmaCta.ACTION_TYPE_LINK)) {
                                    C1044Mm.d(this.e, "do not have token to append in the link");
                                    sb.append("<a href='");
                                    sb.append(jSONObject2.optString("elementId"));
                                    sb.append("'>");
                                    sb.append(jSONObject2.optString("content"));
                                    sb.append("</a>");
                                }
                            } else if (optString2.equals("BOLD")) {
                                sb.append("<b>");
                                sb.append(jSONObject2.optString("content"));
                                sb.append("</b>");
                            }
                        } else if (optString2.equals("NEWLINE")) {
                            sb.append("<br/>");
                        }
                    }
                    sb.append(jSONObject2.optString("content"));
                }
            }
            if (optString.length() > 0) {
                sb.append("</font>");
            }
        } catch (JSONException e) {
            String str = this.e;
            C1044Mm.e(str, "Error parsing content: " + jSONObject, e);
        }
        String sb3 = sb.toString();
        C8632dsu.a(sb3, "");
        return sb3;
    }

    private final JSONArray d(JSONArray jSONArray) {
        JSONArray jSONArray2;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        JSONArray jSONArray3 = jSONArray;
        String str11 = "parameters";
        String str12 = "failureMessage";
        String str13 = "successMessage";
        String str14 = "inputType";
        String str15 = "textColor";
        String str16 = "ctaType";
        JSONArray jSONArray4 = new JSONArray();
        if (jSONArray3 == null || jSONArray.length() == 0) {
            return jSONArray4;
        }
        try {
            int length = jSONArray.length();
            JSONArray jSONArray5 = jSONArray4;
            int i2 = 0;
            while (i2 < length) {
                int i3 = length;
                try {
                    JSONObject jSONObject = jSONArray3.getJSONObject(i2);
                    if (jSONObject == null) {
                        str8 = str11;
                        str3 = str14;
                        str7 = str16;
                        i = i2;
                        jSONArray2 = jSONArray5;
                        String str17 = str13;
                        str6 = str12;
                        str5 = str17;
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        i = i2;
                        String str18 = str15;
                        jSONObject2.putOpt("text", b(jSONObject));
                        jSONObject2.putOpt(str16, jSONObject.opt(str16));
                        JSONArray optJSONArray = jSONObject.optJSONArray("inputGroup");
                        if (optJSONArray != null) {
                            JSONArray jSONArray6 = new JSONArray();
                            str4 = str16;
                            int length2 = optJSONArray.length();
                            str = str12;
                            int i4 = 0;
                            while (i4 < length2) {
                                int i5 = length2;
                                Object obj = optJSONArray.get(i4);
                                JSONArray jSONArray7 = optJSONArray;
                                JSONObject jSONObject3 = obj instanceof JSONObject ? (JSONObject) obj : null;
                                if (jSONObject3 == null) {
                                    str9 = str13;
                                    str10 = str14;
                                } else {
                                    JSONObject jSONObject4 = new JSONObject();
                                    str9 = str13;
                                    jSONObject4.put(str14, jSONObject3.getString(str14));
                                    str10 = str14;
                                    jSONObject4.put("copy", b(jSONObject3));
                                    JSONObject optJSONObject = jSONObject3.optJSONObject("iconUrl");
                                    if (optJSONObject != null) {
                                        jSONObject4.putOpt("iconUrlLow", optJSONObject.optString("low"));
                                        jSONObject4.putOpt("iconUrlMedium", optJSONObject.optString("medium"));
                                        jSONObject4.putOpt("iconUrlHigh", optJSONObject.optString("high"));
                                    }
                                    jSONArray6.put(jSONObject4);
                                }
                                i4++;
                                length2 = i5;
                                optJSONArray = jSONArray7;
                                str13 = str9;
                                str14 = str10;
                            }
                            str2 = str13;
                            str3 = str14;
                            jSONObject2.putOpt("inputGroup", jSONArray6);
                        } else {
                            str = str12;
                            str2 = str13;
                            str3 = str14;
                            str4 = str16;
                        }
                        jSONObject2.putOpt(SignupConstants.Error.DEBUG_INFO_ACTION, jSONObject.opt(SignupConstants.Error.DEBUG_INFO_ACTION));
                        jSONObject2.putOpt("actionType", jSONObject.opt("actionType"));
                        jSONObject2.putOpt("callback", jSONObject.opt("callback"));
                        jSONObject2.putOpt("autoLogin", jSONObject.opt("mintAutoLogin"));
                        jSONObject2.putOpt(VisualStateDefinition.ELEMENT_STATE.SELECTED, jSONObject.opt("isSelected"));
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("trackingInfo");
                        if (optJSONObject2 != null) {
                            jSONObject2.putOpt("trackingInfo", optJSONObject2.toString());
                        }
                        JSONObject optJSONObject3 = jSONObject.optJSONObject("umsAlertCtaFeedback");
                        if (optJSONObject3 != null) {
                            jSONObject2.putOpt("umsAlertCtaFeedback", optJSONObject3.toString());
                        }
                        jSONObject2.putOpt("openLinkInWebView", Boolean.valueOf(C8168dfL.d(jSONObject.optString("target"), "WEBVIEW")));
                        JSONObject optJSONObject4 = jSONObject.optJSONObject(str11);
                        if (optJSONObject4 != null) {
                            jSONObject2.putOpt(str11, optJSONObject4.toString());
                        }
                        str5 = str2;
                        JSONObject optJSONObject5 = jSONObject.optJSONObject(str5);
                        jSONObject2.putOpt(str5, b(optJSONObject5 != null ? optJSONObject5.optJSONObject("default") : null));
                        str6 = str;
                        JSONObject optJSONObject6 = jSONObject.optJSONObject(str6);
                        jSONObject2.putOpt(str6, b(optJSONObject6 != null ? optJSONObject6.optJSONObject("default") : null));
                        if (C8632dsu.c((Object) jSONObject.optString(SignupConstants.Error.DEBUG_INFO_ACTION), (Object) UmaCta.ACTION_RETRY_PAYMENT)) {
                            str7 = str4;
                            if (C8632dsu.c((Object) jSONObject.optString(str7), (Object) "BUTTON")) {
                                jSONObject2.put("fallbackUrl", b);
                            }
                        } else {
                            str7 = str4;
                        }
                        str15 = str18;
                        try {
                            if (!jSONObject.has(str15) && !jSONObject.has("buttonColor")) {
                                str8 = str11;
                                jSONArray2 = jSONArray5;
                                jSONArray2.put(jSONObject2);
                            }
                            jSONArray2.put(jSONObject2);
                        } catch (JSONException e) {
                            e = e;
                            C1044Mm.e(this.e, "error in prcessing ctas: " + jSONArray, e);
                            return jSONArray2;
                        }
                        JSONObject jSONObject5 = new JSONObject();
                        str8 = str11;
                        jSONObject5.putOpt(str15, jSONObject.optString(str15));
                        jSONObject5.putOpt("buttonColor", jSONObject.optString("buttonColor"));
                        jSONObject2.put("style", jSONObject5);
                        jSONArray2 = jSONArray5;
                    }
                    i2 = i + 1;
                    jSONArray3 = jSONArray;
                    jSONArray5 = jSONArray2;
                    length = i3;
                    str11 = str8;
                    str16 = str7;
                    str14 = str3;
                    String str19 = str6;
                    str13 = str5;
                    str12 = str19;
                } catch (JSONException e2) {
                    e = e2;
                    jSONArray2 = jSONArray5;
                }
            }
            return jSONArray5;
        } catch (JSONException e3) {
            e = e3;
            jSONArray2 = jSONArray4;
        }
    }

    private final String b(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        if (jSONObject == null) {
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            return sb2;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("copy");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                if ((jSONObject2 != null ? jSONObject2.optString("content") : null) != null) {
                    sb.append(jSONObject2.optString("content"));
                }
            }
        }
        String sb3 = sb.toString();
        C8632dsu.a(sb3, "");
        return sb3;
    }
}
