package o;

import android.content.Context;
import android.net.Uri;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pservice.PDiskData;
import com.netflix.partner.card.CardCommandType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class dlM {
    private static final List<PDiskData.ListType> a = Arrays.asList(PDiskData.ListType.BILLBOARD, PDiskData.ListType.CW, PDiskData.ListType.STANDARD_FIRST, PDiskData.ListType.STANDARD_SECOND);
    private static final List<PDiskData.ListType> e = Arrays.asList(PDiskData.ListType.NON_MEMBER);
    private dlQ b;
    private Context c;

    private List<PDiskData.ListType> e(boolean z) {
        return z ? a : e;
    }

    public dlM(Context context) {
        this.c = context;
        this.b = dlQ.e(context);
    }

    public boolean a(int i) {
        String d = d();
        C1044Mm.a("nf_partner_CardAlgo", "isCardRefreshNeeded: cardEventType %s(%s)", Integer.valueOf(i), CardCommandType.b(i));
        if (CardCommandType.USER_REFRESH.g == i || CardCommandType.WARMUP.g == i) {
            return true;
        }
        if (CardCommandType.ENTRY.g == i) {
            return d(d);
        }
        if (CardCommandType.USER_HIDE_CARD.g == i || CardCommandType.USER_REMOVE_CARD.g == i || CardCommandType.IMPRESSION.g != i) {
            return false;
        }
        return e(d);
    }

    private boolean d(String str) {
        boolean a2 = a(str);
        C1044Mm.a("nf_partner_CardAlgo", "shouldRefreshOnEntry: cardOld? %s", Boolean.valueOf(a2));
        return a2;
    }

    private boolean a(String str) {
        if (C8168dfL.g(str)) {
            C1044Mm.e("nf_partner_CardAlgo", "isLastSentCardOld: card null - treating old");
            return true;
        }
        try {
            String optString = new JSONObject(str).optString("impressionTimeMs", null);
            if (!C8168dfL.g(optString) && C8168dfL.i(optString)) {
                boolean e2 = C8175dfS.e(Long.parseLong(optString));
                C1044Mm.a("nf_partner_CardAlgo", "isLastSentCardOld: cTimeStr: %s old - %s", optString, Boolean.valueOf(e2));
                return e2;
            }
            C1044Mm.a("nf_partner_CardAlgo", "isLastSentCardOld: cTimeStr null ? %s", optString);
            return true;
        } catch (JSONException e3) {
            C1044Mm.e("nf_partner_CardAlgo", "unable to json prev card ", e3);
            return true;
        }
    }

    private boolean e(String str) {
        if (C8168dfL.g(str)) {
            C1044Mm.e("nf_partner_CardAlgo", "shouldRefreshOnImpression: cardImpression is null - skip");
            return false;
        }
        Map<String, String> c = c(str);
        String str2 = c.get("listType");
        PDiskData.ListType a2 = PDiskData.ListType.a(str2);
        dlO d = this.b.d(a2);
        String str3 = c.get(SignupConstants.Field.VIDEO_ID);
        C1044Mm.a("nf_partner_CardAlgo", "shouldRefreshOnImpression: listType %s, videoId %s algoData %s", str2, str3, d);
        if (d == null || str3 == null || C8168dfL.g(str2)) {
            C1044Mm.d("nf_partner_CardAlgo", "stored impression seems to be wrong - skip recording - should not happen ");
            return true;
        }
        d.a();
        int e2 = e(a2);
        int e3 = d.e();
        boolean z = e3 > e2;
        C1044Mm.a("nf_partner_CardAlgo", "CardAlgo %s, %s count %s  <  %s, refresh: %s", str2, str3, Integer.valueOf(e3), Integer.valueOf(e2), Boolean.valueOf(z));
        if (z) {
            d.c();
        }
        this.b.a(this.c);
        return z;
    }

    private Map<String, String> c(String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        HashMap hashMap = new HashMap();
        if (!C8168dfL.g(str) && !str.trim().equals("undefined")) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                if (jSONObject2.has("videoImpressions") && (jSONArray = jSONObject2.getJSONArray("videoImpressions")) != null && jSONArray.length() > 0 && (jSONObject = jSONArray.getJSONObject(0)) != null) {
                    String optString = jSONObject.optString("marker");
                    if (C8168dfL.h(optString)) {
                        hashMap.put("marker", optString);
                        hashMap.put("listType", b(optString));
                    }
                    String optString2 = jSONObject.optString("playableId");
                    if (C8168dfL.g(optString2)) {
                        optString2 = jSONObject.optString(SignupConstants.Field.VIDEO_ID);
                    }
                    hashMap.put(SignupConstants.Field.VIDEO_ID, optString2);
                }
            } catch (JSONException e2) {
                C1044Mm.e("nf_partner_CardAlgo", "unable to json card impression ", e2);
            }
            C1044Mm.e("nf_partner_CardAlgo", "getVideoImpressionInfo() returned: " + hashMap);
        }
        return hashMap;
    }

    private String b(String str) {
        return Uri.parse("https://www.netfix.com?" + str).getQueryParameter("listType");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dlM$5  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PDiskData.ListType.values().length];
            b = iArr;
            try {
                iArr[PDiskData.ListType.BILLBOARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[PDiskData.ListType.CW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[PDiskData.ListType.NON_MEMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[PDiskData.ListType.STANDARD_FIRST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[PDiskData.ListType.STANDARD_SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private int e(PDiskData.ListType listType) {
        int i = AnonymousClass5.b[listType.ordinal()];
        return 3;
    }

    public PDiskData.ListType b(PDiskData pDiskData, boolean z) {
        PDiskData.ListType a2 = PDiskData.ListType.a(this.b.c());
        C1044Mm.a("nf_partner_CardAlgo", "getListToUse member? %s,  prevCardListType %s", Boolean.valueOf(z), a2);
        List<PDiskData.ListType> e2 = e(z);
        int size = e2.size();
        PDiskData.ListType d = d(e2, a2);
        for (int i = 0; i < size; i++) {
            if (c(d, pDiskData.getVideoListByType(d), this.b.d(d), a2)) {
                C1044Mm.a("nf_partner_CardAlgo", "getListToUse: member? %s, foundListToUse: %s", Boolean.valueOf(z), d);
                return d;
            }
            d = d(e2, d);
        }
        this.b.e(this.c, e2);
        C1044Mm.a("nf_partner_CardAlgo", "getListToUse: got to end of all member data.. cycling");
        return e2.get(0);
    }

    private PDiskData.ListType d(List<PDiskData.ListType> list, PDiskData.ListType listType) {
        int indexOf = list.indexOf(listType) + 1;
        if (indexOf >= list.size()) {
            indexOf = 0;
        }
        return list.get(indexOf);
    }

    private boolean c(PDiskData.ListType listType, List<C4935bpK> list, dlO dlo, PDiskData.ListType listType2) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        PDiskData.ListType listType3 = PDiskData.ListType.CW;
        if (listType == listType3) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(list.size());
            objArr[1] = Boolean.valueOf(listType2 != listType3);
            C1044Mm.a("nf_partner_CardAlgo", "canUseList: Special case for CW videoList %s, returned %s", objArr);
            return listType2 != listType3;
        } else if (dlo.f() <= 0 || list.size() > dlo.f()) {
            C1044Mm.a("nf_partner_CardAlgo", "canUseList: %s videoList %s > presented %d", listType, Integer.valueOf(list.size()), Integer.valueOf(dlo.f()));
            return true;
        } else {
            return a(list, dlo, listType);
        }
    }

    private boolean a(List<C4935bpK> list, dlO dlo, PDiskData.ListType listType) {
        for (C4935bpK c4935bpK : list) {
            if (c4935bpK == null) {
                InterfaceC1598aHf.a("SPY-31942 hasNonPresentedVideo(" + listType.d() + "): video is null");
            } else {
                String e2 = e(c4935bpK);
                if (e2 == null) {
                    InterfaceC1598aHf.a("SPY-31901 hasNonPresentedVideo(" + listType.d() + "): video ID is null: " + c4935bpK.toString());
                } else if (!dlo.b(e2)) {
                    C1044Mm.a("nf_partner_CardAlgo", "hasNonPresentedVideo videoId %s not in presented", e2);
                    return true;
                }
            }
        }
        return false;
    }

    public String e(C4935bpK c4935bpK) {
        return c4935bpK.b ? c4935bpK.j : c4935bpK.a;
    }

    public void e(PDiskData.ListType listType, dlO dlo, List<C4935bpK> list) {
        C1044Mm.e("nf_partner_CardAlgo", "makeAllPresented: ");
        ArrayList arrayList = new ArrayList(list.size());
        for (C4935bpK c4935bpK : list) {
            arrayList.add(e(c4935bpK));
        }
        dlo.a(arrayList, arrayList.size() - 1);
        this.b.c(listType.d());
        this.b.a(this.c);
    }

    public void e(PDiskData.ListType listType, dlO dlo, C4935bpK c4935bpK, int i) {
        dlo.b(e(c4935bpK), i);
        this.b.c(listType.d());
        this.b.a(this.c);
    }

    public dlO a(PDiskData.ListType listType) {
        return this.b.d(listType);
    }

    private String d() {
        JSONObject jSONObject = new JSONObject();
        String e2 = C8157dfA.e(this.c, "partner_curr_card_data", (String) null);
        if (C8168dfL.g(e2)) {
            return jSONObject.toString();
        }
        try {
            JSONObject jSONObject2 = new JSONObject(e2);
            JSONArray jSONArray = jSONObject2.getJSONArray(SignupConstants.Field.VIDEOS);
            jSONObject.putOpt("cardPosition", 1);
            jSONObject.putOpt("impressionDurationMs", 800);
            jSONObject.putOpt("templateId", jSONObject2.optString("templateId"));
            jSONObject.putOpt("impressionTimeMs", jSONObject2.optString("currentTime"));
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.putOpt("playableId", jSONObject3.optString("playableId"));
                jSONObject4.putOpt("marker", jSONObject3.optString("marker"));
                jSONArray2.put(jSONObject4);
            }
            jSONObject.putOpt("videoImpressions", jSONArray2);
        } catch (JSONException e3) {
            C1044Mm.e("nf_partner_CardAlgo", "buildImpressionFromLastCard: exception ", e3);
        }
        return jSONObject.toString();
    }
}
