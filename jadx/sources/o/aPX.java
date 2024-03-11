package o;

import android.os.PersistableBundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aPX {
    public static JSONArray e(PersistableBundle persistableBundle) {
        Stack stack = new Stack();
        JSONArray jSONArray = new JSONArray();
        c(jSONArray, stack, persistableBundle);
        return jSONArray;
    }

    private static void c(JSONArray jSONArray, Stack<String> stack, PersistableBundle persistableBundle) {
        List asList;
        ArrayList<String> arrayList = new ArrayList(persistableBundle.keySet());
        if (!arrayList.isEmpty() && ((String) arrayList.get(0)).startsWith("[")) {
            Collections.sort(arrayList, Comparator.comparing(new Function() { // from class: o.aPZ
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Integer b;
                    b = aPX.b((String) obj);
                    return b;
                }
            }));
        }
        for (String str : arrayList) {
            if (persistableBundle.get(str) instanceof PersistableBundle) {
                stack.push(str);
                c(jSONArray, stack, persistableBundle.getPersistableBundle(str));
                stack.pop();
            } else if (Arrays.asList("oem_crypto_result", "error_code").contains(str)) {
                String str2 = stack.get(2);
                long j = persistableBundle.getLong(str);
                if (str.equals("error_code")) {
                    asList = Arrays.asList(0L, 2L, 4L, 7L);
                } else {
                    asList = Arrays.asList(0L, 7L, 25L, 39L);
                }
                if (!asList.contains(Long.valueOf(j))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, j);
                    jSONObject.put("api", str2);
                    jSONArray.put(jSONObject);
                    if (persistableBundle.containsKey("error_detail")) {
                        jSONObject.put("error_detail", persistableBundle.getLong("error_detail"));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer b(String str) {
        return Integer.valueOf(Integer.parseInt(str.replaceAll("[\\[\\]]", "")));
    }
}
