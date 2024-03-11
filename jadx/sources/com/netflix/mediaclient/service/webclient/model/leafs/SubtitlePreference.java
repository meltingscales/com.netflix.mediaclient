package com.netflix.mediaclient.service.webclient.model.leafs;

import o.C1044Mm;
import o.C8123deT;
import o.C8168dfL;
import o.InterfaceC5284bvp;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class SubtitlePreference implements InterfaceC5284bvp {
    private static final String FIELD_BACK_COLOR = "backgroundColor";
    private static final String FIELD_BACK_OPACITY = "backgroundOpacity";
    private static final String FIELD_CHAR_COLOR = "charColor";
    private static final String FIELD_CHAR_OPACITY = "charOpacity";
    private static final String FIELD_CHAR_SIZE = "charSize";
    private static final String FIELD_CHAR_STLE = "charStyle";
    private static final String FIELD_EDGE_ATTRS = "charEdgeAttrs";
    private static final String FIELD_EDGE_COLOR = "charEdgeColor";
    public static final String FIELD_SUBTITLE_DEFAULT = "subtitleDefault";
    public static final String FIELD_SUBTITLE_OVERRIDE = "subtitleOverride";
    private static final String FIELD_WIN_COLOR = "windowColor";
    private static final String FIELD_WIN_OPACITY = "windowOpacity";
    private static final String TAG = "nf_subtitlePreference";
    private String backgroundColor;
    private String backgroundOpacity;
    private String charColor;
    private String charEdgeAttrs;
    private String charEdgeColor;
    private String charOpacity;
    private String charSize;
    private String charStyle;
    private String windowColor;
    private String windowOpacity;

    @Override // o.InterfaceC5284bvp
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // o.InterfaceC5284bvp
    public String getBackgroundOpacity() {
        return this.backgroundOpacity;
    }

    @Override // o.InterfaceC5284bvp
    public String getCharColor() {
        return this.charColor;
    }

    @Override // o.InterfaceC5284bvp
    public String getCharEdgeAttrs() {
        return this.charEdgeAttrs;
    }

    @Override // o.InterfaceC5284bvp
    public String getCharEdgeColor() {
        return this.charEdgeColor;
    }

    @Override // o.InterfaceC5284bvp
    public String getCharOpacity() {
        return this.charOpacity;
    }

    @Override // o.InterfaceC5284bvp
    public String getCharSize() {
        return this.charSize;
    }

    @Override // o.InterfaceC5284bvp
    public String getCharStyle() {
        return this.charStyle;
    }

    @Override // o.InterfaceC5284bvp
    public String getWindowColor() {
        return this.windowColor;
    }

    @Override // o.InterfaceC5284bvp
    public String getWindowOpacity() {
        return this.windowOpacity;
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setBackgroundColor(String str) {
        this.backgroundColor = str;
        return this;
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setBackgroundOpacity(String str) {
        this.backgroundOpacity = str;
        return this;
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setCharColor(String str) {
        this.charColor = str;
        return this;
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setCharEdgeAttrs(String str) {
        this.charEdgeAttrs = str;
        return this;
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setCharEdgeColor(String str) {
        this.charEdgeColor = str;
        return this;
    }

    public InterfaceC5284bvp setCharOpacity(String str) {
        this.charOpacity = str;
        return this;
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setCharSize(String str) {
        this.charSize = str;
        return this;
    }

    public InterfaceC5284bvp setCharStyle(String str) {
        this.charStyle = str;
        return this;
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setWindowColor(String str) {
        this.windowColor = str;
        return this;
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setWindowOpacity(String str) {
        this.windowOpacity = str;
        return this;
    }

    @Override // o.InterfaceC5284bvp
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FIELD_CHAR_OPACITY, getCharOpacity());
            jSONObject.put(FIELD_BACK_OPACITY, getBackgroundOpacity());
            jSONObject.put(FIELD_WIN_OPACITY, getWindowOpacity());
            jSONObject.put(FIELD_CHAR_COLOR, getCharColor());
            jSONObject.put(FIELD_BACK_COLOR, getBackgroundColor());
            jSONObject.put(FIELD_WIN_COLOR, getWindowColor());
            jSONObject.put(FIELD_EDGE_COLOR, getCharEdgeColor());
            jSONObject.put(FIELD_EDGE_ATTRS, getCharEdgeAttrs());
            jSONObject.put(FIELD_CHAR_SIZE, getCharSize());
            jSONObject.put(FIELD_CHAR_STLE, getCharStyle());
        } catch (JSONException e) {
            C1044Mm.e(TAG, "failed in json string " + e);
        }
        C1044Mm.e(TAG, "user string=" + jSONObject.toString());
        return jSONObject;
    }

    public String toString() {
        return toJsonObject().toString();
    }

    public SubtitlePreference(String str) {
        try {
            JSONObject jSONObject = C8168dfL.g(str) ? new JSONObject() : new JSONObject(str);
            setCharOpacity(C8123deT.a(jSONObject, FIELD_CHAR_OPACITY, (String) null));
            setBackgroundOpacity(C8123deT.a(jSONObject, FIELD_BACK_OPACITY, (String) null));
            setWindowOpacity(C8123deT.a(jSONObject, FIELD_WIN_OPACITY, (String) null));
            setCharColor(C8123deT.a(jSONObject, FIELD_CHAR_COLOR, (String) null));
            setBackgroundColor(C8123deT.a(jSONObject, FIELD_BACK_COLOR, (String) null));
            setWindowColor(C8123deT.a(jSONObject, FIELD_WIN_COLOR, (String) null));
            setCharEdgeColor(C8123deT.a(jSONObject, FIELD_EDGE_COLOR, (String) null));
            setCharEdgeAttrs(C8123deT.a(jSONObject, FIELD_EDGE_ATTRS, (String) null));
            setCharSize(C8123deT.a(jSONObject, FIELD_CHAR_SIZE, (String) null));
            setCharStyle(C8123deT.a(jSONObject, FIELD_CHAR_STLE, (String) null));
        } catch (JSONException e) {
            C1044Mm.e(TAG, "failed to create json string=" + str + " exception =" + e);
        }
    }
}
