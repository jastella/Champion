package es.fabricaweb.www.champion.clases;

import android.util.JsonReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrador on 20/07/16.
 */
public class JsonPersonaParse {

    public List<persona> readJsonStream (InputStream in) throws IOException{

        JsonReader reader = new JsonReader(new InputStreamReader(in,"UTF-8"));
        try {
            return leerArrayPersonas(reader);
        }finally {
            reader.close();
        }
    }

    public List leerArrayPersonas(JsonReader reader) throws IOException {

        ArrayList personas = new ArrayList();

        reader.beginArray();

        while (reader.hasNext()) {

            personas.add(leerPersona(reader));
        };
        reader.endArray();
        return personas;
    }

    public persona leerPersona(JsonReader reader) throws IOException {

        String nombre = null;
        String apellido = null;
        String apellido2 = null;
        String sexo = null;
        String nif = null;
        String direccion = null;
        String movil = null;
        String fechaNacimiento = null;
        String lugarNacimiento = null;
        String codigoPostal = null;
        String ciudad = null;
        String provincia = null;
        String mail = null;
        String servidor = null;
        String tarjeta = null;
        String tarjetaNumero = null;
        String caducidad = null;
        String control = null;
        String propietario = null;

        reader.beginObject();

        while (reader.hasNext()){

            String name = reader.nextName();

            switch (name){
                case "nombre":
                    nombre = reader.nextString();
                    break;
                case "apellido1":
                    apellido = reader.nextString();
                    break;
                case "apellido2":
                    apellido2 = reader.nextString();
                    break;
                case "sexo":
                    sexo = reader.nextString();
                    break;
                case "nif":
                    nif = reader.nextString();
                    break;
                case "direccion":
                    direccion = reader.nextString();
                    break;
                case "movil":
                    movil = reader.nextString();
                    break;
                case "fechanacimiento":
                    fechaNacimiento = reader.nextString();
                    break;
                case "lugarnacimiento":
                    lugarNacimiento = reader.nextString();
                    break;
                case "codigopostal":
                    codigoPostal = reader.nextString();
                    break;
                case "ciudad":
                    ciudad = reader.nextString();
                    break;
                case "provincia":
                    provincia = reader.nextString();
                    break;
                case "mail":
                    mail = reader.nextString();
                    break;
                case "servidor":
                    servidor = reader.nextString();
                    break;
                case "tarjetatipo":
                    tarjeta = reader.nextString();
                    break;
                case "tarjeta":
                    tarjetaNumero = reader.nextString();
                    break;
                case "caducidadtarjeta":
                    caducidad = reader.nextString();
                    break;
                case "control":
                    control = reader.nextString();
                    break;
                case "propietariotarjeta":
                    propietario = reader.nextString();
                    break;
                default:
                    reader.skipValue();
                    break;
            }
        }
        reader.endObject();

        return new persona(nombre,apellido,apellido2,sexo,nif,direccion,movil,fechaNacimiento,lugarNacimiento,codigoPostal,
                ciudad,provincia,mail,servidor,tarjeta,tarjetaNumero,caducidad,control,propietario);

    }

}
