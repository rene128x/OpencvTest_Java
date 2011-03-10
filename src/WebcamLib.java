/**
 * Interfaz c++/java para ver la salida de una webcam. El procesado de imagenes
 * se hace desde c++ (i.e. no hay intercambio de informacion)
 * 
 * @author rene128x Rene Fernando Tapia Pincheira - rene128x.insa@gmail.com
 */
public class WebcamLib {
	static {
		System.loadLibrary("webcam");
	}

	private int camera;

	/**
	 * @param cam
	 *            Camara desde la que se obtendran las imagenes procesadas.
	 */
	public WebcamLib(int cam) {
		this.camera = cam;
	}

	/**
	 * Iniciar la captura de imagenes.
	 */
	public void startVideoRutine() {
		videoRutine(camera);
	}

	private native void videoRutine(int cam);
}
