package vistas.controlador;

import modelo.vista.PersonaMV;
import vista.comunes.PanelDatosPersonales;

public class ControladorPanelDatosPersonales {

	public void rellenarDatos(PanelDatosPersonales panel, PersonaMV persona) {
		panel.txtID.setText(String.valueOf(persona.getID()));
		panel.txtNombre.setText(persona.getNombre());
		panel.txtaApellido.setText(persona.getApellidos());
		panel.txtDireccion.setText(persona.getDireccion());
		panel.textTelefono.setText(persona.getTelefono());
		panel.textNacimiento.setText(persona.getFechaNacimiento());
		
	}

	public PersonaMV obtenerDatos(PanelDatosPersonales panel) {
		PersonaMV modelo = new PersonaMV();
		if (!panel.txtID.getText().isEmpty()) {
			modelo.setID(new Long(panel.txtID.getText()));
		}
		modelo.setNombre(panel.txtNombre.getText());
		modelo.setApellidos(panel.txtaApellido.getText());
		modelo.setDireccion(panel.txtDireccion.getText());
		modelo.setTelefono(panel.textTelefono.getText());
		modelo.setFechaNacimiento(panel.textNacimiento.getText());
		return modelo;
	}

	public void vaciarDatos(PanelDatosPersonales panel) {
		panel.txtID.setText("");
		panel.txtNombre.setText("");
		panel.txtaApellido.setText("");
		panel.txtDireccion.setText("");
		panel.textTelefono.setText("");
		panel.textNacimiento.setText("");
	}

}
