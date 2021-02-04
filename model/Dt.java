package ejercicio.model;

import java.time.LocalDate;

public class Dt extends Persona{

    private LocalDate fechaQueDirigioInicio;
    private LocalDate fechaQueDirigioFin;

    public Dt(String nombre, String apellido, int dni, int telefono, String email, LocalDate fechaQueDirigioInicio, LocalDate fechaQueDirigioFin) {
        super(nombre, apellido, dni, telefono, email);
        this.fechaQueDirigioInicio = fechaQueDirigioInicio;
        this.fechaQueDirigioFin = fechaQueDirigioFin;
    }

    public LocalDate getFechaQueDirigioInicio() {
        return fechaQueDirigioInicio;
    }

    public void setFechaQueDirigioInicio(LocalDate fechaQueDirigioInicio) {
        this.fechaQueDirigioInicio = fechaQueDirigioInicio;
    }

    public LocalDate getFechaQueDirigioFin() {
        return fechaQueDirigioFin;
    }

    public void setFechaQueDirigioFin(LocalDate fechaQueDirigioFin) {
        this.fechaQueDirigioFin = fechaQueDirigioFin;
    }
}
