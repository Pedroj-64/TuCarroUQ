package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.RegistroVehicularController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegistroVehicularViewController {

    @FXML // fx:id="ScrollPane_Screen09"
    private ScrollPane ScrollPane_Screen09; // Value injected by FXMLLoader

    @FXML // fx:id="btn_Regresar"
    private Button btn_Regresar; // Value injected by FXMLLoader

    @FXML // fx:id="btn_guardarVehiculo"
    private Button btn_guardarVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="btn_listo"
    private Button btn_listo; // Value injected by FXMLLoader

    @FXML // fx:id="check_4x4"
    private CheckBox check_4x4; // Value injected by FXMLLoader

    @FXML // fx:id="check_ABS"
    private CheckBox check_ABS; // Value injected by FXMLLoader

    @FXML // fx:id="check_AireAcondicionado"
    private CheckBox check_AireAcondicionado; // Value injected by FXMLLoader

    @FXML // fx:id="check_AsistenteDePermanenciaDECarril"
    private CheckBox check_AsistenteDePermanenciaDECarril; // Value injected by FXMLLoader

    @FXML // fx:id="check_CamaraReversa"
    private CheckBox check_CamaraReversa; // Value injected by FXMLLoader

    @FXML // fx:id="check_EsEnchufable"
    private CheckBox check_EsEnchufable; // Value injected by FXMLLoader

    @FXML // fx:id="check_EsHidridoLigero"
    private CheckBox check_EsHidridoLigero; // Value injected by FXMLLoader

    @FXML // fx:id="check_EsNuevo"
    private CheckBox check_EsNuevo; // Value injected by FXMLLoader

    @FXML // fx:id="check_FrenosAire"
    private CheckBox check_FrenosAire; // Value injected by FXMLLoader

    @FXML // fx:id="check_RevisionTecnica"
    private CheckBox check_RevisionTecnica; // Value injected by FXMLLoader

    @FXML // fx:id="check_SensorColision"
    private CheckBox check_SensorColision; // Value injected by FXMLLoader

    @FXML // fx:id="check_SensorDeTraficoCruzado"
    private CheckBox check_SensorDeTraficoCruzado; // Value injected by FXMLLoader

    @FXML // fx:id="check_TransmisionManual"
    private CheckBox check_TransmisionManual; // Value injected by FXMLLoader

    @FXML // fx:id="check_VelocidadCrucero"
    private CheckBox check_VelocidadCrucero; // Value injected by FXMLLoader

    @FXML // fx:id="cmb_TipoDeVehiculo"
    private ComboBox<String> cmb_TipoDeVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="cmb_Vehiculo"
    private ComboBox<String> cmb_Vehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="txt_AutonomiaCargaCompleta"
    private TextField txt_AutonomiaCargaCompleta; // Value injected by FXMLLoader

    @FXML // fx:id="txt_AutonomiaTanqueLleno"
    private TextField txt_AutonomiaTanqueLleno; // Value injected by FXMLLoader

    @FXML // fx:id="txt_CaballosDeFuerza"
    private TextField txt_CaballosDeFuerza; // Value injected by FXMLLoader

    @FXML // fx:id="txt_CantidadPuertas"
    private TextField txt_CantidadPuertas; // Value injected by FXMLLoader

    @FXML // fx:id="txt_CapacidadDeCarga"
    private TextField txt_CapacidadDeCarga; // Value injected by FXMLLoader

    @FXML // fx:id="txt_CapacidadDeMaletero"
    private TextField txt_CapacidadDeMaletero; // Value injected by FXMLLoader

    @FXML // fx:id="txt_CapacidadDeTanque"
    private TextField txt_CapacidadDeTanque; // Value injected by FXMLLoader

    @FXML // fx:id="txt_Cilindraje"
    private TextField txt_Cilindraje; // Value injected by FXMLLoader

    @FXML // fx:id="txt_Marca"
    private TextField txt_Marca; // Value injected by FXMLLoader

    @FXML
    private TextField txt_NumeroPasajeros;

    @FXML // fx:id="txt_Kilometraje"
    private TextField txt_Kilometraje; // Value injected by FXMLLoader

    @FXML // fx:id="txt_CapacidadCajaDeCarga"
    private TextField txt_CapacidadCajaDeCarga; // Value injected by FXMLLoader

    @FXML // fx:id="txt_Modelo"
    private TextField txt_Modelo; // Value injected by FXMLLoader

    @FXML // fx:id="txt_NumeroBolsasAire"
    private TextField txt_NumeroBolsasAire; // Value injected by FXMLLoader

    @FXML // fx:id="txt_NumeroDeEjes"
    private TextField txt_NumeroDeEjes; // Value injected by FXMLLoader

    @FXML // fx:id="txt_NumeroSalidasEmergencia"
    private TextField txt_NumeroSalidasEmergencia; // Value injected by FXMLLoader

    @FXML // fx:id="txt_Placa"
    private TextField txt_Placa; // Value injected by FXMLLoader

    @FXML // fx:id="txt_PrecioAlquilerDia"
    private TextField txt_PrecioAlquilerDia; // Value injected by FXMLLoader

    @FXML // fx:id="txt_PrecioVenta"
    private TextField txt_PrecioVenta; // Value injected by FXMLLoader

    @FXML // fx:id="txt_Cambios"
    private TextField txt_Cambios; // Value injected by FXMLLoader

    @FXML // fx:id="txt_Referencia"
    private TextField txt_Referencia; // Value injected by FXMLLoader

    @FXML // fx:id="txt_TiempoEn100km"
    private TextField txt_TiempoEn100km; // Value injected by FXMLLoader

    @FXML // fx:id="txt_TiempoPromedioPorCarga"
    private TextField txt_TiempoPromedioPorCarga; // Value injected by FXMLLoader

    @FXML // fx:id="txt_TipoDeCamion"
    private TextField txt_TipoDeCamion; // Value injected by FXMLLoader

    @FXML // fx:id="txt_TipoDeMoto"
    private TextField txt_TipoDeMoto; // Value injected by FXMLLoader

    @FXML // fx:id="txt_VelocidadMax"
    private TextField txt_VelocidadMax; // Value injected by FXMLLoader

    @FXML // fx:id="txt_tipoDeCombustible"
    private TextField txt_tipoDeCombustible; // Value injected by FXMLLoader

    RegistroVehicularController registroVehicularController = new RegistroVehicularController();

    @FXML
    public void initialize() {
        try {
            check_RevisionTecnica.setDisable(true);
            ocultarTodosLosCamposInicio();
            configurarBotones();
            configurarComboBoxes();
            configurarListeners();
        } catch (Exception e) {
            App.showAlert("Error de Inicialización", "Ocurrió un error al inicializar la vista: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    private void configurarBotones() {
        btn_listo.setOnAction(this::accionBotonListo);
        btn_Regresar.setOnAction(this::accionRegresar);
        btn_guardarVehiculo.setOnAction(this::accionGuardarVehiculo);
    }

    private void configurarComboBoxes() {
        cmb_TipoDeVehiculo.getItems().addAll("Híbrido", "Combustión", "Eléctrico");

        cmb_Vehiculo.getItems().addAll("Van", "Sedán", "Pick-Up", "Moto", "Deportivo", "Camioneta", "Camión", "Bus");
    }

    private void configurarListeners() {
        cmb_Vehiculo.setOnAction(event -> {
            String tipoVehiculoSeleccionado = cmb_Vehiculo.getValue();
            try {
                // Asegúrate de que el valor seleccionado no sea null o vacío
                if (tipoVehiculoSeleccionado == null || tipoVehiculoSeleccionado.isEmpty()) {
                    throw new IllegalArgumentException("Por favor, selecciona un tipo de vehículo.");
                }
                actualizarCamposSegunVehiculo(tipoVehiculoSeleccionado);
            } catch (IllegalArgumentException e) {
                App.showAlert("Advertencia", e.getMessage(), Alert.AlertType.WARNING);
            } catch (Exception e) {
                // Capturar cualquier otra excepción inesperada
                App.showAlert("Error", "Error al cambiar el tipo de vehículo: " + e.getMessage(),
                        Alert.AlertType.ERROR);
                // Log de la excepción para ayudar a la depuración
                e.printStackTrace();
            }
        });
    
        cmb_TipoDeVehiculo.setOnAction(event -> {
            String tipoVehiculo = cmb_TipoDeVehiculo.getValue();
    
            try {
                // Validación adicional si es necesario
                if (tipoVehiculo == null || tipoVehiculo.isEmpty()) {
                    throw new IllegalArgumentException("Por favor, selecciona un tipo de combustible.");
                }
                actualizarCamposSegunTipo(tipoVehiculo);
            } catch (IllegalArgumentException e) {
                App.showAlert("Advertencia", e.getMessage(), Alert.AlertType.WARNING);
            } catch (Exception e) {
                App.showAlert("Error", "Error al actualizar los campos según el tipo de vehículo: " + e.getMessage(),
                        Alert.AlertType.ERROR);
                e.printStackTrace();  // Ayuda en la depuración
            }
        });
    }
    

    private void actualizarCamposSegunTipo(String tipoSeleccionado) {
        try {
            // Verificar que el tipo de vehículo no sea nulo ni vacío
            if (tipoSeleccionado == null || tipoSeleccionado.isEmpty()) {
                throw new IllegalArgumentException("El tipo de vehículo seleccionado no puede estar vacío.");
            }
    
            ocultarTodosLosCamposInicio();
    
            if ("Híbrido".equals(tipoSeleccionado)) {
                check_EsEnchufable.setVisible(true);
                check_EsHidridoLigero.setVisible(true);
                txt_Cambios.setVisible(true);
            } else if ("Combustión".equals(tipoSeleccionado)) {
                txt_CapacidadDeTanque.setVisible(true);
                txt_AutonomiaTanqueLleno.setVisible(true);
                txt_tipoDeCombustible.setVisible(true);
                txt_Cilindraje.setVisible(true);
                txt_Cambios.setVisible(true);
            } else if ("Eléctrico".equals(tipoSeleccionado)) {
                txt_AutonomiaCargaCompleta.setVisible(true);
                txt_TiempoPromedioPorCarga.setVisible(true);
            } else {
                // Si el tipo seleccionado no es válido, lanzar una excepción
                throw new IllegalArgumentException("Tipo de vehículo no reconocido: " + tipoSeleccionado);
            }
        } catch (IllegalArgumentException e) {
            // Mostrar mensaje de advertencia si el tipo es inválido o vacío
            App.showAlert("Advertencia", e.getMessage(), Alert.AlertType.WARNING);
        } catch (Exception e) {
            // Mostrar error genérico si ocurre un problema inesperado
            App.showAlert("Error", "Error al actualizar los campos según el tipo de vehículo: " + e.getMessage(),
                    Alert.AlertType.ERROR);
            // Registrar el error para depuración
            e.printStackTrace();
        }
    }
    
    private void accionBotonListo(ActionEvent event) {
        try {
            inhabilitarCamposGenerales();
            // Verificar si todos los campos relevantes están correctamente llenados
            if (estánCamposVacios()) {
                App.showAlert("Advertencia", "Por favor, complete todos los campos antes de continuar.", Alert.AlertType.WARNING);
                return; // No continuar si algún campo está vacío
            }
    
            // Verificar que el ScrollPane esté correctamente inicializado
            if (ScrollPane_Screen09 == null) {
                throw new IllegalStateException("El ScrollPane no está inicializado correctamente.");
            }
    
            ScrollPane_Screen09.setDisable(false);
            
        } catch (IllegalStateException e) {
            // Mostrar mensaje de error si hay un problema con la inicialización
            App.showAlert("Advertencia", e.getMessage(), Alert.AlertType.WARNING);
        } catch (Exception e) {
            // Capturar cualquier otro error inesperado
            App.showAlert("Error", "Error al procesar la acción del botón 'Listo': " + e.getMessage(),
                    Alert.AlertType.ERROR);
            // Registrar el error para depuración
            e.printStackTrace();
        }
    }
    
    // Método para verificar si algún campo está vacío o no válido
    private boolean estánCamposVacios() {
        // Verificar los campos uno por uno y retornar true si alguno está vacío o no tiene un valor válido
        if (cmb_TipoDeVehiculo.getValue() == null || cmb_Vehiculo.getValue() == null || 
            txt_CapacidadDeTanque.getText().isEmpty() || txt_AutonomiaTanqueLleno.getText().isEmpty() || 
            txt_tipoDeCombustible.getText().isEmpty() || txt_AutonomiaCargaCompleta.getText().isEmpty() || 
            txt_TiempoPromedioPorCarga.getText().isEmpty() || txt_Cilindraje.getText().isEmpty() ||
            txt_Cambios.getText().isEmpty() || txt_Kilometraje.getText().isEmpty() || 
            txt_PrecioAlquilerDia.getText().isEmpty() || txt_PrecioVenta.getText().isEmpty() || 
            txt_Marca.getText().isEmpty() || txt_Referencia.getText().isEmpty() || 
            txt_Placa.getText().isEmpty() || txt_VelocidadMax.getText().isEmpty() || 
            txt_Modelo.getText().isEmpty()) {
            return true; // Si algún campo está vacío, retornar true
        }
        return false; // Si todos los campos están llenos, retornar false
    }
    

    private void accionRegresar(ActionEvent event) {
        App.goBack();
    }
    



    private void accionGuardarVehiculo(ActionEvent event) {
        try {
            // Capturar valores comunes
            String tipoDeCombustion = cmb_TipoDeVehiculo.getValue();
            String tipoDeVehiculo = cmb_Vehiculo.getValue();

            String marca = txt_Marca.getText();
            String placa = txt_Placa.getText();
            String referencia = txt_Referencia.getText();
            int cambios = Integer.parseInt(txt_Cambios.getText());
            int velocidadMax = Integer.parseInt(txt_VelocidadMax.getText());
            int kilometraje = Integer.parseInt(txt_Kilometraje.getText());
            int modelo = Integer.parseInt(txt_Modelo.getText());
            double precioVenta = Double.parseDouble(txt_PrecioVenta.getText());
            double precioAlquilerDia = Double.parseDouble(txt_PrecioAlquilerDia.getText());
            boolean esNuevo = check_EsNuevo.isSelected();
            int cilindraje = Integer.parseInt(txt_Cilindraje.getText());

            // Capturar valores específicos
            int cantidadPuertas = parseIntOrDefault(txt_CantidadPuertas.getText(), 0);
            int numeroBolsasAire = parseIntOrDefault(txt_NumeroBolsasAire.getText(), 0);
            int numeroPasajeros = parseIntOrDefault(txt_NumeroPasajeros.getText(), 0);
            boolean transmisionManual = check_TransmisionManual.isSelected();
            boolean aireAcondicionado = check_AireAcondicionado.isSelected();
            boolean camaraReversa = check_CamaraReversa.isSelected();
            boolean abs = check_ABS.isSelected();
            boolean velocidadCrucero = check_VelocidadCrucero.isSelected();
            boolean sensorColision = check_SensorColision.isSelected();
            boolean sensorTraficoCruzado = check_SensorDeTraficoCruzado.isSelected();
            boolean asistenteCarril = check_AsistenteDePermanenciaDECarril.isSelected();
            boolean revisionTecnica = check_RevisionTecnica.isSelected();
            boolean frenosAire = check_FrenosAire.isSelected();
            boolean es4x4 = check_4x4.isSelected();
            boolean esEnchufable = check_EsEnchufable.isSelected();
            boolean esHibridoLigero = check_EsHidridoLigero.isSelected();

            // Capturar valores adicionales (dependiendo del tipo de vehículo)
            String autonomiaCargaCompleta = txt_AutonomiaCargaCompleta.getText();
            int autonomiaTanqueLleno = parseIntOrDefault(txt_AutonomiaTanqueLleno.getText(), 0);
            int capacidadDeCarga = parseIntOrDefault(txt_CapacidadDeCarga.getText(), 0);
            int capacidadDeMaletero = parseIntOrDefault(txt_CapacidadDeMaletero.getText(), 0);
            int numeroDeEjes = parseIntOrDefault(txt_NumeroDeEjes.getText(), 0);
            int numeroSalidasEmergencia = parseIntOrDefault(txt_NumeroSalidasEmergencia.getText(), 0);
            String tiempoPromedioPorCarga = txt_TiempoPromedioPorCarga.getText();
            double tiempoQueAlcanza100kmh = parseDoubleOrDefault(txt_TiempoEn100km.getText(), 0);
            String tipoDeCamion = txt_TipoDeCamion.getText();
            String tipoDeMoto = txt_TipoDeMoto.getText();

            // Llamar al método para crear el vehículo
            boolean banderilla = registroVehicularController.crearVehiculo(tipoDeCombustion, tipoDeVehiculo, marca,
                    referencia, placa, kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                    referencia, autonomiaTanqueLleno, capacidadDeMaletero, cilindraje, revisionTecnica, cambios,
                    autonomiaCargaCompleta, tiempoPromedioPorCarga, esEnchufable, esHibridoLigero, cantidadPuertas,
                    numeroBolsasAire, numeroPasajeros, transmisionManual, aireAcondicionado, camaraReversa, abs,
                    numeroPasajeros, autonomiaTanqueLleno, numeroBolsasAire, velocidadCrucero, sensorColision,
                    sensorTraficoCruzado, asistenteCarril, capacidadDeMaletero, es4x4, tipoDeMoto, numeroDeEjes,
                    tiempoQueAlcanza100kmh, tipoDeCamion, capacidadDeCarga, numeroSalidasEmergencia, frenosAire);
            if (banderilla) {
                App.showAlert("Éxito", "El vehículo ha sido creado correctamente", Alert.AlertType.INFORMATION);
                
            } else {
                App.showAlert("Error", "No se pudo crear el vehículo", Alert.AlertType.ERROR);
            }
        } catch (NumberFormatException e) {
            App.showAlert("Error", "Por favor verifica que los valores numéricos sean válidos.",
                    Alert.AlertType.WARNING);
        }
    }

    // Métodos auxiliares para manejar valores vacíos o nulos
    private int parseIntOrDefault(String text, int defaultValue) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    private double parseDoubleOrDefault(String text, double defaultValue) {
        try {
            return Double.parseDouble(text);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    private void ocultarTodosLosCamposInicio() {
        // Ocultar todos los campos dependientes de tipo de vehículo
        check_EsEnchufable.setVisible(false);
        check_EsHidridoLigero.setVisible(false);
        txt_CapacidadDeTanque.setVisible(false);
        txt_AutonomiaTanqueLleno.setVisible(false);
        txt_tipoDeCombustible.setVisible(false);
        txt_AutonomiaCargaCompleta.setVisible(false);
        txt_TiempoPromedioPorCarga.setVisible(false);
        txt_Cilindraje.setVisible(false);
        txt_Cambios.setVisible(false);
    }

    private void actualizarCamposSegunVehiculo(String tipoVehiculo) {
        // Resetear todos los campos
        ocultarTodosLosCampos();

        // Configurar campos según el tipo de vehículo seleccionado
        switch (tipoVehiculo) {
            case "Van":
                mostrarCamposVan();
                break;
            case "Sedán":
                mostrarCamposSedan();
                break;
            case "Pick-Up":
                mostrarCamposPickUp();
                break;
            case "Moto":
                mostrarCamposMoto();
                break;
            case "Deportivo":
                mostrarCamposDeportivo();
                break;
            case "Camioneta":
                mostrarCamposCamioneta();
                break;
            case "Camión":
                mostrarCamposCamion();
                break;
            case "Bus":
                mostrarCamposBus();
                break;
            default:
                App.showAlert("Advertencia", "Tipo de vehículo desconocido: " + tipoVehiculo,
                        Alert.AlertType.WARNING);
                break;
        }
    }

    private void ocultarTodosLosCampos() {
        txt_CantidadPuertas.setVisible(false);
        txt_NumeroPasajeros.setVisible(false);
        txt_NumeroBolsasAire.setVisible(false);
        txt_CapacidadDeMaletero.setVisible(false);
        txt_TipoDeMoto.setVisible(false);
        txt_CaballosDeFuerza.setVisible(false);
        txt_TiempoEn100km.setVisible(false);
        txt_TipoDeCamion.setVisible(false);
        txt_CapacidadDeCarga.setVisible(false);
        txt_NumeroDeEjes.setVisible(false);
        txt_NumeroSalidasEmergencia.setVisible(false);
        txt_CapacidadDeCarga.setVisible(false);
        txt_CapacidadCajaDeCarga.setVisible(false);
        check_AireAcondicionado.setVisible(false);
        check_CamaraReversa.setVisible(false);
        check_ABS.setVisible(false);
        check_VelocidadCrucero.setVisible(false);
        check_SensorColision.setVisible(false);
        check_SensorDeTraficoCruzado.setVisible(false);
        check_AsistenteDePermanenciaDECarril.setVisible(false);
        check_TransmisionManual.setVisible(false);
        check_4x4.setVisible(false);
    }

    private void mostrarCamposVan() {
        txt_CantidadPuertas.setVisible(true);
        txt_NumeroBolsasAire.setVisible(true);
        txt_NumeroPasajeros.setVisible(true);
        check_TransmisionManual.setVisible(true);
        check_AireAcondicionado.setVisible(true);
        check_CamaraReversa.setVisible(true);
        check_ABS.setVisible(true);
    }

    private void mostrarCamposSedan() {
        txt_CantidadPuertas.setVisible(true);
        txt_NumeroPasajeros.setVisible(true);
        txt_CapacidadDeMaletero.setVisible(true);
        txt_NumeroBolsasAire.setVisible(true);
        check_AireAcondicionado.setVisible(true);
        check_CamaraReversa.setVisible(true);
        check_VelocidadCrucero.setVisible(true);
        check_ABS.setVisible(true);
        check_SensorColision.setVisible(true);
        check_SensorDeTraficoCruzado.setVisible(true);
        check_AsistenteDePermanenciaDECarril.setVisible(true);
    }

    private void mostrarCamposPickUp() {
        txt_CantidadPuertas.setVisible(true);
        txt_NumeroPasajeros.setVisible(true);
        txt_NumeroBolsasAire.setVisible(true);
        txt_CapacidadCajaDeCarga.setVisible(true);
        check_AireAcondicionado.setVisible(true);
        check_CamaraReversa.setVisible(true);
        check_ABS.setVisible(true);
        check_4x4.setVisible(true);
    }

    private void mostrarCamposMoto() {
        txt_TipoDeMoto.setVisible(true);
    }

    private void mostrarCamposDeportivo() {
        txt_CantidadPuertas.setVisible(true);
        txt_NumeroPasajeros.setVisible(true);
        txt_NumeroBolsasAire.setVisible(true);
        txt_TiempoEn100km.setVisible(true);
        txt_CaballosDeFuerza.setVisible(true);
    }

    private void mostrarCamposCamioneta() {
        txt_CantidadPuertas.setVisible(true);
        txt_NumeroPasajeros.setVisible(true);
        txt_CapacidadDeMaletero.setVisible(true);
        txt_NumeroBolsasAire.setVisible(true);
        check_AireAcondicionado.setVisible(true);
        check_CamaraReversa.setVisible(true);
        check_VelocidadCrucero.setVisible(true);
        check_ABS.setVisible(true);
        check_SensorColision.setVisible(true);
        check_SensorDeTraficoCruzado.setVisible(true);
        check_AsistenteDePermanenciaDECarril.setVisible(true);
        check_4x4.setVisible(true);
    }

    private void mostrarCamposCamion() {
        txt_TipoDeCamion.setVisible(true);
        txt_CapacidadDeCarga.setVisible(true);
        txt_NumeroDeEjes.setVisible(true);
        check_FrenosAire.setVisible(true);
        check_ABS.setVisible(true);
        check_AireAcondicionado.setVisible(true);
    }

    private void mostrarCamposBus() {
        txt_CantidadPuertas.setVisible(true);
        txt_NumeroPasajeros.setVisible(true);
        txt_CapacidadDeMaletero.setVisible(true);
        txt_NumeroBolsasAire.setVisible(true);
        txt_NumeroDeEjes.setVisible(true);
        txt_NumeroSalidasEmergencia.setVisible(true);
        check_AireAcondicionado.setVisible(true);
        check_CamaraReversa.setVisible(true);
        check_ABS.setVisible(true);
    }

    private void inhabilitarCamposGenerales() {
        cmb_TipoDeVehiculo.setDisable(true);
        cmb_Vehiculo.setDisable(true);
        check_EsEnchufable.setDisable(true);
        check_EsHidridoLigero.setDisable(true);
        txt_CapacidadDeTanque.setDisable(true);
        txt_AutonomiaTanqueLleno.setDisable(true);
        txt_tipoDeCombustible.setDisable(true);
        txt_AutonomiaCargaCompleta.setDisable(true);
        txt_TiempoPromedioPorCarga.setDisable(true);
        txt_Cilindraje.setDisable(true);
        txt_Cambios.setDisable(true);
        txt_Kilometraje.setDisable(true);
        txt_PrecioAlquilerDia.setDisable(true);
        txt_PrecioVenta.setDisable(true);
        txt_Marca.setDisable(true);
        txt_Referencia.setDisable(true);
        txt_Placa.setDisable(true);
        txt_VelocidadMax.setDisable(true);
        txt_Modelo.setDisable(true);
        check_EsNuevo.setDisable(true);
        
    }

}
