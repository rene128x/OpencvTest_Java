/**
 * Pone en funcionamiento la rutina de captura de imagenes escrita en c++
 * 
 * @author rene128x Rene Fernando Tapia Pincheira - rene128x.insa@gmail.com
 */

public class WebcamMain {
	public static void main(String[] args) {
		WebcamLib wl = new WebcamLib(0);
		wl.startVideoRutine();
	}
}
