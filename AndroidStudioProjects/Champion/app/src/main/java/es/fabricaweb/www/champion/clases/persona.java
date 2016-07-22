package es.fabricaweb.www.champion.clases;

/**
 * Created by Administrador on 20/07/16.
 */
public class persona {

    private String nombre;
    private String apellido;
    private String apellido2;
    private String sexo;
    private String nif;
    private String direccion;
    private String movil;
    private String fechaNacimiento;
    private String lugarNacimiento;
    private String codigoPostal;
    private String ciudad;
    private String provincia;
    private String mail;
    private String servidor;
    private String tarjetaTipo;
    private String tarjetaNumnero;
    private String caducidad;
    private String control;
    private String propietario;

    public persona(String nombre, String apellido, String apellido2, String sexo, String nif, String direccion, String movil, String fechaNacimiento, String lugarNacimiento, String codigoPostal, String ciudad, String provincia, String mail, String servidor, String tarjetaTipo, String tarjetaNumnero, String caducidad, String control, String propietario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.sexo = sexo;
        this.nif = nif;
        this.direccion = direccion;
        this.movil = movil;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.mail = mail;
        this.servidor = servidor;
        this.tarjetaTipo = tarjetaTipo;
        this.tarjetaNumnero = tarjetaNumnero;
        this.caducidad = caducidad;
        this.control = control;
        this.propietario = propietario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getTarjetaTipo() {
        return tarjetaTipo;
    }

    public void setTarjetaTipo(String tarjetaTipo) {
        this.tarjetaTipo = tarjetaTipo;
    }

    public String getTarjetaNumnero() {
        return tarjetaNumnero;
    }

    public void setTarjetaNumnero(String tarjetaNumnero) {
        this.tarjetaNumnero = tarjetaNumnero;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() { return nombre;  }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
}
