package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.cdx.api.event.type.PlaybackSourceType;
import com.netflix.mediaclient.cdx.api.event.type.PlaybackStateType;
import com.netflix.mediaclient.cdx.api.event.type.PlaybackSubStateType;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aON implements UW {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final boolean f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String m;
    private final String n;

    @Override // o.UW
    public String a() {
        return this.c;
    }

    @Override // o.UW
    public String b() {
        return this.b;
    }

    @Override // o.UW
    public String c() {
        return this.h;
    }

    @Override // o.UW
    public String e() {
        return this.d;
    }

    @Override // o.UW
    public boolean g() {
        return this.f;
    }

    @Override // o.UW
    public String h() {
        return this.m;
    }

    @Override // o.UW
    public String j() {
        return this.n;
    }

    public aON(JSONObject jSONObject) {
        Float i;
        Float i2;
        C8632dsu.c((Object) jSONObject, "");
        String optString = jSONObject.optString("cmd", "");
        C8632dsu.a(optString, "");
        this.k = optString;
        String optString2 = jSONObject.optString("appState", "");
        C8632dsu.a(optString2, "");
        this.e = optString2;
        String optString3 = jSONObject.optString("duration", "");
        C8632dsu.d((Object) optString3);
        i = C8690duy.i(optString3);
        this.c = i == null ? "0" : String.valueOf(i.floatValue() / 1000);
        String optString4 = jSONObject.optString("uxPts", "");
        C8632dsu.d((Object) optString4);
        i2 = C8690duy.i(optString4);
        this.d = i2 != null ? String.valueOf(i2.floatValue() / 1000) : "0";
        JSONObject optJSONObject = jSONObject.optJSONObject("currentTimedTextTrack");
        String optString5 = optJSONObject != null ? optJSONObject.optString(SignupConstants.Field.LANG_ID, "") : null;
        this.b = optString5 == null ? "" : optString5;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("currentAudioTrack");
        String optString6 = optJSONObject != null ? optJSONObject.optString(SignupConstants.Field.LANG_ID, "") : null;
        this.a = optString6 == null ? "" : optString6;
        this.f = optJSONObject2 != null ? optJSONObject2.optBoolean("offTrackDisallowed", false) : false;
        String optString7 = optJSONObject2 != null ? optJSONObject2.optString("offTrack", "") : null;
        this.h = optString7 == null ? "" : optString7;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("playerState");
        String optString8 = optJSONObject3 != null ? optJSONObject3.optString("stateName", "") : null;
        this.i = optString8 == null ? "" : optString8;
        JSONObject optJSONObject4 = optJSONObject3 != null ? optJSONObject3.optJSONObject("subState") : null;
        String optString9 = optJSONObject4 != null ? optJSONObject4.optString("stateName", "") : null;
        this.j = optString9 == null ? "" : optString9;
        JSONObject optJSONObject5 = optJSONObject3 != null ? optJSONObject3.optJSONObject(NotificationFactory.DATA) : null;
        String optString10 = optJSONObject5 != null ? optJSONObject5.optString("viewableId", "") : null;
        this.n = optString10 == null ? "" : optString10;
        String optString11 = optJSONObject5 != null ? optJSONObject5.optString("trackingId", "") : null;
        this.m = optString11 == null ? "" : optString11;
        String optString12 = optJSONObject5 != null ? optJSONObject5.optString("playbackType", "") : null;
        this.g = optString12 != null ? optString12 : "";
    }

    @Override // o.UW
    public PlaybackStateType i() {
        String str = this.i;
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

    @Override // o.UW
    public PlaybackSubStateType f() {
        String str = this.j;
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

    @Override // o.UW
    public PlaybackSourceType d() {
        if (this.g.length() == 0) {
            return PlaybackSourceType.a;
        }
        int parseInt = Integer.parseInt(this.g);
        PlaybackSourceType playbackSourceType = PlaybackSourceType.d;
        if (parseInt != playbackSourceType.c()) {
            int parseInt2 = Integer.parseInt(this.g);
            playbackSourceType = PlaybackSourceType.c;
            if (parseInt2 != playbackSourceType.c()) {
                return PlaybackSourceType.a;
            }
        }
        return playbackSourceType;
    }
}
