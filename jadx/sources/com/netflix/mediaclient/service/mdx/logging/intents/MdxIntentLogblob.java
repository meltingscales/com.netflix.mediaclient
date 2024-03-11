package com.netflix.mediaclient.service.mdx.logging.intents;

import android.os.Build;
import com.netflix.mediaclient.service.mdx.logging.MdxTargetType;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Date;
import o.AbstractApplicationC1040Mh;
import o.C8055ddE;
import o.aWN;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class MdxIntentLogblob extends aWN {
    protected long d;
    protected IntentType e;

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return "mdxintent";
    }

    public IntentType g() {
        return this.e;
    }

    /* loaded from: classes3.dex */
    public enum IntentType {
        SkipSegment("SKIP_SEGMENT"),
        Stop("STOP");
        
        private String e;

        public String c() {
            return this.e;
        }

        IntentType(String str) {
            this.e = str;
        }
    }

    public MdxIntentLogblob(String str, int i, IntentType intentType, MdxTargetType mdxTargetType) {
        super(str);
        this.d = new Date().getTime();
        this.e = intentType;
        String e = C8055ddE.e(AbstractApplicationC1040Mh.d());
        try {
            this.i.put("index", i);
            this.i.put("intent", intentType.c());
            this.i.put("controllerUI", e);
            this.i.put("controllerNative", Build.VERSION.RELEASE);
            this.i.put("targetType", mdxTargetType.d());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void d(String str) {
        if (this.i.has("xid")) {
            return;
        }
        try {
            this.i.put("xid", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void o() {
        if (this.i.has("firstImpressionTime")) {
            return;
        }
        try {
            this.i.put("firstImpressionTime", i());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void e(String str) {
        try {
            this.i.put("subIntent", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void d(JSONObject jSONObject) {
        try {
            this.i.put("extraInfo", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void k() {
        try {
            this.i.put(VisualStateDefinition.ELEMENT_STATE.RESULT, "SUCCESS");
            this.i.put("completedTime", i());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void b(IntentType intentType) {
        try {
            this.i.put(VisualStateDefinition.ELEMENT_STATE.RESULT, "PRE-EMPTED");
            this.i.put("preEmptedBy", intentType.c());
            this.i.put("completedTime", i());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    protected long i() {
        return new Date().getTime() - this.d;
    }
}
