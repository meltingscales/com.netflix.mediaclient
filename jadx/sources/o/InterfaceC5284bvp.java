package o;

import org.json.JSONObject;

/* renamed from: o.bvp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5284bvp {
    String getBackgroundColor();

    String getBackgroundOpacity();

    String getCharColor();

    String getCharEdgeAttrs();

    String getCharEdgeColor();

    String getCharOpacity();

    String getCharSize();

    String getCharStyle();

    String getWindowColor();

    String getWindowOpacity();

    InterfaceC5284bvp setBackgroundColor(String str);

    InterfaceC5284bvp setBackgroundOpacity(String str);

    InterfaceC5284bvp setCharColor(String str);

    InterfaceC5284bvp setCharEdgeAttrs(String str);

    InterfaceC5284bvp setCharEdgeColor(String str);

    InterfaceC5284bvp setCharSize(String str);

    InterfaceC5284bvp setWindowColor(String str);

    InterfaceC5284bvp setWindowOpacity(String str);

    JSONObject toJsonObject();
}
