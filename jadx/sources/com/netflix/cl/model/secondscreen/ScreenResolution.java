package com.netflix.cl.model.secondscreen;

import com.netflix.cl.model.Data;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ScreenResolution extends Data {
    private Double height;
    private Double pixelRatio;
    private Double width;

    public ScreenResolution(Double d, Double d2, Double d3) {
        this.pixelRatio = d;
        this.width = d2;
        this.height = d3;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "pixelRatio", this.pixelRatio);
        ExtCLUtils.addObjectToJson(jSONObject, InteractiveAnimation.ANIMATION_TYPE.WIDTH, this.width);
        ExtCLUtils.addObjectToJson(jSONObject, InteractiveAnimation.ANIMATION_TYPE.HEIGHT, this.height);
        return jSONObject;
    }
}
