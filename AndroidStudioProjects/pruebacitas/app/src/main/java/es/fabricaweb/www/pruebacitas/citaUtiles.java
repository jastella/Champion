package es.fabricaweb.www.pruebacitas;

import android.content.Context;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrador on 6/02/16.
 */
public class citaUtiles {

    public static List<citaUsuario> getDataSet(Context context){
        List<citaUsuario> dataSet = new ArrayList<>();
        try {
            StringBuilder builder = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(context.getAssets().open("information.json")));
            String line = "";
            //Se lee el archivo JSON
            while ((line=bufferedReader.readLine()) != null){
                builder.append(line);
            }
            bufferedReader.close();
            String json = builder.toString();
            // Se convierte a un JSONArray
            JSONArray jsonArray = new JSONArray(json);
            for (int index = 0; index < jsonArray.length(); index++) {
                SocialNetwork socialNetwork = new SocialNetwork();
                JSONObject jsonObject = jsonArray.getJSONObject(index);
                socialNetwork.setId(jsonObject.getInt("id"));
                socialNetwork.setName(jsonObject.getString("name"));
                socialNetwork.setDescription(jsonObject.getString("description"));
                socialNetwork.setIcon(index);
                socialNetwork.setRating((float)jsonObject.getDouble("rating"));
                dataSet.add(socialNetwork);
            }
        } catch (IOException ex) {
            Toast.makeText(context, "I/O Error", Toast.LENGTH_SHORT).show();

        } catch (JSONException e) {
            Log.e(SocialNetworkUtils.class.getName(), e.getMessage(), e);
            Toast.makeText(context,e.getMessage(),Toast.LENGTH_SHORT).show();
        }
        return dataSet;
    }
}
