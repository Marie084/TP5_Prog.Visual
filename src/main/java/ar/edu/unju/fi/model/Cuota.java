package ar.edu.unju.fi.model;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cuota {
        private long id;
        private LocalDate fechaPago;
        private String periodo;
        private double monto;
        private String estado;
        @Autowired
        private Usuario usuario;
        
        /**
         * Constructor sin parametros
         */
        
        public Cuota() {
			super();
		
		}

		/**
         * Constructor con parametros
         * @param id
         * @param fechaPago
         * @param periodo
         * @param monto
         * @param estado
         * @param usuario
         * 
         */
		public Cuota(long id, LocalDate fechaPago, String periodo, double monto, String estado, Usuario usuario) {
			super();
			this.id = id;
			this.fechaPago = fechaPago;
			this.periodo = periodo;
			this.monto = monto;
			this.estado = estado;
			this.usuario = usuario;
		}

		/**
		 * @return the id
		 */
		public long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(long id) {
			this.id = id;
		}

		/**
		 * @return the fechaPago
		 */
		public LocalDate getFechaPago() {
			return fechaPago;
		}

		/**
		 * @param fechaPago the fechaPago to set
		 */
		public void setFechaPago(LocalDate fechaPago) {
			this.fechaPago = fechaPago;
		}

		/**
		 * @return the periodo
		 */
		public String getPeriodo() {
			return periodo;
		}

		/**
		 * @param periodo the periodo to set
		 */
		public void setPeriodo(String periodo) {
			this.periodo = periodo;
		}

		/**
		 * @return the monto
		 */
		public double getMonto() {
			return monto;
		}

		/**
		 * @param monto the monto to set
		 */
		public void setMonto(double monto) {
			this.monto = monto;
		}

		/**
		 * @return the estado
		 */
		public String getEstado() {
			return estado;
		}

		/**
		 * @param estado the estado to set
		 */
		public void setEstado(String estado) {
			this.estado = estado;
		}

		/**
		 * @return the usuario
		 */
		public Usuario getUsuario() {
			return usuario;
		}

		/**
		 * @param usuario the usuario to set
		 */
		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		@Override
		public String toString() {
			return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
					+ ", estado=" + estado + ", usuario=" + usuario + "]";
		}
      
        
}
