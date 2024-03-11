package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.storage.db.entity.DownloadablePersistentData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bvA  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C5243bvA {
    public static List<DownloadablePersistentData> c(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                DownloadablePersistentData downloadablePersistentData = new DownloadablePersistentData(jSONObject.getString(SignupConstants.Field.LANG_ID), jSONObject.getLong("size"));
                downloadablePersistentData.mIsComplete = jSONObject.getBoolean("done");
                arrayList.add(downloadablePersistentData);
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    public static String c(List<DownloadablePersistentData> list) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (DownloadablePersistentData downloadablePersistentData : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(SignupConstants.Field.LANG_ID, downloadablePersistentData.mDownloadableId);
                jSONObject.put("done", downloadablePersistentData.mIsComplete);
                jSONObject.put("size", downloadablePersistentData.mSizeOfDownloadable);
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
