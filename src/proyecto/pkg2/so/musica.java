/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg2.so;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Indatech
 */

public class musica {
    private Clip clip;
    private String rutaMusica;
    
    public musica(String rutaArchivo) {
        this.rutaMusica = rutaArchivo;
        // Verificar si el archivo existe e imprimir información de depuración
        File archivo = new File(rutaArchivo);
        System.out.println("Intentando acceder al archivo en: " + archivo.getAbsolutePath());
        if (!archivo.exists()) {
            // Intentar encontrar el archivo usando rutas relativas al proyecto
            File proyectoDir = new File(System.getProperty("user.dir"));
            File archivoEnProyecto = new File(proyectoDir, rutaArchivo);
            System.out.println("Intentando ruta alternativa: " + archivoEnProyecto.getAbsolutePath());
            if (archivoEnProyecto.exists()) {
                this.rutaMusica = archivoEnProyecto.getAbsolutePath();
            } else {
                System.out.println("Error: No se puede encontrar el archivo en ninguna ubicación");
            }
        }
    }
    
    public boolean reproducir() {
        try {
            File archivoMusica = new File(rutaMusica);
            if (!archivoMusica.exists()) {
                System.out.println("Error: El archivo no existe en: " + archivoMusica.getAbsolutePath());
                return false;
            }
            
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(archivoMusica);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("Reproduciendo música desde: " + archivoMusica.getAbsolutePath());
            return true;
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Error: Formato de audio no soportado");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.out.println("Error: No se puede reproducir el audio");
            e.printStackTrace();
        }
        return false;
    }
    
    public void pausar() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
    
    public void reanudar() {
        if (clip != null && !clip.isRunning()) {
            clip.start();
        }
    }
    
    public void detener() {
        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }
    
    public void reiniciar() {
        if (clip != null) {
            clip.setMicrosecondPosition(0);
            clip.start();
        }
    }
}

