package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.cdx.api.event.type.PlaybackSourceType;
import com.netflix.mediaclient.cdx.api.event.type.PlaybackStateType;
import com.netflix.mediaclient.cdx.api.event.type.PlaybackSubStateType;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aOG implements UU {
    private final String a;
    private final String b;
    private final boolean c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String l;

    @Override // o.UU
    public String a() {
        return this.b;
    }

    @Override // o.UU
    public String b() {
        return this.j;
    }

    @Override // o.UU
    public String c() {
        return this.d;
    }

    @Override // o.UU
    public String d() {
        return this.e;
    }

    @Override // o.UU
    public String g() {
        return this.i;
    }

    @Override // o.UU
    public boolean h() {
        return this.c;
    }

    @Override // o.UU
    public String i() {
        return this.l;
    }

    public aOG(JSONObject jSONObject) {
        Float i;
        Float i2;
        C8632dsu.c((Object) jSONObject, "");
        String optString = jSONObject.optString("duration", "");
        C8632dsu.d((Object) optString);
        i = C8690duy.i(optString);
        this.b = i == null ? "0" : String.valueOf(i.floatValue() / 1000);
        String optString2 = jSONObject.optString("uxPts", "");
        C8632dsu.d((Object) optString2);
        i2 = C8690duy.i(optString2);
        this.e = i2 != null ? String.valueOf(i2.floatValue() / 1000) : "0";
        JSONObject optJSONObject = jSONObject.optJSONObject("currentTimedTextTrack");
        String optString3 = optJSONObject != null ? optJSONObject.optString(SignupConstants.Field.LANG_ID, "") : null;
        this.d = optString3 == null ? "" : optString3;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("currentAudioTrack");
        String optString4 = optJSONObject != null ? optJSONObject.optString(SignupConstants.Field.LANG_ID, "") : null;
        this.a = optString4 == null ? "" : optString4;
        this.c = optJSONObject2 != null ? optJSONObject2.optBoolean("offTrackDisallowed", false) : false;
        String optString5 = optJSONObject2 != null ? optJSONObject2.optString("offTrackId", "") : null;
        this.j = optString5 == null ? "" : optString5;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("playerState");
        String optString6 = optJSONObject3 != null ? optJSONObject3.optString("stateName", "") : null;
        this.g = optString6 == null ? "" : optString6;
        JSONObject optJSONObject4 = optJSONObject3 != null ? optJSONObject3.optJSONObject("subState") : null;
        String optString7 = optJSONObject4 != null ? optJSONObject4.optString("stateName", "") : null;
        this.h = optString7 == null ? "" : optString7;
        JSONObject optJSONObject5 = optJSONObject3 != null ? optJSONObject3.optJSONObject(NotificationFactory.DATA) : null;
        String optString8 = optJSONObject5 != null ? optJSONObject5.optString("viewableId", "") : null;
        this.l = optString8 == null ? "" : optString8;
        String optString9 = optJSONObject5 != null ? optJSONObject5.optString("trackingId", "") : null;
        this.i = optString9 == null ? "" : optString9;
        String optString10 = optJSONObject5 != null ? optJSONObject5.optString("playbackType", "") : null;
        this.f = optString10 != null ? optString10 : "";
    }

    @Override // o.UU
    public PlaybackStateType f() {
        String str = this.g;
        switch (str.hashCode()) {
            case -1298752217:
                if (str.equals("ending")) {
                    return PlaybackStateType.b;
                }
                break;
            case -493563858:
                if (str.equals("playing")) {
                    return PlaybackStateType.d;
                }
                break;
            case 3227604:
                if (str.equals("idle")) {
                    return PlaybackStateType.c;
                }
                break;
            case 336650556:
                if (str.equals("loading")) {
                    return PlaybackStateType.e;
                }
                break;
        }
        return PlaybackStateType.a;
    }

    @Override // o.UU
    public PlaybackSubStateType j() {
        String str = this.h;
        switch (str.hashCode()) {
            case -995321554:
                if (str.equals("paused")) {
                    return PlaybackSubStateType.e;
                }
                break;
            case -790192845:
                if (str.equals("pausing")) {
                    return PlaybackSubStateType.c;
                }
                break;
            case -493563858:
                if (str.equals("playing")) {
                    return PlaybackSubStateType.a;
                }
                break;
            case -335770198:
                if (str.equals("resuming")) {
                    return PlaybackSubStateType.g;
                }
                break;
            case -91442467:
                if (str.equals("swimming")) {
                    return PlaybackSubStateType.f;
                }
                break;
            case 61512610:
                if (str.equals("buffering")) {
                    return PlaybackSubStateType.b;
                }
                break;
            case 189104227:
                if (str.equals("audiosafe")) {
                    return PlaybackSubStateType.d;
                }
                break;
            case 271855711:
                if (str.equals("prebuffering")) {
                    return PlaybackSubStateType.j;
                }
                break;
            case 1715648628:
                if (str.equals("stopping")) {
                    return PlaybackSubStateType.i;
                }
                break;
        }
        return PlaybackSubStateType.h;
    }

    @Override // o.UU
    public PlaybackSourceType e() {
        if (this.f.length() == 0) {
            return PlaybackSourceType.a;
        }
        int parseInt = Integer.parseInt(this.f);
        PlaybackSourceType playbackSourceType = PlaybackSourceType.d;
        if (parseInt != playbackSourceType.c()) {
            int parseInt2 = Integer.parseInt(this.f);
            playbackSourceType = PlaybackSourceType.c;
            if (parseInt2 != playbackSourceType.c()) {
                return PlaybackSourceType.a;
            }
        }
        return playbackSourceType;
    }
}
