package o;

import com.netflix.mediaclient.service.mdx.protocol.target.TargetSessionMessageType;
import o.C2076aYz;
import org.json.JSONObject;

/* renamed from: o.aYm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2063aYm extends aXC {
    protected JSONObject c;

    public JSONObject f() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2063aYm(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C2076aYz.b a(JSONObject jSONObject) {
        char c;
        String string = jSONObject.getString("sessionAction");
        string.hashCode();
        if (string.equals("endSession")) {
            return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_ENDSESSOIN, new C2060aYj());
        }
        if (string.equals("startSessionResponse")) {
            return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_STARTSESSION, new C2059aYi(jSONObject));
        }
        String string2 = jSONObject.getString("appAction");
        JSONObject optJSONObject = jSONObject.optJSONObject("appBody");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        string2.hashCode();
        switch (string2.hashCode()) {
            case -2088753260:
                if (string2.equals("DIALOG_SHOW")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2006733487:
                if (string2.equals("DIALOG_CANCEL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1183534128:
                if (string2.equals("AUDIO_SUBTITLES_SETTINGS")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -878340337:
                if (string2.equals("HANDSHAKE_ACCEPTED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -861484972:
                if (string2.equals("PLAYER_CAPABILITIES")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -243777799:
                if (string2.equals("META_DATA_CHANGED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 793034055:
                if (string2.equals("AUDIO_SUBTITLES_CHANGED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 828731546:
                if (string2.equals("MDX_ACTION_PIN_VERIFICATION_NOT_REQUIRED")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 974516823:
                if (string2.equals("PIN_VERIFICATION_SHOW")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1436783917:
                if (string2.equals("PLAYER_CURRENT_STATE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1602921562:
                if (string2.equals("MESSAGE_IGNORED")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1978639336:
                if (string2.equals("PLAYER_STATE_CHANGED")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2092050337:
                if (string2.equals("PIN_VERIFICATION_INCORRECT_PIN")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_DIALOG_SHOW, new aXY(optJSONObject));
            case 1:
                return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_DIALOG_CANCEL, new C2051aYa(optJSONObject));
            case 2:
                return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_AUDIO_SUBTITLE_SETTINGS, new aXV(optJSONObject));
            case 3:
                return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_HANDSHAKE, new C2053aYc(optJSONObject));
            case 4:
                return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_CAPABILITY, new C2054aYd(optJSONObject));
            case 5:
                return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_META_DATA_CHANGED, new C2055aYe(optJSONObject));
            case 6:
                return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_AUDIO_SUBTITLES_CHANGED, new aXX(optJSONObject));
            case 7:
                return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_PIN_VERIFICATION_NOT_REQUIRED, new C2056aYf(optJSONObject));
            case '\b':
                return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_PIN_VERIFICATION_SHOW, new C2058aYh(optJSONObject));
            case '\t':
                return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_CURRENT_STATE, new C2057aYg(optJSONObject));
            case '\n':
                return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_GENERIC, new aXZ(optJSONObject));
            case 11:
                return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_STATE_CHANGED, new C2062aYl(optJSONObject));
            case '\f':
                return new C2076aYz.b(TargetSessionMessageType.MESSAGE_TYPE_PIN_VERIFICATION_INCORRECT_PIN, new C2052aYb(optJSONObject));
            default:
                return null;
        }
    }
}
