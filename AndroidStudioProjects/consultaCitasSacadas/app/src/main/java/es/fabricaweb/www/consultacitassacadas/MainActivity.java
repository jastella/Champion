package es.fabricaweb.www.consultacitassacadas;

import android.app.DownloadManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button miBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        miBoton = (Button) findViewById(R.id.button);

        miBoton.setOnClickListener(this);




    }





    protected void consultar(){

        RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);

        String url = "http://www.fabricaweb.es/ws/prueba.php";

        Toast.makeText(MainActivity.this, "consultar",Toast.LENGTH_SHORT).show();


        JsonArrayRequest miConsultaMatriz = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        //Toast.makeText(MainActivity.this, "onResponse",Toast.LENGTH_SHORT).show();
                        try {

                            if (response.length() >0) {
                                for (int i=0;i<response.length();i++) {
                                    JSONObject row = response.getJSONObject(i);
                                    Toast.makeText(MainActivity.this, row.getString("mensaje") ,Toast.LENGTH_SHORT).show();
                                }
                            }
                        } catch (JSONException e) {
                            Toast.makeText(MainActivity.this, "error TRY" ,Toast.LENGTH_SHORT).show();

                            //e.printStackTrace();
                        }




            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "error RESPONSE" ,Toast.LENGTH_SHORT).show();

            }
        });

        requestQueue.add(miConsultaMatriz);

    }


    @Override
    public void onClick(View v) {

        if (v == miBoton) {
            consultar();
        }

    }
}
