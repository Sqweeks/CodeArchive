/**
* DATE: 11/08/2018
* DESC: Following code allows to read a JSON file from the RAW folder in Android application development.
**/

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.InputStream;
import java.util.Scanner;

public class ReadJSONFromRaw {
    private Context mContext;

    public ReadJSONFromRaw(Context context) {
        mContext = context;
    }

    public JSONArray readJsonArray(int id) throws JSONException {
        InputStream dataStream = mContext.getResources().openRawResource(id);
        Scanner dataScanner = new Scanner(dataStream);

        StringBuilder dataBuilder = new StringBuilder();
        while (dataScanner.hasNextLine()) {
            dataBuilder.append(dataScanner.nextLine());
        }
        return new JSONArray(dataBuilder.toString());
    }
}
