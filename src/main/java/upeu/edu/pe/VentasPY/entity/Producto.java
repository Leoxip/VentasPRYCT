package upeu.edu.pe.VentasPY.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
private int idproducto;
private String nombre;
private double precio;
private double cantidad;
}
