package com.password.springbinaryshockpablo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringBinaryShockPabloApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringBinaryShockPabloApplication.class);

    @Override
    public void run(String... args) throws Exception
    {
        /* Ideas para sobreescribir el run:
         * 1. Registrar logs o realizar auditorías
         * 2. Tareas de limpieza o migraciones: como eliminar registros temporales o actualizar datos antiguos
         * 3. Enviar notificaciones: enviar una notificación o alerta al arrancar (por ejemplo, por correo electrónico o a un sistema de monitoreo)
         * 4. Scripts SQL personalizados para que se ejecuten al inicio
         * 5. Cargar configuraciones externas o de archivos
         * 6. Realizar validaciones de configuración
         * 7. Conexión a servicios externos o APIs
         * 8. Inicializar datos en la base de datos
         * */
        //Niveles de log: debug, info, warn, error
        log.info("Aplicacion iniciada correctamente");
    }

    public static void main(String[] args)
    {
        SpringApplication.run(SpringBinaryShockPabloApplication.class, args);
    }
}
